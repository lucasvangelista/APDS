package visao;

import java.util.Scanner;

import dominio.Empresa;

public class Principal {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			Empresa Etronix = new Empresa();
			Empresa Pheniz = new Empresa();
			Empresa Floater = new Empresa();
			Empresa Goat = new Empresa();
			Empresa Collac = new Empresa();
			Empresa Gulagas = new Empresa();
			
			System.out.println("Nome da primeira pessoa");
			Etronix.setNome(ler.next());
			System.out.println("nome:" + Etronix.getNome());
			System.out.println(Etronix.getNome() + " Trabalhou em 2 empresas");
			Etronix.tempotrabalho();
			
			System.out.println("Nome da segunda pessoa");
			Pheniz.setNome(ler.next());
			System.out.println("nome:" + Pheniz.getNome());
			System.out.println(Pheniz.getNome() + " Trabalhou em 1 empresa");
			Pheniz.tempotrabalho1();
			
			System.out.println("Nome da terceira pessoa:");
			Floater.setNome(ler.next());
			System.out.println("nome:" + Floater.getNome());
			System.out.println(Floater.getNome() + " trabalhou em 3 empresas");
			Floater.tempotrabalho2();
			
			System.out.println("Nome da quarta pessoa:");
			Goat.setNome(ler.next());
			System.out.println("nome:" + Goat.getNome());
			System.out.println(Goat.getNome() + " trabalhou em 1 empresas");
			Goat.tempotrabalho3();
			
			System.out.println("Nome da quinta pessoa");
			Collac.setNome(ler.next());
			System.out.println("nome:" + Collac.getNome());
			System.out.println(Collac.getNome() + " trabalhou em 2 empresas:");
			Collac.tempotrabalho4();
			
			System.out.println("Nome da sexta pessoa");
			Gulagas.setNome(ler.next());
			System.out.println("nome:" + Gulagas.getNome());
			System.out.println(Gulagas.getNome() + " trabalhou em 4 empresas:");
			Gulagas.tempotrabalho5();
		}
	}

}