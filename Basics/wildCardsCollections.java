import java.util.*;
abstract class wildCardsCollections{
    abstract void show();
}

class wildCardsCollections extends honda{
    void show(){
        System.out.println("I am i10");
    }
}

class wildCardsCollections extends honda{
    void show(){
        System.out.println("I am i20");
    }
}

public class wildCardsCollections {

    public static void car(List<? extends honda> ls){  // In generic code, the question mark (?), called the wildcard, represents an unknown type.
        for(honda h:ls){
            h.show();
        }
    }
    public static void main(String[] args) {
        List<i10> obj = new ArrayList<i10>(); // List--> Interface & ArrayList--> class wildCardsCollections.add(new i10());
        car(obj);

        List<i20> obj1 = new ArrayList<i20>();
        obj1.add(new i20());
        car(obj1);
    }
}

