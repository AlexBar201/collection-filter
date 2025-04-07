import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] object = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayElementMultiplyTwo arrayMultiply = new ArrayElementMultiplyTwo();
        MethodFilter methodFilter = new MethodFilter();

        System.out.println(Arrays.toString(methodFilter.filter(object, arrayMultiply)));
    }
}
