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
	
	/**
	 * <p>
	 * Confirms the given subscription.
	 * </p>
	 * 
	 * @param subscriberId subscriber ID
	 * @param digest digest
	 * @throws ConfirmationFailedException if the subscription failed
	 */
	void confirmSubscriber(Long subscriberId, String digest) throws ConfirmationFailedException;
	
	/**
	 * <p>
	 * Call this method when the user asks to unsubscribe. This method sends the user a confirmation e-mail that allows
	 * the user to effect the actual unsubscription.
	 * </p>
	 * 
	 * @param email e-mail address to unsubscribe
	 */
	void requestUnsubscription(String email);
	
	/**
	 * <p>
	 * Unsubscribes all subscribers (if any) having the given e-mail address. It doesn't matter if no subscriber
	 * (confirmed or not) has the e-mail address; in that case we don't delete anything. By design this method behaves
	 * exactly the same whether the subscriber exists or not, since for security reasons, users should not be able to
	 * discover whether other users have signed up for the mailing list.
	 * </p>
	 * 
	 * @param email e-mail address to unsubscribe
	 * @param timestamp timestamp
	 * @param digest digest
	 * @throws ConfirmationFailedException if the unsubscription failed
	 */
	void confirmUnsubscription(String email, Long timestamp, String digest) throws ConfirmationFailedException;
}
