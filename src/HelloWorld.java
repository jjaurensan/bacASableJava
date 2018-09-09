import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//affiche Hello world sur la console
		System.out.println("Hello World !");
//creation d'une instance scanner pour recupere le texte saisi dans la console
Scanner sc = new Scanner(System.in);
System.out.println("Veuillez saisir un mot :");
String str = sc.nextLine();
//affiche le contenu de la variable str
System.out.println("Vous avez saisi : " + str);
sc.close();

	}

}
