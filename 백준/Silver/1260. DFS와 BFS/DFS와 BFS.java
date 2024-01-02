import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Main {
    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[][] nodeArr;
    static int node, line, startNode;
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        startNode = Integer.parseInt(st.nextToken());


        nodeArr = new int[node+1][node+1];
        check = new boolean[node+1];

        for(int i = 0; i<line;i++){
            StringTokenizer input = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(input.nextToken());
            int b = Integer.parseInt(input.nextToken());

            nodeArr[a][b] = nodeArr[b][a] = 1;
        }
        dfs(startNode);
        sb.append("\n");
        check = new boolean[node+1];

        bfs(startNode);
        System.out.println(sb);

    }



    public static void dfs(int startNode) {
        check[startNode] = true;
        sb.append(startNode).append(" ");

        for(int i = 0;i<=node;i++){
            if(nodeArr[startNode][i]==1 && !check[i])
                dfs(i);
        }
    }

    public static void bfs(int startNode) {
        q.add(startNode);
        check[startNode] = true;

        while(!q.isEmpty()){
            startNode = q.poll();
            sb.append(startNode).append(" ");

            for(int i = 1;i<=node;i++){
                if(nodeArr[startNode][i] == 1 && !check[i]){
                    q.add(i);
                    check[i] = true;

                }
            }
        }
    }
}