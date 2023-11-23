import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int m = Integer.parseInt(input1[1]);
        int[] b = new int[n];
        for(int x1 = 0;x1<m;x1++){
            String[] input2 = br.readLine().split(" ");
            int i = Integer.parseInt(input2[0]);
            int j = Integer.parseInt(input2[1]);
            int k = Integer.parseInt(input2[2]);//공 번호

            for(int x2 = i-1;x2<j;x2++){
                b[x2] = k;
            }
        }
        for(int x : b){
            System.out.print(x + " ");
        }

    }
}
