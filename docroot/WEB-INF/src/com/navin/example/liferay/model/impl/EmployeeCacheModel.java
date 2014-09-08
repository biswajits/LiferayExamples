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

package com.navin.example.liferay.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.navin.example.liferay.model.Employee;

import java.io.Serializable;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author biswajits
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{employeeId=");
		sb.append(employeeId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", eMail=");
		sb.append(eMail);
		sb.append(", phoneNo=");
		sb.append(phoneNo);
		sb.append("}");

		return sb.toString();
	}

	public Employee toEntityModel() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setEmployeeId(employeeId);
		employeeImpl.setCompanyId(companyId);
		employeeImpl.setUserId(userId);

		if (firstName == null) {
			employeeImpl.setFirstName(StringPool.BLANK);
		}
		else {
			employeeImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			employeeImpl.setLastName(StringPool.BLANK);
		}
		else {
			employeeImpl.setLastName(lastName);
		}

		if (eMail == null) {
			employeeImpl.setEMail(StringPool.BLANK);
		}
		else {
			employeeImpl.setEMail(eMail);
		}

		if (phoneNo == null) {
			employeeImpl.setPhoneNo(StringPool.BLANK);
		}
		else {
			employeeImpl.setPhoneNo(phoneNo);
		}

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	public long employeeId;
	public long companyId;
	public long userId;
	public String firstName;
	public String lastName;
	public String eMail;
	public String phoneNo;
}