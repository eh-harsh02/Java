class genericT_V<T,V>{
    T rollno;
    V name;
    gen(T rollno, V name){
        this.rollno=rollno;
        this.name=name;
    }
    void display() {
        System.out.println(rollno);
        System.out.println(name);
    }
}

public class genericT_V {
    public static void main(String[] args) {
        gen<Integer,String> obj = new gen<>(6, "Harsh");
        obj.display();
        gen<Float,Character> obj1 = new gen<>(6.5f, 'H');
        obj1.display();
        gen<Integer,Double> obj2 = new gen<>(5, 5.945);
        obj2.display();
    }
}

