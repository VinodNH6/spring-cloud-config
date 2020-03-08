package springconfigproduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringConfigProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigProductApplication.class, args);
	}
	
	@Autowired
	public void setEnv(Environment e)
	{
		System.out.println(e.getProperty("productmsg"));
	}
}

@RefreshScope
@RestController
class MessageRestController {

	@Value("${productmsg:Config Server is not working. Please check...}")
	private String msg;

	@GetMapping("/productmsg")
	public String getMsg() {
		return this.msg;
	}
}
