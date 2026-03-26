import java.util.*;

class Transaction {
    String id;
    double fee;
    String timestamp;

    Transaction(String id, double fee, String timestamp) {
        this.id = id;
        this.fee = fee;
        this.timestamp = timestamp;
    }
}

public class Assignment2 {

    // Bubble Sort (by fee)
    static void bubbleSort(ArrayList<Transaction> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).fee > list.get(j + 1).fee) {
                    Collections.swap(list, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // Insertion Sort (fee + timestamp)
    static void insertionSort(ArrayList<Transaction> list) {
        for (int i = 1; i < list.size(); i++) {
            Transaction key = list.get(i);
            int j = i - 1;

            while (j >= 0 &&
                    (list.get(j).fee > key.fee ||
                            (list.get(j).fee == key.fee &&
                                    list.get(j).timestamp.compareTo(key.timestamp) > 0))) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }

    // Outliers
    static void findOutliers(ArrayList<Transaction> list) {
        for (Transaction t : list) {
            if (t.fee > 50)
                System.out.println("Outlier: " + t.id);
        }
    }

    // ✅ MAIN METHOD (added)
    public static void main(String[] args) {
        ArrayList<Transaction> list = new ArrayList<>();

        list.add(new Transaction("T1", 20, "2024-01-01"));
        list.add(new Transaction("T2", 60, "2024-01-02"));
        list.add(new Transaction("T3", 20, "2024-01-03"));
        list.add(new Transaction("T4", 10, "2024-01-01"));

        System.out.println("Before Sorting:");
        for (Transaction t : list) {
            System.out.println(t.id + " " + t.fee + " " + t.timestamp);
        }

        // Choose sorting
        insertionSort(list);

        System.out.println("\nAfter Sorting:");
        for (Transaction t : list) {
            System.out.println(t.id + " " + t.fee + " " + t.timestamp);
        }

        System.out.println("\nOutliers:");
        findOutliers(list);
    }
}