import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
 
public class testCore {
	public QuizOneJunit obj;
	
	@Before
	public void init() {
		obj = new QuizOneJunit();
	}
	@Test
	public void WTC1() {
		assertEquals(2, obj.countLetterA("sdadawe"));
	}
	@Test
	public void WTC2() {
		assertEquals(0, obj.countLetterA("edodxs"));
	}
	@Test
	public void WTC3() {
		assertEquals(0, obj.countLetterA(""));
	}
	
	@Test
	public void LTC1() {
		assertEquals(false, obj.checkTwoLetter("A"));
	}
	@Test
	public void LTC2() {
		assertEquals(true, obj.checkTwoLetter("CC"));
	}
	@Test
	public void LTC3() {
		assertEquals(true, obj.checkTwoLetter("dodo"));
	}
}
