public class Main {
    public static void main(String[] args) {
        int [][] array = new int[6][8];
        int num = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = num;
                num ++;
            }
        }
        System.out.println("测试用例30" + "  "+ new Solution().FindNumber2(30 , array));
        System.out.println("测试用例50" + "  "+ new Solution().FindNumber2(50 , array));


    }
}
