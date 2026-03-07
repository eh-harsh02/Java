enum enumDemo{North, South, NorthEast, SouthEast, East, West;}
class enumDemo{
public static void main(String[] args){
for(Direction d:Direction.values()){
System.out.println(d);
}
System.out.println("Value of North:- "+ Direction.valueOf("North"));
System.out.println("Index of NorthEast:- "+ Direction.valueOf("NorthEast").ordinal());
}
}
