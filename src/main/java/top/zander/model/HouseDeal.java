package top.zander.model;

import java.util.Date;

public class HouseDeal {
    private Integer id;

    private Long houseRecord;

    private Date createTime;

    private String ownership;

    private Date lastDealTime;

    private String useType;

    private String useYears;

    private String rightType;

    private String pledgeInfo;

    private String attachment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getHouseRecord() {
        return houseRecord;
    }

    public void setHouseRecord(Long houseRecord) {
        this.houseRecord = houseRecord;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership == null ? null : ownership.trim();
    }

    public Date getLastDealTime() {
        return lastDealTime;
    }

    public void setLastDealTime(Date lastDealTime) {
        this.lastDealTime = lastDealTime;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType == null ? null : useType.trim();
    }

    public String getUseYears() {
        return useYears;
    }

    public void setUseYears(String useYears) {
        this.useYears = useYears == null ? null : useYears.trim();
    }

    public String getRightType() {
        return rightType;
    }

    public void setRightType(String rightType) {
        this.rightType = rightType == null ? null : rightType.trim();
    }

    public String getPledgeInfo() {
        return pledgeInfo;
    }

    public void setPledgeInfo(String pledgeInfo) {
        this.pledgeInfo = pledgeInfo == null ? null : pledgeInfo.trim();
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }
}