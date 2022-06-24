package environment;

import animals.carnivore.Carnivore;
import animals.herbivore.Herbivore;
import animals.plant.Plant;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Nature {

    public Map<String, Herbivore> herbivores= new LinkedHashMap<>();
    public Carnivore carnivore;
    public Plant plant;

   public void eat() {
    }

   public void hunt() {
    }

   public void makeSound()  {
    }
}
