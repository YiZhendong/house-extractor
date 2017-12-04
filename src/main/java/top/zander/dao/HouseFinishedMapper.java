package top.zander.dao;

import org.apache.ibatis.annotations.Mapper;
import top.zander.model.HouseFinished;

/**
 * @Description:
 * @vertion:1.0
 * @author:yizhendong
 * @date:2017/12/4 21:40
 */
@Mapper
public interface HouseFinishedMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HouseFinished record);

    int insertSelective(HouseFinished record);

    HouseFinished selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HouseFinished record);

    int updateByPrimaryKey(HouseFinished record);
}
