package faseTres;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TerceitaEtapa {

	public boolean verificandoQuestaoCriada(WebDriver nav) {
		
		boolean questionFound = false;

		// --- ACESSANDO SITE
		nav.get("https://opentdb.com/");
		System.out.println("------------------------------------");
		System.out.println("Realizando Terceira Parte do Desafio!");

		// --- CLICANDO NO BOTÃO 'BROWSE'
		WebElement botaoInicial = nav.findElement(By.xpath("//*[text()=' BROWSE']"));
		botaoInicial.click();

		// --- DIGINTANDO A KEY
		WebElement buscaUsuaria = nav.findElement(By.id("query"));
		buscaUsuaria.sendKeys("What does the computer software acronym JVM stand for?");
		
		// --- BUSCANDO USUÁRIA
		WebElement botaoCampoBusca = nav.findElement(By.xpath("//*[text()=' Search']"));		
		botaoCampoBusca.click();
		
		// --- VERIFICANDO SE EXISTE ALGUM RESULTADO
		
		try {
			int column = nav.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr")).size();
			// --- VERIFICANDO SE EXISTE PELO MENOS 1 QUESTÃO NO CAMPO DE BUSCA
			if (column > 0) {
				// --- VERIFICANDO SE EXISTE ALGUMA PERGUNTA CREATED BY KAREN E CLICANDO
				WebElement createBy =nav.findElement(By.linkText("Karen"));
				createBy.click();
				// --- VERIFICANDO SE O PERFIL QUE CRIOU A PERGUNTA É O MESMO DA KAREN
				if(nav.getCurrentUrl().equalsIgnoreCase("https://opentdb.com/user_profile.php?user=5725")) {
					questionFound = true;
					System.out.println("Pergunta criada por Karen");
				}
				else {
					System.out.println(nav.getCurrentUrl());
				}
				
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return questionFound;
	}

}
