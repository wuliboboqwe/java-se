package com.wulibobo;
/*
 * 主要理解引用和指向
 * what is 引用？
 * 		如果一个变量的数据类型不是基本类型，而是类类型，那么该变量就叫引用!
 * 
 * 一、引用和指向。
 * 	new  Hero()		
 *  代表创建了一个Hero对象
	但是也仅仅是创建了一个对象，没有办法访问它
	为了访问这个对象，会使用引用来代表这个对象
	
	Hero h = new Hero();
	
	h这个变量是Hero类型，又叫做引用
	=的意思指的h这个引用代表右侧创建的对象
	“代表” 在面向对象里，又叫做“指向”
	
	二、多个引用一个指向
	String name; //姓名
    float hp; //血量
    public static void main(String[] args) {
         
        //使用一个引用来指向这个对象
        Hero h1 = new Hero();
        Hero h2 = h1;  //h2指向h1所指向的对象
        Hero h3 = h1;
        Hero h4 = h1;
        Hero h5 = h4;
         
        //h1,h2,h3,h4,h5 五个引用，都指向同一个对象
 * 
 * 三、一个引用，多个对象?
 * 		这种操作是不被允许的，也就是同一时间里，一个引用只能指向一个对象
 * 		finalDemo1 fd = new  finalDemo1();
		fd=new  newDemo1();
		
		当然还有这种操作，只是会导致第一行引用没有意义
		finalDemo1 fd = new  finalDemo1();
		fd=new  finalDemo1();
		
  四、 问题：
       h4所指向的对象和h2所指向的对象，是否是同一个对象？
public class Hero {
    public String name;
    protected float hp;
  
    public static void main(String[] args) {
           Hero h1 =  new Hero();
           Hero h2 =  new Hero();
           Hero h3;
           Hero h4;
           h3 = h1;
           h4 = h3;
    }
}		
 * 
 * */
public class newDemo1 {
	public static void main(String[] args) {
	
	}
}
