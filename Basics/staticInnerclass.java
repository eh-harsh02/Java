class staticInnerclass
{
static String country="India";
static class inner
{
static void showCountry(){
System.out.println("My country is:- "+country);
}
}
public static void main(String... args){
staticInnerclass.inner.showCountry();
}
}