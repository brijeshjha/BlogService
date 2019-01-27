package BlogService;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class DemoController {
 
	@RequestMapping("/")
	public String welcome() {
		return "welcomeee";
	}
}