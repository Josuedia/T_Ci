import java.util.Scanner;
class aifon{
	public static void main (String[] args){
		//INPUT
		boolean pregunta;
		Scanner scanner;
		scanner	= new Scanner(System.in);
		String mensaje = "";
		
		//PROCESS
		System.out.println("tenei aifon?");
		pregunta = scanner.nextBoolean();
		if (pregunta == true){
			mensaje = "No erei pobre.";
		} else if (pregunta == false) {
			mensaje = "tu ere pobre tu no tiene aifon";
		}
		//OUTPUT
		System.out.println(mensaje);
		
	}
}