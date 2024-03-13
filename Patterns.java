public class Patterns {

    public static void solidRectangle(int n) {
        /**
         * This function will print the solid rectangle
         *  * * *
            * * *
            * * *
         */
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightTriangle(int n) {
        /**
         * This function will print the right angle triangle
         *  * 
            * * 
            * * *
            * * * *
         */
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberTriangle(int n){
        /**
         * This function will print the right angle triangle with numbers
         *  1 
            1 2 
            1 2 3
            1 2 3 4
         */
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solidRectangle(5);
    }
}