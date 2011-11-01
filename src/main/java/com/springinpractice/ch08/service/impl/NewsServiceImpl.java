/* 
 * $Id: NewsServiceImpl.java 6 2011-04-10 01:31:25Z willie $
 * 
 * Copyright (c) 2010-2011 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.ch08.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springinpractice.ch08.dao.NewsItemDao;
import com.springinpractice.ch08.model.NewsItem;
import com.springinpractice.ch08.service.NewsService;

/**
 * @version $Id: NewsServiceImpl.java 6 2011-04-10 01:31:25Z willie $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@Service
@Transactional(
	propagation = Propagation.REQUIRED,
	isolation = Isolation.DEFAULT,
	readOnly = true)
public class NewsServiceImpl implements NewsService {
	@Inject private NewsItemDao newsItemDao;
	
	/* (non-Javadoc)
	 * @see com.springinpractice.ch08.service.NewsService#getRecentNews()
	 */
	@Override
	public List<NewsItem> getRecentNews() {
		return newsItemDao.getListByDateDesc();
	}
}
