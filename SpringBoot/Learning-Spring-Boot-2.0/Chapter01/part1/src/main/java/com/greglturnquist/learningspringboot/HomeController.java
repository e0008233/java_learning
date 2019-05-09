package com.greglturnquist.learningspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping
	// equals to @RequestMapping(method = RequestMethod.GET)
	public String greeting(@RequestParam(required = false,
							defaultValue = "") String name) {
		return name.equals("")
			? "Hey!"
			: "Hey, " + name + "!";
	}

}




//import java.util.concurrent.atomic.AtomicLong;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HomeController{
//
//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();
//
//    @RequestMapping("/greeting")
//    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                            String.format(template, name));
//    }
//}