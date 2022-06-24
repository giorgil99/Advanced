package animals.herbivore;

import animals.herbivore.Deer;
import animals.herbivore.Rabbit;
import animals.herbivore.Squirrel;
import animals.carnivore.Wolf;

public sealed class PeacefulAnimal permits Deer, Rabbit, Squirrel {

    public boolean alive;
    public final static boolean haveAccess = true;
}
