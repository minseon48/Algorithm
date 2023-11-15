import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(arr[i]) == 1) {
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(Integer.parseInt(arr[i])); j++) {
                if (Integer.parseInt(arr[i]) % j == 0) {
                    isPrime = false;
                    break; 
                }
            }

            if (isPrime) {
                count++;
            }
        }

        System.out.print(count);
    }
}