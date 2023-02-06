package com.hzsun.bigdata.sci.dao;

import com.hzsun.bigdata.sci.model.dto.*;
import com.hzsun.bigdata.sci.model.qo.SciSearchQO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luomeng
 * @Classname: SciSearchDao
 * @Description: 科研查询 Dao
 * @Date: 2020/8/26 11:17
 */
@Repository
public interface SciSearchDao {

    /**
     * Description: 论文 上部
     *
     * @param qo
     * @return: com.hzsun.bigdata.sci.model.dto.SciSearchPaperDTO
     * @author: luomeng
     * @date: 2020/8/26 15:41
     */
    SciSearchPaperDTO getPaperTop(SciSearchQO qo);

    /**
     * Description: 论文 下部
     *
     * @param qo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.SciSearchPaperDTO>
     * @author: luomeng
     * @date: 2020/8/26 15:41
     */
    List<SciSearchPaperDTO> getPaperEndList(SciSearchQO qo);

    /**
     * Description: 论文 下部(计数)
     *
     * @param qo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/2 16:54
     */
    Integer getPaperEndListCount(SciSearchQO qo);

    /**
     * Description: 项目 上部
     *
     * @param qo
     * @return: com.hzsun.bigdata.sci.model.dto.SciSearchItemDTO
     * @author: luomeng
     * @date: 2020/8/26 15:41
     */
    SciSearchItemDTO getItemTop(SciSearchQO qo);

    /**
     * Description: 项目 下部
     *
     * @param qo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.SciSearchItemDTO>
     * @author: luomeng
     * @date: 2020/8/26 15:42
     */
    List<SciSearchItemDTO> getItemEndList(SciSearchQO qo);

    /**
     * Description: 项目 下部(计数)
     *
     * @param qo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/2 16:55
     */
    Integer getItemEndListCount(SciSearchQO qo);

    /**
     * Description: 获奖 上部
     *
     * @param qo
     * @return: com.hzsun.bigdata.sci.model.dto.SciSearchAwardDTO
     * @author: luomeng
     * @date: 2020/8/26 15:42
     */
    SciSearchAwardDTO getAwardTop(SciSearchQO qo);

    /**
     * Description: 获奖 下部
     *
     * @param qo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.SciSearchAwardDTO>
     * @author: luomeng
     * @date: 2020/8/26 15:42
     */
    List<SciSearchAwardDTO> getAwardEndList(SciSearchQO qo);

    /**
     * Description: 获奖 下部(计数)
     *
     * @param qo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/2 16:55
     */
    Integer getAwardEndListCount(SciSearchQO qo);

    /**
     * Description: 平台基地 上部
     *
     * @param qo
     * @return: com.hzsun.bigdata.sci.model.dto.SciSearchOrganDTO
     * @author: luomeng
     * @date: 2020/8/26 15:42
     */
    SciSearchOrganDTO getOrganTop(SciSearchQO qo);

    /**
     * Description: 平台基地 下部
     *
     * @param qo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.SciSearchOrganDTO>
     * @author: luomeng
     * @date: 2020/8/26 15:42
     */
    List<SciSearchOrganDTO> getOrganEndList(SciSearchQO qo);

    /**
     * Description: 平台基地 下部(计数)
     *
     * @param qo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/2 16:55
     */
    Integer getOrganEndListCount(SciSearchQO qo);

    /**
     * Description: 专利 上部
     *
     * @param qo
     * @return: com.hzsun.bigdata.sci.model.dto.SciSearchPatentDTO
     * @author: luomeng
     * @date: 2020/8/26 15:42
     */
    SciSearchPatentDTO getPatentTop(SciSearchQO qo);

    /**
     * Description: 专利 下部
     *
     * @param qo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.SciSearchPatentDTO>
     * @author: luomeng
     * @date: 2020/8/26 15:42
     */
    List<SciSearchPatentDTO> getPatentEndList(SciSearchQO qo);

    /**
     * Description: 专利 下部(计数)
     *
     * @param qo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/2 16:56
     */
    Integer getPatentEndListCount(SciSearchQO qo);

    /**
     * Description: 会议报告 上部
     *
     * @param qo
     * @return: com.hzsun.bigdata.sci.model.dto.SciSearchReportDTO
     * @author: luomeng
     * @date: 2020/8/26 15:42
     */
    SciSearchReportDTO getReportTop(SciSearchQO qo);

    /**
     * Description: 会议报告 下部
     *
     * @param qo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.SciSearchReportDTO>
     * @author: luomeng
     * @date: 2020/8/26 15:42
     */
    List<SciSearchReportDTO> getReportEndList(SciSearchQO qo);

    /**
     * Description: 会议报告 下部(计数)
     *
     * @param qo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/2 16:58
     */
    Integer getReportEndListCount(SciSearchQO qo);

    /**
     * Description: 专著 上部
     *
     * @param qo
     * @return: com.hzsun.bigdata.sci.model.dto.SciSearchTechWorkDTO
     * @author: luomeng
     * @date: 2020/8/26 15:42
     */
    SciSearchTechWorkDTO getTechWorkTop(SciSearchQO qo);

    /**
     * Description: 专著 下部
     *
     * @param qo
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.SciSearchTechWorkDTO>
     * @author: luomeng
     * @date: 2020/8/26 15:42
     */
    List<SciSearchTechWorkDTO> getTechWorkEndList(SciSearchQO qo);

    /**
     * Description: 专著 下部(计数)
     *
     * @param qo
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/9/2 16:58
     */
    Integer getTechWorkEndListCount(SciSearchQO qo);
}
