package br.com.sicredi.deli.pageobject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import br.com.sicredi.deli.config.DriverFactory;

public class SimuladorPage extends DriverFactory{

	DriverFactory drivefactorig = new DriverFactory();

	public void chamaDrive() {
		driver = drivefactorig.getDriver();
	}
	
	public void escolhePerfilEmpresa() {		
		driver.findElement(radioParaEmpresa).click();
	}
	
	public String inseriValorAplicar(String valor) {		
		driver.findElement(campoValorAplicar).sendKeys(valor);
		return valor;
	}
	
	public String inseriValorInvestir(String valor) {
		driver.findElement(campoValorInvestir).sendKeys(valor);
		return valor;
	}
	
	public String inseriTempoPoupar(String tempo) {
		driver.findElement(campoPouparTempo).sendKeys(tempo);
		return tempo;
	}
	
	public void selecionaAno() {
		driver.findElement(comboSelect).click();
		driver.findElement(opcaoAno).click();
	}
	
	public void clicarBotaoSimular() {
		driver.findElement(botaoSimular).click();
	}
	
	public String verificaTabelaResultado(String msg) throws IOException{					
		boolean existeTexto = driver.getPageSource().contains(msg);
		assertTrue(existeTexto);
		return msg;
	}
	
	public String validaMessagenErro(String msg) {	
		driver.findElement(campoPouparTempo).click();
		String erroMessage = driver.findElement(erroVlInvestir).getText();		
		assertEquals(erroMessage, msg);	
		return msg;
	}	
	
	public void fecharBrowser() {		
		driver.close();
	}
	
	
}
