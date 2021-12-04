package com.rubencarmona.proyecto_base_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
    	StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
    	
    	SessionFactory sf = new MetadataSources(sr).getMetadataBuilder().build().buildSessionFactory();       	
        
    	//Abrimos la sessión.    	
    	Session session = sf.openSession();   	
    	
    	User user = new User();
    	user.setId(1);
    	user.setUserName("Rubén");
    	user.setUserMesagge("Bienvenido Rubén a Hibernate");
    	
    	    	
    	User user2 = new User();
    	user2.setId(2);
    	user2.setUserName("Isabel");
    	user2.setUserMesagge("Bienvenido Isabel a Hibernate");
    	
    	session.getTransaction().begin();
    	
    	session.save(user);
    	session.save(user2);    	
    	
    	//Comiteamos a la bbdd.
    	session.getTransaction().commit();
    	
    	
    	//Cerramos la session.
    	session.close();   	
    	
    }
}
