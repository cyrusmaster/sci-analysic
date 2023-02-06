package com.hzsun.bigdata.sci.service.impl;

import com.hzsun.bigdata.sci.constant.Constants;
import com.hzsun.bigdata.sci.dao.CommonDao;
import com.hzsun.bigdata.sci.model.dto.CollegeMsgDTO;
import com.hzsun.bigdata.sci.model.dto.DimClassDTO;
import com.hzsun.bigdata.sci.model.dto.ItemClassDTO;
import com.hzsun.bigdata.sci.model.dto.TeacherMsgDTO;
import com.hzsun.bigdata.sci.service.CommonService;
import com.hzsun.zbp.basic.util.BaseUtils;
import com.hzsun.zbp.basic.util.RestResult;
import com.hzsun.zbp.basic.util.RestResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author luomeng
 * @Classname: CommonServiceImpl
 * @Description:
 * @Date: 2020-08-18 08:57
 */
@Service
public class CommonServiceImpl implements CommonService {
    @Autowired
    private CommonDao dao;

    /**
     * Description: 获取单位列表
     *
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/18 8:59
     */
    @Override
    public RestResult getUnit() {
        List<DimClassDTO> list = dao.getDimClassFirst("edu_sch_unit_cls");
        return RestResultFactory.success(list);
    }

    /**
     * Description: 获取获奖类别
     *
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/19 9:20
     */
    @Override
    public RestResult getWinRank() {
        List<DimClassDTO> list = new LinkedList<>();
        list.add(new DimClassDTO("edu_sci_achv_win_cls", "全部", "-1"));
        list.addAll(dao.getDimClassFirst("edu_sci_achv_win_cls"));
        return RestResultFactory.success(list);
    }

    /**
     * Description: 获取学院列表
     *
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 16:00
     */
    @Override
    public RestResult getCollege(String year) {
        //获取最新院系所单位基本数据子类表名
        String unitTableName = dao.findLatestTableByPrefix("TDWD_SCH_COLL_COLL_UNIT_BASE_INFO_D_");
        List<CollegeMsgDTO> list = new ArrayList<>();
        if (!BaseUtils.isNull(unitTableName)) {
            list = dao.getCollege(unitTableName);
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 获取课题类型
     *
     * @param year
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 10:13
     */
    @Override
    public RestResult getItemClass(String year) {
        //获取最新科技项目基本数据子类表
        String itemTableName = dao.findLatestMonTableByYear("TDWB_SCI_SCI_ITEM_FUND_INFO_M_", year);
        List<ItemClassDTO> list = new ArrayList<>();
        if (!BaseUtils.isNull(itemTableName)) {
            list = dao.getItemClass(itemTableName);
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 获取学科门类
     *
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 14:30
     */
    @Override
    public RestResult getSubject() {
        List<DimClassDTO> list = dao.getDimClassFirst("ctry_sch_degree_grant_dvlp_subj");
        return RestResultFactory.success(list);
    }

    /**
     * Description: 获取一级学科信息
     *
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/9/9 9:46
     */
    @Override
    public RestResult getPrimarySubject() {
        List<DimClassDTO> list = dao.getDimClassWithLayer("ctry_sch_degree_grant_dvlp_subj", "2");
        return RestResultFactory.success(list);
    }

    /**
     * Description: 获取教师职称
     *
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/26 9:33
     */
    @Override
    public RestResult getTechTitle() {
        List<DimClassDTO> list = dao.getDimClassWithPre("ctry_base_spec_tech_title", "010");
        return RestResultFactory.success(list);
    }

    /**
     * Description: 模糊查询教师信息
     *
     * @param year
     * @param staffName
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/9/11 14:38
     */
    @Override
    public RestResult getTeachMsg(String year, String staffName) {
        //教职工成果产出信息表名
        String tableName = dao.findLatestDayTableByYear("TDWD_STAFF_BASE_BASE_INFO_D_", year);
        List<TeacherMsgDTO> list = new ArrayList<>();
        if(Constants.PERCENT.equals(staffName)){
            staffName = "@uncheckable@";
        }
        if (!BaseUtils.isNull(tableName)) {
            list = dao.getTeachMsg(tableName, staffName);
        }
        return RestResultFactory.success(list);
    }

}