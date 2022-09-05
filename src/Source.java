import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
        int [] arr = new int[] {2,2,2,2};
        System.out.println(getAverage(arr)==2);
    }
    public static int getAverage(int[] marks){
        return (int) Arrays.stream(marks).average().getAsDouble();
    }

}
