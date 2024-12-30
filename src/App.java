import java.util.Arrays;

public class App {
    public static void main(String[] args) {
       int array[] = {22,44,11,33,11};
      Arrays.stream(array).sorted().forEach(e -> System.out.println(e + " "));
    
    }
}


