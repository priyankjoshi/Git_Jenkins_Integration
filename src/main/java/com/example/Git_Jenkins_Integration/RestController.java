/**
 * 
 */
package com.example.Git_Jenkins_Integration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Admin
 *
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping(method= RequestMethod.GET, value="/SampleApplication")
	public void sayHello() {
		
		System.out.println("Hello Demo");
		
	}
	
}
