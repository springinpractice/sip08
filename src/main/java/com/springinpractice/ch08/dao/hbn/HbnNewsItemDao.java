/* 
 * $Id: HbnNewsItemDao.java 6 2011-04-10 01:31:25Z willie $
 * 
 * Copyright (c) 2010-2011 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.ch08.dao.hbn;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springinpractice.ch08.dao.NewsItemDao;
import com.springinpractice.ch08.model.NewsItem;
import com.springinpractice.dao.hibernate.AbstractHbnDao;

/**
 * @version $Id: HbnNewsItemDao.java 6 2011-04-10 01:31:25Z willie $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@Repository
public class HbnNewsItemDao extends AbstractHbnDao<NewsItem> implements NewsItemDao {

	/* (non-Javadoc)
	 * @see com.springinpractice.ch08.dao.NewsItemDao#getListByDateDesc()
	 */
	@SuppressWarnings("unchecked")
	public List<NewsItem> getListByDateDesc() {
		return (List<NewsItem>) getSession()
			.getNamedQuery("findAllNewsItems")
			.setMaxResults(10)
			.list();
	}
}
