public class Assignment2 {

    static void findFloorCeil(int[] arr, int key) {
        int floor = -1, ceil = -1;

        for (int x : arr) {
            if (x <= key) floor = x;
            if (x >= key) {
                ceil = x;
                break;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 100};

        findFloorCeil(arr, 30);
    }
}