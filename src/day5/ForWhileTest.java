/*
题目：
从键盘输入个数不确定的整数，并判断读入的正数和负数的个数，输入为0是结束程序。

说明：
1.不在循环条件部分限制次数的结构：for(;;) 或   while(true)
2.结
方式二：在循环体中，执行break
*/
package day5;

import java.util.Scanner;

public class ForWhileTest {

	public static void main(String[] args) {

		@SuppressWarnings({ "resource" })
		Scanner scan = new Scanner(System.in);
				
		int positiveNumber = 0;//记录正数的个数
		int negativeNumber = 0;//记录负数的个数
		for(;;) {//while(true) {
			int number = scan.nextInt();
			//判断number的正负情况
			if(number > 0) {	
				positiveNumber++;	
			}else if(number < 0) {
				negativeNumber++;
			}else {
				//一旦执行break，跳出循环
				break;
			}
		}
		System.out.println("输入的正数个数为： " + positiveNumber);
		System.out.println("输入的负数个数为： " + negativeNumber);
	}
}
