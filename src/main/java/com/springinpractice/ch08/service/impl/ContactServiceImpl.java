/* 
 * $Id: ContactServiceImpl.java 6 2011-04-10 01:31:25Z willie $
 * 
 * Copyright (c) 2010-2011 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.ch08.service.impl;

import static org.springframework.util.Assert.notNull;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springinpractice.ch08.dao.UserMessageDao;
import com.springinpractice.ch08.model.UserMessage;
import com.springinpractice.ch08.service.ContactService;

/**
 * @version $Id: ContactServiceImpl.java 6 2011-04-10 01:31:25Z willie $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@Service
@Transactional(
	propagation = Propagation.REQUIRED,
	isolation = Isolation.DEFAULT,
	readOnly = true)
public class ContactServiceImpl implements ContactService {
	@Inject private UserMessageDao userMsgDao;
	
	/* (non-Javadoc)
	 * @see com.springinpractice.ch08.service.ContactService#saveUserMessage
	 * (com.springinpractice.ch08.model.UserMessage)
	 */
	@Transactional(readOnly = false)
	public void saveUserMessage(UserMessage userMsg) {
		notNull(userMsg, "userMsg can't be null");
		userMsgDao.create(userMsg);
	}
}
