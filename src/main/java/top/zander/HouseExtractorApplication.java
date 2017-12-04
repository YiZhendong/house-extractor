package top.zander;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import top.zander.service.HouseService;

import java.util.Date;
import java.util.concurrent.ThreadPoolExecutor;

@EnableScheduling
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(value = {"top.zander"})
@Configuration
@Slf4j
public class HouseExtractorApplication {

	@Autowired
	private HouseService houseService;

	public static void main(String[] args) {
		SpringApplication.run(HouseExtractorApplication.class, args);
	}

	/**
	 * 每天凌晨一点执行
	 */
//	@Scheduled(cron = "0 0 1 * * ?" )
	@Scheduled(fixedRate = 5000)
	public void sync(){
		log.info("开始刷新数据,Date:{}",new Date());
		houseService.syncHouse();
		log.info("刷新数据结束,Date:{}",new Date());
	}
}
