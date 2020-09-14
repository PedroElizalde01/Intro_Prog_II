public class Main {
  public static void main(String[] args) {
    LinfocitoB linfoB = new LinfocitoB();
    System.out.println(linfoB.status()); // TRUE / FALSE

    LinfocitoCD8 linfoCD8 = new LinfocitoCD8();
    System.out.println(linfoCD8.status()); // TRUE / FALSE

    Antigeno unAntigeno = new Antigeno("Proteico");
    linfoCD8.destroy(unAntigeno); // ELIMINA?

    LinfocitoCD4 linfoCD4 = new LinfocitoCD4();
    System.out.println(linfoCD4.status()); // TRUE / FALSE
    List<Antigeno> antigenos = new ArrayList<>();
    List<AntigenoProteico> antigenosProteicos = linfoCD4.detectAntigenoProteicos(antigenos);

  }
}
