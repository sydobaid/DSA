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


    public static void main(String[] args) {
        solidRectangle(5);
    }
}