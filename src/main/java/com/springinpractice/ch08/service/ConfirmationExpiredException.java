/* 
 * $Id: ConfirmationExpiredException.java 6 2011-04-10 01:31:25Z willie $
 * 
 * Copyright (c) 2010-2011 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.ch08.service;

/**
 * @version $Id: ConfirmationExpiredException.java 6 2011-04-10 01:31:25Z willie $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@SuppressWarnings("serial")
public class ConfirmationExpiredException extends ConfirmationFailedException {
	
	public ConfirmationExpiredException() {
		super("Confirmation expired");
	}
	
	public ConfirmationExpiredException(String msg) {
		super(msg);
	}
}
