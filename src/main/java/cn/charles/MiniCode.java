package cn.charles;

/**
 * @Author: charles
 * @eamil charles@qq.com
 * @Date: 2018/8/31 1:04
 * @description
 */
public class MiniCode {
    public static void main(String[] args) {
        for (int index = 1; index < 100; index++) {
            if (index % 3 == 0 && index % 5 != 0){
                System.out.println("Fizz");
            }else if(index % 5 == 0 && index % 3 != 0){
                System.out.println("Buzz");
            }else if(index%15==0){
                System.out.println("FizzBuzz");
            }else{
                System.out.println(index);
            }
        }
    }
}
