import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] += 1+i;
        }

        for(int x = 0; x<m;x++){
            String[] ij = br.readLine().split(" ");
            int i = Integer.parseInt(ij[0]);
            int j = Integer.parseInt(ij[1]);

            //공 바꾸기
            int temp = 0;
            temp=arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;

        }

        for(int x : arr){
            System.out.print(x + " ");
        }

    }
}