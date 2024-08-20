public class shadowing {
    static int x = 90; // This will be shadowed for PVSM 
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);    //Displaying the number which is declared in this block 
        fun();
    }
    
    static void fun(){
        System.out.println(x);   //Displaying the number which is declared globally but if we pass the arguements of PVSM than it will print the value of integer declared in PVSM
    }
}
