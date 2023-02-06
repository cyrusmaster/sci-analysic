package com.hzsun.bigdata.sci.service.impl;

import com.hzsun.bigdata.sci.constant.Constants;
import com.hzsun.bigdata.sci.dao.CommonDao;
import com.hzsun.bigdata.sci.dao.SpecialDevDao;
import com.hzsun.bigdata.sci.model.dto.*;
import com.hzsun.bigdata.sci.service.SpecialDevService;
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
 * @Classname: SpecialDevServiceImpl
 * @Description: 专项发展概况接口实现类
 * @Date: 2020-08-25 11:12
 */
@Service
public class SpecialDevServiceImpl implements SpecialDevService {

    @Autowired
    private SpecialDevDao specialDevDao;

    @Autowired
    private CommonDao dao;

    /**
     * Description: 项目类别金额统计
     *
     * @param year
     * @param fourItemCode 四大目标码 1.科学研究 2.队伍建设 3.人才培养 4.国际合作交流 9.其他
     * @param type         type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/25 13:41
     */
    @Override
    public RestResult itemClassFundStatic(String year, String fourItemCode, Integer type) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = specialDevDao.getItemClassFundStatic(year, fourItemCode, type);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 项目来源金额统计
     *
     * @param year
     * @param fourItemCode 四大目标码 1.科学研究 2.队伍建设 3.人才培养 4.国际合作交流 9.其他
     * @param type         type 0:近5年趋势 1:季度趋势 2:月度趋势
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/25 13:42
     */
    @Override
    public RestResult itemFundSrcStatic(String year, String fourItemCode, Integer type) {
        if (type >= Constants.TYPE_FLAG) {
            return RestResultFactory.success(new ArrayList<>());
        }
        if (type == 0) {
            year = String.valueOf(Integer.valueOf(year) - 5);
        }
        List<DrawDTO> list = specialDevDao.getItemFundSrcStatic(year, fourItemCode, type);
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        return RestResultFactory.success(list);
    }

    /**
     * Description: 论文指标统计
     *
     * @param year
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/25 15:14
     */
    @Override
    public RestResult paperIndexStatic(String year, Integer page, Integer pageSize) {
        PageQO pageQo = new PageQO(page, pageSize);
        pageQo.init();
        //论文信息表
        String paperTableName = dao.findLatestTableByPrefix("TDWD_SCI_TECH_ACHV_TECH_PAPER_BASE_INFO_D_");
        //论文发表情况表
        String pubTableName = dao.findLatestTableByPrefix("TDWD_SCI_TECH_ACHV_TECH_PAPER_PUB_D_");
        List<PaperIndexStaticDTO> list = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(paperTableName) && !BaseUtils.isNull(pubTableName)) {
            list = specialDevDao.getPaperIndexStatic(year,paperTableName, pubTableName, pageQo.getLimit(), pageQo.getOffset());
            count = specialDevDao.getPaperIndexStaticCount(year,paperTableName, pubTableName);
        }
        return RestResultFactory.success(new CommonListDTO(list, count, pageQo));
    }

    /**
     * Description: 获奖列表
     *
     * @param year
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/25 15:15
     */
    @Override
    public RestResult awardList(String year, Integer page, Integer pageSize) {
        PageQO pageQo = new PageQO(page, pageSize);
        pageQo.init();
        String awardTableName = dao.findLatestTableByPrefix("TDWD_SCI_TECH_ACHV_WIN_ACHV_BASE_INFO_D_");
        List<AwardListDTO> list = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(awardTableName)) {
            list = specialDevDao.getAwardList(year,awardTableName, pageQo.getLimit(), pageQo.getOffset());
            count = specialDevDao.getAwardListCount(year,awardTableName);
        }
        return RestResultFactory.success(new CommonListDTO(list, count, pageQo));
    }

    /**
     * Description: 平台基地列表
     *
     * @param year
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/25 15:15
     */
    @Override
    public RestResult organBaseList(String year, Integer page, Integer pageSize) {
        PageQO pageQo = new PageQO(page, pageSize);
        pageQo.init();
        String organTableName = dao.findLatestTableByPrefix("TDWD_SCI_ORGAN_SCI_ORGAN_BASE_INFO_D_");
        List<OrganBaseListDTO> list = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(organTableName)) {
            list = specialDevDao.getOrganBaseList(year,organTableName, pageQo.getLimit(), pageQo.getOffset());
            count = specialDevDao.getOrganBaseListCount(year,organTableName);
        }
        return RestResultFactory.success(new CommonListDTO(list, count, pageQo));
    }

    /**
     * Description: 成果转化列表
     *
     * @param year
     * @param page
     * @param pageSize
     * @return: com.hzsun.zbp.basic.util.RestResult
     * @author: luomeng
     * @date: 2020/8/25 15:15
     */
    @Override
    public RestResult achvPatentList(String year, Integer page, Integer pageSize) {
        PageQO pageQo = new PageQO(page, pageSize);
        pageQo.init();
        String patentTableName = dao.findLatestTableByPrefix("TDWD_SCI_TECH_ACHV_PATENT_ACHV_BASE_INFO_D_");
        String saleTableName = dao.findLatestTableByPrefix("TDWD_SCI_TECH_ACHV_PATENT_SALE_D_");
        List<AchvPatentListDTO> list = new ArrayList<>();
        Integer count = 0;
        if (!BaseUtils.isNull(patentTableName) && !BaseUtils.isNull(saleTableName)) {
            list = specialDevDao.getAchvPatentList(year,patentTableName, saleTableName, pageQo.getLimit(), pageQo.getOffset());
            count = specialDevDao.getAchvPatentListCount(year,patentTableName);
        }
        return RestResultFactory.success(new CommonListDTO(list, count, pageQo));
    }
}