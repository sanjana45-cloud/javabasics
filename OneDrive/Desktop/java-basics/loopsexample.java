public class loopsexample{
    public static void main(String[] args) {
        /* for loop*/
        for(int i=0;i<10;i++){
            System.out.println("Hello world");
        }
        for(int counter=0;counter<10;counter=counter+1){
            System.out.println(counter);
            System.out.println("*********************");
        }

        /* while condition */
        int j=0;
        while(j<11){
            System.out.println(j++);
}
        int x=0;
        do { 
            System.out.println(x++);
        } while (x<10);
    }
}

