package cn.com.lemart.storemngsys.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@ComponentScan("cn.com.lemart.storemngsys.web.controller")
@EnableWebMvc
@PropertySource({ "classspath:/dbConf/jdbc.properties" })
public class WebServeletConfig {

	@Bean(value = "dataSource", destroyMethod = "close")
	public DruidDataSource getDataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl("${}");
		return dataSource;
	}

	@Bean("transactionManager")
	@Autowired
	public DataSourceTransactionManager getTransactionManager(DruidDataSource dataSource) {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource);
		return transactionManager;
	}
}
