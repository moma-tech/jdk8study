package onjava_2.enums;

import java.security.SecureRandom;
import java.util.function.Supplier;

public class EnumRandom {

  public static void main(String[] args) {
    Armory mine = Armory.FIST;
    ArmoryPicker armoryPicker = new ArmoryPicker();
    EnumPicker enumPicker = new EnumPicker();
    for (int i = 0; i < 5; i++) {
      mine = armoryPicker.get();
      //System.out.println(mine);
      System.out.println(enumPicker.get(Armory.class));
    }
  }
}

class ArmoryPicker implements Supplier<Armory> {
  private SecureRandom secureRandom = new SecureRandom();

  @Override
  public Armory get() {
    return Armory.values()[secureRandom.nextInt(Armory.values().length)];
  }
}

class EnumPicker {
  private SecureRandom secureRandom = new SecureRandom();

  public <T extends Enum> T get(Class<T> t) {
    return t.getEnumConstants()[secureRandom.nextInt(t.getEnumConstants().length)];
  }
}
