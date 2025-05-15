package com.hibernate.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.model.Persona;

public class Config {

	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				
				Configuration configuration = new Configuration();
				System.out.println("Buenas")
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://127.0.0.1:3307/agenda?useSSL=false");
				settings.put(Environment.USER, "alumno");
				settings.put(Environment.PASS, "Alumno1219");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				settings.put(Environment.HBM2DDL_AUTO, "update");
				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Persona.class);
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return  sessionFactory;
	}
	
	
}
