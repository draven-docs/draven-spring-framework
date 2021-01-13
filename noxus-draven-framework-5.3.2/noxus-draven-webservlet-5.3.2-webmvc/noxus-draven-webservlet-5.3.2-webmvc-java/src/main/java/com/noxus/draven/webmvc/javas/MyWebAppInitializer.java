package com.noxus.draven.webmvc.javas;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * <context-param>
     *          <param-name>contextConfigLocation</param-name>
     *          <param-value>/WEB-INF/applicationContext.xml</param-value>
     * </context-param>
     * <listener>
     *          <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
     * </listener>
     *
     * @return
     */

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
     * <servlet>
     *         <servlet-name>springMVC</servlet-name>
     *         <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
     *         <init-param>
     *             <!--配置dispatcher.xml作为mvc的配置文件-->
     *             <param-name>contextConfigLocation</param-name>
     *             <param-value>/WEB-INF/dispatcher-servlet.xml</param-value>
     *         </init-param>
     *         <load-on-startup>1</load-on-startup>
     *         <async-supported>true</async-supported>
     *     </servlet>
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfigs.class};
    }

    /**
     *  <servlet-mapping>
     *         <servlet-name>springMVC</servlet-name>
     *         <url-pattern>/</url-pattern>
     *  </servlet-mapping>
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

   /* @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
    }*/
}
