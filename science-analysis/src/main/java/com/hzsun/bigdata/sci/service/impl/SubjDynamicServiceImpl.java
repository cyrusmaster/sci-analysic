package com.hzsun.bigdata.sci.service.impl;

import com.hzsun.bigdata.sci.dao.CommonDao;
import com.hzsun.bigdata.sci.dao.SubjDynamicDao;
import com.hzsun.bigdata.sci.model.dto.DrawDTO;
import com.hzsun.bigdata.sci.model.dto.HotPaperDTO;
import com.hzsun.bigdata.sci.model.dto.HotWordDetailDTO;
import com.hzsun.bigdata.sci.model.dto.HotWordSummaryDTO;
import com.hzsun.bigdata.sci.model.qo.SubjDynamicQO;
import com.hzsun.bigdata.sci.service.SubjDynamicService;
import com.hzsun.zbp.basic.model.dto.CommonListDTO;
import com.hzsun.zbp.basic.util.BaseUtils;
import com.hzsun.zbp.basic.util.RestResult;
import com.hzsun.zbp.basic.util.RestResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luomeng
 * @Classname: SubjDynamicSerivceImpl
 * @Description: 学科动态接口实现类
 * @Date: 2020-08-31 14:55
 */
@Service
public class SubjDynamicServiceImpl implements SubjDynamicService {

    @Autowired
    private SubjDynamicDao subjDynamicDao;

    @Autowired
    private CommonDao dao;

    /**
     * Description: 研究热点词汇统计
     *
     * @param qo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 17:18
     */
    @Override
    public RestResult hotWordSummary(SubjDynamicQO qo) {
        String tableName = dao.findLatestYearTableByYear("TDWB_SCI_SUBJ_SCI_HOT_WORD_INFO_Y_", qo.getYear());
        HotWordSummaryDTO result = new HotWordSummaryDTO();
        if (!BaseUtils.isNull(tableName)) {
            result = subjDynamicDao.getHotWordSummary(qo);
        }
        return RestResultFactory.success(result);
    }

    /**
     * Description: 热点词汇详情
     *
     * @param qo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 17:18
     */
    @Override
    public RestResult hotWordList(SubjDynamicQO qo) {
        qo.init();
        String tableName = dao.findLatestYearTableByYear("TDWB_SCI_SUBJ_SCI_HOT_WORD_INFO_Y_", qo.getYear());
        List<HotWordDetailDTO> list = new ArrayList<>();
        if (!BaseUtils.isNull(tableName)) {
            list = subjDynamicDao.getHotWordList(qo);
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 热词趋势图表
     *
     * @param qo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 17:18
     */
    @Override
    public RestResult hotWordTrendDraw(SubjDynamicQO qo) {
        String tableName = dao.findLatestYearTableByYear("TDWB_SCI_SUBJ_SCI_HOT_WORD_INFO_Y_", qo.getYear());
        List<DrawDTO> list = new ArrayList<>();
        if (!BaseUtils.isNull(tableName) && !BaseUtils.isNull(qo.getHotWord())) {
            list = subjDynamicDao.getHotWordTrendDraw(qo);
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 学科前沿和热点论文
     *
     * @param qo
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/31 17:19
     */
    @Override
    public RestResult hotPaperDetail(SubjDynamicQO qo) {
        qo.init();
        String tableName = dao.findLatestYearTableByYear("TDWB_SCI_SUBJ_SCI_PAPER_INFO_Y_", qo.getYear());
        List<HotPaperDTO> list = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(tableName)) {
            list = subjDynamicDao.getHotPaperDetail(qo);
            count = subjDynamicDao.getHotPaperDetailCount(qo);
        }
        return RestResultFactory.success(new CommonListDTO(list, qo.getPage(), qo.getPageSize(), count));
    }
}