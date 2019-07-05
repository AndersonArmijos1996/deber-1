public class Nprimos{
	private int n;
	public Nprimos(int n){
		this . n = n;
	}
	public String numerosPrimos(){
		int cont2 = 0;
		for(int cont1 = 1; cont1<= n; cont1++){
			if ((n % cont1)==0){
				cont2++;   
			}
		}
		if(cont2 == 2)
			return(" es perimo");
		else
			return(" no es perimo");
     
	}
 
}