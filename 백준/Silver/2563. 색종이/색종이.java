import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        boolean[][] area = new boolean[101][101];
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for(int i = 0; i<num;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j = 0; j<10;j++){
                for(int k = 0; k<10; k++){
                    if(!area[x + j][y + k]){
                        area[x+j][y+k] = true;
                        count++;
                    }
                }

            }
        }

        System.out.print(count);
    }
}