import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int index = 1;
        for (int i = 1; i <= 9; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n > max) {
                max = n;
                index = i;
            }
        }
        System.out.print(max + "\n" + index);



    }
}