<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

<% if(SessionMessages.contains(renderRequest.getPortletSession(),"student-form-success")){%>
<liferay-ui:success key="student-form-success" message="Student form Submitted successfully and following are the details." />
<%} %>

<portlet:actionURL var="addStudentActionURL" windowState="normal" name="addStudent"/>

<aui:form action="<%=addStudentActionURL.toString()%>" method="POST">

	<aui:fieldset>
		<aui:input name="studentName" label="Student Name : " inlineField="true"/>
		<aui:button-row>
			<aui:button name="Save" type="submit" value="Save"/>
		</aui:button-row>
	</aui:fieldset>
</aui:form>