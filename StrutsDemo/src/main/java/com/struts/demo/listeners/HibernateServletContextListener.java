/**
 * 
 */
package com.struts.demo.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * @author jack
 *
 */
public class HibernateServletContextListener implements ServletContextListener {

	/**
	 * 
	 */
	public HibernateServletContextListener() {

	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		SessionFactory sessionFactory = (SessionFactory) servletContextEvent.getServletContext()
				.getAttribute("SessionFactory");
		sessionFactory.close();
	}

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		Configuration config = new Configuration()
				.configure(HibernateServletContextListener.class.getResource("/hibernate.cfg.xml"));

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties())
				.build();
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		servletContextEvent.getServletContext().setAttribute("SessionFactory", sessionFactory);
	}

}
