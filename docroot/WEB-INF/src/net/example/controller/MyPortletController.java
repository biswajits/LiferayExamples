package net.example.controller;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import net.service.builder.model.StudentEntry;
import net.service.builder.service.StudentEntryLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class MyPortletController extends MVCPortlet {
	
	public void addStudent(ActionRequest request, ActionResponse response) throws SystemException{
		
		StudentEntryLocalServiceUtil.addStudent(request.getParameter("studentName"));
		SessionMessages.add(request.getPortletSession(),"student-form-success");
		System.out.println("one student sucessfully added");
		response.setRenderParameter("mvcPath", "/html/jsp/addStudent.jsp");
	}
	
	public void editStudentRender(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
		
	//	long studentId = Long.valueOf(request.getParameter("studentID"));
//		StudentEntry  student = StudentEntryLocalServiceUtil.getStudentEntry(studentId);
//		request.setAttribute("edit", student);
//		request.setAttribute("test12", "test");
//		System.out.println(student.getName());
		response.setRenderParameter("mvcPath", "/html/jsp/edit.jsp");
		System.out.println("in student render");
		PortalUtil.copyRequestParameters(request, response); //forward the actionRequest parameter
	}
	
	
	public void studentAction(ActionRequest request, ActionResponse response) throws NumberFormatException, PortalException, SystemException{
		String actionName = request.getParameter("actionName");
		StudentEntry student = StudentEntryLocalServiceUtil.getStudentEntry(Long.valueOf(request.getParameter("studentID")));
		if(actionName.equals("edit")){
			student.setName(request.getParameter("name"));
			StudentEntryLocalServiceUtil.updateStudentEntry(student);
		}else
			StudentEntryLocalServiceUtil.deleteStudentEntry(student);
		
		response.setRenderParameter("mvcPath", "/html/jsp/listAllStudent.jsp");;
	}
}
