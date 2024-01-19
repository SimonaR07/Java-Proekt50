import mmm.Broj;
import mmm.Scanner;

public class Zbir {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println(" Vnesi vrednost za'a':");
        int a = scanner.nextInt();

        System.out.println(" Vnesi vrednost za 'b':");
        int b = scanner.nextInt();

        Broj broj = new Broj();
        broj.seta(a);
        broj.setb(b);
        
		int c;
		c=broj.geta() + broj.getb();
		System.out.println(c);
	}

}
