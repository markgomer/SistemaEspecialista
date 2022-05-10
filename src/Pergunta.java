public class Pergunta implements Modelo {
  private String pergunta;
  private String opcao0;
  private String opcao1;

  private Pergunta prox0;
  private Pergunta prox1;


  public Pergunta(String pergunta, String opcao0, String opcao1, Pergunta prox0, Pergunta prox1) {
    this.pergunta = pergunta;
    this.opcao0 = opcao0;
    this.opcao1 = opcao1;
    this.prox0 = prox0;
    this.prox1 = prox1;
  }


  public Pergunta onOpcao0() {
    return this.prox0;
  }
  

  public Pergunta onOpcao1() {
    return this.prox1;
  }

}
