package 接口练习;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Army a=new Army(4);
		a.addWeapon(new Tank());
		a.addWeapon(new Flighter());
		a.addWeapon(new Warship());
		a.addWeapon(new Warship());
		a.moveAll();
		a.attackAll();
	}
}
