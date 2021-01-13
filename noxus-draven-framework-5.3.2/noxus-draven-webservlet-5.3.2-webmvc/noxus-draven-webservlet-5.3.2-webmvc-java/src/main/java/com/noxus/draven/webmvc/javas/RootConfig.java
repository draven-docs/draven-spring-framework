package com.noxus.draven.webmvc.javas;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

//去除applicationContext.xml
@Configuration
@ComponentScan(basePackages = {"com.draven.javas"}, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
})
@Import(value = JdbcConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class RootConfig {


    /**
     * 用于创建一个QueryRunner对象
     *
     * @param dataSource
     * @return
     */
    @Bean(name = "runner")
    @Scope("prototype")
    public QueryRunner createQueryRunner(@Qualifier(value = "ds2") DataSource dataSource) {
        return new QueryRunner(dataSource);
    }


}
