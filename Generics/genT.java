class genT<T>{
    T a;
    void add(T a){
        this.a=a;
    }
    T show(){
        System.out.println();
        return a;
    }
}

public class genT {
    public static void main(String[] args) {
        gen<String> s = new gen<>();
        s.add("Aman");
        System.out.println(s.show());
        gen<Integer> i = new gen<>();
        i.add(4);
        System.out.println(i.show());
        gen<Float> f = new gen<>();
        f.add(3.5f);
        System.out.println(f.show());
        gen<Character> c = new gen<>();
        c.add('H');
        System.out.println(c.show());
    }
}

