public class BMExercicio4 {
    public static void main (String[] args) {
        long long1 = 100L;
        long int1 = 200L;
        long int2; 
        
        int2 = long1 + int1;

        System.out.println(int2);
    }
}

/* Código original, que não compila:: 

public class BMExercicio4 {
    public static void main (String[] args) {
        long long1 = 100L;
        int int1 = 200;
        int int2;

        int2 = long1 + int1;

        System.out.println(int2);
    }
}
*/