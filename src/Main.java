import model.*;
import util.*;
import algoritmos.*;

public class Main {

    public static void main(String[] args) {      
      Grafo grafo = GeraGrafo.fromPajek("../dados/boardGame.net");
      Iterator iterator = new Iterator(grafo);
      iterator.promptAnswer();
    }

}
