import java.sql.Time;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Scanner;

public class Main_atual {
    public static void main(String[] args) {
        ArrayList<Obra> obras = new ArrayList<>();
        ArrayList<Autor> autores1 = new ArrayList<>();
        ArrayList<Produtor> produtores1 = new ArrayList<>();
        Autor autor = new Autor("");
        Produtor produtor = new Produtor("");

        Scanner scOperacao = new Scanner(System.in);
        int operacao = 0;
        scOperacao.close();
        while(true){
            System.out.println("Digite a operacao desejada (1 para adicionar musica, 2 para excluir musica e 3 para consultar todas as musicas ou 4 para sair): ");
            operacao = scOperacao.nextInt();
            if (operacao == 1) {
                Scanner scTitulo = new Scanner(System.in);
                System.out.println("Digite o titulo da obra: ");
                String titulo = scTitulo.nextLine();
                scTitulo.close();

                Scanner scLetra = new Scanner(System.in);
                System.out.println("Digite a letra da obra: ");
                String letra = scLetra.nextLine();
                scLetra.close();

                Scanner scCategoria = new Scanner(System.in);
                System.out.println("Digite a categoria da obra: ");
                String categoria = scCategoria.nextLine();
                scCategoria.close();

                Scanner scLancamento = new Scanner(System.in);
                System.out.println("Digite a data de lancamento da obra (ano-mes-dia): ");
                String lancamentos = scLancamento.nextLine();
                Date lancamento = java.sql.Date.valueOf(lancamentos);
                scLancamento.close();

                Scanner scDuracao = new Scanner(System.in);
                System.out.println("Digite o tempo de duracao (hora:minuto:segundo): ");
                String duracaoString = scDuracao.nextLine();
                Time duracao = java.sql.Time.valueOf(duracaoString);
                scDuracao.close();

                Scanner numAutores = new Scanner(System.in);
                System.out.println("Digite o numero de autores: ");
                int numA = numAutores.nextInt();
                numAutores.close();

                Scanner numProdutores = new Scanner(System.in);
                System.out.println("Digite o numero de Produtores: ");
                int numP = numProdutores.nextInt();
                numProdutores.close();

                Scanner scCensura = new Scanner(System.in);
                System.out.println("A musica tem censura? (sim ou nao) ");
                String censura = scCensura.nextLine();
                scCensura.close();

                if(censura == "sim") {

                }

                if(censura == "nao") {

                }

                for(int i=0; i< numA; i++ ){
                    Scanner scNomeA = new Scanner(System.in);
                    System.out.println("Digite o nome do autor: ");
                    String nomeA = scNomeA.nextLine();
                    autor.setNome(nomeA);
                    autores1.add(new Autor(nomeA));
                    scNomeA.close();
                }

                for(int i = 0; i < numP; i++){
                    Scanner scProdutor = new Scanner(System.in);
                    System.out.println("Digite o nome do produtor: ");
                    String nomeP = scProdutor.nextLine();
                    produtor.setNome(nomeP);
                    produtores1.add(produtor);
                    scProdutor.close();
                }

                Obra top1 = new Obra(titulo, letra, lancamento, autores1, produtores1, categoria, duracao, true);
                obras.add(top1);
                System.out.println("\n" + top1.toString());

        }

        if(operacao == 2) {
            int index = 0;
            Scanner scDel = new Scanner(System.in);
            System.out.println("Digite o titulo da obra que quer deletar: ");
            String tituloDel = scDel.nextLine();
            for(Obra obra : obras){
                if(obra.getTitulo().equals(tituloDel)){
                    System.out.println(obra.toString());
                    index = obras.indexOf(obra);
                }
            scDel.close();
            }
            obras.remove(index);
        }

        if(operacao == 3) {
            for (int i = 0; i < obras.size(); i++) {
                System.out.println(i+1 + ":\n" + obras.get(i).toString() + "\n");
              }
        }
        if(operacao == 4) {
            break;
        }


            autores1.clear();
            produtores1.clear();

        }
    }
}