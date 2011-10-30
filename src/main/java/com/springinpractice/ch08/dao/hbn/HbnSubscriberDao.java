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

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.springinpractice.ch08.dao.SubscriberDao;
import com.springinpractice.ch08.model.Subscriber;
import com.springinpractice.dao.hibernate.AbstractHbnDao;

/**
 * @version $Id: HbnSubscriberDao.java 6 2011-04-10 01:31:25Z willie $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@Repository("subscriberDao")
public class HbnSubscriberDao extends AbstractHbnDao<Subscriber>
	implements SubscriberDao {
		
	public void disableAllByEmail(String email) {
		Assert.notNull(email, "email required");
		Query q = getSession().createQuery(
			"update Subscriber set enabled = false where email = :email");
		q.setString("email", email);
		q.executeUpdate();
	}
}
