/* 
 * $Id: HbnUserMessageDao.java 6 2011-04-10 01:31:25Z willie $
 * 
 * Copyright (c) 2010-2011 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.ch08.dao.hbn;

import org.springframework.stereotype.Repository;

import com.springinpractice.ch08.dao.UserMessageDao;
import com.springinpractice.ch08.model.UserMessage;
import com.springinpractice.dao.hibernate.AbstractHbnDao;

/**
 * @version $Id: HbnUserMessageDao.java 6 2011-04-10 01:31:25Z willie $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@Repository("userMessageDao")
public final class HbnUserMessageDao extends AbstractHbnDao<UserMessage>
	implements UserMessageDao {
	
}
