package animals.carnivore;

import animals.herbivore.Herbivore;
import animals.herbivore.PeacefulAnimal;

public non-sealed class Wolf extends HostileAnimal implements Carnivore {


    @Override
    public String name() {

        return "wolf";
    }

    @Override
    public int weight() {
        return 10;
    }

    @Override
    public void sound() {
        System.out.println("this is wolf");
    }

    @Override
    public Herbivore hunt(Herbivore herbivore) {
        herbivore.alive(false);
        return herbivore;
    }
}
