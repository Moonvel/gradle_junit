package ru.smoke;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.base.BaseTests;

public class SmokeTests extends BaseTests {

	@Test
	@Tag("smoke")
	public void uiSmokeTest() {
		System.out.println("@Test - Smoke uiSmokeTest - Быстрая проверка важного UI функционала");
	}

	@Test
	@Tag("smoke")
	public void apiSmokeTest() {
		System.out.println("@Test - Smoke apiSmokeTest - Быстрая проверка важного API функционала");
	}
}
