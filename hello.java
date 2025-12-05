class Hello{
    public static void main(String a[]){
        System.out.println("Hello World");
        DataType.data_type();
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