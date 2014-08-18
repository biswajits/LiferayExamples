package is.brendan.liferay.portlet.testportlet.controller;  

import java.util.HashMap;
import java.util.Map;

import javax.portlet.RenderRequest;  
import javax.portlet.RenderResponse;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;  
 
@Controller(value = "MyController")  
@RequestMapping("VIEW")  
public class MyController {
 
  @RenderMapping  
  public ModelAndView handleRenderRequest(RenderRequest request,RenderResponse response,Model model){  
 
	Map<String, Object> map = new HashMap<>();
	map.put("welcomeMessage", "My First Spring Protlet");
	  
    return new ModelAndView("myview", map);
  }  
}