public class Solution {

    public boolean FindNumber(int number , int [][] array){
        boolean result = false;
        if(array.length == 0){
            return result;
        }
        //数组的行数
        int rowLength = array.length;
        //数组的列数
        int colLength = array[0].length;
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if(array[i][j] == number){
                    result = true;
                }
            }
        }

        return result;
    }


    public boolean FindNumber2(int number ,int [][] array){
        boolean result = false;
        if(array.length == 0){
            return result;
        }

        int i = 0;
        int j = array.length;

        while (i < array[0].length && j >= 0){
            if(array[i][j] < number){
                i++;
            }else if(array[i][j] > number){
                j--;
            }
            if(array[i][j] == number){
                result = true;
            }
        }

        return result;
    }

}
