public class main2 {
	public static void main(String[] args) {
		CustomList<String> aa = new CustomList(10);
		aa.add("eee");
		aa.add("hhh");
		aa.set(1, "yyy");
		aa.print();
	}
}

