package plant;

public class  Plant {



    enum LifeCycle{ANNUAL,PERENIAL,BIENNIAL};

    final private String name;
    final private LifeCycle lifeCycle;

    Plant(String name,LifeCycle lifeCycle){
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return "plant.plant{" +
                "name='" + name + '\'' +
                ", lifeCycle=" + lifeCycle +
                '}';
    }
}
