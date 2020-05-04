package br.com.sicredi.deli.runner;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriverException;

import br.com.sicredi.deli.pageobject.SimuladorPage;


/*
	História
	Com o propósito de Simular um Investimento na Poupança
	como um Associado,
	eu gostaria de preencher o formulário de simulação
	e ver a tabela de resultado com Mês e Valor.

	Critério de aceitação:
	
	- O associado preencher todos os campos corretamente e visualizar o formulário de simulação
	- O associado preencher o valor inferior a “R$ 20.00” e receber a mensagem de orientação “Valor mínimo de R$ 20.00”.
*/
public class SimuladorRunner {

	SimuladorPage simuladorPage = new SimuladorPage();	
	
	
	@Test
	public void validarInvestimentoMensalEmpresa() throws IOException { //Simulacao pra empresa meses	
		simuladorPage.chamaDrive();
		simuladorPage.escolhePerfilEmpresa();
		simuladorPage.inseriValorAplicar("500000");
		simuladorPage.inseriValorInvestir("10000");
		simuladorPage.inseriTempoPoupar("10");
		simuladorPage.clicarBotaoSimular();
		simuladorPage.verificaTabelaResultado("Veja estas outras opções para você");
	}
	
	@Test
	public void validarInvestimentoAnualEmpresa() throws IOException{   //Simulacao pra empresa anos
		simuladorPage.chamaDrive();
		simuladorPage.escolhePerfilEmpresa();
		simuladorPage.inseriValorAplicar("1000000");
		simuladorPage.inseriValorInvestir("20000");
		simuladorPage.inseriTempoPoupar("2");
		simuladorPage.selecionaAno();
		simuladorPage.clicarBotaoSimular();
		simuladorPage.verificaTabelaResultado("Veja estas outras opções para você");
	}
	
	@Test
	public void validarInvestimentoMensalPraVc() throws IOException { //Simulacao pra você meses
		simuladorPage.chamaDrive();
		simuladorPage.inseriValorAplicar("800000");
		simuladorPage.inseriValorInvestir("50000");
		simuladorPage.inseriTempoPoupar("11");
		simuladorPage.clicarBotaoSimular();
		simuladorPage.verificaTabelaResultado("Veja estas outras opções para você");
	}
	
	@Test
	public void validarInvestimentoAnualPraVc() throws IOException{   //Simulacao pra você anos		
		simuladorPage.chamaDrive();
		simuladorPage.inseriValorAplicar("5000000");
		simuladorPage.inseriValorInvestir("30000");
		simuladorPage.inseriTempoPoupar("5");
		simuladorPage.selecionaAno();
		simuladorPage.clicarBotaoSimular();
		simuladorPage.verificaTabelaResultado("Veja estas outras opções para você");
	}
	
	@Test
	public void validarCamposValorInferior() throws IOException{	//Valida valor inferior
		simuladorPage.chamaDrive();
		simuladorPage.inseriValorAplicar("1999");
		simuladorPage.inseriValorInvestir("1999");		
		simuladorPage.validaMessagenErro("Valor mínimo de 20.00");
	}	
		
	@After
	public void CloseBrowser() throws WebDriverException{   //Fecha browser
		simuladorPage.fecharBrowser();
	}
}
