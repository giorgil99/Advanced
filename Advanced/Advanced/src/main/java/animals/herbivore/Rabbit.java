package animals.herbivore;

import animals.plant.Plant;

public non-sealed class Rabbit extends PeacefulAnimal implements Herbivore {


    @Override
    public boolean isAlive() {
        return alive;
    }

    @Override
    public boolean alive(boolean alive) {
        return this.alive = alive;
    }

    @Override
    public String name() {
        return "rabbit";
    }

    @Override
    public int weight() {
        return 5;
    }

    @Override
    public void sound() {
        System.out.println("this is rabbit");
    }

    @Override
    public void eat(Plant plant) {
        System.out.println(name() + " ate " + plant.name());
    }

}

