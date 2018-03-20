package com.connect2java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	private static final EntityManagerFactory entityManagerFactory;
    static {
      try {
        entityManagerFactory = Persistence.createEntityManagerFactory("com.connect2java");
        

      } catch (Throwable ex) {          
        throw new ExceptionInInitializerError(ex);
      }
    }

    public static EntityManager getEntityManager() {
      return entityManagerFactory.createEntityManager();

    }
}
