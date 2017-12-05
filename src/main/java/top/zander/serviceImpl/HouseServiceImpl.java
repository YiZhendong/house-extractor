package top.zander.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;
import top.zander.dao.HouseFinishedMapper;
import top.zander.dao.HouseKeyInfoMapper;
import top.zander.model.HouseFinished;
import top.zander.service.HouseService;

import javax.annotation.Resource;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @Description:
 * @vertion:1.0
 * @author:yizhendong
 * @date:2017/12/4 22:59
 */
@Service
@Slf4j
public class HouseServiceImpl implements HouseService {
    @Resource
    private ThreadPoolTaskExecutor threadPoolExecutor;

    @Autowired
    private HouseKeyInfoMapper houseKeyInfoMapper;

    @Autowired
    private HouseFinishedMapper houseFinishedMapper;


    @Override
    public void syncHouse() {
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                StopWatch stopWatch = new StopWatch("本次更新过期任务");
                stopWatch.start();
                log.info("本次更新过期任务开始");
                updateHouse();
                log.info("本次更新过期任务结束");
                stopWatch.stop();
                stopWatch.toString();
            }
        });
    }

    private void updateHouse() {
//        HouseKeyInfo houseKeyInfo = houseKeyInfoMapper.selectByPrimaryKey(1);
        HouseFinished houseFinished = houseFinishedMapper.selectByPrimaryKey(1L);
//        log.info("HouseKeyInfo:{}",houseKeyInfo);
    }
}
