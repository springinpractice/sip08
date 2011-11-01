/* 
 * $Id: HbnSubscriberDao.java 6 2011-04-10 01:31:25Z willie $
 * 
 * Copyright (c) 2010-2011 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.ch08.dao.hbn;

import static org.springframework.util.Assert.notNull;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.springinpractice.ch08.dao.SubscriberDao;
import com.springinpractice.ch08.model.Subscriber;
import com.springinpractice.dao.hibernate.AbstractHbnDao;

/**
 * @version $Id: HbnSubscriberDao.java 6 2011-04-10 01:31:25Z willie $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@Repository
public class HbnSubscriberDao extends AbstractHbnDao<Subscriber> implements SubscriberDao {
		
	/* (non-Javadoc)
	 * @see com.springinpractice.ch08.dao.SubscriberDao#deleteByEmail(java.lang.String)
	 */
	public void deleteByEmail(String email) {
		notNull(email, "email required");
//		Query q = getSession().createQuery("delete Subscriber where email = :email");
		Query q = getSession().getNamedQuery("deleteSubscriberByEmail");
		q.setString("email", email);
		q.executeUpdate();
	}
}
