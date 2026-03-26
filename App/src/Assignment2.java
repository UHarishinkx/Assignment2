class Asset {
    String name;
    double returnRate;

    Asset(String n, double r) {
        name = n;
        returnRate = r;
    }
}

public class Assignment2 {

    static void sort(Asset[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].returnRate > arr[j].returnRate) {
                    Asset temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Asset[] arr = {
                new Asset("AAPL", 12),
                new Asset("TSLA", 8),
                new Asset("GOOG", 15)
        };

        sort(arr);

        for (Asset a : arr)
            System.out.println(a.name + " " + a.returnRate);
    }
}