public class InterfaceImpl2{
    public static void main(String[] args) {
        hello h = new hello();
        h.display();
        
    }}
class hello implements method{
    public void display(){
        System.out.println("from class");
    }
}
interface method{
    default void display(){
        System.out.println("from interface");
    }
}
