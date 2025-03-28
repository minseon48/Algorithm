import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public double average(double[] total, double gradeTotal){
        double subTotal = 0.0;

        for (double v : total) {
            subTotal += v;
        }

        double result = subTotal / gradeTotal;

        return result;

    }
    public static void main(String[] args) throws IOException {
        HashMap<String,Double> subjects = new HashMap<>();
        subjects.put("A+",4.5);
        subjects.put("A0",4.0);
        subjects.put("B+",3.5);
        subjects.put("B0",3.0);
        subjects.put("C+",2.5);
        subjects.put("C0",2.0);
        subjects.put("D+",1.5);
        subjects.put("D0",1.0);
        subjects.put("F",0.0);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] total = new double[20];
        double gradeTotal = 0.0;

        for(int i = 0; i<20; i++){
            String[] s = br.readLine().split(" ");
            if(s[2].equals("P")){
                continue;
            }
            String level = s[2];
            gradeTotal += Double.parseDouble(s[1]);
            total[i] = Double.parseDouble(s[1]) * subjects.get(level);
        }

        Main avg = new Main();
        double average = avg.average(total, gradeTotal);

        System.out.printf("%.6f",average);


    }
}