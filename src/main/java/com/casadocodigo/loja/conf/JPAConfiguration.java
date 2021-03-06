package com.casadocodigo.loja.conf;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

public class JPAConfiguration {
	
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource());
		em.setPackagesToScan("com.loja.models");
		
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(additionalProperties());
		
		return em;
	}
	
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.postgres.jdbc.Driver");	
		dataSource.setUrl("jdbc:postgresql://localhost:5432/casadocodigo?createDatabaseIfNotExist=true&useSSL=false");
		dataSource.setUsername("postgress");
		dataSource.setPassword("ybr1251");
		
		
		return dataSource;
	}
	
	private Properties additionalProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto",
				"update");
				properties.setProperty("hibernate.dialect",
				"org.hibernate.dialect.PostgreSQLDialect");
				properties.setProperty("hibernate.show_sql", "true");
		
	   return properties;
	}
}
