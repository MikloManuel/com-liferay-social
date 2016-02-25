/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.privatemessaging.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.AuditedModel;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the UserThread service. Represents a row in the &quot;UserThread&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.privatemessaging.model.impl.UserThreadModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.privatemessaging.model.impl.UserThreadImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserThread
 * @see com.liferay.privatemessaging.model.impl.UserThreadImpl
 * @see com.liferay.privatemessaging.model.impl.UserThreadModelImpl
 * @generated
 */
@ProviderType
public interface UserThreadModel extends AuditedModel, BaseModel<UserThread>,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a user thread model instance should use the {@link UserThread} interface instead.
	 */

	/**
	 * Returns the primary key of this user thread.
	 *
	 * @return the primary key of this user thread
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this user thread.
	 *
	 * @param primaryKey the primary key of this user thread
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the user thread ID of this user thread.
	 *
	 * @return the user thread ID of this user thread
	 */
	public long getUserThreadId();

	/**
	 * Sets the user thread ID of this user thread.
	 *
	 * @param userThreadId the user thread ID of this user thread
	 */
	public void setUserThreadId(long userThreadId);

	/**
	 * Returns the company ID of this user thread.
	 *
	 * @return the company ID of this user thread
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this user thread.
	 *
	 * @param companyId the company ID of this user thread
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this user thread.
	 *
	 * @return the user ID of this user thread
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this user thread.
	 *
	 * @param userId the user ID of this user thread
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this user thread.
	 *
	 * @return the user uuid of this user thread
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this user thread.
	 *
	 * @param userUuid the user uuid of this user thread
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this user thread.
	 *
	 * @return the user name of this user thread
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this user thread.
	 *
	 * @param userName the user name of this user thread
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this user thread.
	 *
	 * @return the create date of this user thread
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this user thread.
	 *
	 * @param createDate the create date of this user thread
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this user thread.
	 *
	 * @return the modified date of this user thread
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this user thread.
	 *
	 * @param modifiedDate the modified date of this user thread
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the mb thread ID of this user thread.
	 *
	 * @return the mb thread ID of this user thread
	 */
	public long getMbThreadId();

	/**
	 * Sets the mb thread ID of this user thread.
	 *
	 * @param mbThreadId the mb thread ID of this user thread
	 */
	public void setMbThreadId(long mbThreadId);

	/**
	 * Returns the top m b message ID of this user thread.
	 *
	 * @return the top m b message ID of this user thread
	 */
	public long getTopMBMessageId();

	/**
	 * Sets the top m b message ID of this user thread.
	 *
	 * @param topMBMessageId the top m b message ID of this user thread
	 */
	public void setTopMBMessageId(long topMBMessageId);

	/**
	 * Returns the read of this user thread.
	 *
	 * @return the read of this user thread
	 */
	public boolean getRead();

	/**
	 * Returns <code>true</code> if this user thread is read.
	 *
	 * @return <code>true</code> if this user thread is read; <code>false</code> otherwise
	 */
	public boolean isRead();

	/**
	 * Sets whether this user thread is read.
	 *
	 * @param read the read of this user thread
	 */
	public void setRead(boolean read);

	/**
	 * Returns the deleted of this user thread.
	 *
	 * @return the deleted of this user thread
	 */
	public boolean getDeleted();

	/**
	 * Returns <code>true</code> if this user thread is deleted.
	 *
	 * @return <code>true</code> if this user thread is deleted; <code>false</code> otherwise
	 */
	public boolean isDeleted();

	/**
	 * Sets whether this user thread is deleted.
	 *
	 * @param deleted the deleted of this user thread
	 */
	public void setDeleted(boolean deleted);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.liferay.privatemessaging.model.UserThread userThread);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.privatemessaging.model.UserThread> toCacheModel();

	@Override
	public com.liferay.privatemessaging.model.UserThread toEscapedModel();

	@Override
	public com.liferay.privatemessaging.model.UserThread toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}