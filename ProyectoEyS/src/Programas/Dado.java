package programa;

public class Dado {
	private int cara;
	public Dado() {
		
	}
	public int getCara() {
		return cara;
	}
	public void setCara(int cara) {
		this.cara = cara;
	}
	public int tirar() {
		int val = (int) (Math.random() * 6)+1;
		setCara(val);
		return cara;	
	}
}
