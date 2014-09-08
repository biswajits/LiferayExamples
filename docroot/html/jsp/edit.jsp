<%@page import="net.service.builder.service.StudentEntryLocalServiceUtil"%>
<%@page import="net.service.builder.model.StudentEntry"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects/>

<%
	StudentEntry student = StudentEntryLocalServiceUtil.getStudentEntry(Long.valueOf(renderRequest.getParameter("studentID")));
%>

<portlet:actionURL var="editStudentActionURL" windowState="normal" name="studentAction"/>
<aui:form action="<%=editStudentActionURL.toString() %>" method="POST">
	<aui:input name="studentID" value="<%=student.getStudentId() %>" type="hidden"/>
	<aui:input name="name" value="<%=student.getName() %>" label="Name : " inlineField="true"/>
	<aui:input name="actionName" value="edit" type="hidden"/>
	<aui:button-row>
		<aui:button value="Edit" type="submit"/>
	</aui:button-row>
</aui:form>