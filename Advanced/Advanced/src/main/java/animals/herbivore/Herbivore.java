package animals.herbivore;

import animals.plant.Plant;

public interface Herbivore {


    public boolean isAlive();
    public boolean alive(boolean alive);
    public String name();

    public int weight();

    public void sound();

    public void eat(Plant plant);


}
