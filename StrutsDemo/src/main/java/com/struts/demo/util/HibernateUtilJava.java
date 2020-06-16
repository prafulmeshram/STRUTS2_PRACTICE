/**
 * 
 */
package com.struts.demo.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.reflections.Reflections;

/**
 * @author jack
 * 
 * @see Pure Java Hibernate Configuration And Auto Load Of All Model Classes
 *
 */
public class HibernateUtilJava {

	/**
	 * 
	 */
	public HibernateUtilJava() {

	}

	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();

				Map<String, String> settings = new HashMap<>();
				settings.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
				settings.put("hibernate.connection.url",
						"jdbc:mysql://localhost:3306/db_struts_demo?createDatabaseIfNotExist=true");
				settings.put("hibernate.connection.username", "root");
				settings.put("hibernate.connection.password", "Root@123");
				settings.put("hibernate.show_sql", "true");
				settings.put("hibernate.hbm2ddl.auto", "update");

				registryBuilder.applySettings(settings);

				registry = registryBuilder.build();

				MetadataSources sources = new MetadataSources(registry);

				Reflections reflections = new Reflections("com.struts.demo");
				Set<Class<?>> importantClasses = reflections.getTypesAnnotatedWith(Entity.class);
				for (Class<?> clazz : importantClasses) {
					sources.addAnnotatedClass(clazz);
				}

				Metadata metadata = sources.getMetadataBuilder().build();

				sessionFactory = metadata.getSessionFactoryBuilder().build();
			} catch (Exception e) {
				System.out.println("SessionFactory creation failed");
				if (registry != null) {
					StandardServiceRegistryBuilder.destroy(registry);
				}
			}
		}
		return sessionFactory;
	}

	public static void shutdown() {
		if (registry != null) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

}
