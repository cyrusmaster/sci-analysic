package com.hzsun.bigdata.sci.dao;

import com.hzsun.bigdata.sci.model.dto.DrawDTO;
import com.hzsun.bigdata.sci.model.dto.HotPaperDTO;
import com.hzsun.bigdata.sci.model.dto.HotWordDetailDTO;
import com.hzsun.bigdata.sci.model.dto.HotWordSummaryDTO;
import com.hzsun.bigdata.sci.model.qo.SubjDynamicQO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luomeng
 * @Classname: SubjDynamicDao
 * @Description: 科研动态Dao
 * @Date: 2020/8/31 14:58
 */
@Repository
public interface SubjDynamicDao {
    /**
     * Description: 研究热点词汇统计
     *
     * @param qo
     * @return: com.hzsun.bigdata.sci.model.dto.HotWordSummaryDTO
     * @author: luomeng
     * @date: 2020/8/31 17:29
     */
    HotWordSummaryDTO getHotWordSummary(SubjDynamicQO qo);

    /**
     * Description: 热点词汇详情
     *
     * @param qo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.HotWordDetailDTO>
     * @author: luomeng
     * @date: 2020/8/31 17:29
     */
    List<HotWordDetailDTO> getHotWordList(SubjDynamicQO qo);

    /**
     * Description: 热词趋势图表
     *
     * @param qo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/31 17:29
     */
    List<DrawDTO> getHotWordTrendDraw(SubjDynamicQO qo);

    /**
     * Description: 学科前沿和热点论文
     *
     * @param qo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.HotPaperDTO>
     * @author: luomeng
     * @date: 2020/8/31 17:29
     */
    List<HotPaperDTO> getHotPaperDetail(SubjDynamicQO qo);

    /**
     * Description: 学科前沿和热点论文(计数)
     *
     * @param qo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.HotPaperDTO>
     * @author: luomeng
     * @date: 2020/8/31 17:29
     */
    Integer getHotPaperDetailCount(SubjDynamicQO qo);
}
