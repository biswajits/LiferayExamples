<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />
<portlet:actionURL var="createEmployeeDetailURL">
    <portlet:param name="action" value="createEmployee" />
</portlet:actionURL>
<aui:form action="<%=createEmployeeDetailURL %>" method="post" name="createEmp">
    <aui:layout>         
         <aui:fieldset>
           <aui:column>
            	<aui:input type="text" name="firstName" label="First Name" />
                <aui:input type="text" name="LastName" label="Last Name" />
                <aui:input type="text" name="email" label="Email" />
                <aui:input type="text" name="phoneNo" label="Phone No" />
                <aui:button type="submit" value="Save"  />
           </aui:column>
     	</aui:fieldset>  
    </aui:layout>
</aui:form>