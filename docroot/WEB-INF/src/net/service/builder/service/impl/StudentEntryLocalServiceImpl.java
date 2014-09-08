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

package net.service.builder.service.impl;

import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

import net.service.builder.model.StudentEntry;
import net.service.builder.service.base.StudentEntryLocalServiceBaseImpl;
import net.service.builder.service.persistence.StudentEntryUtil;


/**
 * The implementation of the student entry local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link net.service.builder.service.StudentEntryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Administrator
 * @see net.service.builder.service.base.StudentEntryLocalServiceBaseImpl
 * @see net.service.builder.service.StudentEntryLocalServiceUtil
 */
public class StudentEntryLocalServiceImpl
	extends StudentEntryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link net.service.builder.service.StudentEntryLocalServiceUtil} to access the student entry local service.
	 */
	
	public StudentEntry addStudent(String name) throws SystemException{
		StudentEntry student = StudentEntryUtil.create(CounterLocalServiceUtil.increment(StudentEntry.class.getName()));
		student.setName(name);
		
		return StudentEntryUtil.update(student, true);
	}
	
	public List<StudentEntry> getAllStudent() throws SystemException{
		return StudentEntryUtil.findAll();
	}
}