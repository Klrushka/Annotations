package task2;


@ExtractInterface("Divider")
public class Division {
    public static int div(int x, int y) throws Exception {
        if (y == 0) throw new Exception("Divide by zero");
        int delta = sub(x, y);
        if (delta < 0) {
            return 0;
        }
        if (delta == 0) {
            return 1;
        }
        int result = 0;
        while (delta >= 0) {
            result++;
            delta = sub(delta, y);
        }
        return result;
    }

    private static int sub(int x, int y) {
        return x - y;
    }
}
