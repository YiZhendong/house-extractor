package top.zander.mapper;

import top.zander.model.HouseFinished;

/**
 * @Description:
 * @vertion:1.0
 * @author:yizhendong
 * @date:2017/12/4 21:40
 */
public interface HouseFinishedMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HouseFinished record);

    int insertSelective(HouseFinished record);

    HouseFinished selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HouseFinished record);

    int updateByPrimaryKey(HouseFinished record);
}
