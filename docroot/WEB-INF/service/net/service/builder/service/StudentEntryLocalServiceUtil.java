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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the student entry local service. This utility wraps {@link net.service.builder.service.impl.StudentEntryLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Administrator
 * @see StudentEntryLocalService
 * @see net.service.builder.service.base.StudentEntryLocalServiceBaseImpl
 * @see net.service.builder.service.impl.StudentEntryLocalServiceImpl
 * @generated
 */
public class StudentEntryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link net.service.builder.service.impl.StudentEntryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the student entry to the database. Also notifies the appropriate model listeners.
	*
	* @param studentEntry the student entry
	* @return the student entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public static net.service.builder.model.StudentEntry addStudentEntry(
		net.service.builder.model.StudentEntry studentEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addStudentEntry(studentEntry);
	}

	/**
	* Creates a new student entry with the primary key. Does not add the student entry to the database.
	*
	* @param studentId the primary key for the new student entry
	* @return the new student entry
	*/
	public static net.service.builder.model.StudentEntry createStudentEntry(
		long studentId) {
		return getService().createStudentEntry(studentId);
	}

	/**
	* Deletes the student entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentId the primary key of the student entry
	* @return the student entry that was removed
	* @throws PortalException if a student entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.service.builder.model.StudentEntry deleteStudentEntry(
		long studentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteStudentEntry(studentId);
	}

	/**
	* Deletes the student entry from the database. Also notifies the appropriate model listeners.
	*
	* @param studentEntry the student entry
	* @return the student entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static net.service.builder.model.StudentEntry deleteStudentEntry(
		net.service.builder.model.StudentEntry studentEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteStudentEntry(studentEntry);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static net.service.builder.model.StudentEntry fetchStudentEntry(
		long studentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchStudentEntry(studentId);
	}

	/**
	* Returns the student entry with the primary key.
	*
	* @param studentId the primary key of the student entry
	* @return the student entry
	* @throws PortalException if a student entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static net.service.builder.model.StudentEntry getStudentEntry(
		long studentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentEntry(studentId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<net.service.builder.model.StudentEntry> getStudentEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentEntries(start, end);
	}

	/**
	* Returns the number of student entries.
	*
	* @return the number of student entries
	* @throws SystemException if a system exception occurred
	*/
	public static int getStudentEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentEntriesCount();
	}

	/**
	* Updates the student entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param studentEntry the student entry
	* @return the student entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static net.service.builder.model.StudentEntry updateStudentEntry(
		net.service.builder.model.StudentEntry studentEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateStudentEntry(studentEntry);
	}

	/**
	* Updates the student entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param studentEntry the student entry
	* @param merge whether to merge the student entry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the student entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static net.service.builder.model.StudentEntry updateStudentEntry(
		net.service.builder.model.StudentEntry studentEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateStudentEntry(studentEntry, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static net.service.builder.model.StudentEntry addStudent(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addStudent(name);
	}

	public static java.util.List<net.service.builder.model.StudentEntry> getAllStudent()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllStudent();
	}

	public static void clearService() {
		_service = null;
	}

	public static StudentEntryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					StudentEntryLocalService.class.getName());

			if (invokableLocalService instanceof StudentEntryLocalService) {
				_service = (StudentEntryLocalService)invokableLocalService;
			}
			else {
				_service = new StudentEntryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(StudentEntryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(StudentEntryLocalService service) {
	}

	private static StudentEntryLocalService _service;
}