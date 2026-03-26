public class Assignment2 {

    static void linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key))
                System.out.println("Found at index " + i);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "B"};

        linearSearch(arr, "B");
    }
}