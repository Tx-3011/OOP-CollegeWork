class prime {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;

            for (int j = 2; j < arr[i]; j++) { // Start from 2
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(arr[i]);
            }
        }
    }
}
