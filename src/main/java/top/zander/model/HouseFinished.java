package top.zander.model;

import java.util.Date;

/**
 * @Description:
 * @vertion:1.0
 * @author:yizhendong
 * @date:2017/12/4 21:41
 */
public class HouseFinished {
    private Long id;

    private String houseRecord;

    private Integer finalPrice;

    private Integer initPrice;

    private Integer finishedPeriod;

    private Integer changeNumber;

    private Integer cartCount;

    private Integer favCount;

    private Integer viewCount;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHouseRecord() {
        return houseRecord;
    }

    public void setHouseRecord(String houseRecord) {
        this.houseRecord = houseRecord == null ? null : houseRecord.trim();
    }

    public Integer getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Integer finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Integer getInitPrice() {
        return initPrice;
    }

    public void setInitPrice(Integer initPrice) {
        this.initPrice = initPrice;
    }

    public Integer getFinishedPeriod() {
        return finishedPeriod;
    }

    public void setFinishedPeriod(Integer finishedPeriod) {
        this.finishedPeriod = finishedPeriod;
    }

    public Integer getChangeNumber() {
        return changeNumber;
    }

    public void setChangeNumber(Integer changeNumber) {
        this.changeNumber = changeNumber;
    }

    public Integer getCartCount() {
        return cartCount;
    }

    public void setCartCount(Integer cartCount) {
        this.cartCount = cartCount;
    }

    public Integer getFavCount() {
        return favCount;
    }

    public void setFavCount(Integer favCount) {
        this.favCount = favCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
