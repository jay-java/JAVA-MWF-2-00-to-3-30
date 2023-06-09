package OOPS;
//abstraction -> hiding internal details and showing only essential
//			    information to user
abstract class RBI{
	abstract public void interest();
	abstract public void HL();
	public static void repoRate() {
		System.out.println("repo rate : +-4%");
	}
}
class SBI extends RBI{
	public void interest() {
		System.out.println("sbi interest : 5%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("sbi hL : 7%");
	}
}
class JAVA extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("java interest : 6%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("java homeloan : 8%");
	}
	
}
public class AbstractionDemo {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.HL();
		s.repoRate();
		JAVA j = new JAVA();
		j.interest();
		j.HL();
		SBI.repoRate();
		JAVA.repoRate();
	}
}
