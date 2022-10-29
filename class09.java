package java11;

interface Math
{
public void show();
public void add(int a, int b); // 計算 a+b
public void sub(int a, int b); // 計算 a-b
public void mul(int a, int b); // 計算 a*b
public void div(int a, int b); // 計算 a/b
}
interface AdvancedMath
 {
 public void mod(int a, int b); // 計算 a%b
 public void fac(int a); // 計算 a!
 public void pow(int a, int b); // 計算ab
 }
class Compute implements Math,AdvancedMath
{
public int ans;
public void add(int a, int b) {
	 ans=a+b;
}
public void sub(int a, int b) {
	 ans=a-b;
}
public void mul(int a, int b) {
	 ans=a*b;
}
public void div(int a, int b) {
	 ans=a/b;
}

public void mod(int a,int b)
 {
 ans=a%b;
 }
 public void fac(int a)
 {
 ans=1;
 for(int i=1;i<=a;i++)
 ans*=i;
 }
 public void pow(int a,int b)
 {
 ans=1;
 for(int i=1;i<=b;i++)
 ans*=a;
 }
 public void show()
 {
 System.out.println("ans="+ans);
 }}
public class class09
{
public static void main(String args[])
{
Compute cmp=new Compute();
cmp.mul(3,5);
cmp.show();
cmp.mod(14,5);
cmp.show();
cmp.fac(5);
cmp.show();
}
}