package onjava_2.enums.complex;

public class Hero {
  public static void main(String[] args) {
    for (StartSuits startSuits : StartSuits.values()) {
      System.out.println(startSuits.pick());
    }
  }
}
