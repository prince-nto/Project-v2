package services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.TweetEntity;

@Stateless
@LocalBean
public class TweetEJB {

	@PersistenceContext
	private EntityManager em;
	
	public TweetEJB() {
		
	}
}
