package test;

/**
 * Created by Administrator on 2017/8/21 0021.
 */
public class TestDemo {
	public static void main(String[] args) {
		int x=0;
		int y=x+1;
		int sim=++x+y;
		System.out.println(sim);
		print();
	}
	public static  void print(){
		System.out.println("test push");
	}
}
