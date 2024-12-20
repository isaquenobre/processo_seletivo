/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle.candidatos.candidatura;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Windows 10 PRO
 */
public class ProcessoSeletivo {
    public static void main(String[] args) {
        /*analisarCandidato(1900.0);pppp
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);*/
        //linhas acima fora feitas na aula 48
        
        //selecaoCandidatos(); lnha feita na aula 49
        imprimirSelecionados();
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe","Marcio","Julia","Paulo","Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
       for (int indice=0;indice<candidatos.length;indice++){
           System.out.println("O candidato de nº " + (indice+1)+ " é " + candidatos[indice]);
       }
        System.out.println("Forma abreviada de iteração for each");
        for (String candidato: candidatos){
            System.out.println("O candidadto selecionado foi " + candidato);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto",
            "Monica", "Fabricio", "MIrela", "Daniela", "Jorge"};
                int candidatosSelecionados = 0;
                int candidatosAtual = 0;
                double salarioBase = 2000.0;
                while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
                    String candidato = candidatos[candidatosAtual];
                    double salarioPretendido = valorPretendido();
                    System.out.println("O candidato " + candidato + " Solicitou esse valor de salario " + salarioPretendido);
                    if(salarioBase >= salarioPretendido){
                        System.out.println("O candidato "+candidato+" foi selecionado para vaga");
                        candidatosSelecionados++;
                    }
                    candidatosAtual++;
        }
                
                }
    static double valorPretendido(){
                    return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
        else{
            System.out.println("Aguardar o resultado dos demais candidatos");
        }
    }
}
