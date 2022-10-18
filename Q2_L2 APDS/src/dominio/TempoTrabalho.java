package dominio;

import java.time.LocalDateTime;
import java.time.Period;

public class TempoTrabalho {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void tempotrabalho() {

		LocalDateTime inicialDate = LocalDateTime.of(2018, 5, 7, 0, 0);
		LocalDateTime finalDate = LocalDateTime.of(2028, 12, 5, 0, 0);

		Period periodo = Period.between(inicialDate.toLocalDate(), finalDate.toLocalDate());
		int years = Math.abs(periodo.getYears());
		int months = Math.abs(periodo.getMonths());
		int days = Math.abs(periodo.getDays());
		System.out.println("Primeiro ao Segundo emprego: ");
		System.out.println("Data de admissão: " + inicialDate);
		System.out.println("Data de rescisão: " + finalDate);
		System.out.println("tempo de trabalho: " + years + " anos " + months + " meses e " + days + " dias ");
	}
	
	public void tempotrabalho1() {
		
		LocalDateTime inicialDate2 = LocalDateTime.of(2015, 4, 8, 0, 0);
		LocalDateTime finalDate2 = LocalDateTime.of(2025, 12, 11, 0, 0);

		Period periodo2 = Period.between(inicialDate2.toLocalDate(), finalDate2.toLocalDate());
		int years2 = Math.abs(periodo2.getYears());
		int months2 = Math.abs(periodo2.getMonths());
		int days2 = Math.abs(periodo2.getDays());

		System.out.println("Primeiro emprego: ");
		System.out.println("Data de admissão: " + inicialDate2);
		System.out.println("Data de rescisão: " + finalDate2);
		System.out.println("Tempo de Trabalho: " + years2 + " anos " + months2 + " meses e " + days2 + " dias ");
		
	}
	
	public void tempotrabalho2() {
		
		LocalDateTime inicialDate3 = LocalDateTime.of(2008, 8, 4, 0, 0);
		LocalDateTime finalDate3 = LocalDateTime.of(2015, 9, 28, 0, 0);

		Period periodo3 = Period.between(inicialDate3.toLocalDate(), finalDate3.toLocalDate());
		int years3 = Math.abs(periodo3.getYears());
		int months3 = Math.abs(periodo3.getMonths());
		int days3 = Math.abs(periodo3.getDays());

		System.out.println("Primeiro ao terceiro emprego: ");
		System.out.println("Data de admissão: " + inicialDate3);
		System.out.println("Data de rescisão: " + finalDate3);
		System.out.println("Periodo de Trabalho: " + years3 + " anos " + months3 + " meses e " + days3 + " dias ");
		
		
	}
	
	public void tempotrabalho3() {
		
		LocalDateTime inicialDate4 = LocalDateTime.of(2001, 6, 12, 0, 0);
		LocalDateTime finalDate4 = LocalDateTime.of(2024, 8, 23, 0, 0);

		Period periodo4 = Period.between(inicialDate4.toLocalDate(), finalDate4.toLocalDate());
		int years4 = Math.abs(periodo4.getYears());
		int months4 = Math.abs(periodo4.getMonths());
		int days4 = Math.abs(periodo4.getDays());

		System.out.println("Primeiro emprego: ");
		System.out.println("Data de admissão: " + inicialDate4);
		System.out.println("Data de rescisão: " + finalDate4);
		System.out.println("Periodo de Trabalho: " +years4 + " anos " + months4 + " meses e " + days4 + " dias " );
		
	}
	
	public void tempotrabalho4() {
		
		LocalDateTime inicialDate5 = LocalDateTime.of(1997, 1, 1, 0, 0);
		LocalDateTime finalDate5 = LocalDateTime.of(2017, 8, 25, 0, 0);

		Period periodo5 = Period.between(inicialDate5.toLocalDate(), finalDate5.toLocalDate());
		int years5 = Math.abs(periodo5.getYears());
		int months5 = Math.abs(periodo5.getMonths());
		int days5 = Math.abs(periodo5.getDays());

		System.out.println("Primeiro ao segundo emprego: ");
		System.out.println("Data de admissão: " + inicialDate5);
		System.out.println("Data de rescisão: " + finalDate5);
		System.out.println("Periodo de Trabalho: " + years5 + " anos " + months5 + " meses e " + days5 + " dias ");
		
	}
	public void tempotrabalho5() {
		
		LocalDateTime inicialDate5 = LocalDateTime.of(2003, 7, 12, 0, 0);
		LocalDateTime finalDate5 = LocalDateTime.of(2012, 6, 24, 0, 0);

		Period periodo5 = Period.between(inicialDate5.toLocalDate(), finalDate5.toLocalDate());
		int years5 = Math.abs(periodo5.getYears());
		int months5 = Math.abs(periodo5.getMonths());
		int days5 = Math.abs(periodo5.getDays());

		System.out.println("Primeiro ao quarto emprego: ");
		System.out.println("Data de admissão: " + inicialDate5);
		System.out.println("Data de rescisão: " + finalDate5);
		System.out.println("Periodo de Trabalho: " + years5 + " anos " + months5 + " meses e " + days5 + " dias ");

	}
}