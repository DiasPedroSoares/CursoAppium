package br.ce.wcaquino.appium.page;

import org.openqa.selenium.By;

import br.ce.wcaquino.appium.core.DSL;
import io.appium.java_client.MobileBy;

public class FormularioPage {
	
	private DSL dsl = new DSL();

	public void escreverNome(String nome) {
		
		dsl.escrever(MobileBy.AccessibilityId("nome"), nome);
	}
	
	public String obterNome() {
		
		return dsl.obterTexto(MobileBy.AccessibilityId("nome"));
	}
	
	public void selecionarCombo(String valor) {
		
		dsl.clicarNoCombo(MobileBy.AccessibilityId("console"), valor);
	}
	
	public String obterValorCombo() {
		
		return dsl.obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	}
	
	public void clicaCheck() {
		
		dsl.Clicar(By.className("android.widget.CheckBox"));
	}
	
	public void clicaSwitch() {
		
		dsl.Clicar(MobileBy.AccessibilityId("switch"));
	}
	
	public boolean isCheckMarcado() {
		return dsl.IsCheckedMarcado(By.className("android.widget.CheckBox"));
	}
	
	public boolean isSwitchMarcado() {
		return dsl.IsCheckedMarcado(MobileBy.AccessibilityId("switch"));
	}
	
	public void salvar() {
		
		dsl.clicarPortexto("SALVAR");
	}
	
	public String obterNomeCadastrado() {
		
		return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:')]"));
	}
	
	public String obterConsoleCadastrado() {
		
		return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]"));
	}
	
	public String ObterValorSwitchCadastrado() {
		
		return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch:')]"));
	}
	
	public String ObterValorCheckCadastrado() {
		
		return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox:')]"));
	}
	
}
