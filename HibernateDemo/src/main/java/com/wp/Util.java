package com.wp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
	
	public static SessionFactory getSF(){
		Configuration config=new Configuration().configure("myconfig.xml");
		SessionFactory sf=config.buildSessionFactory();
		return sf;
	}

}