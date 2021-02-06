import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FormLife {
	
	@Test
	public void testform() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://forms.liferay.com/web/forms/shared/-/form/122548");
		System.out.println(driver.getTitle());
		//Cenário Automatizado 1 - Alterar o idioma do formulário de Inglês para Portugês.
		WebElement ButtonIdd =
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/form/div[1]/div/div/div/button/span[2]"));
			ButtonIdd.click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul/li/a/span[2]")).click();
		Thread.sleep(1000);
		//Cenário Automatizado 2 - Cadastrar um usuário no Formulário com sucesso.
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/div/label")).getText();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/div/input")).sendKeys("Nathalia Martins");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[3]/div/div/div/div[1]/div/div/div[2]/div/div/label")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[3]/div/div/div/div[1]/div/div/div[2]/div/div/textarea")).sendKeys("Porque eu amo automatizar");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[3]/div/div/div/div[1]/div/div/div[1]/div[2]/div/label")).getText();
		Thread.sleep(1000);
		WebElement ButtonId =
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[3]/div/div/div/div[1]/div/div/div[1]/div[2]/div/div/div[1]/div/button"));
		ButtonId.click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[3]/div/div/div/div[1]/div/div/div[1]/div[2]/div/div/div[2]/div/div[3]/div[1]/div[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/form/div[3]/div/div/div/div[2]/button")).click();
		Thread.sleep(1000);
	
	}
	

}



