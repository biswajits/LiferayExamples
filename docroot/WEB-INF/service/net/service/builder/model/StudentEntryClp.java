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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import net.service.builder.service.ClpSerializer;
import net.service.builder.service.StudentEntryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 */
public class StudentEntryClp extends BaseModelImpl<StudentEntry>
	implements StudentEntry {
	public StudentEntryClp() {
	}

	public Class<?> getModelClass() {
		return StudentEntry.class;
	}

	public String getModelClassName() {
		return StudentEntry.class.getName();
	}

	public long getPrimaryKey() {
		return _studentId;
	}

	public void setPrimaryKey(long primaryKey) {
		setStudentId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_studentId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentId", getStudentId());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
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

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		_studentId = studentId;

		if (_studentEntryRemoteModel != null) {
			try {
				Class<?> clazz = _studentEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setStudentId", long.class);

				method.invoke(_studentEntryRemoteModel, studentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;

		if (_studentEntryRemoteModel != null) {
			try {
				Class<?> clazz = _studentEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_studentEntryRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getStudentEntryRemoteModel() {
		return _studentEntryRemoteModel;
	}

	public void setStudentEntryRemoteModel(BaseModel<?> studentEntryRemoteModel) {
		_studentEntryRemoteModel = studentEntryRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _studentEntryRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_studentEntryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			StudentEntryLocalServiceUtil.addStudentEntry(this);
		}
		else {
			StudentEntryLocalServiceUtil.updateStudentEntry(this);
		}
	}

	@Override
	public StudentEntry toEscapedModel() {
		return (StudentEntry)ProxyUtil.newProxyInstance(StudentEntry.class.getClassLoader(),
			new Class[] { StudentEntry.class }, new AutoEscapeBeanHandler(this));
	}

	public StudentEntry toUnescapedModel() {
		return this;
	}

	@Override
	public Object clone() {
		StudentEntryClp clone = new StudentEntryClp();

		clone.setStudentId(getStudentId());
		clone.setName(getName());

		return clone;
	}

	public int compareTo(StudentEntry studentEntry) {
		long primaryKey = studentEntry.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StudentEntryClp)) {
			return false;
		}

		StudentEntryClp studentEntry = (StudentEntryClp)obj;

		long primaryKey = studentEntry.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{studentId=");
		sb.append(getStudentId());
		sb.append(", name=");
		sb.append(getName());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("net.service.builder.model.StudentEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studentId</column-name><column-value><![CDATA[");
		sb.append(getStudentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _studentId;
	private String _name;
	private BaseModel<?> _studentEntryRemoteModel;
}