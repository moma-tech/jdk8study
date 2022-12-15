package onjava_2.enums;

public class EnumAsObject {

  public static void main(String[] args) {
    Armory[] weapons = Armory.values();
    for (Armory weapons1 : Armory.values()) {
      System.out.println("Ordinal: " + weapons1.ordinal());
      System.out.println("Name: " + weapons1.name());
      System.out.println("Equals: " + weapons1.equals(Armory.SWORD));
      System.out.println("==: " + (weapons1 == Armory.SWORD));
      System.out.println("Class: " + weapons1.getDeclaringClass());
      System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
  }
}
