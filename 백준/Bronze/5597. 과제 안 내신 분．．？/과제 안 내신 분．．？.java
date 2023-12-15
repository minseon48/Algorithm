import java.io.*;
import java.util.ArrayList;
import java.util.List;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> student = new ArrayList<>();
        List<Integer> studentNum = new ArrayList<>();

        for(int i = 0;i<30;i++){
            studentNum.add(i+1);
        }
        for(int i = 0;i<28;i++){
            student.add(Integer.parseInt(br.readLine()));
        }

        studentNum.removeAll(student);
        for (Integer number : studentNum) {
            System.out.println(number);
        }



    }
}