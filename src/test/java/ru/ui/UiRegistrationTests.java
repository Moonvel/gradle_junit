package ru.ui;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.base.BaseTests;

@Tag("ui")
public class UiRegistrationTests extends BaseTests {

	@Test
	public void registrationFormTest() {
		System.out.println("@Test - UITest registrationFormTest - Проверка формы регистрации");
	}

	@Test
	public void resetPassword() {
		System.out.println("@Test - UITest resetPassword - Восстановление пароля");
		Assertions.fail("Не удалось восстановить пароль");
	}
}
