package ru.api;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.base.BaseTests;

public class ApiTest extends BaseTests {

	@Test
	@Tag("api")
	public void currentWeatherApiTest() {
		System.out.println("@Test - APITest currentWeatherApiTest - Проврека API 'Текущая погода'");
	}

	@Test
	@Tag("api")
	public void dailyForecast16DaysTest() {
		System.out.println(
				"@Test - APITest dailyForecast16DaysTest - Проврека API 'Погода на 16 дней'");
	}
}
