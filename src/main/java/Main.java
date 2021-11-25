public class Main {
    public static void main(String[] args) {

        System.out.println("Distance length is 210m");


    Cat catEsau = new Cat();
    catEsau.setName("Esau");
    catEsau.setRun("140m");
    catEsau.setSwim("can't swim");
        System.out.println("Cat " + catEsau.name + " ran " +  "max " +  catEsau.run + "," + " but he " + catEsau.swim + ".");

    Cat catIsaak = new Cat();
    catIsaak.setName("Isaak");
    catIsaak.setRun("150m");
    catIsaak.setSwim("doesn't like swim");
        System.out.println("Cat " + catIsaak.name +  " ran " + "max  "  +  catIsaak.run + ", " + "but he " + catIsaak.swim + ".");

    Dog dogJacob = new Dog();
    dogJacob.setName("Jacob");
    dogJacob.setRun("200m");
    dogJacob.setSwim("10m");
        System.out.println("Dog " + dogJacob.name + " ran " + "max  "  +  dogJacob.run  + " and " + "swam " + dogJacob.swim +  ".");

    Dog dogJosef = new Dog();
    dogJosef.setName("Josef");
    dogJosef.setRun("210m");
    dogJosef.setSwim("10m");
        System.out.println("Dog " + dogJosef.name + " ran " + "max  "  +  dogJosef.run  + " and " + "swam " + dogJosef.swim  +  ".");


        System.out.println(dogJosef.name + "is Winner");

        Animal[] animals =  new Animal[4];
        animals[0] = catEsau;
        animals[1] = catIsaak;
        animals[2] = dogJacob;
        animals[3] = dogJosef;

        System.out.println("Quantity pets are four");

    }


}
