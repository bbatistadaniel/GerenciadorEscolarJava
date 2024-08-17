package net.senai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static ArrayList<Sala> salas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lastInput;



        while (true){
            try{
                System.out.printf("Deseja listar, selecionar ou criar uma sala?\n");
                Thread.sleep(100);
                lastInput = scanner.nextLine();
                if (Arrays.asList(new String[]{"list", "listar"}).contains(lastInput.toLowerCase())){
                    if (!salas.isEmpty()){
                        for (int i = 0; i < salas.size(); i++){
                            System.out.printf("%s\n", salas.get(i).getNome());
                        }
                    }else{
                        System.out.printf("Nenhuma sala encontrada\n");
                    }
                }

                if (Arrays.asList(new String[]{"criar", "create"}).contains(lastInput.toLowerCase())){
                    System.out.printf("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.printf("Digite a matéria: ");
                    String materia = scanner.nextLine();
                    System.out.printf("Digite o período (manhã, tarde e noite): ");
                    String periodo = scanner.nextLine();
                    System.out.printf("Digite o nome do professor: ");
                    String professor = scanner.nextLine();
                    salas.add(new Sala(nome, materia, periodo, professor, new ArrayList<>()));
                    System.out.printf("Sala %s criada\n", salas.getLast().getNome());
                }

                if (Arrays.asList(new String[]{"select", "selecionar"}).contains(lastInput.toLowerCase())){
                    System.out.printf("Digite o nome da sala: ");
                    String salaDesejada = scanner.nextLine();
                    Sala salaSelecionada;
                    for (int i = 0; i < salas.size(); i++){
                        if (salas.get(i).getNome().toLowerCase().equals(salaDesejada.toLowerCase())){
                            salaSelecionada = salas.get(i);
                            System.out.printf("Sala selecionada: %s\n", salaSelecionada.getNome());
                        }else{
                            System.out.printf("Sala \"%s\" não encontrada\n", salaDesejada);
                        }
                    }
                }
            }catch (Exception _){}
        }
    }
}
