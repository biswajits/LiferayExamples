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

package com.navin.example.liferay.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.navin.example.liferay.model.Employee;

/**
 * The persistence interface for the employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author biswajits
 * @see EmployeePersistenceImpl
 * @see EmployeeUtil
 * @generated
 */
public interface EmployeePersistence extends BasePersistence<Employee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeUtil} to access the employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the employee in the entity cache if it is enabled.
	*
	* @param employee the employee
	*/
	public void cacheResult(com.navin.example.liferay.model.Employee employee);

	/**
	* Caches the employees in the entity cache if it is enabled.
	*
	* @param employees the employees
	*/
	public void cacheResult(
		java.util.List<com.navin.example.liferay.model.Employee> employees);

	/**
	* Creates a new employee with the primary key. Does not add the employee to the database.
	*
	* @param employeeId the primary key for the new employee
	* @return the new employee
	*/
	public com.navin.example.liferay.model.Employee create(long employeeId);

	/**
	* Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeId the primary key of the employee
	* @return the employee that was removed
	* @throws com.navin.example.liferay.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.navin.example.liferay.model.Employee remove(long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.navin.example.liferay.NoSuchEmployeeException;

	public com.navin.example.liferay.model.Employee updateImpl(
		com.navin.example.liferay.model.Employee employee, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employee with the primary key or throws a {@link com.navin.example.liferay.NoSuchEmployeeException} if it could not be found.
	*
	* @param employeeId the primary key of the employee
	* @return the employee
	* @throws com.navin.example.liferay.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.navin.example.liferay.model.Employee findByPrimaryKey(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.navin.example.liferay.NoSuchEmployeeException;

	/**
	* Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeId the primary key of the employee
	* @return the employee, or <code>null</code> if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.navin.example.liferay.model.Employee fetchByPrimaryKey(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the employees where firstName = &#63;.
	*
	* @param firstName the first name
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.navin.example.liferay.model.Employee> findByfirstNameCollection(
		java.lang.String firstName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees where firstName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param firstName the first name
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.navin.example.liferay.model.Employee> findByfirstNameCollection(
		java.lang.String firstName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees where firstName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param firstName the first name
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.navin.example.liferay.model.Employee> findByfirstNameCollection(
		java.lang.String firstName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first employee in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee
	* @throws com.navin.example.liferay.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.navin.example.liferay.model.Employee findByfirstNameCollection_First(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.navin.example.liferay.NoSuchEmployeeException;

	/**
	* Returns the first employee in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.navin.example.liferay.model.Employee fetchByfirstNameCollection_First(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last employee in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee
	* @throws com.navin.example.liferay.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.navin.example.liferay.model.Employee findByfirstNameCollection_Last(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.navin.example.liferay.NoSuchEmployeeException;

	/**
	* Returns the last employee in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.navin.example.liferay.model.Employee fetchByfirstNameCollection_Last(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the employees before and after the current employee in the ordered set where firstName = &#63;.
	*
	* @param employeeId the primary key of the current employee
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next employee
	* @throws com.navin.example.liferay.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.navin.example.liferay.model.Employee[] findByfirstNameCollection_PrevAndNext(
		long employeeId, java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.navin.example.liferay.NoSuchEmployeeException;

	/**
	* Returns all the employees.
	*
	* @return the employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.navin.example.liferay.model.Employee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @return the range of employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.navin.example.liferay.model.Employee> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of employees
	* @param end the upper bound of the range of employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.navin.example.liferay.model.Employee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employees where firstName = &#63; from the database.
	*
	* @param firstName the first name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByfirstNameCollection(java.lang.String firstName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the employees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees where firstName = &#63;.
	*
	* @param firstName the first name
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public int countByfirstNameCollection(java.lang.String firstName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of employees.
	*
	* @return the number of employees
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}