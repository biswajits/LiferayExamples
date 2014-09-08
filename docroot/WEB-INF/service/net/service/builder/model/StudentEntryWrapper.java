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

package net.service.builder.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link StudentEntry}.
 * </p>
 *
 * @author    Administrator
 * @see       StudentEntry
 * @generated
 */
public class StudentEntryWrapper implements StudentEntry,
	ModelWrapper<StudentEntry> {
	public StudentEntryWrapper(StudentEntry studentEntry) {
		_studentEntry = studentEntry;
	}

	public Class<?> getModelClass() {
		return StudentEntry.class;
	}

	public String getModelClassName() {
		return StudentEntry.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentId", getStudentId());
		attributes.put("name", getName());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentId = (Long)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	/**
	* Returns the primary key of this student entry.
	*
	* @return the primary key of this student entry
	*/
	public long getPrimaryKey() {
		return _studentEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this student entry.
	*
	* @param primaryKey the primary key of this student entry
	*/
	public void setPrimaryKey(long primaryKey) {
		_studentEntry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the student ID of this student entry.
	*
	* @return the student ID of this student entry
	*/
	public long getStudentId() {
		return _studentEntry.getStudentId();
	}

	/**
	* Sets the student ID of this student entry.
	*
	* @param studentId the student ID of this student entry
	*/
	public void setStudentId(long studentId) {
		_studentEntry.setStudentId(studentId);
	}

	/**
	* Returns the name of this student entry.
	*
	* @return the name of this student entry
	*/
	public java.lang.String getName() {
		return _studentEntry.getName();
	}

	/**
	* Sets the name of this student entry.
	*
	* @param name the name of this student entry
	*/
	public void setName(java.lang.String name) {
		_studentEntry.setName(name);
	}

	public boolean isNew() {
		return _studentEntry.isNew();
	}

	public void setNew(boolean n) {
		_studentEntry.setNew(n);
	}

	public boolean isCachedModel() {
		return _studentEntry.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_studentEntry.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _studentEntry.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _studentEntry.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_studentEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _studentEntry.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_studentEntry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StudentEntryWrapper((StudentEntry)_studentEntry.clone());
	}

	public int compareTo(net.service.builder.model.StudentEntry studentEntry) {
		return _studentEntry.compareTo(studentEntry);
	}

	@Override
	public int hashCode() {
		return _studentEntry.hashCode();
	}

	public com.liferay.portal.model.CacheModel<net.service.builder.model.StudentEntry> toCacheModel() {
		return _studentEntry.toCacheModel();
	}

	public net.service.builder.model.StudentEntry toEscapedModel() {
		return new StudentEntryWrapper(_studentEntry.toEscapedModel());
	}

	public net.service.builder.model.StudentEntry toUnescapedModel() {
		return new StudentEntryWrapper(_studentEntry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _studentEntry.toString();
	}

	public java.lang.String toXmlString() {
		return _studentEntry.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentEntry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StudentEntryWrapper)) {
			return false;
		}

		StudentEntryWrapper studentEntryWrapper = (StudentEntryWrapper)obj;

		if (Validator.equals(_studentEntry, studentEntryWrapper._studentEntry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public StudentEntry getWrappedStudentEntry() {
		return _studentEntry;
	}

	public StudentEntry getWrappedModel() {
		return _studentEntry;
	}

	public void resetOriginalValues() {
		_studentEntry.resetOriginalValues();
	}

	private StudentEntry _studentEntry;
}