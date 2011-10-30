/* 
 * $Id: Unsubscriber.java 6 2011-04-10 01:31:25Z willie $
 * 
 * Copyright (c) 2010-2011 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.ch08.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

/**
 * @version $Id: Unsubscriber.java 6 2011-04-10 01:31:25Z willie $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public final class Unsubscriber {
	
	@NotNull
	@Size(min = 1, max = 80)
	@Email
	private String email;
	
	public String getEmail() { return email; }

	public void setEmail(String email) { this.email = email; }
}
