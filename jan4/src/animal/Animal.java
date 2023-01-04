package animal;
//추상 클래스(p329)
public abstract class Animal {
	protected int age;
	protected String name;
	//추상 메소드
	public abstract void sound();//바디가 없어요.
	public abstract void add();//강제
	
	public void thehagi() {
		
	}
	
	public void eat() {
		System.out.println("먹이를 먹습니다.");
	}
}