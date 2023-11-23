import java.io.*;
import java.util.ArrayList;
import java.util.Stack;


class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            if(str[0].equals("push")) {
                stack.push(Integer.parseInt(str[1]));
            } else if (str[0].equals("top")) {
                if (!stack.isEmpty())
                    list.add(stack.peek());
                else
                    list.add(-1);
            } else if (str[0].equals("size")) {
                list.add(stack.size());
            } else if (str[0].equals("empty")) {
                if (stack.isEmpty())
                    list.add(1);
                else
                    list.add(0);
            } else if (str[0].equals("pop")) {
                if (!stack.isEmpty()) {
                    list.add(stack.pop());
                } else {
                    list.add(-1);
                }
            }




        }
        for (int x : list) {
            System.out.println(x);
        }
    }
}