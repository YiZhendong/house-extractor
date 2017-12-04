package top.zander.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.zander.model.HouseBaseInfo;

@Mapper
public interface HouseBaseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseBaseInfo record);

    int insertSelective(HouseBaseInfo record);

    HouseBaseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseBaseInfo record);

    int updateByPrimaryKey(HouseBaseInfo record);

    void deleteByHouseRecord(@Param("houseRecord") Long houseRecord);
}