public class Tabuadas {

	public static void main(String[] args) {
		
		for (int i=1;i<=9;i++){
		System.out.println();
		System.out.println( "A tabela do "+i+" é:");
		System.out.println( "----------------");
		
		for (int j=1;j<=10;j++){ 
		int resultado=i*j;
		System.out.println(i +" X " +j+ " = "+ resultado);
		            
			}
		}
	}
}