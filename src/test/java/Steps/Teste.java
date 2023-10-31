package Steps;

import Elementos.ElementosTela;
import Metodos.Metodos;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class Teste {
	
	Metodos m = new Metodos();
	ElementosTela e = new ElementosTela();
	
	
	
	
	@Dado("^que estou no site \"([^\"]*)\"$")
	public void que_estou_no_site(String url) throws Throwable {
		System.out.println("=========================");
		System.out.println("Aguarde Abrindo site !!!");
		System.out.println("=========================");
		m.abrirNavegador(url);
		Thread.sleep(5000);


		}

	@Quando("^preencho o formulário do cliente com um nome válido, um e-mail válido, uma senha válida e a confirmação da senha$")
	public void preencho_o_formulário_do_cliente_com_um_nome_válido_um_e_mail_válido_uma_senha_válida_e_a_confirmação_da_senha() throws Throwable {
		m.clicar(e.getMenuUser());
		System.out.println("Menu user OK.");
		Thread.sleep(1000);
		
		m.clicar(e.getCreatNewAccount());
		System.out.println("CreatNewAccount OK.");
		Thread.sleep(1000);
		
		m.preencher(e.getUserName(),"TESTE");
		System.out.println("User Name OK.");
		Thread.sleep(500);
		
		m.preencher(e.getEmail(), "joew@hotmail.com");
		System.out.println("Email OK.");
		Thread.sleep(500);
		
		m.preencher(e.getPassword(), "Ad123456789");
		System.out.println("Password OK.");
		Thread.sleep(500);
	
		m.preencher(e.getConfirmPassword(), "Ad123456789");
		System.out.println("Confirm Password OK.");
		Thread.sleep(500);
		
		m.preencher(e.getFirtName(), "TESTE");
		System.out.println("Firt Name OK.");
		Thread.sleep(500);

		m.preencher(e.getLastName(), "TESTE");
		System.out.println("Last Name OK.");
		Thread.sleep(500);
		
		m.preencher(e.getPhoneNumber(), "12345678910");
		System.out.println("PhoneNumber OK.");
		Thread.sleep(500);
		
		m.clicar(e.getCountry());
		System.out.println("Country OK.");
		Thread.sleep(500);
		
		m.clicar(e.getCountryBr());
		System.out.println("CountryBr OK.");
		Thread.sleep(500);
		
		m.preencher(e.getCity(), "TESTE");
		System.out.println("City OK.");
		Thread.sleep(500);
		
		m.preencher(e.getAddress(), "TESTE");
		System.out.println("Address OK.");
		Thread.sleep(500);
		
		m.preencher(e.getStateProvince(), "TESTE");
		System.out.println("StateProvince OK.");
		Thread.sleep(500);
		
		m.preencher(e.getPostalCode(), "555555555");
		System.out.println("PostalCode OK.");
		Thread.sleep(500);
		
		m.clicar(e.getConditions());
		System.out.println("Conditions OK.");
		Thread.sleep(500);
		
		
	}

	@Quando("^clico no botão \"([^\"]*)\"$")
	public void clico_no_botão(String arg1) throws Throwable {
		m.clicar(e.getRegister());
		System.out.println("Register OK.");
		Thread.sleep(500);
		
		
		System.out.println("======================");
		System.out.println("Aguarde finalizando...");
		System.out.println("======================");
		Thread.sleep(5000);



		
	}

	@Então("^vejo uma mensagem de sucesso indicando que meu cadastro foi realizado$")
	public void vejo_uma_mensagem_de_sucesso_indicando_que_meu_cadastro_foi_realizado() throws Throwable {
	
		
		m.fecharNavegador();
		System.out.println("===================================");
		System.out.println("Cadastro finalizado com sucesso !!!");
		System.out.println("===================================");
		
	}



}
