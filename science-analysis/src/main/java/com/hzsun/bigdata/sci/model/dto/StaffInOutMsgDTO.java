package com.hzsun.bigdata.sci.model.dto;

import com.hzsun.zbp.basic.util.BaseUtils;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luomeng
 * @Classname: StaffInOutMsgDTO
 * @Description: 人员投入产出概况信息
 * @Date: 2020-08-25 09:37
 */
@Data
public class StaffInOutMsgDTO {
    /**
     * 科研成果产出
     */
    private StaffOutPutInfoDTO staffOutPutInfo;
    /**
     * 参与项目
     */
    private List<StaffItemFundDTO> itemFundList;
    /**
     * 获得经费投入
     */
    private List<StaffFundSrcDTO> fundSrcList;

    public StaffInOutMsgDTO() {
        this.staffOutPutInfo = new StaffOutPutInfoDTO();
        this.itemFundList = new ArrayList<>();
        this.fundSrcList = new ArrayList<>();
    }

    public StaffInOutMsgDTO(StaffOutPutInfoDTO staffOutPutInfo,
                            List<StaffItemFundDTO> itemFundList,
                            List<StaffFundSrcDTO> fundSrcList) {
        this.staffOutPutInfo = new StaffOutPutInfoDTO();
        if(!BaseUtils.isNull(staffOutPutInfo)){
            this.staffOutPutInfo = staffOutPutInfo;
        }
        this.itemFundList = itemFundList;
        this.fundSrcList = fundSrcList;
    }


}