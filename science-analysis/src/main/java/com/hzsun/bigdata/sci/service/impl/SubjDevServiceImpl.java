package com.hzsun.bigdata.sci.service.impl;

import com.hzsun.bigdata.sci.constant.Constants;
import com.hzsun.bigdata.sci.dao.CommonDao;
import com.hzsun.bigdata.sci.dao.SubjDevDao;
import com.hzsun.bigdata.sci.model.dto.*;
import com.hzsun.bigdata.sci.service.SubjDevService;
import com.hzsun.bigdata.sci.util.DateUtils;
import com.hzsun.zbp.basic.model.DateArea;
import com.hzsun.zbp.basic.model.dto.CommonListDTO;
import com.hzsun.zbp.basic.model.qo.PageQO;
import com.hzsun.zbp.basic.util.BaseUtils;
import com.hzsun.zbp.basic.util.RestResult;
import com.hzsun.zbp.basic.util.RestResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luomeng
 * @Classname: SubjDevServiceImpl
 * @Description: 学科发展概况接口实现类
 * @Date: 2020-08-24 14:44
 */
@Service
public class SubjDevServiceImpl implements SubjDevService {

    @Autowired
    private SubjDevDao subjDevDao;
    @Autowired
    private CommonDao dao;

    /**
     * Description: 学科 核心指标总体概况
     *
     * @param year
     * @param subjNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:06
     */
    @Override
    public RestResult generalCoreIndexBySubj(String year, String subjNo) {
        GeneralCoreIndexDTO result = subjDevDao.getGeneralCoreIndexBySubj(year, subjNo);
        if (BaseUtils.isNull(result)) {
            result = new GeneralCoreIndexDTO();
        }
        return RestResultFactory.success(result);
    }

    /**
     * Description: 学科 科研横向项目数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:06
     */
    @Override
    public RestResult countProjectHBySubjDraw(String year, Integer type, String subjNo) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = subjDevDao.getCountProjectHBySubjDraw(year, type, subjNo);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 学科 科研纵向项目数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:06
     */
    @Override
    public RestResult countProjectVBySubjDraw(String year, Integer type, String subjNo) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = subjDevDao.getCountProjectVBySubjDraw(year, type, subjNo);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 学科 科研成果数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:07
     */
    @Override
    public RestResult sciAchievementBySubjDraw(String year, Integer type, String subjNo) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = subjDevDao.getSciAchievementBySubjDraw(year, type, subjNo);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 学科 科研成果等级分布
     *
     * @param year
     * @param type   0:纵向项目 1:论文 2:奖励 3:著作 4:专利 5:软著 6:艺术作品 7:研究报告
     * @param subjNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:07
     */
    @Override
    public RestResult sciAchvLvBySubjDraw(String year, Integer type, String subjNo) {
        List<DrawDTO> list = subjDevDao.getSciLevelBySubjDraw(year, type, subjNo);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 学科 科研经费金额统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param subjNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:07
     */
    @Override
    public RestResult sciFeeBySubjDraw(String year, Integer type, String subjNo) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = subjDevDao.getSciFeeBySubjDraw(year, type, subjNo);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 学科 科研项目经费金额统计明细
     *
     * @param year
     * @param itemCode 课题类别
     * @param timeType 时间类别 0~3 第1~4季度 4~15 第1~12月
     * @param subjNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:07
     */
    @Override
    public RestResult sciFeeBySubjDetail(String year, String itemCode, Integer timeType, String subjNo, Integer page, Integer pageSize) {
        PageQO pageQo = new PageQO(page, pageSize);
        pageQo.init();
        //科研项目经费信息表
        String fundTableName = dao.findLatestTableByPrefix("TDWB_SCI_SCI_ITEM_FUND_INFO_M_");
        //获取时间范围
        DateArea dateArea = DateUtils.getDateArea(timeType, year);
        List<ItemFundDetailDTO> list = new ArrayList();
        Integer count = 0;
        if (!BaseUtils.isNull(fundTableName)) {
            list = subjDevDao.getSciFeeBySubjDetail(fundTableName, itemCode, dateArea, subjNo,
                    pageQo.getLimit(), pageQo.getOffset());
            count = subjDevDao.getSciFeeBySubjDetailCount(fundTableName, itemCode, dateArea, subjNo);
        }
        return RestResultFactory.success(new CommonListDTO(list, count, pageQo));
    }

    /**
     * Description: 学科 获奖统计明细
     *
     * @param year
     * @param honorType -1 为全部
     * @param subjNo
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 15:07
     */
    @Override
    public RestResult honorStaticBySubj(String year, String honorType, String subjNo, Integer page, Integer pageSize) {
        PageQO pageQo = new PageQO(page, pageSize);
        pageQo.init();
        //获取获奖成果基本数据子类表
        String achvTableName = dao.findLatestTableByPrefix("TDWD_SCI_TECH_ACHV_WIN_ACHV_BASE_INFO_D_");
        List<HonorStaticDTO> list = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(achvTableName)) {
            list = subjDevDao.getHonorStaticBySubj(year, honorType, achvTableName, subjNo,
                    pageQo.getLimit(), pageQo.getOffset());
            count = subjDevDao.getHonorStaticBySubjCount(year, honorType, achvTableName, subjNo);
        }
        return RestResultFactory.success(new CommonListDTO(list, count, pageQo));
    }

    /**
     * Description: 学科投入产出总体概况
     *
     * @param year
     * @param timeType 时间类别 0~3 第1~4季度 4~15 第1~12月
     * @param subjNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/24 17:37
     */
    @Override
    public RestResult subjInOutPut(String year, Integer timeType, String subjNo, Integer page, Integer pageSize) {
        PageQO pageQo = new PageQO(page, pageSize);
        pageQo.init();
        //获取时间范围
        List<String> monthList = DateUtils.getMonthList(year, timeType);
        List<SubjInOutPutDTO> list = subjDevDao.getSubjInOutPut(year, monthList, subjNo, page, pageSize);
        Integer count = subjDevDao.getSubjInOutPutCount(year, monthList, subjNo);
        return RestResultFactory.success(new CommonListDTO(list, count, pageQo));
    }

    /**
     * Description:  人员投入产出概况
     *
     * @param year
     * @param staffNo 教师工号
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/25 9:44
     */
    @Override
    public RestResult staffInOutMsg(String year, String staffNo) {
        //教职工成果产出信息表名
        String staffOutTable = dao.findLatestTableByPrefix("TDWB_SCI_STAFF_SCI_ITEM_ACHV_DETAIL_INFO_D_");
        //教职工项目经费信息表名
        String staffItemFundTable = dao.findLatestTableByPrefix("TDWB_SCI_STAFF_ITEM_FUND_INFO_M_");
        //教职工项目来源经费信息表名
        String staffFundSrcTable = dao.findLatestTableByPrefix("TDWB_SCI_STAFF_ITEM_FUND_SRC_INFO_M_");
        //成果产出
        StaffOutPutInfoDTO staffOutPutInfo = new StaffOutPutInfoDTO();
        if (!BaseUtils.isNull(staffOutTable)) {
            staffOutPutInfo = subjDevDao.getStaffOutPutInfo(staffOutTable, staffNo);
        }
        //项目经费信息
        List<StaffItemFundDTO> itemFundList = new ArrayList<>();
        if (!BaseUtils.isNull(staffItemFundTable)) {
            itemFundList = subjDevDao.getItemFundList(staffItemFundTable, staffNo);
        }
        //项目来源经费信息
        List<StaffFundSrcDTO> fundSrcList = new ArrayList<>();
        if (!BaseUtils.isNull(staffFundSrcTable)) {
            fundSrcList = subjDevDao.getFundSrcList(staffFundSrcTable, staffNo);
        }
        //整合返回
        return RestResultFactory.success(new StaffInOutMsgDTO(staffOutPutInfo, itemFundList, fundSrcList));
    }

}