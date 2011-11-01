/* 
 * $Id: NewsController.java 6 2011-04-10 01:31:25Z willie $
 * 
 * Copyright (c) 2010-2011 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.ch08.web;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springinpractice.ch08.service.NewsService;

@Controller
public final class NewsController {
	@Inject private NewsService newsService;
	
	/**
	 * @param model model
	 * @return
	 */
	@RequestMapping("/news.rss")
	public String rss(Model model) {
		model.addAttribute(newsService.getRecentNews());
		return "news";
	}
}
