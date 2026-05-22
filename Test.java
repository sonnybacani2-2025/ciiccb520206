package chapter2;

import chapter1.Toy;

public class OperatorsLesson {
    public static void main(String[] args) {
        int a = +10;
        int b = 5;
        boolean isEating = false;
        System.out.println();
        // a = +a++; ✅
        System.out.println(--a + a++);//11 -- a + a ++ or --a+a++✅ 
        System.out.println(a);
        b++;
        // ++b++ or --b-- ❌
        --a;//10
        System.out.println(a);
        System.out.println(-a);
        System.out.println(!!!!isEating);
        // !(!(!(!isEating)))
        System.out.println(5/2);
        System.out.println(5%2);
        System.out.println(8>>1);
        //0000 1000 -> 0000  0100
        System.out.println(3<<1);
        //0000 0011 -> 0000 0110
        System.out.println(16>>>2);
        // 0000 0100
        // 0001 0000 -> 0000 0100
        System.out.println("1<2 = "+(1<2));
        System.out.println("1>2 = "+(1>2));
        System.out.println("2<1 = "+(2<1));
        System.out.println("2>1 = "+(2>1));
        System.out.println("1<1 = "+(1<1));
        System.out.println("2>2 = "+(2>2));
        System.out.println("1<1 = "+(1<1));
        System.out.println("2>2 = "+(2>2));
        System.out.println("1<=1 = "+(1<=1));
        System.out.println("2>=2 = "+(2>=2));
        
        System.out.println("1==1 = "+(1==1));
        System.out.println("2==2 = "+(2==2));
        System.out.println("1!=1 = "+(1!=1));
        System.out.println("2!=2 = "+(2!=2));
        System.out.println("2!=1 = "+(2!=1));
        System.out.println("1!=2 = "+(1!=2));
        System.out.println(1+1.0); // 1(double) + 1.0 -> 1.0 + 1.0
        short b1 = 10;// byte+short+char = int
        short b2 = 11;// byte+short+char = int
        // char b3 = b1+b2;
        short b4 = b1;
        System.out.println(b1+b2);
        int x2 = 1;
        long l2 = 33;
        long l3 = x2*l2; //int l3 = x2*l2;
        // System.out.println(true==1);
        float f = 21;
        double d =21d;
        System.out.println(Integer.MAX_VALUE);
        //-32768,0, 32767
        System.out.println(Short.MAX_VALUE);
        short wraparoundSample = (short)32768;
        System.out.println(wraparoundSample);
        //short - 1921222
        //compound assignment
        short x = 3;
        short y =2;
        x*=y;//x = x*y 
        //x =(type of x) (x*y)
        short z =(short)(x*y);
        System.out.println(z);
        long x3 = 5;
        boolean p1 = false;
        boolean p2 = p1=x3<100;
        long y3 =(x=3);
        System.out.println(y3);//3
        System.out.println(x3);//3
        System.out.println(p2);
        boolean x4 = true | (y3<4);
        System.out.println(x4);
        // boolean x4 =  🔵true | 🔵(y3<4);
        x4 = true || (y3<4);
        // boolean x4 =  🔵true || (y3<4);
        //  x4 =  🔵false ||🔵 (y3<4);
        System.out.println(x4);
        //Equality operator
        System.out.println(100==100.000);// rule 1. 2 numeric data types
        System.out.println(true==y3<4);// rule 2. 2 boolean data types or value
        System.out.println("marco"=="marco");// rule 3. 2 objects, Strings or null
        Toy toy1 = new Toy();
        Toy toy2 = new Toy();
        Toy toy3 = toy1;
        Toy toy4 = null;
        System.out.println("toy1==toy2 = "+(toy1==toy2));
        System.out.println("toy1==toy3 = "+(toy1==toy3));
        System.out.println("toy4==toy3 = "+(toy4==toy3));
        System.out.println("toy4==null = "+(toy4==null));
       
    }
}
