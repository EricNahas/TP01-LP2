class Teste {
	public static void main(String[] args) {
		Student teste1 = new Student("Eric", "Rua ABC", "XYZ", 20, 3.0);
		Staff teste2 = new Staff("Alexandre", "Rua DEF", "Escola GHI", 2100);

		System.out.println(teste1.toString());
		System.out.println(teste2.toString());
	}
}