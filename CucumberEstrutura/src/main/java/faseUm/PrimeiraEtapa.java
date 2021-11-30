package faseUm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraEtapa {

	public boolean acessandoSiteTeste(WebDriver nav) {
		boolean exist;
		// --- ACESSANDO SITE
		nav.get("https://opentdb.com/");
		System.out.println("Realizando Primeira Parte do Desafio!");
		
		// --- CLICANDO NO BOTÃO 'BROWSE'
		WebElement botaoInicial = nav.findElement(By.xpath("//*[text()=' BROWSE']"));		
		botaoInicial.click();
		
		// ---  DIGINTANDO A KEY 
		WebElement campoBusca = nav.findElement(By.id("query"));
		campoBusca.sendKeys("Science: Computers");
		
		// --- BUSCANDO A KEY
		WebElement botaoCampoBusca = nav.findElement(By.xpath("//*[text()=' Search']"));		
		botaoCampoBusca.click();
		
		// --- SE EXISTIR O ELEMENTO = TESTE REALIZADO(TRUE)
		try {
			WebElement resultado = nav.findElement(By.xpath("//*[text()='No questions found.']"));
			exist = true;
			System.out.println("------ Primeira fase realizada com sucesso ------");
		} catch (Exception e) {
			exist = false;
			System.out.println("Erro ao Realizar teste de interface!");
			System.out.println(e);
		}
		return exist;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
