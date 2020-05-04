package br.com.sicredi.deli.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory implements IConstants{

	public static WebDriver driver;
	
	//locators simulador form
	public By radioParaVoce = By.cssSelector("input[value=paraVoce]");	
	public By radioParaEmpresa = By.cssSelector("input[value=paraEmpresa]");
	public By campoValorAplicar = By.id("valorAplicar");
	public By campoValorInvestir = By.id("valorInvestir");
	public By campoPouparTempo = By.id("tempo");
	public By comboSelect = By.cssSelector(".btSelect");
	public By opcaoAno = By.linkText("Anos");		
	public By botaoSimular = By.cssSelector("button.btn.btnAmarelo.btnSimular");
	public By mensagem = By.cssSelector("div span");
	
	//labels de erro valor aplicar e valor investir
	public By erroVlAplicar = By.cssSelector("label[id=valorAplicar-error]");
	public By erroVlInvestir = By.cssSelector("label[id=valorInvestir-error]");
	
	//locator da tela resultado	
	public By botaoRefazSimulacao = By.cssSelector(".btn.btnAmarelo.btnRefazer");	
	
	//executa uma instância do ChromeDriver 
	public WebDriver getDriver(){
		System.setProperty("webdriver.chrome.driver",  CHROME_DRIVER );
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");		
		return driver;
	}	
}
