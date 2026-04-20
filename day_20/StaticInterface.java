public class StaticInterface{
    public static void main(String[] args) {
        String s = CarEngine.display();
        System.out.println(s);
    }
}
interface CarEngine{
    static String display(){
    return "engine is designd with 3000rpm";
    }
}
