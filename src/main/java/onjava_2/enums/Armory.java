package onjava_2.enums;

/**
 * Armory
 *
 * <p>A plant weapons
 *
 * @version 1.0
 * @author Created by ivan at 17:53.
 */
public enum Armory {
  SWORD("Sharp one, can cut"),
  SHIELD("Tough one, can block"),
  BOW("Light one, can shoot"),
  KNIFE("Quick one, can stub"),
  WOD("Smart one, can magic"),
  FIST("Hard one, can smash"),
  ;
  private String description;

  Armory(String description) {
    this.description = description;
  }

  String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    String id = name();
    String lower = id.substring(1).toLowerCase();
    return id.charAt(0) + lower;
  }
}
