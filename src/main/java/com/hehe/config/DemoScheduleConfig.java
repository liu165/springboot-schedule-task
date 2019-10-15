package com.hehe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * ClassName: DemoScheduleConfig <br/>
 * Description: <br/>
 * date: 2019/10/15 17:21<br/>
 *
 * @author me<br />
 * @since JDK 1.8
 */
@Configuration //prettyGood
@EnableScheduling  //taskScheduling
public class DemoScheduleConfig {
    @Scheduled(cron = "0 45/1 * * * ?")
    public void configureTasks(){
        System.out.println("demo任务正在执行中。。。。。");
    }


}
