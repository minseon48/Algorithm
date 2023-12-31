import java.io.*;


class Main {

    public int DFS(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        else if(n==2) return 1;
        else return DFS(n-2)+DFS(n-1);

    }


    public static void main(String[] args) throws Exception {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(m.DFS(n));


    }
}