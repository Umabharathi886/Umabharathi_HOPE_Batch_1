public class ThreadImplementation{
public static void main(String[] args) {
   // Music m = new Music();
    Timer m = new Timer();
    Timer2 t = new Timer2();
   m.start();
   t.start();
   try {
    t.join();
    System.out.println(t.j);
   } catch (Exception e) {
   }
   

}}

class Music extends Thread{
   public  void run(){
        System.out.println("music is  playing");
    }
}
class Timer extends Thread{
  public   void run(){
    for(int i=0;i<=5;i++){
        try{
        System.out.println("Thread1 value is"+i);
        Thread.sleep(50);
        }catch(Exception e){
            System.out.println(e);
        }

    }
        
    }
}
class Timer2 extends Thread{
    int j;
    public void run(){
        
        for(int i=0;i<=5;i++){
            try{
            System.out.println("Thread2  value is"+ i);
            Thread.sleep(50);
        }catch(Exception e){
            System.out.println(e);
        }
        j=i;
    }
}
}