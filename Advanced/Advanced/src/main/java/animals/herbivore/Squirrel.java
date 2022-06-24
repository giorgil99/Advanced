package animals.herbivore;

import animals.plant.Plant;

public non-sealed class Squirrel extends PeacefulAnimal implements Herbivore {
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
        return "squirrel";
    }

    @Override
    public int weight() {
        return 2;
    }

    @Override
    public void sound() {
        System.out.println("This is squirrel");

    }

    @Override
    public void eat(Plant plant) {
        System.out.println(name() + " ate " + plant.name());

    }
}
