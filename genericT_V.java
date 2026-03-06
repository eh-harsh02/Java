class gen<T,V>{
    T rollno;
    V name;
    gen(T rollno, V name){
        this.rollno=rollno;
        this.name=name;
        System.out.println(rollno);
        System.out.println(name);
    }
}

public class genericT_V {
    public static void main(String[] args) {
        gen<Integer,String> obj = new gen<Integer,String>(6, "Harsh");
        gen<Float,Character> obj1 = new gen<Float,Character>(6.5f, 'H');
        gen<Integer,Double> obj2 = new gen<Integer,Double>(5, 5.945);
    }
}
