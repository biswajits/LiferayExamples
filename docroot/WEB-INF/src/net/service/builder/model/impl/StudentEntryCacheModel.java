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

package net.service.builder.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import net.service.builder.model.StudentEntry;

import java.io.Serializable;

/**
 * The cache model class for representing StudentEntry in entity cache.
 *
 * @author Administrator
 * @see StudentEntry
 * @generated
 */
public class StudentEntryCacheModel implements CacheModel<StudentEntry>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{studentId=");
		sb.append(studentId);
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	public StudentEntry toEntityModel() {
		StudentEntryImpl studentEntryImpl = new StudentEntryImpl();

		studentEntryImpl.setStudentId(studentId);

		if (name == null) {
			studentEntryImpl.setName(StringPool.BLANK);
		}
		else {
			studentEntryImpl.setName(name);
		}

		studentEntryImpl.resetOriginalValues();

		return studentEntryImpl;
	}

	public long studentId;
	public String name;
}