public class patternrevtri {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1; col <=n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}
