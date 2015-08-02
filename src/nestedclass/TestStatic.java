package nestedclass;

public class TestStatic {
	private class In {
	}

	public static void main(String[] args) {
		//静态成员（main方法）无法访问非静态成员
		//new In();
	}
}
