package com.navin.example.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
 
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.navin.example.liferay.model.Employee;
import com.navin.example.liferay.model.impl.EmployeeImpl;
import com.navin.example.liferay.service.EmployeeLocalServiceUtil;
 
/**
 * Portlet implementation class EmployeeController
 *
 * @author NavinAgarwal
 *
 */
@Controller
@RequestMapping("VIEW")
public class EmployeeController {
  
     
    @RenderMapping
    public String createEmployee(RenderRequest request,RenderResponse response) {  
        return "createEmployee";   
    }
     
    @RenderMapping(params = "redirectPage=welcome")
    public String registration(RenderRequest request,RenderResponse response) {
        return "welcome";
    }
     
    @ActionMapping(params = "action=createEmployee")
    public void createEmployee(ActionRequest request,ActionResponse response)throws SystemException
    {
        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
        Employee employee = new EmployeeImpl();
        employee.setCompanyId(themeDisplay.getCompanyId());    
        employee.setUserId(themeDisplay.getUserId());
        employee.setFirstName(request.getParameter("firstName"));
        employee.setLastName(request.getParameter("LastName"));
        employee.setEMail(request.getParameter("email"));
        employee.setPhoneNo(request.getParameter("phoneNo"));
                         
//        EmployeeLocalServiceUtil.addEmployee(employee);
        
        EmployeeLocalServiceUtil.createEmployee(employee);
        
        response.setRenderParameter("redirectPage", "welcome");
        request.setAttribute("EmployeeName",request.getParameter("firstName")+" "+request.getParameter("LastName"));
    }
     
}
