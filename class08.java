package java11;
interface iAaa
 {
 public void show();
 }
class Cbbb
 {
 public int num=10;

 public void set(int n)
 {
 num=n;
 }
 }
class Cccc extends Cbbb implements iAaa{
	public void show() {
		System.out.println("num="+num);
	}
	
}
public class class08 {

	public static void main(String[] args) {
		Cccc ans=new Cccc();
		ans.set(5);
		ans.show();
	}

}
