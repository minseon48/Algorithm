import java.io.*;
import java.util.HashMap;
import java.util.Map;



class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,Integer> hashMap = new HashMap<>();


        for(int i = 0;i<10;i++){
            int num = Integer.parseInt(br.readLine());
            int remain = num % 42;
            hashMap.put(remain,hashMap.getOrDefault(remain,0)+1);

        }
        System.out.println(hashMap.size());
    }
}