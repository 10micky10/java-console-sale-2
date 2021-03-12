package tools;

public class CleanScreen{

  private CleanScreen() {
  }

  public static void clean() {
    try {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch (Exception error) {
      System.out.println("Error");
      System.out.println(error);
    }
  }
}
