interface calculateArea{
public int area(int w, int h); 
}
class calculateArea{
public static void main(String... args){
calculate c1=(w,h)->{
return w*h;
};
System.out.println(c1.area(3,8));

calculate c2=(w, h)->(w*h);
System.out.println(c2.area(5,7));
}
}
