import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testautomation {

    @Test
    public void pesquisaFirefox(){
        WebDriver navegar = new FirefoxDriver();
        navegar.get("https://google.com");

        navegar.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).click();
        navegar.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("pdfroom", Keys.ENTER);
    }

    @Test
    public void pesquisaSite(){
        WebDriver pesquisa = new FirefoxDriver();
        pesquisa.get("https://pdfroom.com");

        pesquisa.findElement(By.xpath("/html/body/div[1]/nav/div[1]/div/div[1]/div[2]/div/div[2]/div/form/input")).click();
        pesquisa.findElement(By.xpath("/html/body/div[1]/nav/div[1]/div/div[1]/div[2]/div/div[2]/div/form/input")).sendKeys("Java", Keys.ENTER);

    }

    @Test
    public void queroMuito(){
        WebDriver pesquisa = new FirefoxDriver();
        pesquisa.get("https://www.kabum.com.br");

        pesquisa.findElement(By.id("input-busca"));
        pesquisa.findElement(By.id("input-busca")).sendKeys("notebook", Keys.ENTER);

    }
}
