package onjava_2.enums;

import onjava_2.tools.OSExecute;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

enum                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        Explore {
  Here,
  There,
  ;
}

public class EnumReflection {
  public static Set<String> analyze(Class<?> clazz) {
    Set<String> methods = new TreeSet<>();
    System.out.println("_____Analyze Class: " + clazz + " _____");
    System.out.println("Interfaces: ");
    for (Type t : clazz.getGenericInterfaces()) {
      System.out.println(t);
    }

    System.out.println("Super Base: ");
    System.out.println(clazz.getSuperclass());

    System.out.println("Methods: ");
    for (Method m : clazz.getMethods()) {
      methods.add(m.getName());
    }
    System.out.println(methods);

    return methods;
  }

  public static void main(String[] args) {
    Set<String> exploreMethods = analyze(Explore.class);

    Set<String> enumMethods = analyze(Enum.class);

    System.out.println(
        "Explore contains all enum methods? " + exploreMethods.containsAll(enumMethods));
    exploreMethods.removeAll(enumMethods);
    System.out.println("Explore contains extra: " + exploreMethods);

    System.out.println("Decomp: ");
    OSExecute.javapCp("target/classes/onjava_2/enums", "Explore");
  }
}
