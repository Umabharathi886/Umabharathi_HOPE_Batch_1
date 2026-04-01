public class autoboxing{
    public static void main(String[] args){
        /*int a = 10;
        Integer obj =a;//Integer.valueOf(a);//mamual autoboxing
        System.out.println(obj);
        */
      /* Integer a =1000;
        Integer obj =1000;
        System.out.println(a==obj);//checks both reference and value
        System.out.println(a.equals(obj));//checks only thevalue
   */
  /* Integer a = -128;
   Integer b = -128;//based on range true and false is updated
   System.out.println(a+" "+b);
   System.out.println(a==b);
   */
 // Character c = 'a';
  //Character b = 'a';
//System.out.println(c==b);
/*Character a='#';
Character d = '#';
System.out.println(a==d);*/
Float c = 0f;// for float it comes true but for wrraperclass or object it comes false
Float b = 0f;
System.out.println(c==b);//reference not eqal
System.out.println(c.equals(b));//checks value 

   
    }
}