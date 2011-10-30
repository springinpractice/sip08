/* 
 * $Id: ContactService.java 6 2011-04-10 01:31:25Z willie $
 * 
 * Copyright (c) 2010-2011 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.ch08.service;

import com.springinpractice.ch08.model.UserMessage;

/**
 * <p>
 * Service interface for the "contact us" form.
 * </p>
 * 
 * @version $Id: ContactService.java 6 2011-04-10 01:31:25Z willie $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public interface ContactService {
	
	/**
	 * <p>
	 * Saves the user's message in the database, forwards it to the admin, and
	 * sends a confirmation message to the user.
	 * </p>
	 * 
	 * @param msg
	 *            user message
	 * @throws IllegalArgumentException
	 *             if <code>msg</code> is <code>null</code>
	 */
	void saveUserMessage(UserMessage msg);
}
