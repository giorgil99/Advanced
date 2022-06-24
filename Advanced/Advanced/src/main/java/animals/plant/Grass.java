package animals.plant;

public class Grass implements Plant{

    @Override
    public String name() {
       return "grass";
    }

    @Override
    public int weight() {
        return 1;
    }
}
