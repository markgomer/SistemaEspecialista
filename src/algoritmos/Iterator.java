package algoritmos;

import java.util.Scanner;

import model.*;

public class Iterator {
  private Grafo grafo;
  private Vertice verticeAtual;
  Scanner scanner = new Scanner(System.in);

  public Iterator(Grafo grafo) {
    this.grafo = grafo;
    verticeAtual = grafo.getVertice(0);
  }

  public void promptAnswer() {
    String dadosVertice[] = verticeAtual.rotuloToString().split(":"); //"Pergunta:Esq:Dir"
    System.out.println(dadosVertice[0]);
    
    if(hasNext()) {
      System.out.println("[1]" + dadosVertice[1]);
      System.out.println("[2]" + dadosVertice[2]);
      
      int opcao;
      do {
        opcao = scanner.nextInt();
      } while(opcao != 1 && opcao != 2);
      if(opcao == 1) {
        goToLeft();
      } else {
        goToRight();
      }
      promptAnswer();
    }

  }


  public boolean hasNext() {
    boolean resp = true;
    String dadosVertice[] = verticeAtual.rotuloToString().split(":"); //"Pergunta:Esq:Dir"
    if(dadosVertice.length == 1) {
      resp = false;
    }
    return resp;
  }


  public void goToLeft() {
    this.verticeAtual = this.verticeAtual.getAdjacente(0); 
  }
  
  public void goToRight() {
    this.verticeAtual = this.verticeAtual.getAdjacente(1); 
  }


}
