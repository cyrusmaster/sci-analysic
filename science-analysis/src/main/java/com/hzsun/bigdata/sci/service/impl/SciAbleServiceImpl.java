package com.hzsun.bigdata.sci.service.impl;

import com.hzsun.bigdata.sci.dao.CommonDao;
import com.hzsun.bigdata.sci.dao.SciAbleDao;
import com.hzsun.bigdata.sci.model.dto.DrawDTO;
import com.hzsun.bigdata.sci.model.dto.SciAbleCommonDTO;
import com.hzsun.bigdata.sci.model.dto.SciSchDetailDTO;
import com.hzsun.bigdata.sci.service.SciAbleService;
import com.hzsun.zbp.basic.model.dto.CommonListDTO;
import com.hzsun.zbp.basic.model.qo.PageQO;
import com.hzsun.zbp.basic.util.BaseDateUtils;
import com.hzsun.zbp.basic.util.BaseUtils;
import com.hzsun.zbp.basic.util.RestResult;
import com.hzsun.zbp.basic.util.RestResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luomeng
 * @Classname: SciAbleServiceImpl
 * @Description: 科研能力横向对比接口实现类
 * @Date: 2020-08-31 14:49
 */
@Service
public class SciAbleServiceImpl implements SciAbleService {

    @Autowired
    private SciAbleDao sciAbleDao;

    @Autowired
    private CommonDao dao;

    /**
     * Description: 科研平台
     *
     * @param year
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 15:33
     */
    @Override
    public RestResult sciPlatform(String year) {
        String tableName = dao.findLatestTableByPrefix("TDWB_SCI_SCH_SCI_PLAT_RSRC_COMP_INFO_Y_");
        List<SciAbleCommonDTO> list = new ArrayList<>();
        if (!BaseUtils.isNull(tableName)) {
            list = sciAbleDao.getSciPlatForm(tableName,year);
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 人才资源
     *
     * @param year
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 15:33
     */
    @Override
    public RestResult humanSrc(String year) {
        String tableName = dao.findLatestTableByPrefix("TDWB_SCI_SCH_SCI_PLAT_RSRC_COMP_INFO_Y_");
        List<SciAbleCommonDTO> list = new ArrayList<>();
        if (!BaseUtils.isNull(tableName)) {
            list = sciAbleDao.getHumanSrc(tableName,year);
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 对标同类型高校学科图表
     *
     * @param year
     * @param sciNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 15:33
     */
    @Override
    public RestResult subjCompareDraw(String year, String sciNo) {
        String tableName = dao.findLatestTableByPrefix("TDWB_SCI_SCH_SCI_ACHV_COMP_INFO_Y_");
        List<DrawDTO> list = new ArrayList<>();
        if (!BaseUtils.isNull(tableName)) {
            list = sciAbleDao.subjCompareDraw(tableName,year, sciNo);
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 综合对比
     *
     * @param year
     * @param sciNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 15:33
     */
    @Override
    public RestResult fixCompare(String year, String sciNo) {
        String tableName = dao.findLatestTableByPrefix("TDWB_SCI_SCH_SUBJ_SCI_PLAT_RSRC_INFO_Y_");
        List<SciAbleCommonDTO> list = new ArrayList<>();
        if (!BaseUtils.isNull(tableName)) {
            list = sciAbleDao.getFixCompare(tableName,year, sciNo);
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 其他学校明细
     *
     * @param year
     * @param sciNo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 15:33
     */
    @Override
    public RestResult schDetail(String year, String sciNo, Integer page, Integer pageSize) {
        PageQO pageQo = new PageQO(page, pageSize);
        pageQo.init();
        String tableName = dao.findLatestTableByPrefix("TDWB_SCI_SCH_SUBJ_SCI_PLAT_RSRC_INFO_Y_");
        List<SciSchDetailDTO> list = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(tableName)) {
            list = sciAbleDao.getSchDetail(tableName,year, sciNo, pageQo.getLimit(), pageQo.getOffset());
            count = sciAbleDao.getSchDetailCount(tableName,year, sciNo);
        }
        return RestResultFactory.success(new CommonListDTO(list, count, pageQo));
    }
}