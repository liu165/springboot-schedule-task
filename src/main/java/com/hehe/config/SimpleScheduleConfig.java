package com.hehe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

@Configuration //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling // 2.openRegularTasks 开启定时任务
public class SimpleScheduleConfig {
    //3.Add regular tasks
    @Scheduled(cron = "0/60 * * * * ?")
    private void configureTasks() {
        System.err.println("执行定时任务1: " + LocalDateTime.now());
    }

}