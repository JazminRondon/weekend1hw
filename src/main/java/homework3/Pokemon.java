package homework3;

public class Pokemon {

    String name;
    int level;

    Pokemon(){
        level = 1;
    }

    Pokemon(String name, int level){
        this.name = name;
        this.level = level;

    }

    public void attack(){
        System.out.println(name + " Attack!");
    }




}
