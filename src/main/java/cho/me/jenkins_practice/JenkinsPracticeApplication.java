package cho.me.jenkins_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JenkinsPracticeApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "WELCOME !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsPracticeApplication.class, args);
	}

}
