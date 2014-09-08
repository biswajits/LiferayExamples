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

import com.liferay.portal.service.persistence.BasePersistence;

import net.service.builder.model.StudentEntry;

/**
 * The persistence interface for the student entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Administrator
 * @see StudentEntryPersistenceImpl
 * @see StudentEntryUtil
 * @generated
 */
public interface StudentEntryPersistence extends BasePersistence<StudentEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StudentEntryUtil} to access the student entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the student entry in the entity cache if it is enabled.
	*
	* @param studentEntry the student entry
	*/
	public void cacheResult(net.service.builder.model.StudentEntry studentEntry);

	/**
	* Caches the student entries in the entity cache if it is enabled.
	*
	* @param studentEntries the student entries
	*/
	public void cacheResult(
		java.util.List<net.service.builder.model.StudentEntry> studentEntries);

	/**
	* Creates a new student entry with the primary key. Does not add the student entry to the database.
	*
	* @param studentId the primary key for the new student entry
	* @return the new student entry
	*/
	public net.service.builder.model.StudentEntry create(long studentId);

	/**
	* Removes the student entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the student entry
	* @return the student entry that was removed
	* @throws net.service.builder.NoSuchEntryException if a student entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.service.builder.model.StudentEntry remove(long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.service.builder.NoSuchEntryException;

	public net.service.builder.model.StudentEntry updateImpl(
		net.service.builder.model.StudentEntry studentEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the student entry with the primary key or throws a {@link net.service.builder.NoSuchEntryException} if it could not be found.
	*
	* @param studentId the primary key of the student entry
	* @return the student entry
	* @throws net.service.builder.NoSuchEntryException if a student entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.service.builder.model.StudentEntry findByPrimaryKey(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			net.service.builder.NoSuchEntryException;

	/**
	* Returns the student entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentId the primary key of the student entry
	* @return the student entry, or <code>null</code> if a student entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.service.builder.model.StudentEntry fetchByPrimaryKey(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the student entries.
	*
	* @return the student entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.service.builder.model.StudentEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the student entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of student entries
	* @param end the upper bound of the range of student entries (not inclusive)
	* @return the range of student entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.service.builder.model.StudentEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the student entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of student entries
	* @param end the upper bound of the range of student entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of student entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<net.service.builder.model.StudentEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the student entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of student entries.
	*
	* @return the number of student entries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}