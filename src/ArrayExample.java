import java.util.Random;

public class ArrayExample {
    public Integer[] creatRandom() {
        Random random = new Random();
        Integer[] integers = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            integers[i] = random.nextInt(100);
            System.out.print(integers[i] + " ");
        }
        return integers;
    }
}
