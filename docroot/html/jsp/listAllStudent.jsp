<%@page import="net.service.builder.service.StudentEntryLocalServiceUtil"%>
<%@page import="net.service.builder.model.StudentEntry"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

<%
	List<StudentEntry> students = StudentEntryLocalServiceUtil.getAllStudent();
	System.out.println("List Size  :  "+students.size());
%>
<liferay-ui:search-container delta="10" emptyResultsMessage="No Results Found">
	<liferay-ui:search-container-results total="<%= students.size() %>" results="<%=students%>" />
		<liferay-ui:search-container-row modelVar="student" className="net.service.builder.model.impl.StudentEntryBaseImpl" >
			<liferay-ui:search-container-column-text name='name' value="<%=student.getName() %>" href="" />
			<liferay-ui:search-container-column-text name='id' value="<%=Long.toString(student.getStudentId()) %>" href="" />
			<liferay-ui:search-container-column-jsp path="/html/jsp/button.jsp"/>
		</liferay-ui:search-container-row>
	<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" paginate="<%= true %>" />
</liferay-ui:search-container>
