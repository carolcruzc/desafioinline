package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;


public class EdicaoInlineTestSteps {
	private static boolean initialized = false;
	private static boolean quit = false;
	private static WebDriver driver;
	private static WebDriverWait wait;
	
		
	@Before
	public void setUp() throws Exception{
		
		
		
		 if (!initialized){
	            initialized = true;
	            System.setProperty("webdriver.chrome.driver", "C:\\caroltestes\\chromedriver.exe");	
	    		driver = new ChromeDriver();
	    		
	        }
		 
		 wait = new WebDriverWait(driver, 10);
		 
	}
	
	 public static WebDriver getDriver(){
	        return driver;
	    }  
	 
	
	
	@After
	public void tearDown(){
		if (quit) {
			driver.quit();
		}
		
	}
	
	
	
	

	@Given("^Acessar a página de edição inline do site do Elias Nogueira$")
	public void acessar_a_página_de_edição_inline_do_site_do_Elias_Nogueira() throws Throwable {
		driver.get("http://eliasnogueira.com/arquivos_blog/selenium/desafio/2desafio/");
	    
	}
	
	@Given("^Alterar o nome \"(.*?)\"$")
	public void alterar_o_nome(String nome) throws Throwable {
		
		driver.findElement(By.id("name_rg_display_section")).click();
	    driver.findElement(By.id("nome_pessoa")).clear();
	    driver.findElement(By.id("nome_pessoa")).sendKeys(nome);
	    
	    
	}
	
	@When("^Completar a ação através do Salvar nome$")
	public void completar_a_ação_através_do_Salvar_nome() throws Throwable {
		 driver.findElement(By.cssSelector("#name_hv_editing_section > input[value='Salvar']")).click();
	    
	}
	
	@Then("^Verificar que a troca do nome foi feita com sucesso$")
	public void verificar_que_a_troca_do_nome_foi_feita_com_sucesso() throws Throwable {
		
		WebElement camponome = driver.findElement(By.id("name_rg_display_section")); 
		wait.until(ExpectedConditions.visibilityOf(camponome));
	    
		String resultado = driver.findElement(By.id("name_rg_display_section")).getText();
		assertEquals(resultado, "Carol Cruz");
	    
	}
	
	@Given("^Alterar o email \"(.*?)\"$")
	public void alterar_o_email(String email) throws Throwable {
		
		driver.findElement(By.id("email_rg_display_section")).click();
	    driver.findElement(By.id("email_value")).clear();
	    driver.findElement(By.id("email_value")).sendKeys(email);
	   
	    
	}
	
	@When("^Completar a ação através do Salvar email$")
	public void completar_a_ação_através_do_Salvar_email() throws Throwable {
		driver.findElement(By.cssSelector("#email_hv_editing_section > input[type=\"button\"]:nth-child(4)")).click();
	    
	}
	
	@Then("^Verificar que a troca do email foi feita com sucesso$")
	public void verificar_que_a_troca_do_email_foi_feita_com_sucesso() throws Throwable {
		
		WebElement campoemail = driver.findElement(By.id("email_rg_display_section"));
		wait.until(ExpectedConditions.visibilityOf(campoemail));
		
		String mensagem2 = driver.findElement(By.id("email_rg_display_section")).getText();
		assertEquals (mensagem2 , "Email: lolicruz@gmail.com");
	    
	}
	
	@Given("^Alterar o telefone \"(.*?)\"$")
	public void alterar_o_telefone(String telefone) throws Throwable {
		
		driver.findElement(By.id("phone_rg_display_section")).click();
	    driver.findElement(By.id("phone_value")).clear();
	    driver.findElement(By.id("phone_value")).sendKeys(telefone);
	    
	}
	
	@When("^Completar a ação através do Salvar telefone$")
	public void completar_a_ação_através_do_Salvar_telefone() throws Throwable {
		driver.findElement(By.cssSelector("#phone_hv_editing_section > input[type=\"button\"]:nth-child(4)")).click();
		
		
	}
	
	@Then("^Verificar que a troca do telefone foi feita com sucesso$")
	public void verificar_que_a_troca_do_telefone_foi_feita_com_sucesso() throws Throwable {
		WebElement campotelefone = driver.findElement(By.id("phone_rg_display_section"));
		wait.until(ExpectedConditions.visibilityOf(campotelefone));
		
		String mensagem3 = driver.findElement(By.id("phone_rg_display_section")).getText();
	    assertEquals (mensagem3 , "Telefone: 21 21222121");
	    
	    quit = true;
	    
	}

	
}