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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.navin.example.liferay.model.Employee;

import java.util.List;

/**
 * The persistence utility for the employee service. This utility wraps {@link EmployeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author biswajits
 * @see EmployeePersistence
 * @see EmployeePersistenceImpl
 * @generated
 */
public class EmployeeUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Employee employee) {
		getPersistence().clearCache(employee);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Employee> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Employee update(Employee employee, boolean merge)
		throws SystemException {
		return getPersistence().update(employee, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Employee update(Employee employee, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(employee, merge, serviceContext);
	}

	/**
	* Caches the employee in the entity cache if it is enabled.
	*
	* @param employee the employee
	*/
	public static void cacheResult(
		com.navin.example.liferay.model.Employee employee) {
		getPersistence().cacheResult(employee);
	}

	/**
	* Caches the employees in the entity cache if it is enabled.
	*
	* @param employees the employees
	*/
	public static void cacheResult(
		java.util.List<com.navin.example.liferay.model.Employee> employees) {
		getPersistence().cacheResult(employees);
	}

	/**
	* Creates a new employee with the primary key. Does not add the employee to the database.
	*
	* @param employeeId the primary key for the new employee
	* @return the new employee
	*/
	public static com.navin.example.liferay.model.Employee create(
		long employeeId) {
		return getPersistence().create(employeeId);
	}

	/**
	* Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeId the primary key of the employee
	* @return the employee that was removed
	* @throws com.navin.example.liferay.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.navin.example.liferay.model.Employee remove(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.navin.example.liferay.NoSuchEmployeeException {
		return getPersistence().remove(employeeId);
	}

	public static com.navin.example.liferay.model.Employee updateImpl(
		com.navin.example.liferay.model.Employee employee, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(employee, merge);
	}

	/**
	* Returns the employee with the primary key or throws a {@link com.navin.example.liferay.NoSuchEmployeeException} if it could not be found.
	*
	* @param employeeId the primary key of the employee
	* @return the employee
	* @throws com.navin.example.liferay.NoSuchEmployeeException if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.navin.example.liferay.model.Employee findByPrimaryKey(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.navin.example.liferay.NoSuchEmployeeException {
		return getPersistence().findByPrimaryKey(employeeId);
	}

	/**
	* Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeId the primary key of the employee
	* @return the employee, or <code>null</code> if a employee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.navin.example.liferay.model.Employee fetchByPrimaryKey(
		long employeeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(employeeId);
	}

	/**
	* Returns all the employees where firstName = &#63;.
	*
	* @param firstName the first name
	* @return the matching employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.navin.example.liferay.model.Employee> findByfirstNameCollection(
		java.lang.String firstName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfirstNameCollection(firstName);
	}

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
	public static java.util.List<com.navin.example.liferay.model.Employee> findByfirstNameCollection(
		java.lang.String firstName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfirstNameCollection(firstName, start, end);
	}

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
	public static java.util.List<com.navin.example.liferay.model.Employee> findByfirstNameCollection(
		java.lang.String firstName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfirstNameCollection(firstName, start, end,
			orderByComparator);
	}

	/**
	* Returns the first employee in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee
	* @throws com.navin.example.liferay.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.navin.example.liferay.model.Employee findByfirstNameCollection_First(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.navin.example.liferay.NoSuchEmployeeException {
		return getPersistence()
				   .findByfirstNameCollection_First(firstName, orderByComparator);
	}

	/**
	* Returns the first employee in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.navin.example.liferay.model.Employee fetchByfirstNameCollection_First(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfirstNameCollection_First(firstName,
			orderByComparator);
	}

	/**
	* Returns the last employee in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee
	* @throws com.navin.example.liferay.NoSuchEmployeeException if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.navin.example.liferay.model.Employee findByfirstNameCollection_Last(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.navin.example.liferay.NoSuchEmployeeException {
		return getPersistence()
				   .findByfirstNameCollection_Last(firstName, orderByComparator);
	}

	/**
	* Returns the last employee in the ordered set where firstName = &#63;.
	*
	* @param firstName the first name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching employee, or <code>null</code> if a matching employee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.navin.example.liferay.model.Employee fetchByfirstNameCollection_Last(
		java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfirstNameCollection_Last(firstName, orderByComparator);
	}

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
	public static com.navin.example.liferay.model.Employee[] findByfirstNameCollection_PrevAndNext(
		long employeeId, java.lang.String firstName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.navin.example.liferay.NoSuchEmployeeException {
		return getPersistence()
				   .findByfirstNameCollection_PrevAndNext(employeeId,
			firstName, orderByComparator);
	}

	/**
	* Returns all the employees.
	*
	* @return the employees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.navin.example.liferay.model.Employee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.navin.example.liferay.model.Employee> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.navin.example.liferay.model.Employee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the employees where firstName = &#63; from the database.
	*
	* @param firstName the first name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfirstNameCollection(java.lang.String firstName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfirstNameCollection(firstName);
	}

	/**
	* Removes all the employees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of employees where firstName = &#63;.
	*
	* @param firstName the first name
	* @return the number of matching employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfirstNameCollection(java.lang.String firstName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfirstNameCollection(firstName);
	}

	/**
	* Returns the number of employees.
	*
	* @return the number of employees
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EmployeePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EmployeePersistence)PortletBeanLocatorUtil.locate(com.navin.example.liferay.service.ClpSerializer.getServletContextName(),
					EmployeePersistence.class.getName());

			ReferenceRegistry.registerReference(EmployeeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(EmployeePersistence persistence) {
	}

	private static EmployeePersistence _persistence;
}