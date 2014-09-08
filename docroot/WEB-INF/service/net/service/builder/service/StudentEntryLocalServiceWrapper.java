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

package net.service.builder.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link StudentEntryLocalService}.
 * </p>
 *
 * @author    Administrator
 * @see       StudentEntryLocalService
 * @generated
 */
public class StudentEntryLocalServiceWrapper implements StudentEntryLocalService,
	ServiceWrapper<StudentEntryLocalService> {
	public StudentEntryLocalServiceWrapper(
		StudentEntryLocalService studentEntryLocalService) {
		_studentEntryLocalService = studentEntryLocalService;
	}

	/**
	* Adds the student entry to the database. Also notifies the appropriate model listeners.
	*
	* @param studentEntry the student entry
	* @return the student entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public net.service.builder.model.StudentEntry addStudentEntry(
		net.service.builder.model.StudentEntry studentEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.addStudentEntry(studentEntry);
	}

	/**
	* Creates a new student entry with the primary key. Does not add the student entry to the database.
	*
	* @param studentId the primary key for the new student entry
	* @return the new student entry
	*/
	public net.service.builder.model.StudentEntry createStudentEntry(
		long studentId) {
		return _studentEntryLocalService.createStudentEntry(studentId);
	}

	/**
	* Deletes the student entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the student entry
	* @return the student entry that was removed
	* @throws PortalException if a student entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.service.builder.model.StudentEntry deleteStudentEntry(
		long studentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.deleteStudentEntry(studentId);
	}

	/**
	* Deletes the student entry from the database. Also notifies the appropriate model listeners.
	*
	* @param studentEntry the student entry
	* @return the student entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	public net.service.builder.model.StudentEntry deleteStudentEntry(
		net.service.builder.model.StudentEntry studentEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.deleteStudentEntry(studentEntry);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _studentEntryLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	public net.service.builder.model.StudentEntry fetchStudentEntry(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.fetchStudentEntry(studentId);
	}

	/**
	* Returns the student entry with the primary key.
	*
	* @param studentId the primary key of the student entry
	* @return the student entry
	* @throws PortalException if a student entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public net.service.builder.model.StudentEntry getStudentEntry(
		long studentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.getStudentEntry(studentId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.getPersistedModel(primaryKeyObj);
	}

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
	public java.util.List<net.service.builder.model.StudentEntry> getStudentEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.getStudentEntries(start, end);
	}

	/**
	* Returns the number of student entries.
	*
	* @return the number of student entries
	* @throws SystemException if a system exception occurred
	*/
	public int getStudentEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.getStudentEntriesCount();
	}

	/**
	* Updates the student entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param studentEntry the student entry
	* @return the student entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public net.service.builder.model.StudentEntry updateStudentEntry(
		net.service.builder.model.StudentEntry studentEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.updateStudentEntry(studentEntry);
	}

	/**
	* Updates the student entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param studentEntry the student entry
	* @param merge whether to merge the student entry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the student entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public net.service.builder.model.StudentEntry updateStudentEntry(
		net.service.builder.model.StudentEntry studentEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.updateStudentEntry(studentEntry, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _studentEntryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_studentEntryLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _studentEntryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public net.service.builder.model.StudentEntry addStudent(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.addStudent(name);
	}

	public java.util.List<net.service.builder.model.StudentEntry> getAllStudent()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentEntryLocalService.getAllStudent();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public StudentEntryLocalService getWrappedStudentEntryLocalService() {
		return _studentEntryLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedStudentEntryLocalService(
		StudentEntryLocalService studentEntryLocalService) {
		_studentEntryLocalService = studentEntryLocalService;
	}

	public StudentEntryLocalService getWrappedService() {
		return _studentEntryLocalService;
	}

	public void setWrappedService(
		StudentEntryLocalService studentEntryLocalService) {
		_studentEntryLocalService = studentEntryLocalService;
	}

	private StudentEntryLocalService _studentEntryLocalService;
}