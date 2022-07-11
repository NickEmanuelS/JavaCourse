import java.util.Scanner;

public class RentExc {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int N;
		
		Rent[] v = new Rent[10];
		System.out.print("How many rooms will be rented? ");
		N = kb.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println("\nRent #" + (i+1) + ":");
			System.out.print("Name: ");
			kb.nextLine();
			String name = kb.nextLine();
			
			System.out.print("Email: ");
			String email = kb.nextLine();
			
			System.out.print("Room: ");
			int room = kb.nextInt();
			
			v[room] = new Rent(name, email); 
		}
		
		System.out.println("\nBusy rooms:");
		for (int i = 0; i < v.length; i++) {
			if (v[i] != null)
				System.out.println(i + ": " + v[i]);
		}
		
		kb.close();
	}

}

class Rent	{
	
	private String name;
	private String email;
	
	public Rent() {
		
	}

	public Rent(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return name + ", " + email;
	}
}
