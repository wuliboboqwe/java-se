package com.wulibobo;
/*
 * ��Ҫ������ú�ָ��
 * what is ���ã�
 * 		���һ���������������Ͳ��ǻ������ͣ����������ͣ���ô�ñ����ͽ�����!
 * 
 * һ�����ú�ָ��
 * 	new  Hero()		
 *  ��������һ��Hero����
	����Ҳ�����Ǵ�����һ������û�а취������
	Ϊ�˷���������󣬻�ʹ�������������������
	
	Hero h = new Hero();
	
	h���������Hero���ͣ��ֽ�������
	=����˼ָ��h������ô����Ҳഴ���Ķ���
	������ �����������ֽ�����ָ��
	
	�����������һ��ָ��
	String name; //����
    float hp; //Ѫ��
    public static void main(String[] args) {
         
        //ʹ��һ��������ָ���������
        Hero h1 = new Hero();
        Hero h2 = h1;  //h2ָ��h1��ָ��Ķ���
        Hero h3 = h1;
        Hero h4 = h1;
        Hero h5 = h4;
         
        //h1,h2,h3,h4,h5 ������ã���ָ��ͬһ������
 * 
 * ����һ�����ã��������?
 * 		���ֲ����ǲ�������ģ�Ҳ����ͬһʱ���һ������ֻ��ָ��һ������
 * 		finalDemo1 fd = new  finalDemo1();
		fd=new  newDemo1();
		
		��Ȼ�������ֲ�����ֻ�ǻᵼ�µ�һ������û������
		finalDemo1 fd = new  finalDemo1();
		fd=new  finalDemo1();
		
  �ġ� ���⣺
       h4��ָ��Ķ����h2��ָ��Ķ����Ƿ���ͬһ������
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
