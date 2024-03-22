package pkg;

public class Myint {

	public int result;
	public int nmbr1;
	public int nmbr2;
	
	public Myint (int nmbr1, int nmbr2) {
		this.nmbr1=nmbr1;
		this.nmbr2=nmbr2;
	}
	
	public String Division () {
		
		try {
				this.result = nmbr1/nmbr2;
				return ""+result;
				
		} catch(Exception e) {
			  return "Erreur : " + e.getMessage();
		}
		
	}
}