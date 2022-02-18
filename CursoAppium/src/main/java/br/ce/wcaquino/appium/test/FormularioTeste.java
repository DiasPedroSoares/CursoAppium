package br.ce.wcaquino.appium.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.wcaquino.appium.core.DriverFactory;
import br.ce.wcaquino.appium.page.FormularioPage;
import br.ce.wcaquino.appium.page.MenuPage;

public class FormularioTeste {
	
	
	private MenuPage menu = new MenuPage();
	private FormularioPage formulario = new FormularioPage();
	
	@Before
	public void iniciarlizarAppium(){
		
		menu.acessarFormulario();
	}
	
	@After
	public void finalizarAppium() {
		
		DriverFactory.killDriver();
	}
	
	@Test
	public void devePreencherCampoTexto(){
		
		   
	    formulario.escreverNome("Pedro Dias");
	    
	    assertEquals("Pedro Dias", formulario.obterNome());
	    
	}
	
	@Test
	public void deveInteragirCombo(){
		
   	    formulario.selecionarCombo("PS4");
	    
	    Assert.assertEquals("PS4", formulario.obterValorCombo());	    

	}
	
	@Test
	public void deveInteragirComSwitchCheckbox(){
		
	    Assert.assertFalse(formulario.isCheckMarcado());
	    Assert.assertTrue(formulario.isSwitchMarcado());
	        
	    formulario.clicaCheck();
	    formulario.clicaSwitch();
	    
	    Assert.assertTrue(formulario.isCheckMarcado());
	    Assert.assertFalse(formulario.isSwitchMarcado());
	    	    
	}
	
	@Test
	public void devePreencherFormulario(){
		
	    
		formulario.escreverNome("Pedro Dias");	   
	    formulario.selecionarCombo("PS4");
	    formulario.clicaCheck();
	    formulario.clicaSwitch();	    	
	    
	    formulario.salvar();     
	    
	    Assert.assertEquals("Nome: Pedro Dias", formulario.obterNomeCadastrado());
	    Assert.assertEquals("Console: ps4", formulario.obterConsoleCadastrado());  
	    Assert.assertTrue(formulario.ObterValorSwitchCadastrado().endsWith("Off"));	    
	    Assert.assertTrue(formulario.ObterValorCheckCadastrado().endsWith("Marcado"));
	     	    
	}

}
