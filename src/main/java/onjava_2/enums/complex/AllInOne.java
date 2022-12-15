package onjava_2.enums.complex;

import onjava_2.tools.Enums;

public class AllInOne {
  public static void main(String[] args) {
    for (Starter starter : Starter.values()) {
      System.out.println(starter.pick());
    }
  }

  enum Starter {
    WEAPONS(Stocks.First.class),
    ARMORS(Stocks.Second.class),
    ACCESSORIES(Stocks.Third.class),
    TRANSPORTATION(Stocks.Forth.class),
    ;

    private Stocks[] armories;

    Starter(Class<? extends Stocks> armories) {
      this.armories = armories.getEnumConstants();
    }

    public Stocks pick() {
      return Enums.get(armories);
    }
  }

  interface Stocks {
    enum First implements Stocks {
      SWORD,
      BOW,
      WOD,
      KNIFE,
      FIST,
      ;
    }

    enum Second implements Stocks {
      HELM,
      SHIELD,
      GLOVE,
      SHOE,
      ;
    }

    enum Third implements Stocks {
      RING,
      NECKLACE,
      GEM,
      ;
    }

    enum Forth implements Stocks {
      HOUSE,
      BIKE,
      CAR,
      TANK,
      FLY,
      ;
    }
  }
}
