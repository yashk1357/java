class Hello{
    public static void main(String a[]){
        Initializer init = new Initializer();
        Initializer init2 = new Initializer();
    }

}

class Initializer{
    Initializer(){
        display();
        arrays();
    }

    void display(){
       System.out.println("Hello World");
       DataType.data_type();
    }

    void arrays(){
        int arr[] = new int[5];
        Array.assign_values(arr);
        Array.print_array(arr);

        int arr2d[][] = new int[3][4];
        Array.assign_values(arr2d);
        Array.print_array(arr2d);

        // jagged array
        int jagged_arr[][] = new int[3][];
        jagged_arr[0] = new int[2];
        jagged_arr[1] = new int[4];
        jagged_arr[2] = new int[3];
        Array.assign_values(jagged_arr);
        Array.print_array(jagged_arr);
    }
}

class Array{

    public static void assign_values(int arr[]){
        System.out.println("Assigning random values to array...");
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*10);
        }
    }

    public static void print_array(int arr[]){
        System.out.println("printing array elements...");
        for(int n:arr){
            System.out.println(n);
        }
    }

    // Method overloading 
    public static void assign_values(int arr[][]){
        System.out.println("Assigning random values to 2D array...");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*10);
            }
        }
    }

    public static void print_array(int arr[][]){
        System.out.println("printing array elements...");
        for(int n[]:arr){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

class DataType{
    static void data_type(){
        byte num1= 89;
        int num2 = 8989;
        long num3 = 4567890990909l;

        float num4 = 7.898f;
        double num5 = 67.8978989;

        char letter = 'h';
        boolean check = true;

        // System.out.println(num1);
        // System.out.printl(num2);
        // System.out.println(num3);
        // System.out.println(num4);
        // System.out.println(num5);  
        // string concatination 
        System.out.println(letter + " " + check + " "+ num1+" "+ num2+" "+ num3+ "" + num4+" "+ num5);

        // literals
        int binary = 0b1010; // binary literal for 10
        int octal = 012;     // octal literal for 10
        double p = 12e90; // scientific notation for 12 * 10^90
        System.out.println("Binary literal (0b1010): " + binary);
        System.out.println("Octal literal (012): " + octal); 
        System.out.println("Scientific notation (12e90): " + p);

        char j = 'A'; // character literal
        System.out.println("Character literal A: " + j);
        j++;
        System.out.println("Next character: " + j);
        return ;
    }
}