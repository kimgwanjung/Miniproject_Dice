package mini;
class Dice{
	private int face;
	void roll() {
		face =(int)(Math.random()*6)+1;
	}
	int getValue() {
		return face;
	}
	void setValue(int face) {
		this.face = face;
	}
}
public class Programming1 {
	public static void main(String[] args) {
		Dice D1 = new Dice();
		Dice D2 = new Dice();
		int cnt = 0;
		while(true) {
			cnt++;
			D1.roll();
			D2.roll();
			System.out.printf("�ֻ���1 = %d �ֻ���2 = %d\n",D1.getValue(),D2.getValue());
			if(D1.getValue()==1 && D2.getValue()==1) {
				System.out.println("(1,1)�� �����µ� �ɸ� Ƚ��= "+ cnt);
				break;
			}
		}
	}

}
