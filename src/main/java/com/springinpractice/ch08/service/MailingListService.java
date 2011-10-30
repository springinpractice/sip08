/* 
 * $Id: MailingListService.java 6 2011-04-10 01:31:25Z willie $
 * 
 * Copyright (c) 2010-2011 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.ch08.service;

import com.springinpractice.ch08.model.Subscriber;

/**
 * @version $Id: MailingListService.java 6 2011-04-10 01:31:25Z willie $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public interface MailingListService {
	
	Subscriber getSubscriber(Long id);
	
	/**
	 * <p>
	 * Adds a subscription for the given subscriber. The subscriber must be unconfirmed. It's fine if there are other
	 * subscriptions associated with the same subscriber. We don't want to complain about it because that would give
	 * attackers a way to discover whether any given e-mail address is already signed up for the mailing list.
	 * </p>
	 * 
	 * @param subscriber subscriber
	 */
	void addSubscriber(Subscriber subscriber);
	
	void confirmSubscriber(Long subscriberId, String digest) throws ConfirmationFailedException;
	
	/**
	 * <p>
	 * Removes all subscriptions with the given e-mail address.
	 * </p>
	 * 
	 * @param email e-mail
	 */
	void requestUnsubscription(String email);
	
	void confirmUnsubscription(String email, Long timestamp, String digest) throws ConfirmationFailedException;
}
