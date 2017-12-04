package top.zander.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.zander.model.HouseDeal;

@Mapper
public interface HouseDealMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseDeal record);

    int insertSelective(HouseDeal record);

    HouseDeal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseDeal record);

    int updateByPrimaryKey(HouseDeal record);

    void deleteByHouseRecord(@Param("houseRecord") Long houseId);
}