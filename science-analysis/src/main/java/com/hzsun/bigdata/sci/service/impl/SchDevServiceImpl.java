package com.hzsun.bigdata.sci.service.impl;

import com.hzsun.bigdata.sci.constant.Constants;
import com.hzsun.bigdata.sci.dao.CommonDao;
import com.hzsun.bigdata.sci.dao.SchDevDao;
import com.hzsun.bigdata.sci.model.dto.*;
import com.hzsun.bigdata.sci.service.SchDevService;
import com.hzsun.zbp.basic.model.dto.CommonListDTO;
import com.hzsun.zbp.basic.model.qo.PageQO;
import com.hzsun.zbp.basic.util.BaseUtils;
import com.hzsun.zbp.basic.util.RestResult;
import com.hzsun.zbp.basic.util.RestResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author luomeng
 * @Classname: SchDevServiceImpl
 * @Description: 学校发展概况接口实现类
 * @Date: 2020-08-17 14:52
 */
@Service
public class SchDevServiceImpl implements SchDevService {

    @Autowired
    private SchDevDao schDevDao;

    @Autowired
    private CommonDao dao;

    /**
     * Description: 各单位考核指标总体概况
     *
     * @param year
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 15:04
     */
    @Override
    public RestResult generalAssess(String year) {
        GeneralAssessDTO result = schDevDao.getGeneralAssess(year);
        if (BaseUtils.isNull(result)) {
            result = new GeneralAssessDTO();
        }
        return RestResultFactory.success(result);
    }

    /**
     * Description: 各单位目标任务完成率统计
     *
     * @param year
     * @param unitClassNo 单位类别码
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 16:57
     */
    @Override
    public RestResult targetCompleteDraw(String year, String unitClassNo) {
        //获取最新院系所单位基本数据子类表名
        String unitTableName = dao.findLatestTableByPrefix("TDWD_SCH_COLL_COLL_UNIT_BASE_INFO_D_");
        List<DrawDTO> list = new ArrayList<>();
        //如果最新院系所单位基本数据子类表存在
        if (!BaseUtils.isNull(unitTableName)) {
            //各单位目标任务完成率统计
            list = schDevDao.getEveryFinishRate(year, unitClassNo, unitTableName);
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 各单位贡献奖励统计
     *
     * @param year
     * @param unitClassNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/19 15:39
     */
    @Override
    public RestResult contrbAwardScoreDraw(String year, String unitClassNo) {
        //获取最新院系所单位基本数据子类表名
        String unitTableName = dao.findLatestTableByPrefix("TDWD_SCH_COLL_COLL_UNIT_BASE_INFO_D_");
        List<DrawDTO> list = new ArrayList<>();
        //如果最新院系所单位基本数据子类表存在
        if (!BaseUtils.isNull(unitTableName)) {
            //各单位目标任务完成率统计
            list = schDevDao.getContrbAwardScoreDraw(year, unitClassNo, unitTableName);
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 各单位负面扣减分值统计
     *
     * @param year
     * @param unitClassNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/19 15:40
     */
    @Override
    public RestResult deductionScoreDraw(String year, String unitClassNo) {
        //获取最新院系所单位基本数据子类表名
        String unitTableName = dao.findLatestTableByPrefix("TDWD_SCH_COLL_COLL_UNIT_BASE_INFO_D_");
        List<DrawDTO> list = new ArrayList<>();
        //如果最新院系所单位基本数据子类表存在
        if (!BaseUtils.isNull(unitTableName)) {
            //各单位目标任务完成率统计
            list = schDevDao.getDeductionScoreDraw(year, unitClassNo, unitTableName);
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 核心指标总体概况
     *
     * @param year
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 16:58
     */
    @Override
    public RestResult generalCoreIndex(String year) {
        GeneralCoreIndexDTO result = schDevDao.generalCoreIndex(year);
        if (BaseUtils.isNull(result)) {
            result = new GeneralCoreIndexDTO();
        }
        return RestResultFactory.success(result);
    }

    /**
     * Description: 科研横向项目数量统计
     *
     * @param year
     * @param type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 17:05
     */
    @Override
    public RestResult countProjectHDraw(String year, Integer type) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = schDevDao.getCountProjectHDraw(year, type);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 科研纵向项目数量统计
     *
     * @param year
     * @param type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 17:05
     */
    @Override
    public RestResult countProjectVDraw(String year, Integer type) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = schDevDao.getCountProjectVDraw(year, type);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 科研成果数量统计
     *
     * @param year
     * @param type
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 17:08
     */
    @Override
    public RestResult sciAchievementDraw(String year, Integer type) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = schDevDao.getSciAchievementDraw(year, type);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 科研成果等级分布
     *
     * @param year
     * @param type 0:纵向项目 1:论文 2:奖励 3:著作 4:专利 5:软著 6:艺术作品 7:研究报告
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/21 13:49
     */
    @Override
    public RestResult sciLevelDraw(String year, Integer type) {
        List<DrawDTO> list = schDevDao.getSciLevelDraw(year, type);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 科研经费金额统计
     *
     * @param year
     * @param type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 17:20
     */
    @Override
    public RestResult sciFeeDraw(String year, Integer type) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = schDevDao.getSciFeeDraw(year, type);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 科研经费到位情况统计
     *
     * @param year
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 17:20
     */
    @Override
    public RestResult sciFeeArriveDraw(String year) {
        List<DrawDTO> list = schDevDao.getSciFeeArriveDraw(year);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 获奖统计
     *
     * @param year
     * @param honorType -1 为全部
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 17:11
     */
    @Override
    public RestResult honorStatic(String year, String honorType, Integer page, Integer pageSize) {
        PageQO pageQo = new PageQO(page, pageSize);
        pageQo.init();
        //获取获奖成果基本数据子类表
        String achvTableName = dao.findLatestTableByPrefix("TDWD_SCI_TECH_ACHV_WIN_ACHV_BASE_INFO_D_");
        List<HonorStaticDTO> list = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(achvTableName)) {
            list = schDevDao.getHonorStatic(year, honorType, achvTableName, pageQo.getLimit(), pageQo.getOffset());
            count = schDevDao.getHonorStaticCount(year, honorType, achvTableName);
        }
        return RestResultFactory.success(new CommonListDTO(list, count, pageQo));
    }

    /**
     * Description: 四大类项目指标总体概况
     *
     * @param year
     * @param fourItemCode 四大目标码 1.科学研究 2.队伍建设 3.人才培养 4.国际合作交流 9.其他
     * @param projectType  0:任务目标 1:贡献奖励得分 2:负面扣减分值
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/17 17:20
     */
    @Override
    public RestResult generalProjectIndicators(String year, String fourItemCode,
                                               Integer projectType, Integer page, Integer pageSize) {
        PageQO pageQo = new PageQO(page, pageSize);
        pageQo.init();
        Map<String, Object> map = new HashMap<>(5);
        List<ProjectIndicatorsDTO> list = new ArrayList<>();
        List<Constants.ColumnEntity> titleList;
        Integer count = 0;
        if (projectType == 0) {
            titleList = Constants.fourCodeTargetList;
            //学院考核目标任务信息表
            String aimTableName = dao.findLatestTableByPrefix("TDWB_SCI_UNIT_EVAL_AIM_MISSION_INFO_M_");
            if (!BaseUtils.isNull(aimTableName)) {
                list = schDevDao.getMissionTarget(aimTableName, fourItemCode, pageQo.getLimit(), pageQo.getOffset());
                count = schDevDao.getMissionTargetCount(aimTableName, fourItemCode);
            }
        } else if (projectType == 1) {
            titleList = Constants.fourCodeAwardList;
            //学院考核贡献得分信息表
            String contrbTableName = dao.findLatestTableByPrefix("TDWB_SCI_UNIT_EVAL_CONTRB_SCORE_INFO_M_");
            if (!BaseUtils.isNull(contrbTableName)) {
                list = schDevDao.getAwardScore(contrbTableName, fourItemCode, pageQo.getLimit(), pageQo.getOffset());
                count = schDevDao.getAwardScoreCount(contrbTableName, fourItemCode);
            }
        } else {
            titleList = Constants.fourCodeDeductionList;
            //学院考核扣分信息表
            String deductionTableName = dao.findLatestTableByPrefix("TDWB_SCI_UNIT_DEDUCTION_SCORE_INFO_M_");
            if (!BaseUtils.isNull(deductionTableName)) {
                list = schDevDao.getDeductionMsg(deductionTableName, fourItemCode, pageQo.getLimit(), pageQo.getOffset());
                count = schDevDao.getDeductionMsgCount(deductionTableName, fourItemCode);
            }
        }
        map.put("page", pageQo.getPage());
        map.put("pageSize", pageQo.getPageSize());
        map.put("total", count);
        map.put("list", list);
        map.put("title", titleList);
        return RestResultFactory.success(map);
    }

}