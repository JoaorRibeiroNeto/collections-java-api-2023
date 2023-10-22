public class Desafio {

  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();

    // Cria o cofre
    Cofre cofre;
    if (tipoCofre.equalsIgnoreCase("digital")) {
      cofre = criarCofre(scanner);
    } else if (tipoCofre.equalsIgnoreCase("fisico")) {
      cofre = criarCofre();
    } else {
      System.out.println("Tipo de cofre inválido!");
      return;
    }

    // Verifica se o cofre está aberto
    if (cofre.verificarAbertura()) {
      // O cofre está aberto
      cofre.imprimirInformacoes();
    } else {
      // O cofre está fechado
      System.out.println("Cofre fechado!");
    }
  }

  private static Cofre criarCofre(Scanner scanner) {
    return new CofreDigital(scanner.nextInt());
  }

  private static Cofre criarCofre() {
    return new CofreFisico();
  }
}

class Cofre {

  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public boolean verificarAbertura() {
    // Solicita a senha do usuário
    System.out.println("Digite a senha do cofre digital:");
    String senhaUsuario = scanner.next();

    // Converte a senha do usuário para um inteiro
    int senhaUsuarioInt = Integer.parseInt(senhaUsuario);

    // Verifica se a senha do usuário é igual à senha do cofre
    return senhaUsuarioInt == this.senha;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  // Solicita a senha do usuário
  System.out.println("Digite a senha do cofre digital:");
  String senhaUsuario = scanner.next();

  // Converte a senha do usuário para um inteiro
  int senhaUsuarioInt = Integer.parseInt(senhaUsuario);

  // Verifica se a senha do usuário é igual à senha do cofre
  return senhaUsuarioInt == this.senha;

  // Imprime as informações do cofre
  System.out.println("Tipo: " + this.tipo);
  System.out.println("Metodo de abertura: " + this.metodoAbertura);
  System.out.println("Senha: " + this.senha);
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

  // Por padrão, um cofre físico é considerado aberto
  return true;

  // Imprime as informações do cofre
  System.out.println("Tipo: " + this.tipo);
  System.out.println("Metodo de abertura: " + this.metodoAbertura);
}