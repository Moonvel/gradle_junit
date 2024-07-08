package ru.base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

public class BaseTests {

	@BeforeAll
	public static void setUp(TestInfo testInfo) {
		System.out.println("@BeforeAll - Производим настройки среды тестирования для всех " + testInfo.getDisplayName());
	}

	@BeforeEach
	public void beforeEach(TestInfo testInfo) {
		System.out.println("@BeforeEach - Производим настройки перед тестом: " + testInfo.getDisplayName());
	}

	@AfterEach
	public void afterEach(TestInfo testInfo) {
		System.out.println("@AfterEach - Завершение работы теста: " + testInfo.getDisplayName());
	}

	@AfterAll
	public static void afterAll(TestInfo testInfo) {
		System.out.println("@AfterTest - Производим очистку для всех " + testInfo.getDisplayName());
	}
}
