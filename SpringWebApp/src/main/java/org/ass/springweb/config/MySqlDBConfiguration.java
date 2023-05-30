package org.ass.springweb.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

@Configuration
public class MySqlDBConfiguration
{
	@Bean
	public LocalSessionFactoryBean getSessionFactory()
	{
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		
		sessionFactory.setDataSource(getDataSource());
		
		sessionFactory.setHibernateProperties(getConnectionproperties());
		
		sessionFactory.setPackagesToScan("org.ass.springweb.entity");
		
		return sessionFactory;
		
	}
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/data");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	public static Properties getConnectionproperties()
	{
		Properties properties = new Properties();
//		properties.setProperty("connection.driver_class", 
//				"com.mysql.cj.jdbc.Driver");
//		properties.setProperty("hibernate.connection.url", 
//				"jdbc:mysql://localhost:3306/data");	
//		properties.setProperty("hibernate.connection.username", "root");
//		properties.setProperty("hibernate.connection.password", "root");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		
		return properties;
	}
}
