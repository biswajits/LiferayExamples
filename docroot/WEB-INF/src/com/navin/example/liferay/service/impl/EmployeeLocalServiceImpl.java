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

package com.navin.example.liferay.service.impl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ResourceLocalServiceUtil;
import com.navin.example.liferay.model.Employee;
import com.navin.example.liferay.service.base.EmployeeLocalServiceBaseImpl;
import com.navin.example.liferay.service.persistence.EmployeeUtil;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.navin.example.liferay.service.EmployeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author biswajits
 * @see com.navin.example.liferay.service.base.EmployeeLocalServiceBaseImpl
 * @see com.navin.example.liferay.service.EmployeeLocalServiceUtil
 */
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.navin.example.liferay.service.EmployeeLocalServiceUtil} to access the employee local service.
	 */
	
	public Employee createEmployee(Employee employeeDto) throws SystemException{
		
		Employee employee = EmployeeUtil.create(CounterLocalServiceUtil.increment());
		
		ResourceLocalServiceUtil.addResource(employeeDto.getCompanyId(), Employee.class.getName(), ResourceConstants.SCOPE_COMPANY, String.valueOf(employee.getPrimaryKey()));
		
		employee.setCompanyId(employeeDto.getCompanyId());    
		employee.setUserId(employeeDto.getUserId());
		employee.setFirstName(employeeDto.getFirstName());
		employee.setLastName(employeeDto.getLastName());
		employee.setEMail(employeeDto.getEMail());
		employee.setPhoneNo(employeeDto.getPhoneNo());
		
		return EmployeeUtil.update(employee, true);
	}
	
	public Employee createNewEmployee(Employee newEmployeeDto) throws SystemException{
		
		return EmployeeUtil.update(newEmployeeDto, true);
	}
}