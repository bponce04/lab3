

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {

      int temp = arr[i];

      arr[i] = arr[arr.length - i - 1];

      arr[arr.length - i -1] = temp;
      
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];

    for (int i = 0; i < newArray.length; i ++) {

      newArray[i] = arr[i];

    }

    for(int i = 0; i < newArray.length/2; i += 1) {

      int temp = newArray[i];

      newArray[i] = newArray[newArray.length - i - 1];

      newArray[newArray.length - i - 1] = temp;

    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return arr[0] / arr.length; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    return sum / (arr.length - 1);
  }


}

