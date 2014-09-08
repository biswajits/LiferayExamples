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

package com.navin.example.liferay.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author    biswajits
 * @see       Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
	public EmployeeWrapper(Employee employee) {
		_employee = employee;
	}

	public Class<?> getModelClass() {
		return Employee.class;
	}

	public String getModelClassName() {
		return Employee.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeId", getEmployeeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("eMail", getEMail());
		attributes.put("phoneNo", getPhoneNo());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String eMail = (String)attributes.get("eMail");

		if (eMail != null) {
			setEMail(eMail);
		}

		String phoneNo = (String)attributes.get("phoneNo");

		if (phoneNo != null) {
			setPhoneNo(phoneNo);
		}
	}

	/**
	* Returns the primary key of this employee.
	*
	* @return the primary key of this employee
	*/
	public long getPrimaryKey() {
		return _employee.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee.
	*
	* @param primaryKey the primary key of this employee
	*/
	public void setPrimaryKey(long primaryKey) {
		_employee.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee ID of this employee.
	*
	* @return the employee ID of this employee
	*/
	public long getEmployeeId() {
		return _employee.getEmployeeId();
	}

	/**
	* Sets the employee ID of this employee.
	*
	* @param employeeId the employee ID of this employee
	*/
	public void setEmployeeId(long employeeId) {
		_employee.setEmployeeId(employeeId);
	}

	/**
	* Returns the company ID of this employee.
	*
	* @return the company ID of this employee
	*/
	public long getCompanyId() {
		return _employee.getCompanyId();
	}

	/**
	* Sets the company ID of this employee.
	*
	* @param companyId the company ID of this employee
	*/
	public void setCompanyId(long companyId) {
		_employee.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this employee.
	*
	* @return the user ID of this employee
	*/
	public long getUserId() {
		return _employee.getUserId();
	}

	/**
	* Sets the user ID of this employee.
	*
	* @param userId the user ID of this employee
	*/
	public void setUserId(long userId) {
		_employee.setUserId(userId);
	}

	/**
	* Returns the user uuid of this employee.
	*
	* @return the user uuid of this employee
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employee.getUserUuid();
	}

	/**
	* Sets the user uuid of this employee.
	*
	* @param userUuid the user uuid of this employee
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_employee.setUserUuid(userUuid);
	}

	/**
	* Returns the first name of this employee.
	*
	* @return the first name of this employee
	*/
	public java.lang.String getFirstName() {
		return _employee.getFirstName();
	}

	/**
	* Sets the first name of this employee.
	*
	* @param firstName the first name of this employee
	*/
	public void setFirstName(java.lang.String firstName) {
		_employee.setFirstName(firstName);
	}

	/**
	* Returns the last name of this employee.
	*
	* @return the last name of this employee
	*/
	public java.lang.String getLastName() {
		return _employee.getLastName();
	}

	/**
	* Sets the last name of this employee.
	*
	* @param lastName the last name of this employee
	*/
	public void setLastName(java.lang.String lastName) {
		_employee.setLastName(lastName);
	}

	/**
	* Returns the e mail of this employee.
	*
	* @return the e mail of this employee
	*/
	public java.lang.String getEMail() {
		return _employee.getEMail();
	}

	/**
	* Sets the e mail of this employee.
	*
	* @param eMail the e mail of this employee
	*/
	public void setEMail(java.lang.String eMail) {
		_employee.setEMail(eMail);
	}

	/**
	* Returns the phone no of this employee.
	*
	* @return the phone no of this employee
	*/
	public java.lang.String getPhoneNo() {
		return _employee.getPhoneNo();
	}

	/**
	* Sets the phone no of this employee.
	*
	* @param phoneNo the phone no of this employee
	*/
	public void setPhoneNo(java.lang.String phoneNo) {
		_employee.setPhoneNo(phoneNo);
	}

	public boolean isNew() {
		return _employee.isNew();
	}

	public void setNew(boolean n) {
		_employee.setNew(n);
	}

	public boolean isCachedModel() {
		return _employee.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_employee.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _employee.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _employee.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employee.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employee.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employee.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeWrapper((Employee)_employee.clone());
	}

	public int compareTo(com.navin.example.liferay.model.Employee employee) {
		return _employee.compareTo(employee);
	}

	@Override
	public int hashCode() {
		return _employee.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.navin.example.liferay.model.Employee> toCacheModel() {
		return _employee.toCacheModel();
	}

	public com.navin.example.liferay.model.Employee toEscapedModel() {
		return new EmployeeWrapper(_employee.toEscapedModel());
	}

	public com.navin.example.liferay.model.Employee toUnescapedModel() {
		return new EmployeeWrapper(_employee.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employee.toString();
	}

	public java.lang.String toXmlString() {
		return _employee.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employee.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeWrapper)) {
			return false;
		}

		EmployeeWrapper employeeWrapper = (EmployeeWrapper)obj;

		if (Validator.equals(_employee, employeeWrapper._employee)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Employee getWrappedEmployee() {
		return _employee;
	}

	public Employee getWrappedModel() {
		return _employee;
	}

	public void resetOriginalValues() {
		_employee.resetOriginalValues();
	}

	private Employee _employee;
}