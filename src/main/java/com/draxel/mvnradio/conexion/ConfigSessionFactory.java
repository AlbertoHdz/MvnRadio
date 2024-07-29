/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.draxel.mvnradio.conexion;

import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Albert
 */
@Configuration
@EnableTransactionManagement
public class ConfigSessionFactory {

//    @Bean(name = "dataSourceRadio")
//    static public DataSource getDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//
//        /* DEV */
////        dataSource.setUrl("jdbc:sqlserver://172.17.90.226:49200;databaseName=siox;");
////        dataSource.setUsername("dbaSIOX");
////        dataSource.setPassword("DEVx8n8$Gw$%ZH");
//
//        /*QAS*/
//        dataSource.setUrl("jdbc:sqlserver://172.17.90.225:49200;databaseName=siox;");
//        dataSource.setUsername("dbaSIOX");
//        dataSource.setPassword("QAS9XmQkNAw*8Y");
//
//
//        /* PRD */
////        System.out.println("prd");
////        dataSource.setUrl("jdbc:sqlserver://172.17.90.224:49200;databaseName=siox;");
////        dataSource.setUsername("siox");
////        dataSource.setPassword("pGTI+db*2016!S.");
//
//        
//        System.out.println("dataSource Radio=>" + dataSource.getUrl());
//        if (dataSource.getUrl().contains("172.17.90.226")) {
//            System.out.println("************************************************");
//            System.out.println("******              SQL SERVER            ******");
//            System.out.println("**                  DEV                **");
//            System.out.println("******====================================******");
//            System.out.println("************************************************");
//        } else if (dataSource.getUrl().contains("172.17.90.224")) {
//            System.out.println("************************************************");
//            System.out.println("******              SQL SERVER            ******");
//            System.out.println("**                  PRODUCTIVO                **");
//            System.out.println("******====================================******");
//            System.out.println("************************************************");
//        } else {
//            System.out.println("************************************************");
//            System.out.println("******              SQL SERVER            ******");
//            System.out.println("**                     QAS                    **");
//            System.out.println("******====================================******");
//            System.out.println("************************************************");
//        }
//
//        return dataSource;
//
//    }
//
//    @Bean(name = "sessionFactoryRadio")
//    @Primary
//    public LocalSessionFactoryBean getSessionFactory(@Qualifier("dataSourceRadio") DataSource dataSource) {
//
//        System.out.println(dataSource);
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//
//        sessionFactory.setDataSource(dataSource);
//        Resource configLocation = new ClassPathResource("/sql-hibernate.cfg.xml");
//        sessionFactory.setConfigLocation(configLocation);
//        sessionFactory.setPackagesToScan("com.draxel.mvnradio");
//
//        return sessionFactory;
//    }
//
//    @Bean(name = "transactionManagerRadio")
//    @Primary
//    public PlatformTransactionManager hibernateTransactionManager(@Qualifier("sessionFactoryRadio") SessionFactory sessionFactory) {
//        HibernateTransactionManager transactionManager
//                = new HibernateTransactionManager();
//        transactionManager.setSessionFactory(sessionFactory);
//        return transactionManager;
//    }
//
//    @Bean
//    public JdbcTemplate getJdbcTemplate(@Qualifier("dataSourceRadio") DataSource dataSource) {
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        jdbcTemplate.setDataSource(dataSource);
//        System.out.println(jdbcTemplate);
//        return jdbcTemplate;
//    }

}
