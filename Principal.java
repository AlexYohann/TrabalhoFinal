package trabFinal;
public class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Alex", 5f, 2f,1f);
		System.out.println("objeto aluno1: " + aluno1.toString());
		
		Aluno aluno2 = new Aluno("Daniel", 1f, 2f, 3f);
		System.out.println("objeto aluno2: " + aluno2.toString());
		
		Aluno aluno3 = new Aluno("Isa", 6f, 7f, 4f);
		System.out.println("objeto aluno3: " + aluno3.toString());
		
		System.out.println("Media aluno 1: " + aluno1.getMedia());
		System.out.println("Media aluno 2: " + aluno2.getMedia());
		System.out.println("Media aluno 3: " + aluno3.getMedia());
	}

}
