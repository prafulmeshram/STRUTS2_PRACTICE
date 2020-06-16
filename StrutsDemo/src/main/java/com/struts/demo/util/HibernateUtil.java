/**
 * 
 */
package com.struts.demo.util;

import java.util.Set;

import javax.persistence.Entity;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.reflections.Reflections;

/**
 * @author jack
 *
 * @see XML Hibernate Configuration And Auto Load Of All Model Classes
 */
public class HibernateUtil {

	/**
	 * 
	 */
	public HibernateUtil() {

	}

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			// loads configuration and mappings
			Configuration configuration = new Configuration().configure();
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();

			Reflections reflections = new Reflections("com.struts.demo");
			Set<Class<?>> importantClasses = reflections.getTypesAnnotatedWith(Entity.class);
			for (Class<?> clazz : importantClasses) {
				configuration.addAnnotatedClass(clazz);
			}

			// builds a session factory from the service registry
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}
		return sessionFactory;
	}

}
