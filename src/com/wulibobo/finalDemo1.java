package com.wulibobo;
/*
 * 本案列讲解final关键字的使用
 * 一、final修饰变量
 * 1:final声明的变量赋值后，来修改值。
 * 				public static void main(String[] args) {
					final int a=10;
					     //提示a的值不能修改
						//	a=18;
					}
 * 2:final声明变量未赋值，第一次修改值可以，第二次修改值不可以！
 * 				public static void main(String[] args) {
						final int a;
						     //提示a的值不能修改
								a=18;
								a=19;
					}	
  一句话总结：final修饰的变量值不能被更改，也就是我们常说的常量!!!				
								
 *
 * 二、final修饰方法中的参数
 * 	 public  int  add(final int a) {
 * 		//a会报错
		 a=10;
		return a;
	}			
						
 * */
public class finalDemo1 {
	public static void main(String[] args) {
		
	}
}
