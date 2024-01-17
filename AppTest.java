import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class AppTest {

	@Test
	void test() {
		Radio radio = new Radio();
		assertEquals(radio.getEstacion(), 87.9f);
		assertEquals(radio.getBanda(), 1);
		radio.guardarEstacion(89.7f, 1, 1);
		radio.setEstacion(101.1f, 1);
	}

}
