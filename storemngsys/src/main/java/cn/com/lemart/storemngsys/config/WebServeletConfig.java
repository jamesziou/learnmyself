package cn.com.lemart.storemngsys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("cn.com.lemart.storemngsys.web.controller")
@EnableWebMvc
@PropertySource({ "classspath:/dbConf/jdbc.properties" })
public class WebServeletConfig {

	@Bean("dataSource")
	public void getDataSource() {
	}
}
