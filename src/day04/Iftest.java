/*
岳小鹏参加java考试，他和父亲岳不群达成承诺
如果：
成绩为100分的时，奖励一辆BMW；
成绩为(80-90)时，奖励一台iphone xs max；
成绩为(60-80)时，奖励一个iPad；
低于60什么都没有；
请从键盘输入岳小鹏的期末成绩，并加以判断

说明：
1.else 结构是可选的
2.针对于条件表达式
  >如果多个条件表达式之间是“互斥”关系(或没有交集的关系)，哪个判断和执行语句在上面还是在下面，无所谓。
  >如果多个条件表达式之间有交集的关系，需要根据实际情况，考虑清楚应该将哪个声明放在上面。
  >如果多个条件表达式之间有包含关系，通常需要将范围小的声明在范围大的上面，否则，范围小的没机会执行。
*/

package day04;

import java.util.Scanner;

public class Iftest {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入岳小鹏期末成绩：(0-100)");
		
		int score = scan.nextInt();
		if(score == 100) {
			System.out.println("奖励一辆BMW");
		}else if(score > 80 && score <= 99){
			System.out.println("奖励一台iphone xs max");
		}else if(score >= 60 && score <= 80) {
			System.out.println("奖励一台iPad");
		}else {
			System.out.println("什么奖励都没有");
		}	
	}
}
