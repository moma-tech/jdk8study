package onjava_2.enums.complex;

import onjava_2.tools.Enums;

public enum StartSuits {
  WEAPONS(Weapons.class),
  ARMORS(Armors.class),
  ACCESSORIES(Accessories.class),
  TRANSPORTATION(Transportation.class),
  ;

  private Armory[] armories;

  StartSuits(Class<? extends Armory> armories) {
    this.armories = armories.getEnumConstants();
  }

  public Armory pick() {
    return Enums.get(armories);
  }
}
