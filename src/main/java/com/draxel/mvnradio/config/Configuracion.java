package com.draxel.mvnradio.config;

//import gob.sfo.gti.filters.InterceptorGeneral;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

@EnableWebMvc
@ComponentScan(basePackages = {"com.draxel.mvnradio"})
@Configuration
//@EnableTransactionManagement
//@EnableScheduling
public class Configuracion extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry
//                .addResourceHandler("/resources/**", "/assets/**", "/app/**")
//                .addResourceLocations("/resources/")
//                .addResourceLocations("/assets/")
//                .addResourceLocations("/app/")
//                .setCachePeriod(3600*2);
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }


    
//    @Bean
//    public MultipartResolver multipartResolver() {
//        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
//        resolver.setMaxUploadSize(41943040);
//        return resolver;
//    }

//    @Bean
//    public InterceptorGeneral interceptorGeneral() {
//        return new InterceptorGeneral();
//    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(interceptorGeneral());
    }
    
}
