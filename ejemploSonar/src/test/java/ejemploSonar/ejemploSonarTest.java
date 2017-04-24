package ejemploSonar;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import ejemploSonar.ejemploSonar;

//import org.testng.Assert;
//import org.testng.annotations.Test;
public class ejemploSonarTest {
	@Test
	public void testStudyGroupClass() {
		
		final ejemploSonar ejemploSonar = new ejemploSonar();
		
		Assert.assertTrue(ejemploSonar.ejemploSonar().equals("Hola"));
	}
}
