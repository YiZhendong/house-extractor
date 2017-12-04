package top.zander.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.zander.model.HouseKeyInfo;

@Mapper
public interface HouseKeyInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseKeyInfo record);

    int insertSelective(HouseKeyInfo record);

    HouseKeyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseKeyInfo record);

    int updateByPrimaryKey(HouseKeyInfo record);

    void deleteByHouseRecord(@Param("houseRecord") Long houseId);
}