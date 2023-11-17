public class ArrayUtility {
        public static void print(int[] array) {
            String result = "";
            for (int i = 0; i < array.length; i++) {
                result = array[i] + ", ";
                if (i != array.length - 1) {
                    result = ", ";
                }
            }
            System.out.println(result);
        }

        public static int sum(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum;
        }

        public static double average(int[] array) {
            if (array.length == 0) {
                return 0.0;
            }
            int sum = sum(array);
            double average = (double) sum / array.length;
            average = (double) Math.round(average * 100) / 100;
            return average;
        }

        public static int minimum(int[] array) {
            if (array.length == 0) {
                throw new IllegalArgumentException("Array is empty");
            }
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }

        public static int maximum(int[] array) {
            if (array.length == 0) {
                throw new IllegalArgumentException("Array is empty");
            }
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }

        public static int evenCount(int[] array) {
            int count = 0;
            for (int num : array) {
                if (num % 2 == 0) {
                    count++;
                }
            }
            return count;
        }

        public static int[] reverseOne(int[] array) {
            int[] reversedArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                reversedArray[i] = array[array.length - 1 - i];
            }
            return reversedArray;
        }

        public static void reverseTwo(int[] array) {
            int left = 0;
            int right = array.length - 1;
            while (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        public static boolean linearSearchInt(int[] array, int target) {
            for (int num : array) {
                if (num == target) {
                    return true;
                }
            }
            return false;
        }

        public static boolean linearSearchString(String[] array, String target) {
            for (String str : array) {
                if (str.equals(target)) {
                    return true;
                }
            }
            return false;
        }

        public static void multiplyByTwo(int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] *= 2;
            }
        }

        public static void multiplyByN(int[] array, int n) {
            for (int i = 0; i < array.length; i++) {
                array[i] *= n;
            }
        }

        public static String toString(int[] array) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                sb.append(array[i]);
                if (i != array.length - 1) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        public static boolean twoSum(int[] array, int target) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == target) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static void shiftRight(int[] array) {
            if (array.length <= 1) {
                return;
            }
            int lastElement = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = lastElement;
        }

        public static void shiftLeft(int[] array) {
            if (array.length <= 1) {
                return;
            }
            int firstElement = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = firstElement;
        }

        public static void shiftRightNTimes(int[] array, int n) {
            if (array.length <= 1) {
                return;
            }
            n %= array.length;
            for (int i = 0; i < n; i++) {
                shiftRight(array);
            }
        }

        public static void shiftLeftNTimes(int[] array, int n) {
            if (array.length <= 1) {
                return;
            }
            n %= array.length;
            for (int i = 0; i < n; i++) {
                shiftLeft(array);
            }
        }
    }