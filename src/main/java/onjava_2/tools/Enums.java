package onjava_2.tools;

import java.security.SecureRandom;

public class Enums {

  private static SecureRandom secureRandom = new SecureRandom();

  public static <T extends Enum> T get(Class<T> t) {
    return t.getEnumConstants()[secureRandom.nextInt(t.getEnumConstants().length)];
  }

  public static <T> T get(T[] arrays) {
    return arrays[secureRandom.nextInt(arrays.length)];
  }
}
