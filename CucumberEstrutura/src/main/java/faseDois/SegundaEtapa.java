package faseDois;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SegundaEtapa {
	
	public boolean verificandoQtdPaginacao(WebDriver nav) {
		boolean correctNumPagination = false;
		// --- ACESSANDO SITE 
		nav.get("https://opentdb.com/");
		System.out.println("------------------------------------");
		System.out.println("Realizando Segunda Parte do Desafio!");
		
		// --- CLICANDO NO BOT�O 'BROWSE'
		WebElement botaoInicial = nav.findElement(By.xpath("//*[text()=' BROWSE']"));		
		botaoInicial.click();
		
		// ---  DIGINTANDO A KEY 
		WebElement campoBusca = nav.findElement(By.id("query"));
		campoBusca.sendKeys("Science: Computers");
		
		// --- SELECIONANDO A CATEGORIA
		Select categoria = new Select(nav.findElement(By.id("type")));
		categoria.selectByVisibleText("Category");
		
		// --- BUSCANDO A KEY
		WebElement botaoCampoBusca = nav.findElement(By.xpath("//*[text()=' Search']"));		
		botaoCampoBusca.click();
		
		try {
			// --- PEGANDO O NUMERO DE ITENS NA TABELA
			int columnCount= nav.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr")).size();
			
			// --- VERIFICANDO SE EXISTE 25 ITENS NA TABLE, SE SIM A CONDI��O MUDAR�
			if(columnCount == 25) {
				correctNumPagination = true;
				System.out.println("Numero correto de itens, pagina��o correta!");
			}else {
				System.out.println("Pagina��o incorreta!");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		// --- RETORNANDO A VARI�VEL
		return correctNumPagination;
	}


}
