package com.example.Spring_HW08.configuration;

import com.example.Spring_HW08.aspect.UserActionAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@Configuration
@ComponentScan(basePackages = "com.example.Spring_HW08")
@EnableAspectJAutoProxy
public class AspectConfiguration {
    @Bean
    public UserActionAspect aspect() {
        return new UserActionAspect();
    }

    /**
     * Логирование действий пользователы
     * @return имя метода (действие пользователя)
     * @throws IOException
     */
    @Bean
    public Logger noteLogger() throws IOException {
        Logger logger = Logger.getLogger(UserActionAspect.class.getName());
        ConsoleHandler handler = new ConsoleHandler();
//        FileHandler handler = new FileHandler("log.txt");
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);
        return logger;
    }
}