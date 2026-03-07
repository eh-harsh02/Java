class printAlphabetUsingRunnable implements Runnable 
{
public void run(){
for(int i=65;i<92;i++){
System.out.println((char)i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{

}
}
System.out.println("Alphabets class printAlphabetUsingRunnable");
}
}
class printAlphabetUsingRunnable implements Runnable
{
public void run(){
for(int i=1;i<=10;i++){
System.out.println(i);
try{
Thread.sleep(500);
}
catch(Exception e)
{

}
}
System.out.println("Number class printAlphabetUsingRunnable");
}
}

class printAlphabetUsingRunnable
{
public static void main(String... args){
alphabet a = new alphabet();
number n = new number();
Thread t1 = new Thread(a);
t1.start();
Thread t2 = new Thread(n);
t2.start();
}
}
