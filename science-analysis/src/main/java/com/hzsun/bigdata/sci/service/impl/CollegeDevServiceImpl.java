package com.hzsun.bigdata.sci.service.impl;

import com.hzsun.bigdata.sci.constant.Constants;
import com.hzsun.bigdata.sci.dao.CollegeDevDao;
import com.hzsun.bigdata.sci.dao.CommonDao;
import com.hzsun.bigdata.sci.model.dto.*;
import com.hzsun.bigdata.sci.service.CollegeDevService;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author luomeng
 * @Classname: CollegeDevServiceImpl
 * @Description: 学院发展概况
 * @Date: 2020-08-19 17:03
 */
@Service
public class CollegeDevServiceImpl implements CollegeDevService {
    @Autowired
    private CollegeDevDao collegeDevDao;

    @Autowired
    private CommonDao dao;

    /**
     * Description: 学院 考核指标总体概况
     *
     * @param year
     * @param unitNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:35
     */
    @Override
    public RestResult generalAssessByUnit(String year, String unitNo) {
        GeneralAssessDTO result = collegeDevDao.getGeneralAssessByUnit(year, unitNo);
        if (BaseUtils.isNull(result)) {
            result = new GeneralAssessDTO();
        }
        return RestResultFactory.success(result);
    }

    /**
     * Description:  学院 目标任务完成率统计图表
     *
     * @param year
     * @param unitNo
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:35
     */
    @Override
    public RestResult targetCompleteByUnitDraw(String year, String unitNo, Integer type) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = collegeDevDao.getCompleteByUnitDraw(year, unitNo, type);
        return RestResultFactory.success(list);
    }

    /**
     * Description: 学院 贡献奖励统计
     *
     * @param year
     * @param unitNo
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:36
     */
    @Override
    public RestResult contrbAwardScoreByUnitDraw(String year, String unitNo, Integer type) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = collegeDevDao.getAwardScoreByUnitDraw(year, unitNo, type);
        return RestResultFactory.success(list);
    }

    /**
     * Description:  学院 负面扣减分值
     *
     * @param year
     * @param unitNo
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:36
     */
    @Override
    public RestResult deductionScoreByUnit(String year, String unitNo, Integer page, Integer pageSize) {
        PageQO pageQo = new PageQO(page, pageSize);
        pageQo.init();
        //学院考核扣分信息表
        String deductionTableName = dao.findLatestTableByPrefix("TDWB_SCI_UNIT_DEDUCTION_SCORE_INFO_M_");
        List<ProjectIndicatorsDTO> list = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(deductionTableName)) {
            list = collegeDevDao.getDeductScoreByUnit(deductionTableName, unitNo, pageQo.getLimit(), pageQo.getOffset());
            count = collegeDevDao.getDeductScoreByUnitCount(deductionTableName, unitNo);
        }
        return RestResultFactory.success(new CommonListDTO(list, count, pageQo));
    }

    /**
     * Description: 学院 核心指标总体概况
     *
     * @param year
     * @param unitNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:36
     */
    @Override
    public RestResult generalCoreIndexByUnit(String year, String unitNo) {
        GeneralCoreIndexDTO result = collegeDevDao.getGeneralCoreIndexByUnit(year, unitNo);
        if (BaseUtils.isNull(result)) {
            result = new GeneralCoreIndexDTO();
        }
        return RestResultFactory.success(result);
    }

    /**
     * Description:  学院 科研横向项目数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:36
     */
    @Override
    public RestResult countProjectHByUnitDraw(String year, Integer type, String unitNo) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = collegeDevDao.getCountProjectHByUnitDraw(year, type, unitNo);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 学院 科研纵向项目数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:37
     */
    @Override
    public RestResult countProjectVByUnitDraw(String year, Integer type, String unitNo) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = collegeDevDao.getCountProjectVByUnitDraw(year, type, unitNo);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 学院 科研成果数量统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 9:37
     */
    @Override
    public RestResult sciAchievementByUnitDraw(String year, Integer type, String unitNo) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = collegeDevDao.getSciAchievementByUnitDraw(year, type, unitNo);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 学院 科研成果等级分布
     *
     * @param year
     * @param type   0:纵向项目 1:论文 2:奖励 3:著作 4:专利 5:软著 6:艺术作品 7:研究报告
     * @param unitNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 13:31
     */
    @Override
    public RestResult sciAchvLvByUnitDraw(String year, Integer type, String unitNo) {
        List<DrawDTO> list = collegeDevDao.getSciLevelByUnitDraw(year, type, unitNo);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 学院 科研经费金额统计
     *
     * @param year
     * @param type   0:近5年趋势 1:季度趋势 2:月度趋势
     * @param unitNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 13:31
     */
    @Override
    public RestResult sciFeeByUnitDraw(String year, Integer type, String unitNo) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = collegeDevDao.getSciFeeByUnitDraw(year, type, unitNo);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 学院 科研项目经费金额统计明细
     *
     * @param year
     * @param itemCode 课题类别
     * @param timeType 时间类别 0~3 第1~4季度 4~15 第1~12月
     * @param unitNo
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 13:31
     */
    @Override
    public RestResult sciFeeByUnitDetail(String year, String itemCode, Integer timeType, String unitNo,
                                         Integer page, Integer pageSize) {
        PageQO pageQo = new PageQO(page, pageSize);
        pageQo.init();
        //科研项目经费信息表
        String fundTableName = dao.findLatestTableByPrefix("TDWB_SCI_SCI_ITEM_FUND_INFO_M_");
        //获取时间范围
        DateArea dateArea = DateUtils.getDateArea(timeType, year);
        List<ItemFundDetailDTO> list = new ArrayList();
        Integer count = 0;
        if (!BaseUtils.isNull(fundTableName)) {
            list = collegeDevDao.getSciFeeByUnitDetail(fundTableName, itemCode, dateArea, unitNo,
                    pageQo.getLimit(), pageQo.getOffset());
            count = collegeDevDao.getSciFeeByUnitDetailCount(fundTableName, itemCode, dateArea, unitNo);
        }
        return RestResultFactory.success(new CommonListDTO(list, count, pageQo));
    }

    /**
     * Description: 学院 获奖统计明细
     *
     * @param year
     * @param honorType -1 为全部
     * @param unitNo
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 13:31
     */
    @Override
    public RestResult honorStaticByUnit(String year, String honorType, String unitNo, Integer page, Integer pageSize) {
        PageQO pageQo = new PageQO(page, pageSize);
        pageQo.init();
        //获取获奖成果基本数据子类表
        String achvTableName = dao.findLatestTableByPrefix("TDWD_SCI_TECH_ACHV_WIN_ACHV_BASE_INFO_D_");
        List<HonorStaticDTO> list = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(achvTableName)) {
            list = collegeDevDao.getHonorStaticByUnit(year, honorType, achvTableName, unitNo,
                    pageQo.getLimit(), pageQo.getOffset());
            count = collegeDevDao.getHonorStaticByUnitCount(year, honorType, achvTableName, unitNo);
        }
        return RestResultFactory.success(new CommonListDTO(list, count, pageQo));
    }

    /**
     * Description: 学院 四大类项目指标总体概况
     *
     * @param year
     * @param fourItemCode 四大目标码 1.科学研究 2.队伍建设 3.人才培养 4.国际合作交流 9.其他
     * @param projectType  0:任务目标 1:贡献奖励得分 2:负面扣减分值
     * @param unitNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/20 13:32
     */
    @Override
    public RestResult generalProIndicatorsByUnit(String year, String fourItemCode, Integer projectType, String unitNo,
                                                 Integer page, Integer pageSize) {
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
                list = collegeDevDao.getMissionTargetByUnit(aimTableName, fourItemCode, unitNo,
                        pageQo.getLimit(), pageQo.getOffset());
                count = collegeDevDao.getMissionTargetByUnitCount(aimTableName, fourItemCode, unitNo);
            }
        } else if (projectType == 1) {
            titleList = Constants.fourCodeAwardList;
            //学院考核贡献得分信息表
            String contrbTableName = dao.findLatestTableByPrefix("TDWB_SCI_UNIT_EVAL_CONTRB_SCORE_INFO_M_");
            if (!BaseUtils.isNull(contrbTableName)) {
                list = collegeDevDao.getAwardScoreByUnit(contrbTableName, fourItemCode, unitNo,
                        pageQo.getLimit(), pageQo.getOffset());
                count = collegeDevDao.getAwardScoreByUnitCount(contrbTableName, fourItemCode, unitNo);
            }
        } else {
            titleList = Constants.fourCodeDeductionList;
            //学院考核扣分信息表
            String deductionTableName = dao.findLatestTableByPrefix("TDWB_SCI_UNIT_DEDUCTION_SCORE_INFO_M_");
            if (!BaseUtils.isNull(deductionTableName)) {
                list = collegeDevDao.getDeductionMsgByUnit(deductionTableName, fourItemCode, unitNo,
                        pageQo.getLimit(), pageQo.getOffset());
                count = collegeDevDao.getDeductionMsgByUnitCount(deductionTableName, fourItemCode, unitNo);
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