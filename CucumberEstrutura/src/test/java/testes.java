import static org.junit.Assert.*;
import org.junit.runners.MethodSorters;
import faseUm.*;
import faseDois.*;
import faseTres.*;
import Resources.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class testes {
	//-- IMPORTANDO E ABRINDO O WEB DRIVER DO CHROME
	WebDriver driver = AtivarDriverChrome.Open();
	
	@Test
	//------- PRIMEIRA ETAPA DO DESAFIO --------- //
	public void PrimeiroTeste() {
		// --- Iniciando o Objeto
		PrimeiraEtapa primeiraFase = new PrimeiraEtapa();
		// --- REALIZANDO O TESTE E RETORNANDO TRUE CASO OBTENHA O RESULTADO ESPERADO DO TESTE
		assertEquals(true, primeiraFase.acessandoSiteTeste(driver));
	}
	@Test
	//------- SEGUNDA ETAPA DO DESAFIO --------- //
	public void SegundoTeste() {
		// --- Iniciando o Objeto
		SegundaEtapa segundaFase = new SegundaEtapa();
		// --- REALIZANDO O TESTE E RETORNANDO TRUE CASO OBTENHA O RESULTADO ESPERADO DO TESTE
		assertEquals(true, segundaFase.verificandoQtdPaginacao(driver));
	}
	@Test
	//------- TERCEIRA ETAPA DO DESAFIO --------- //
	public void TerceiroTeste() {
		// --- Iniciando o Objeto
		TerceitaEtapa terceitoTeste = new TerceitaEtapa();
		// --- REALIZANDO O TESTE E RETORNANDO TRUE CASO OBTENHA O RESULTADO ESPERADO DO TESTE		
		assertEquals(true, terceitoTeste.verificandoQuestaoCriada(driver));
	}
}
