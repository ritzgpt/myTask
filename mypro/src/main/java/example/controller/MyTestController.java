package example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import example.entity.Numbers;

import example.service.MyTestService;
/** @author Ritesh Gupta
 * <h1> MyTestController class responsible for handling the request coming from dispatcher servlet
 *  /mypro is default path we need use localhost:8080/mypro/update to run the service
 *  port is default 8080 here and localhost is our default server.
 *  It has getUpdate method which handles update request.<h1/>
 *  
 *  <p>It has two end points (/mypro is default path):
 *  	<ul>
 *  		<li>/ : this is default and it prints only welcome message</li>
 *  		<li>/update : this will update the database table numbers</li> 
 *  	</ul> 
 *  </p>
 *  
 * */ 
@RestController
@Qualifier("MyTestService")
public class MyTestController {
	@Autowired
	MyTestService myTestService;
	/** @param it requires no any parameter
	 *  @return It returns a String as welcome message*/
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomeUser() {
		return "Welcome In Test";
	}
	/** @param it requires no any parameter
	 *  @return It returns nothing
	 *  <p>This API is to update a column named val_int by increment of one</p>*/
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void getUpdate() {
		synchronized(MyTestController.class) {
		Numbers number=myTestService.getVal();
		if(number==null){
		number=	new Numbers(1);
		myTestService.update(number);
		} else {
			number.setValue(number.getValue()+1);
			myTestService.update(number);
		}
	}
	}

}
