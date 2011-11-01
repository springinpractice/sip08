/* 
 * $Id: NewsItemDao.java 6 2011-04-10 01:31:25Z willie $
 * 
 * Copyright (c) 2010-2011 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.ch08.dao;

import java.util.List;

import com.springinpractice.ch08.model.NewsItem;
import com.springinpractice.dao.Dao;

/**
 * @version $Id: NewsItemDao.java 6 2011-04-10 01:31:25Z willie $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public interface NewsItemDao extends Dao<NewsItem> {
	
	/**
	 * @param maxResults 
	 * @return
	 */
	List<NewsItem> getListByDateDesc();
}
