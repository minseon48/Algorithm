import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      String str = br.readLine();
      for(char x : str.toCharArray()){
          if(Character.isUpperCase(x))
              sb.append(Character.toLowerCase(x));
          else
              sb.append(Character.toUpperCase(x));
      }
      System.out.println(sb.toString());
    }
}