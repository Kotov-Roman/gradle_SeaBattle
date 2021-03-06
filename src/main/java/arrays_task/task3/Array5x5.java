package arrays_task.task3;

public class Array5x5 {
    private String[][] arr = {
            {"00", "01", "02", "03", "04"},
            {"10", "11", "12", "13", "14"},
            {"20", "21", "22", "23", "24"},
            {"30", "31", "32", "33", "34"},
            {"40", "41", "42", "43", "44"}};

    /**
     * Method returns string which consist of sequince elements with even index from each element of array
     *
     * @return string result
     */
    public String printLeftToRight() {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array should not be empty");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null || arr[i].length == 0) {
                throw new IllegalArgumentException("Array should not have empty elements ");
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int stringIndex = 0; stringIndex < 5; stringIndex++) {
            if (stringIndex % 2 == 0) {
                stringBuilder.append(arr[stringIndex][0]);
                stringBuilder.append(arr[stringIndex][2]);
                stringBuilder.append(arr[stringIndex][4]);
            } else if (stringIndex % 2 == 1) {
                stringBuilder.append(arr[stringIndex][1]);
                stringBuilder.append(arr[stringIndex][3]);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * /** Method returns string which consist of sequince elements with odd index from each element of array
     *
     * @return string result
     */
    public String printUpToDown() {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array should not be empty");
        }
        //length element check
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null || arr[i].length == 0) {
                throw new IllegalArgumentException("Array should not have empty elements ");
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int columnIndex = 0; columnIndex < 5; columnIndex++) {
            if (columnIndex % 2 == 0) {
                stringBuilder.append(arr[0][columnIndex]);
                stringBuilder.append(arr[2][columnIndex]);
                stringBuilder.append(arr[4][columnIndex]);
            } else if (columnIndex % 2 == 1) {
                stringBuilder.append(arr[1][columnIndex]);
                stringBuilder.append(arr[3][columnIndex]);
            }
        }
        return stringBuilder.toString();
    }

    public String[][] getArr() {
        return arr;
    }

    public void setArr(String[][] arr) {
        this.arr = arr;
    }
}
