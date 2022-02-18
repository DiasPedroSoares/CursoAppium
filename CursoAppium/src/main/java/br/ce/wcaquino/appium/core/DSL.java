package br.ce.wcaquino.appium.core;

import static br.ce.wcaquino.appium.core.DriverFactory.GetDriver;

import org.openqa.selenium.By;

public class DSL {
	
	public void escrever(By by, String texto) {
		
		GetDriver().findElement(by).sendKeys(texto);
	}

	public String obterTexto(By by) {
		
		return GetDriver().findElement(by).getText();
		
	}
	
	public void Clicar(By by) {
		
		GetDriver().findElement(by).click();
		
	}
	
	public void clicarPortexto(String texto) {
		
		Clicar(By.xpath("//*[@text='"+texto+"']"));
	}
		
	public void clicarNoCombo(By by, String valor) {
		
	    GetDriver().findElement(by).click();
	    clicarPortexto(valor);
	    	
	}
	
	public boolean IsCheckedMarcado(By by) {
		
		return GetDriver().findElement(by).getAttribute("checked").equals("true");
	}
	
}
