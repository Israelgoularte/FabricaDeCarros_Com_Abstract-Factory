import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

import fabricas.CorsaBasico;
import fabricas.CorsaCompleto;
import fabricas.GolBasico;
import fabricas.GolCompleto;
import objetos.Carro;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Carro> carros = new LinkedList<>();
        acessaGaragem(carros);
    }

    public static void acessaGaragem(LinkedList<Carro> carros) {
        Boolean acesso = true;
        int count = 0;
        while (acesso) {
            if (count == 0){
                System.out.println("\n*******************************\n"
                                    + "*Seja bem vindo a sua Garagem!*\n"
                                    + "*******************************\n");
                count = 1;
            }
            System.out.println("\n[1] Listar Veiculos"
                    + "     [2] Escolher veiculo\n"
                    + "[3] Ir a Concessionaria"
                    + " [4] Sair\n");

            switch (scan.nextLine()) {
                case "1":
                case "Listar Veiculos":
                case "listar veiculos":
                case "Listar veiculos":
                case "listar Veiculos":
                    if(carros.size()==0){
                        System.out.println("Você não possui nenhum veiculo, adquira um indo a concessionaria!");
                    }else
                        for (int i = 0; i < carros.size(); i++) {
                            System.out.print("   ( " + (i + 1) + " ) ");
                            carros.get(i).dadosVeiculo();
                        }
                    break;
                case "2":
                case "Escolher Veiculo":
                case "escolher veiculo":
                case "Escolher veiculo":
                case "escolher Veiculo":
                    System.out.print("Qual o numero do veiculo desejado: ");
                    try {
                        acessoVeiculo(carros.get((Integer.valueOf(scan.nextLine()))-1));
                    } catch (InputMismatchException e) {
                        erroAcessoVeiculo(carros);
                    } catch (IndexOutOfBoundsException e) {
                        erroAcessoVeiculo(carros);
                    }catch(NumberFormatException e)
                    {
                        erroAcessoVeiculo(carros);
                    }
                    break;
                case "3":
                case "Concessionaria":
                case "concessionaria":
                    acessarConcessionaria(carros);
                    break;
                case "4":
                case "Sair":
                case "sair":
                    acesso=false;
                    return;
                default:
                    System.out.println("Não consegui te entender, digite uma das opções: ");
                    break;
            }
        }
    }

    private static void erroAcessoVeiculo(LinkedList<Carro> carros) {
        if(carros.size()==0){
            System.out.println("Você não possui veiculos va ate uma concessionaria e adquira um! ");
        }
        else {
            System.out.println("Veiculo não encontrado, os veiculos disponiveis são: ");
            
            for (int i = 0; i < carros.size(); i++) {
                System.out.print("   ( " + (i + 1) + " ) ");
                carros.get(i).dadosVeiculo();
            }
        }
    }

    public static void acessoVeiculo(Carro carro) {
        Boolean acesso = true;
        Boolean estaForaDoCarro = true;
        Boolean estaEmMovimento = false;

        while(acesso){
            if(estaForaDoCarro){
                System.out.print("Você entrou no carro: ");
                carro.dadosVeiculo();
                estaForaDoCarro = false;
            }
            
            System.out.println("\n"
                            + "[1] Ligar "
                            + "[2] Andar "
                            + "[3] Parar  "
                            + "[4] Desligar "
                            + "[5] Sair\n");
            try{
                switch(scan.nextLine()){
                    case "1":
                    case "Ligar":
                    case "ligar":
                        carro.ligarCarro();
                        break;
                    case "2":
                    case "andar":
                    case "Andar":
                        if(estaEmMovimento){
                            System.out.println("Veiculo já se encontra em movimento");
                            break;
                        } else{
                            carro.andar();
                            estaEmMovimento = true;
                            break;
                        }
                    case "3":
                    case "Parar":
                    case "parar":
                        if(estaEmMovimento){
                            carro.parar();
                            estaEmMovimento = false;
                        }else System.out.println("Veiculo já se encontra parado");
                        break;
                    case "4":
                    case "Desligar":
                    case "desligar":
                        carro.desligarCarro();
                        break;
                    case "5":
                    case "Sair":
                    case "sair":
                        acesso = false;
                        estaForaDoCarro = true;
                        estaEmMovimento = false;
                        carro.desligarCarro();
                        System.out.print("Você saiu do veiculo: ");
                        carro.dadosVeiculo();
                        break;
                    default: 
                        System.out.println("Não entendi, escolha uma opção a seguir: ");
                        break;
                }
            }catch(InputMismatchException e){
                System.out.println("Não entendi, escolha uma opção a seguir: ");
            }
        }
    }

    public static void acessarConcessionaria(LinkedList<Carro> carros) {
        Boolean acesso = true;
        int count = 0;
        while (acesso) {
            if (count == 0)
                System.out.println("\n****************************************\n"
                        + "*Seja bem vindo a sua Concessionaria *\n"
                        + "**************************************");

            count = 1;
            System.out.print("\n"
                    + "Temos os seguintes veiculos disponiveis\n"
                    + "GM\n"
                    + "  [1] Corsa Completo\n"
                    + "  [2] Corsa Basico\n"
                    + "Volkswagen\n"
                    + "  [3] Gol Completo\n"
                    + "  [4] Gol Basico\n"
                    + "[5] Voltar a Garagem\n");
            String opcao = scan.nextLine();
            switch (opcao) {
                case "1":
                case "Corsa Completo":
                case "corsa completo":
                    CorsaCompleto fabricaGMCorsaCompleto = new CorsaCompleto();
                    carros.add(fabricaGMCorsaCompleto.fabricaVeiculo());
                    System.out.println("Parabens pela aquisição!!!!!");
                    return;
                case "2":
                case "Corsa Basico":
                case "corsa basico":
                    CorsaBasico fabricaGMCorsaBasico = new CorsaBasico();
                    carros.add(fabricaGMCorsaBasico.fabricaVeiculo());
                    System.out.println("Parabens pela aquisição!!!!!");
                    return;
                case "3":
                case "Gol Completo":
                case "gol completo":
                    GolCompleto fabricaGolCompleto = new GolCompleto();
                    carros.add(fabricaGolCompleto.fabricaVeiculo());
                    System.out.println("Parabens pela aquisição!!!!!");
                    return;
                case "4":
                case "Gol Basico":
                case "gol basico":
                    GolBasico fabrGolBasico = new GolBasico();
                    carros.add(fabrGolBasico.fabricaVeiculo());
                    System.out.println("Parabens pela aquisição!!!!!");
                    return;
                case "5":
                case "voltar":
                case "Voltar":
                    System.out.println("Voltando a Garagem");
                    return;
                default:
                    System.out.println("Esse veiculo eu não tenho escolha uma opção valida");
                    break;
            }
        }
    }
}
