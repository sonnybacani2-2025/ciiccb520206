package chapter2;

public class LoopsLesson {
    static boolean isLooping(){
        return false;
    }
    public static void main(String[] args) {
        byte x=0;
        while(x<5)
            System.out.println("while loop x="+x++);
        x=11;
        
        do
            System.out.println("do while x="+x++);
        while(x<=10);
        
        boolean isLooping = true;
        for(byte b=0;b<10;b++)
            System.out.println("for loop b ="+b);
        // System.out.println(b);❌
        // System.out.println("endofprogram");
        //for each
        String[] colors = {"black","red","pink","blue","violet","yellow"};
        for(String color: colors)
            System.out.println(color);

ROW_TABLE:for(int p = 1;p<=10;p++){
COL_TABLE:  for(int l = 1;l<=10;l++)
            {   
                if(l==5)
                    // break COL_TABLE;
                    continue COL_TABLE;
                System.out.print(l*p+"\t");
            }
            System.out.println();
        }
    }
}