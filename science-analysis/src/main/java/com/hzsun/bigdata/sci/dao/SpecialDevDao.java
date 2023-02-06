package com.hzsun.bigdata.sci.dao;

import com.hzsun.bigdata.sci.model.dto.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luomeng
 * @Classname: SpecialDevDao
 * @Description: 专项发展dao
 * @Date: 2020/8/25 13:43
 */
@Repository
public interface SpecialDevDao {

    /**
     * Description: 项目类别金额统计
     *
     * @param year
     * @param fourItemCode 四大目标码 1.科学研究 2.队伍建设 3.人才培养 4.国际合作交流 9.其他
     * @param type         type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/25 13:48
     */
    List<DrawDTO> getItemClassFundStatic(String year, String fourItemCode, Integer type);

    /**
     * Description: 项目来源金额统计
     *
     * @param year
     * @param fourItemCode 四大目标码 1.科学研究 2.队伍建设 3.人才培养 4.国际合作交流 9.其他
     * @param type         type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.DrawDTO>
     * @author: luomeng
     * @date: 2020/8/25 13:48
     */
    List<DrawDTO> getItemFundSrcStatic(String year, String fourItemCode, Integer type);

    /**
     * Description: 论文指标统计
     *
     * @param year
     * @param paperTableName
     * @param pubTableName
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.PaperIndexStaticDTO>
     * @author: luomeng
     * @date: 2020/8/25 15:32
     */
    List<PaperIndexStaticDTO> getPaperIndexStatic(@Param("year") String year,
                                                  @Param("paperTableName") String paperTableName,
                                                  @Param("pubTableName") String pubTableName,
                                                  @Param("limit") Integer limit,
                                                  @Param("offset") Integer offset);

    /**
     * Description: 论文指标统计(计数)
     *
     * @param year
     * @param paperTableName
     * @param pubTableName
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/8/25 15:32
     */
    Integer getPaperIndexStaticCount(@Param("year") String year,
                                     @Param("paperTableName") String paperTableName,
                                     @Param("pubTableName") String pubTableName);

    /**
     * Description: 获奖列表
     *
     * @param year
     * @param awardTableName
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.AwardListDTO>
     * @author: luomeng
     * @date: 2020/8/25 15:33
     */
    List<AwardListDTO> getAwardList(@Param("year") String year,
                                    @Param("awardTableName") String awardTableName,
                                    @Param("limit") Integer limit,
                                    @Param("offset") Integer offset);

    /**
     * Description: 获奖列表(计数)
     *
     * @param year
     * @param awardTableName
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/8/25 15:33
     */
    Integer getAwardListCount(@Param("year") String year,
                              @Param("awardTableName") String awardTableName);

    /**
     * Description: 平台基地列表
     *
     * @param year
     * @param organTableName
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.OrganBaseListDTO>
     * @author: luomeng
     * @date: 2020/8/25 15:33
     */
    List<OrganBaseListDTO> getOrganBaseList(@Param("year") String year,
                                            @Param("organTableName") String organTableName,
                                            @Param("limit") Integer limit,
                                            @Param("offset") Integer offset);

    /**
     * Description: 平台基地列表(计数)
     *
     * @param year
     * @param organTableName
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/8/25 15:33
     */
    Integer getOrganBaseListCount(@Param("year") String year, @Param("organTableName") String organTableName);

    /**
     * Description: 成果转化列表
     *
     * @param year
     * @param patentTableName
     * @param saleTableName
     * @param limit
     * @param offset
     * @return: java.util.List<com.hzsun.bigdata.sci.model.dto.AchvPatentListDTO>
     * @author: luomeng
     * @date: 2020/8/25 15:33
     */
    List<AchvPatentListDTO> getAchvPatentList(@Param("year") String year,
                                              @Param("patentTableName") String patentTableName,
                                              @Param("saleTableName") String saleTableName,
                                              @Param("limit") Integer limit,
                                              @Param("offset") Integer offset);

    /**
     * Description: 成果转化列表(计数)
     *
     * @param year
     * @param patentTableName
     * @return: java.lang.Integer
     * @author: luomeng
     * @date: 2020/8/25 15:34
     */
    Integer getAchvPatentListCount(@Param("year") String year,
                                   @Param("patentTableName") String patentTableName);
}
