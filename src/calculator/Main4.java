package calculator;

public class Main4 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        LogicalOperations logicalOperations = new LogicalOperations();


        int term=7;
        for(int i=1;i<=term;i++){
            for(int j=term;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
}



