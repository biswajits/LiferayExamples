<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="net.service.builder.model.StudentEntry"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%ResultRow rslt=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW) ;
StudentEntry selsetedStudent=(StudentEntry)rslt.getObject();
String id=String.valueOf(selsetedStudent.getStudentId());
%>

<liferay-ui:icon-menu>
	<portlet:actionURL var="editURL" name="editStudentRender">
		<portlet:param name="studentID" value="<%=id %>"/>
	</portlet:actionURL>
	<liferay-ui:icon image="edit" url="<%=editURL.toString() %>"/>

	<portlet:actionURL var="deleteURL" name="studentAction">
		<portlet:param name="studentID" value="<%=id %>"/>
		<portlet:param name="actionName" value="delete"/>
	</portlet:actionURL>
	<liferay-ui:icon-delete url="<%=deleteURL.toString() %>" />
</liferay-ui:icon-menu>