import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TelivisionTest {

	
		Telivision telivision;
		@BeforeEach
		void setUp() {
		telivision =new Telivision(true,8,8,9);
		}
@Test
void testStae()
{
	assertEquals(true,telivision.state());
}
@Test
void testIncreaseVolume()
{
	assertEquals(9,telivision.increaseVolume());
}
@Test
void testDecreaseVolume()
{
	assertEquals(7,telivision.decreaseVolume());
}
@Test
void testChangeChannel()
{
	assertEquals(9,telivision.changeChannel());
}
	}


