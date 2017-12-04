package top.zander.model;

import java.sql.Timestamp;

public class HouseKeyInfo {
    private Integer id;

    private Long houseRecord;

    private String title;

    private String subTitle;

    private Integer favCount;

    private Integer cartCount;

    private Integer totalPrice;

    private Integer unitPrice;

    private Integer taxText;

    private String roomLayout;

    private Integer roomNumber;

    private String roomTotalFloors;

    private String roomFloor;

    private String roomStruct;

    private String houseDirection;

    private String houseDecoration;

    private Double totalArea;

    private String yearHouseType;

    private Integer year;

    private Byte buildingAge;

    private String houseType;

    private String communityName;

    private String district;

    private String subway;

    private String cycle;

    private String subwayText;

    private String subwayLine;

    private String visitTime;

    private Timestamp updateTime;

    private Timestamp createTime;

    private Integer isDeal;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public Integer getFavCount() {
        return favCount;
    }

    public void setFavCount(Integer favCount) {
        this.favCount = favCount;
    }

    public Integer getCartCount() {
        return cartCount;
    }

    public void setCartCount(Integer cartCount) {
        this.cartCount = cartCount;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getTaxText() {
        return taxText;
    }

    public void setTaxText(Integer taxText) {
        this.taxText = taxText;
    }

    public String getRoomLayout() {
        return roomLayout;
    }

    public void setRoomLayout(String roomLayout) {
        this.roomLayout = roomLayout == null ? null : roomLayout.trim();
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomTotalFloors() {
        return roomTotalFloors;
    }

    public void setRoomTotalFloors(String roomTotalFloors) {
        this.roomTotalFloors = roomTotalFloors == null ? null : roomTotalFloors.trim();
    }

    public String getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(String roomFloor) {
        this.roomFloor = roomFloor == null ? null : roomFloor.trim();
    }

    public String getRoomStruct() {
        return roomStruct;
    }

    public void setRoomStruct(String roomStruct) {
        this.roomStruct = roomStruct == null ? null : roomStruct.trim();
    }

    public String getHouseDirection() {
        return houseDirection;
    }

    public void setHouseDirection(String houseDirection) {
        this.houseDirection = houseDirection == null ? null : houseDirection.trim();
    }

    public String getHouseDecoration() {
        return houseDecoration;
    }

    public void setHouseDecoration(String houseDecoration) {
        this.houseDecoration = houseDecoration == null ? null : houseDecoration.trim();
    }

    public Double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(Double totalArea) {
        this.totalArea = totalArea;
    }

    public String getYearHouseType() {
        return yearHouseType;
    }

    public void setYearHouseType(String yearHouseType) {
        this.yearHouseType = yearHouseType == null ? null : yearHouseType.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Byte getBuildingAge() {
        return buildingAge;
    }

    public void setBuildingAge(Byte buildingAge) {
        this.buildingAge = buildingAge;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType == null ? null : houseType.trim();
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName == null ? null : communityName.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getSubway() {
        return subway;
    }

    public void setSubway(String subway) {
        this.subway = subway == null ? null : subway.trim();
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }

    public String getSubwayText() {
        return subwayText;
    }

    public void setSubwayText(String subwayText) {
        this.subwayText = subwayText == null ? null : subwayText.trim();
    }

    public String getSubwayLine() {
        return subwayLine;
    }

    public void setSubwayLine(String subwayLine) {
        this.subwayLine = subwayLine == null ? null : subwayLine.trim();
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime == null ? null : visitTime.trim();
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDeal() {
        return isDeal;
    }

    public void setIsDeal(Integer isDeal) {
        this.isDeal = isDeal;
    }
}