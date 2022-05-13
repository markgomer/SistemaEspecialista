import model.*;
import util.*;
import algoritmos.*;

public class Main {

    public static void main(String[] args) {      
      Grafo grafo = GeraGrafo.fromPajek("src/dados/boardGame.net");
      Iterator iterator = new Iterator(grafo);
      iterator.promptAnswer();
    }

}
