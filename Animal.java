package Animals;

public abstract class Animal {

    protected static int counter;

    protected String name;

    public abstract void run(int run);

    public abstract void swim(int swim);

    public Animal(String name) {
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Animal.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
