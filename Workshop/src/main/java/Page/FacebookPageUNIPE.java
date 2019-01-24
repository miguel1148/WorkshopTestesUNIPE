package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookPageUNIPE {
	
	private static WebDriver driver;
	private WebDriverWait wait;
	
	static By confirmEmail = By.xpath("//*[@id=\"u_0_r\"]");
	
	//
	
	

	public FacebookPageUNIPE(WebDriver driver, WebDriverWait wait) {
		
		this.driver = driver;
		this.wait = wait;
	}
	
	public void preencherSenha() {
		WebElement senha = driver.findElement(By.id("u_0_z"));
		senha.sendKeys("123dsa");
	}
public void preencherXpath() {
		
		WebElement nome = driver.findElement(By.xpath("//*[@id=\"u_0_j\"]"));
		nome.sendKeys("Miguel");
		
		WebElement sobreNome = driver.findElement(By.xpath("//*[@id=\"u_0_l\"]"));
		sobreNome.sendKeys("Ramalho");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"u_0_o\"]"));
		email.sendKeys("coolbrain8@gmail.com");
		
		//Espera ate que a caixa de confirmação apareça p/ confirmar o email
		wait.until(ExpectedConditions.visibilityOfElementLocated(confirmEmail));
		
		WebElement regEmail = driver.findElement(By.xpath("//*[@id=\"u_0_r\"]"));
		regEmail.sendKeys("coolbrain8@gmail.com");
		
		
	}
	
	/* PREENCHENDO COMBOBOX DO FACEBOOK 
	 * 
	 */
	
	public void preencherComboBox(String day) {
		/**
		 * Neste caso temos apenas duas opções para buscar os valores da combo box
		 * Que são selectByValue("3")  ou selectByVisibleText("3")
		 */
		//seleciona a combo box refente ao dia do aniverssario pelo "id" 
		Select dia = new Select(driver.findElement(By.id("day")));
		dia.selectByValue(day);
		//Ex: de busca pelo texto visivel, aquilo que pode ser visualizado pelo usuario
//		dia.selectByVisibleText("3");
		
		
		Select mes = new Select(driver.findElement(By.id("month")));
//		mes.selectByValue("2");
		//selecionado pelo texto visivel da comboBox
		mes.selectByVisibleText("Fev");

		
		Select ano = new Select(driver.findElement(By.id("year")));
		ano.selectByValue("1994");


	}
}