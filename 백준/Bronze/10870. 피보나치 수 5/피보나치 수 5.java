import java.io.*;


class Main {
    static int fibo[];

    public int DFS(int n){
        if(n==0) return fibo[n]= 0;
        else if(n==1) return fibo[n]= 1;
        else if(n==2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-2)+DFS(n-1);

    }


    public static void main(String[] args) throws Exception {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo = new int[n+1];

        m.DFS(n);
        System.out.println(fibo[n]);


    }
}