class Main {  // Змінили ім'я класу на Main

    // Метод для сортування обміном (Bubble Sort)
    public static void bubbleSort(float[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмін елементів
                    float temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Метод для сортування вибором (Selection Sort)
    public static void selectionSort(float[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Обмін елементів
            float temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Метод для виводу масиву
    public static void printArray(float[] array) {
        for (float value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Головний метод для тестування
    public static void main(String[] args) {
        float[] array = {3.5f, 2.1f, 5.9f, 1.4f, 4.7f};

        System.out.println("Початковий масив:");
        printArray(array);

        // Bubble Sort
        bubbleSort(array);
        System.out.println("Масив після сортування методом обміну (Bubble Sort):");
        printArray(array);

        // Відновимо масив для наступного сортування
        float[] array2 = {3.5f, 2.1f, 5.9f, 1.4f, 4.7f};

        // Selection Sort
        selectionSort(array2);
        System.out.println("Масив після сортування методом вибору (Selection Sort):");
        printArray(array2);
    }
}
