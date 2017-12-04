package top.zander.model;

public class HouseBaseInfo {
    private Integer id;

    private Long houseRecord;

    private String layoutDetail;

    private String floorInfo;

    private String totalArea;

    private String roomStruct;

    private String innerArea;

    private String houseType;

    private String houseDirection;

    private String buildingStruct;

    private String houseDecoration;

    private String oneFloorHouses;

    private String heating;

    private String lift;

    private String rightYear;

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

    public String getLayoutDetail() {
        return layoutDetail;
    }

    public void setLayoutDetail(String layoutDetail) {
        this.layoutDetail = layoutDetail == null ? null : layoutDetail.trim();
    }

    public String getFloorInfo() {
        return floorInfo;
    }

    public void setFloorInfo(String floorInfo) {
        this.floorInfo = floorInfo == null ? null : floorInfo.trim();
    }

    public String getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(String totalArea) {
        this.totalArea = totalArea == null ? null : totalArea.trim();
    }

    public String getRoomStruct() {
        return roomStruct;
    }

    public void setRoomStruct(String roomStruct) {
        this.roomStruct = roomStruct == null ? null : roomStruct.trim();
    }

    public String getInnerArea() {
        return innerArea;
    }

    public void setInnerArea(String innerArea) {
        this.innerArea = innerArea == null ? null : innerArea.trim();
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType == null ? null : houseType.trim();
    }

    public String getHouseDirection() {
        return houseDirection;
    }

    public void setHouseDirection(String houseDirection) {
        this.houseDirection = houseDirection == null ? null : houseDirection.trim();
    }

    public String getBuildingStruct() {
        return buildingStruct;
    }

    public void setBuildingStruct(String buildingStruct) {
        this.buildingStruct = buildingStruct == null ? null : buildingStruct.trim();
    }

    public String getHouseDecoration() {
        return houseDecoration;
    }

    public void setHouseDecoration(String houseDecoration) {
        this.houseDecoration = houseDecoration == null ? null : houseDecoration.trim();
    }

    public String getOneFloorHouses() {
        return oneFloorHouses;
    }

    public void setOneFloorHouses(String oneFloorHouses) {
        this.oneFloorHouses = oneFloorHouses == null ? null : oneFloorHouses.trim();
    }

    public String getHeating() {
        return heating;
    }

    public void setHeating(String heating) {
        this.heating = heating == null ? null : heating.trim();
    }

    public String getLift() {
        return lift;
    }

    public void setLift(String lift) {
        this.lift = lift == null ? null : lift.trim();
    }

    public String getRightYear() {
        return rightYear;
    }

    public void setRightYear(String rightYear) {
        this.rightYear = rightYear == null ? null : rightYear.trim();
    }
}