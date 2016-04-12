package assignment1part1.sowathanayong;

public class Assignment1Part1SowathanaYong {
    
    public static void main(String[] args) {
        int n = 27;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= (n-i) * 4; j++){
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--){
                System.out.printf("%4d",k);
            }
            System.out.println();
        }

    }
    
}
