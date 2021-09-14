package br.com.treinaweb.selenium.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Assert;

public class HelloSeleniumTest extends TreinaWebSeleniumTestBase{

	@Test
	public void testHelloSelenium() {
		setUrl("E:/Cursos/Treinaweb/Selenium Web Driver/Projeto WebDriver/Teste_selenium.html");
		getDriver().findElement(By.id("txb-nome")).sendKeys("Anderson");
		String textoInput = getDriver().findElement(By.id("txb-nome")).getAttribute("value");
		Assert.assertEquals(textoInput, "Anderson");
	}
	
}