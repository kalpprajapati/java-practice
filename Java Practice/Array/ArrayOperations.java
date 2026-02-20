import java.util.*;

class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ----- Input array -----
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[100]; // extra space for insertion

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ===== 1. Traversal =====
        System.out.println("\nTraversal:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // ===== 2. Insertion =====
        System.out.print("\n\nEnter position to insert (0 to " + n + "): ");
        int pos = sc.nextInt();

        System.out.print("Enter value to insert: ");
        int val = sc.nextInt();

        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = val;
        n++;

        System.out.println("After Insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // ===== 3. Deletion =====
        System.out.print("\n\nEnter position to delete (0 to " + (n - 1) + "): ");
        int dpos = sc.nextInt();

        for (int i = dpos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;

        System.out.println("After Deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // ===== 4. Searching (Linear) =====
        System.out.print("\n\nEnter value to search: ");
        int key = sc.nextInt();

        int found = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = i;
                break;
            }
        }

        if (found != -1)
            System.out.println("Found at index: " + found);
        else
            System.out.println("Not found");

        // ===== 5. Updating =====
        System.out.print("\nEnter index to update (0 to " + (n - 1) + "): ");
        int upos = sc.nextInt();

        System.out.print("Enter new value: ");
        arr[upos] = sc.nextInt();

        System.out.println("After Update:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // ===== 6. Sorting (Bubble Sort) =====
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // ===== 7. Reversing =====
        int start = 0, end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("\nReversed Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
/* #OUTPUT :
Enter size of array: 5
Enter 5 elements:
1
2
3
4
5

Traversal:
1 2 3 4 5

Enter position to insert (0 to 5): 2
Enter value to insert: 7
After Insertion:
1 2 7 3 4 5

Enter position to delete (0 to 5): 2
After Deletion:
1 2 3 4 5

Enter value to search: 3
Found at index: 2

Enter index to update (0 to 4): 3
Enter new value: 6
After Update:
1 2 3 6 5
Sorted Array:
1 2 3 5 6
Reversed Array:
6 5 3 2 1 */