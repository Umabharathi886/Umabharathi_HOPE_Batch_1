public class InterfaceImpl{
    public static void main(String[] args) {
       Test obj = ()->System.out.println("Hello lambda interface") ;
       obj.show();
    }
}
interface Test{
    public void show();
}