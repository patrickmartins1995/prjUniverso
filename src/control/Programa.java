package control;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import model.Asteroide;
import model.Cometa;
import model.Constelacao;
import model.CorpoCeleste;
import model.Estrela;
import model.Galaxia;
import model.Meteorito;
import model.Meteoro;
import model.Nebulosa;
import model.Planeta;
import model.Satelite;
import model.Sistema;
import model.Universo;

public class Programa {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		//ENTRADA DE DADOS UNIVERSO
		System.out.println("Digite o Nome do Universo: ");
		String nomeUniverso = leia.nextLine();

		Calendar cal = Calendar.getInstance();
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		int mes = cal.get(Calendar.MONTH ) + 1;
		int ano = cal.get(Calendar.YEAR);

		String dataCriacao = dia + "/" + mes + "/" + ano;

		Universo u3 = new Universo(nomeUniverso,dataCriacao);

		int num = 0,num1 = 0,num2 = 0;
		//Quantidade Nebulosas
		System.out.print("Possui Nebulosas? <S/N>? ");
		char resposta = Character.toUpperCase(leia.next().charAt(0));

		if(resposta == 'S') {
			System.out.println("Quantidade de Nebulosas?");
			num = leia.nextInt();
		}

		//Quantidade Galáxias
		System.out.print("Possui Galáxias? <S/N>? ");
		resposta = Character.toUpperCase(leia.next().charAt(0));

		if(resposta == 'S') {
			System.out.println("Quantidade de Galáxias?");
			num1 = leia.nextInt();
		}

		//Quantidade Sistema
		System.out.print("Possui Sistema? <S/N>? ");
		resposta = Character.toUpperCase(leia.next().charAt(0));

		if (resposta == 'S') {
			System.out.println("Quantidade de Sistema?");
			num2 = leia.nextInt();
		}
		//Lixo de memória
		leia.nextLine();

		//ENTRADA DE DADOS NEBULOSA
		int contnebulosa = 1;
		for(int i = 0; i < num; i++) {
			System.out.println("Digite o nome da Nebulosa #: " + contnebulosa);
			String nomeNebulosa = leia.nextLine();
			System.out.println("Digite o tipo de Nebulosa #: " + contnebulosa);
			String tipoNebulosa = leia.nextLine();

			Nebulosa n1 = new Nebulosa(nomeNebulosa, tipoNebulosa);
			u3.addNebulosa(n1);	
			contnebulosa++;
		}

		//ENTRADA DE DADOS GALÁXIA
		int contgalaxia = 1;
		for(int i = 0; i < num1; i++) {
			System.out.println("Digite o nome da Galáxia #: " + contgalaxia);
			String nomeGalaxia = leia.nextLine();
			System.out.println("Digite a Morfologia da Galáxia #: " + contgalaxia);
			String morfologiaGalaxia = leia.nextLine();

			Galaxia g1 = new Galaxia(nomeGalaxia, morfologiaGalaxia);
			u3.addGalaxia(g1);	
			contgalaxia++;
		}

		Galaxia g2 = new Galaxia(null,null);
		//ENTRADA DE DADOS SISTEMA
		int contsistema = 1;
		for(int i = 0; i < num2; i++) {
			System.out.println("Digite o nome do Sistema #: " + contsistema);
			String nomeSistema = leia.nextLine();


			Sistema s1 = new Sistema(nomeSistema);

			g2.addSistema(s1);	
			contsistema++;
		}

		/*ENTRADA DE DADOS PLANETA,SATELITE,ESTRELA,CONST,COMETA,
					METEOROIDE,METEORO,METEORITO E ASTEROIDE*/

		resposta = 's';
		String nomeMeteoroide = null;

		Planeta pl = new Planeta(null, false);
		Constelacao cons = new Constelacao(null,null);
		Cometa comet = new Cometa(null);
		Meteorito meteorito1 = new Meteorito(null,null);
		Meteoro meteoro2 = new Meteoro(null,0);
		Asteroide aster = new Asteroide(null,0);
		

		do {
			System.out.println("Corpo Celeste");
			System.out.println("(1)Planeta e Satélite");
			System.out.println("(2) Estrela e Constelação");
			System.out.println("(3) Cometa"); 
			System.out.println("(4) Meteoroide, Meteoro e Meteorito"); 
			System.out.println("(5) Asteroide");
			int opc = leia.nextInt();
			leia.nextLine();
			
			
			switch(opc) {

			case 1 : //PLANETA
				System.out.println("Nome do Planeta: ");
				String nomePlaneta = leia.nextLine();

				System.out.println("Habitável: TRUE ou FALSE");
				boolean habitavelPlaneta = leia.nextBoolean();
				pl = new Planeta(nomePlaneta, habitavelPlaneta);

				leia.nextLine();
				System.out.print("Possui Satelite <S/N>? ");
				resposta = Character.toUpperCase(leia.next().charAt(0));

				leia.nextLine();

				if(resposta == 'S') {

					do {	//SATÉLITE
						System.out.println("Nome do Satélite: ");
						String nomeSatelite = leia.nextLine();
						System.out.println("Distância do Satélite: ");
						float distanciadoPlaneta = leia.nextFloat();

						Satelite st = new Satelite(nomeSatelite,distanciadoPlaneta);
						pl.addSatelite(st);

						System.out.print("Deseja inserir outro Satélite <S/N>? ");
						resposta = Character.toUpperCase(leia.next().charAt(0));
						leia.nextLine();
					} while((resposta == 'S'));
				}

				System.out.print("Deseja escolher outro Corpo Celeste<S/N>? ");    
				resposta = Character.toUpperCase(leia.next().charAt(0));
				leia.nextLine();
				break;

			case 2 :		
				// CONSTELAÇÃO
				int intensidadedeBrilho;
				System.out.println("Nome da Constelação: ");
				String nomeConstelacao = leia.nextLine();
				System.out.println("Significado: ");
				String descricaoConstelacao = leia.nextLine();
				do {
					//ESTRELA
					System.out.println("Luminosidade da Estrela:");
					intensidadedeBrilho = leia.nextInt();

					System.out.println("Nome da Estrela: ");
					String nomeEstrela = leia.nextLine();
					leia.nextLine();

					cons = new Constelacao(nomeConstelacao,descricaoConstelacao);
					Estrela star = new Estrela(nomeEstrela,intensidadedeBrilho);
					cons.addEstrela(star);

					System.out.print("Deseja inserir outra Estrela <S/N>? ");
					resposta = Character.toUpperCase(leia.next().charAt(0));
				} while(resposta == 'S'); 

				System.out.print("Deseja escolher outro Corpo Celeste<S/N>? ");    
				resposta = Character.toUpperCase(leia.next().charAt(0));
				leia.nextLine();
				break;

			case 3 :
				//COMETA
				System.out.println("Nome do Cometa: ");
				String nomeCometa = leia.nextLine();
				leia.nextLine();
				if(resposta == 'S') {
					comet = new Cometa(nomeCometa);
				}

				System.out.print("Deseja escolher outro Corpo Celeste<S/N>? ");    
				resposta = Character.toUpperCase(leia.next().charAt(0));
				leia.nextLine();
				break;

			case 4 ://METEOROIDE, METEORO E METEORITO
				System.out.println("Nome do Meteoroide: ");
				nomeMeteoroide = leia.nextLine();

				//METEOROIDE, METEORO E METEORITO

				System.out.println("Meteoro?<S/N>");
				resposta = Character.toUpperCase(leia.next().charAt(0));
				if(resposta == 'S') {
					System.out.println("Velocidade de Queda: ");
					int velocidadedeQueda = leia.nextInt();
					if(resposta == 'S') {
						Meteoro meteor = new Meteoro(null,velocidadedeQueda);
					}
					meteoro2 = new Meteoro(null,velocidadedeQueda);
				}
				//METEOROIDE, METEORO E METEORITO
				leia.nextLine();
				System.out.println("Meteorito?<S/N>");
				resposta = Character.toUpperCase(leia.next().charAt(0));
				if(resposta == 'S') {
					System.out.println("Data queda do Meteorito");
					leia.nextLine();
					System.out.println("Data : dd/mm/aaaa");
					String dataQueda = leia.nextLine();

					meteorito1 = new Meteorito(nomeMeteoroide,dataQueda);
				}



				System.out.print("Deseja escolher outro Corpo Celeste<S/N>? ");    
				resposta = Character.toUpperCase(leia.next().charAt(0));
				leia.nextLine();
				break;

			case 5 ://ASTEROIDE
				System.out.println("Nome do Asteroide: ");
				String nomeAsteroide = leia.nextLine();
				System.out.println("Diâmetro do Asteroide: ");
				int diametroAsteroide = leia.nextInt();
				aster = new Asteroide(nomeAsteroide,diametroAsteroide);
				System.out.print("Deseja escolher outro Corpo Celeste<S/N>? ");    
				resposta = Character.toUpperCase(leia.next().charAt(0));
				leia.nextLine();
				break;
			default:
				System.out.println("Erro");
			}

		} while (resposta == 'S');  


		/*RESULTADOS*/
		System.out.println("_____________________________________");
		System.out.println("Parabéns! ");
		System.out.println("Agora você tem o dom de Deus!");
		System.out.println("BIG BANG!");
		
		System.out.println("_____________________________________");
		System.out.println("Universo " + u3.getNomeUniverso());
		System.out.println("Data de Criação:" + u3.getDataCriacao());
		System.out.println("_____________________________________");


		ArrayList<Nebulosa> listanebulosa = u3.getNebulosas();
		int contnebulosa1 = 1;
		for(Nebulosa nebulosaTemp : listanebulosa) {
			System.out.println("_____________________________________");
			System.out.println("Nebulosa # " + contnebulosa1);
			System.out.println("Nome da Nebulosa: "  + nebulosaTemp.getNomeNebulosa());
			System.out.println("Tipo de Nebulosa: " + nebulosaTemp.getTipoNebulosa());
			System.out.println("_____________________________________");
			contnebulosa1++;
		}


		ArrayList<Galaxia> listagalaxia = u3.getGalaxias(); 	
		int contgalaxia1 = 1;
		for(Galaxia galaxiaTemp : listagalaxia) {
			System.out.println("_____________________________________");
			System.out.println("Galáxia # " + contgalaxia1);
			System.out.println("Nome da Galáxia: "  + galaxiaTemp.getNomeGalaxia());
			System.out.println("Morfologia: " + galaxiaTemp.getMorfologiaGalaxia());
			System.out.println("_____________________________________");
			contgalaxia1++;
		}

		ArrayList<Sistema> listasistema = g2.getSistemas(); 	
		int contsistema1 = 1;
		for(Sistema sistemaTemp : listasistema) {
			System.out.println("_____________________________________");
			System.out.println("Sistema # " + contsistema1);
			System.out.println("Sistema : "  + sistemaTemp.getNomeSistema());
			System.out.println("_____________________________________");
			contsistema1++;
		}

		System.out.println("_____________________________________");
		System.out.println("Corpo Celeste ");
		System.out.println("_____________________________________");

		System.out.println("_____________________________________");
		System.out.println("Planeta " + pl.getNomePlaneta());
		System.out.println("Planeta " + pl.isHabitavel());
		System.out.println("_____________________________________");

		ArrayList<Satelite> listasatelite = pl.getSatelites(); 	
		int contsatelite1 = 1;
		for(Satelite sateliteTemp : listasatelite) {
			System.out.println("_____________________________________");
			System.out.println("Satélite # " + contsatelite1);
			System.out.println("Satélite: "  + sateliteTemp.getNomeSatelite());
			System.out.println("Distância do Planeta: "  + sateliteTemp.getDistanciadoPlaneta());
			System.out.println("_____________________________________");
			contsatelite1++;
		}

		System.out.println("_____________________________________");
		System.out.println("Constelação  " + cons.getNomeConstelacao());
		System.out.println("Significado:  " + cons.getDescricaoConstelacao());
		System.out.println("_____________________________________");

	
		System.out.println("_____________________________________");
		System.out.println("Cometa  " + comet.getNomeCometa());
		System.out.println("_____________________________________");


		System.out.println("_____________________________________");
		System.out.println("Meteoroide  " + nomeMeteoroide);
		System.out.println("Velocidade (Meteoro):" + meteoro2.getVelocidadedeQueda() + "KM/H");
		System.out.println("Data Queda (Meteorito):  " + meteorito1.getDataQueda());
		System.out.println("_____________________________________");

		System.out.println("_____________________________________");
		System.out.println("Asteroide " + aster.getNomeAsteroide());
		System.out.println("Diâmetro:  " + aster.getDiametroAsteroide());
		System.out.println("_____________________________________");

		leia.close();
	}
}