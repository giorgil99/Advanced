package naturalProcess;

import animals.carnivore.Wolf;
import animals.herbivore.Deer;
import animals.herbivore.Rabbit;
import animals.herbivore.Squirrel;
import animals.plant.Grass;
import environment.Nature;

import java.util.List;

public class Forest extends Nature {
    public Forest() {
        this.plant = new Grass();

        if (Rabbit.haveAccess) {
            this.herbivores.put("rabbit", new Rabbit());
        }
        if (!Wolf.haveAccess) {
            this.carnivore = new Wolf();
        }

        if (Deer.haveAccess) {
            this.herbivores.put("deer", new Deer());
        }

        if (Squirrel.haveAccess) {
            this.herbivores.put("squirrel", new Squirrel());
        }
    }

    @Override
    public void makeSound() {
//        Thread.currentThread().setUncaughtExceptionHandler((Thread t, Throwable e) -> System.out.println("In this thread " + t.getName() + " an exception was thrown " + e));

        List<String> list = herbivores.keySet().stream().toList();
        for (String s : list) {
            try {
                herbivores.get(s).sound();
            } catch (Throwable throwable) {
                System.out.println(s + " was eaten");
            }
        }

        if (carnivore != null) {
            carnivore.sound();
        }
    }


    @Override
    public void eat() {
        List<String> list = herbivores.keySet().stream().toList();
        for (String s : list) {
            try {
                herbivores.get(s).eat(plant);
            } catch (Throwable throwable) {
                System.out.println(s + " was eaten");
            }
        }

    }

    @Override
    public void hunt() {
        if (carnivore != null) {
            List<String> list = herbivores.keySet().stream().toList();
            for (int i = 0; i < herbivores.size(); i++) {
                String s = list.get(i);
                if (!carnivore.hunt(herbivores.get(s)).isAlive()) {
                    herbivores.remove(s);
                    herbivores.put(s, null);
                }
            }
        }
    }

    public static void main(String[] args) throws Throwable {
        Forest life = new Forest();
        life.makeSound();
        life.eat();
        life.hunt();
        life.makeSound();
    }

}
