public class wrapperClass{
    public static void main(String[] args) {
      /* int a = 10;// convert primitive to object datatype
     //  Integer objA = Integer.valueOf(a);
     System.out.println(a);
     Integer objA = 10;
     System.out.println(objA);
       System.out.println(a==objA) ;//true
       System.out.println(objA.hashCode());// wecan see hashcode for only objects not for an single integer
    */
   //convert object to primitive datatype
   Character c = 'a';
   System.out.println(c);
   System.out.println(c.hashCode());
char b = c.charValue();
System.out.println(b);
System.out.println(c==b);

    }
    }
