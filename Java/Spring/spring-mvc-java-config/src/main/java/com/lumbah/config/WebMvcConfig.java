package com.lumbah.config;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import com.lumbah.springdemo.interceptor.HeaderInterceptor;

@Configuration
@ComponentScan("com.lumbah")
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Bean
	public DataSource dataSource() {
		JndiDataSourceLookup jndiLookup = new JndiDataSourceLookup();
		jndiLookup.setResourceRef(true);
		DataSource ds = jndiLookup.getDataSource("jdbc/spring");
		return ds;
	}
	
	@Bean
	public RequestMappingHandlerMapping requestHandlerMapping() {
		RequestMappingHandlerMapping rhm = new RequestMappingHandlerMapping();
		rhm.setUseSuffixPatternMatch(true);
		rhm.setUseTrailingSlashMatch(true);
		return rhm;
	}
	@Bean
	public UrlBasedViewResolver urlBasedViewresolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new HeaderInterceptor());
	}
}
