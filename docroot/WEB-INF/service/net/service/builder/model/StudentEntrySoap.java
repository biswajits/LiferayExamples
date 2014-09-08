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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.service.builder.service.http.StudentEntryServiceSoap}.
 *
 * @author    Administrator
 * @see       net.service.builder.service.http.StudentEntryServiceSoap
 * @generated
 */
public class StudentEntrySoap implements Serializable {
	public static StudentEntrySoap toSoapModel(StudentEntry model) {
		StudentEntrySoap soapModel = new StudentEntrySoap();

		soapModel.setStudentId(model.getStudentId());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static StudentEntrySoap[] toSoapModels(StudentEntry[] models) {
		StudentEntrySoap[] soapModels = new StudentEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StudentEntrySoap[][] toSoapModels(StudentEntry[][] models) {
		StudentEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StudentEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new StudentEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StudentEntrySoap[] toSoapModels(List<StudentEntry> models) {
		List<StudentEntrySoap> soapModels = new ArrayList<StudentEntrySoap>(models.size());

		for (StudentEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StudentEntrySoap[soapModels.size()]);
	}

	public StudentEntrySoap() {
	}

	public long getPrimaryKey() {
		return _studentId;
	}

	public void setPrimaryKey(long pk) {
		setStudentId(pk);
	}

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		_studentId = studentId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private long _studentId;
	private String _name;
}