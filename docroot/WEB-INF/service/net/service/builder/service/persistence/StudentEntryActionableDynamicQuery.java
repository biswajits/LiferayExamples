/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package net.service.builder.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.service.builder.model.StudentEntry;
import net.service.builder.service.StudentEntryLocalServiceUtil;

/**
 * @author Administrator
 * @generated
 */
public abstract class StudentEntryActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public StudentEntryActionableDynamicQuery() throws SystemException {
		setBaseLocalService(StudentEntryLocalServiceUtil.getService());
		setClass(StudentEntry.class);

		setClassLoader(net.service.builder.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("studentId");
	}
}