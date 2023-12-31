import java.io.*;


class Main {


    public int DFS(int n){
        if(n==0) return 0;
        else if(n==1) return 1;

        int a = 0, b= 1, c=0;

        for(int i = 2;i<=n;i++){
            c = a+b;
            a=b;
            b=c;
        }
        return c;
    }


    public static void main(String[] args) throws Exception {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(m.DFS(n));
    }
}