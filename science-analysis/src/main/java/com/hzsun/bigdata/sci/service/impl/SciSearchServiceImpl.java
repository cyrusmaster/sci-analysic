package com.hzsun.bigdata.sci.service.impl;

import com.hzsun.bigdata.sci.constant.SciSearchEnum;
import com.hzsun.bigdata.sci.dao.CommonDao;
import com.hzsun.bigdata.sci.dao.SciSearchDao;
import com.hzsun.bigdata.sci.model.dto.*;
import com.hzsun.bigdata.sci.model.qo.SciSearchQO;
import com.hzsun.bigdata.sci.service.SciSearchService;
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
 * @Classname: SciSearchServiceImpl
 * @Description: 科研查询接口实现类
 * @Date: 2020-08-26 08:41
 */
@Service
public class SciSearchServiceImpl implements SciSearchService {

    @Autowired
    private CommonDao dao;

    @Autowired
    private SciSearchDao sciSearchDao;

    /**
     * Description: 查询
     *
     * @param qo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/26 9:39
     */
    @Override
    public RestResult search(SciSearchQO qo) {
        Map<String, Object> map = new HashMap<>(3);
        qo.init();
        switch (qo.getItemClass()) {
            case 1:
                paper(map, qo);
                break;
            case 2:
                item(map, qo);
                break;
            case 3:
                award(map, qo);
                break;
            case 4:
                organ(map, qo);
                break;
            case 5:
                patent(map, qo);
                break;
            case 6:
                report(map, qo);
                break;
            case 7:
                techWork(map, qo);
                break;
            default:
                break;
        }
        map.put("topColumnList", SciSearchEnum.getTopList(qo.getItemClass()));
        map.put("endColumnList", SciSearchEnum.getEndList(qo.getItemClass()));
        map.put("page", qo.getPage());
        map.put("pageSize", qo.getPageSize());
        return RestResultFactory.success(map);
    }

    /**
     * Description:  论文
     *
     * @param map
     * @param qo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/26 11:09
     */
    private void paper(Map<String, Object> map, SciSearchQO qo) {
        String year = qo.getEndTime().substring(0, 4);
        String paperTableName = dao.findLatestTableByPrefix("TDWD_SCI_TECH_ACHV_TECH_PAPER_BASE_INFO_D_");
        String pubTableName = dao.findLatestTableByPrefix("TDWD_SCI_TECH_ACHV_TECH_PAPER_PUB_D_");
        qo.setTableName(paperTableName);
        qo.setTableNameSecond(pubTableName);
        //上部
        SciSearchPaperDTO top = sciSearchDao.getPaperTop(qo);
        if(BaseUtils.isNull(top)){
            top = new SciSearchPaperDTO();
        }
        List<SciSearchPaperDTO> endList = new ArrayList<>();
        Integer count = 0;
        //下部
        if (!BaseUtils.isNull(paperTableName) && !BaseUtils.isNull(pubTableName)) {
            endList = sciSearchDao.getPaperEndList(qo);
            count = sciSearchDao.getPaperEndListCount(qo);
        }
        map.put("top", top);
        map.put("endList", endList);
        map.put("total", count);
    }

    /**
     * Description: 项目
     *
     * @param map
     * @param qo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/26 13:41
     */
    private void item(Map<String, Object> map, SciSearchQO qo) {
        String year = qo.getEndTime().substring(0, 4);
        String tableName = dao.findLatestTableByPrefix("TDWB_SCI_SCI_ITEM_FUND_INFO_M_");
        qo.setTableName(tableName);
        SciSearchItemDTO top = sciSearchDao.getItemTop(qo);
        if(BaseUtils.isNull(top)){
            top = new SciSearchItemDTO();
        }
        List<SciSearchItemDTO> endList = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(tableName)) {
            endList = sciSearchDao.getItemEndList(qo);
            count = sciSearchDao.getItemEndListCount(qo);
        }
        map.put("top", top);
        map.put("endList", endList);
        map.put("total", count);
    }

    /**
     * Description: 获奖
     *
     * @param map
     * @param qo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/26 13:41
     */
    private void award(Map<String, Object> map, SciSearchQO qo) {
        String year = qo.getEndTime().substring(0, 4);
        String tableName = dao.findLatestTableByPrefix("TDWD_SCI_TECH_ACHV_WIN_ACHV_BASE_INFO_D_");
        qo.setTableName(tableName);
        SciSearchAwardDTO top = sciSearchDao.getAwardTop(qo);
        if(BaseUtils.isNull(top)){
            top = new SciSearchAwardDTO();
        }
        List<SciSearchAwardDTO> endList = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(tableName)) {
            endList = sciSearchDao.getAwardEndList(qo);
            count = sciSearchDao.getAwardEndListCount(qo);
        }
        map.put("top", top);
        map.put("endList", endList);
        map.put("total", count);
    }

    /**
     * Description: 平台基地
     *
     * @param map
     * @param qo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/26 13:42
     */
    private void organ(Map<String, Object> map, SciSearchQO qo) {
        String year = qo.getEndTime().substring(0, 4);
        String tableName = dao.findLatestTableByPrefix("TDWD_SCI_ORGAN_SCI_ORGAN_BASE_INFO_D_");
        qo.setTableName(tableName);
        //上部
        SciSearchOrganDTO top = sciSearchDao.getOrganTop(qo);
        if(BaseUtils.isNull(top)){
            top = new SciSearchOrganDTO();
        }
        //下部
        List<SciSearchOrganDTO> endList = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(tableName)) {
            endList = sciSearchDao.getOrganEndList(qo);
            count = sciSearchDao.getOrganEndListCount(qo);
        }
        map.put("top", top);
        map.put("endList", endList);
        map.put("total", count);
    }

    /**
     * Description: 专利
     *
     * @param map
     * @param qo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/26 13:42
     */
    private void patent(Map<String, Object> map, SciSearchQO qo) {
        String year = qo.getEndTime().substring(0, 4);
        String tableName = dao.findLatestTableByPrefix("TDWD_SCI_TECH_ACHV_PATENT_ACHV_BASE_INFO_D_");
        qo.setTableName(tableName);
        //上部
        SciSearchPatentDTO top = sciSearchDao.getPatentTop(qo);
        if(BaseUtils.isNull(top)){
            top = new SciSearchPatentDTO();
        }
        //下部
        List<SciSearchPatentDTO> endList = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(tableName)) {
            endList = sciSearchDao.getPatentEndList(qo);
            count = sciSearchDao.getPatentEndListCount(qo);
        }
        map.put("top", top);
        map.put("endList", endList);
        map.put("total", count);
    }

    /**
     * Description: 会议报告
     *
     * @param map
     * @param qo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/26 13:42
     */
    private void report(Map<String, Object> map, SciSearchQO qo) {
        String year = qo.getEndTime().substring(0, 4);
        String tableName = dao.findLatestTableByPrefix("TDWD_SCI_ACAD_EXCH_ACAD_CONF_D_");
        qo.setTableName(tableName);
        //上部
        SciSearchReportDTO top = sciSearchDao.getReportTop(qo);
        if(BaseUtils.isNull(top)){
            top = new SciSearchReportDTO();
        }
        //下部
        List<SciSearchReportDTO> endList = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(tableName)) {
            endList = sciSearchDao.getReportEndList(qo);
            count = sciSearchDao.getReportEndListCount(qo);
        }
        map.put("top", top);
        map.put("endList", endList);
        map.put("total", count);
    }

    /**
     * Description: 著作
     *
     * @param map
     * @param qo
     * @return: void
     * @author: luomeng
     * @date: 2020/8/26 13:42
     */
    private void techWork(Map<String, Object> map, SciSearchQO qo) {
        String year = qo.getEndTime().substring(0, 4);
        String tableName = dao.findLatestTableByPrefix("TDWD_SCI_TECH_ACHV_TECH_WORK_D_");
        qo.setTableName(tableName);
        //上部
        SciSearchTechWorkDTO top = sciSearchDao.getTechWorkTop(qo);
        if(BaseUtils.isNull(top)){
            top = new SciSearchTechWorkDTO();
        }
        //下部
        List<SciSearchTechWorkDTO> endList = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(tableName)) {
            endList = sciSearchDao.getTechWorkEndList(qo);
            count = sciSearchDao.getTechWorkEndListCount(qo);
        }
        map.put("top", top);
        map.put("endList", endList);
        map.put("total", count);
    }

}