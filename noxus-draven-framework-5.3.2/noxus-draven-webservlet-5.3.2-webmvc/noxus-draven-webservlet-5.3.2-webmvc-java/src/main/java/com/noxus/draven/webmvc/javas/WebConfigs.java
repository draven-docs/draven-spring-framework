package com.noxus.draven.webmvc.javas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 〈功能概述〉<br>
 *
 * @className: WebConfigs
 * @package: com.draven.webmvc
 * @author: draven
 * @date: 2021/1/10 00:46
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.draven.javas.controller")
public class WebConfigs implements WebMvcConfigurer {
    /**
     * <bean id="defaultViewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
     *         <property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>
     *         <property name="prefix" value="/WEB-INF/view/"/><!--设置JSP文件的目录位置-->
     *         <property name="suffix" value=".jsp"/>
     *         <property name="exposeContextBeansAsAttributes" value="true"/>
     * </bean>
     * @return
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/css/");
        registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/images/");
        //super.addResourceHandlers(registry);
    }

    //配置静态资源的处理
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
        // super.configureDefaultServletHandling(configurer);
    }
}
