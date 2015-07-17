package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.nexient.practice.PetFinderPracticeApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PetFinderPracticeApplication.class)
@WebAppConfiguration
public class PetFinderPracticeApplicationTests {

	@Test
	public void contextLoads() {
	}

}
