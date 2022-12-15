package onjava_2.enums;

public class EnumWithMethod {

  public static void main(String[] args) {
    for (Armory armory : Armory.values()) {
      System.out.println(armory + ": " + armory.getDescription());
    }
    EnumWithMethod enumWithMethod = new EnumWithMethod();
    for (int i = 0; i < 5; i++) {
      System.out.println(enumWithMethod.armory);
      enumWithMethod.change();
    }
  }

  Armory armory = Armory.FIST;

  public void change() {
    switch (armory) {
      case SWORD:
        armory = Armory.SHIELD;
        break;
      case SHIELD:
        armory = Armory.BOW;
        break;
      case BOW:
        armory = Armory.KNIFE;
        break;
      case KNIFE:
        armory = Armory.WOD;
        break;
      case WOD:
        armory = Armory.FIST;
        break;
      case FIST:
        armory = Armory.SWORD;
        break;
    }
  }
}
