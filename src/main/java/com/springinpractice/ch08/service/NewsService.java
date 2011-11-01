/* 
 * $Id: NewsService.java 6 2011-04-10 01:31:25Z willie $
 * 
 * Copyright (c) 2010-2011 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.ch08.service;

import java.util.List;

import com.springinpractice.ch08.model.NewsItem;

/**
 * @version $Id: NewsService.java 6 2011-04-10 01:31:25Z willie $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public interface NewsService {
	
	/**
	 * <p>
	 * Returns a list of recent news items in descending order by publication date. The meaning of "recent" is
	 * implementation-dependent.
	 * </p>
	 * 
	 * @return list of recent news items
	 */
	List<NewsItem> getRecentNews();
}
