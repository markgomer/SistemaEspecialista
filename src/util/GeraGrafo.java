package util;

import model.Grafo;

public class GeraGrafo 
{
  /**
   * Cria um grafo a partir de um arquivo no formato pajek
   * @param nomeArq caminho e nome do arquivo 
   * @return grafo criado
   */
  public static Grafo fromPajek(String nomeArq) {
    Grafo grafo = new Grafo();
    Arq.openRead(nomeArq);
    // 1ª linha: qtd vertices
    String line = Arq.readLine().replaceAll("[*Vertices ]", "");
    int qtdVertices = Integer.parseInt(line);
    // criar os vértices
    for(int i = 0; i<qtdVertices; i++) {
      Arq.readInt(); Arq.readChar();
      String label = Arq.readLine().replaceAll("[\"]", "");        
      grafo.criaVertice(label);
      System.out.print("Criando vértices: " + i + "/" + qtdVertices + "             \r");
    }
    // 2º passo criar arestas
    Arq.readLine();
    while(Arq.hasNext()) {
      int indexOrigem = Arq.readInt() - 1;
      int indexDestino = Arq.readInt() - 1;
      int peso = Arq.readInt();
      grafo.cria_adjacencia(indexOrigem, indexDestino);
      grafo.seta_peso(indexOrigem, indexDestino, peso);
      System.out.print("Criando arestas: " + indexOrigem + "->" + indexDestino + "                     \r");
    }
    System.out.println("Grafo carregado!                      ");
    
    return grafo;  
  }

}
