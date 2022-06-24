package animals.carnivore;

import animals.herbivore.Herbivore;

public interface Carnivore {
    int weight = 0;
    public String name();
    public int weight();
    public void sound();
    public Herbivore hunt(Herbivore herbivore);
}
