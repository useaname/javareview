package test;

/**
 * 简易验证email地址
 * 
 */
public class StringAPIDemo2 {
	public static void main(String[] args) {
		String email = "www@194.com";
		System.out.println(validata(email));
		;
	}

	static boolean validata(String email) {
		boolean flag = true;
		if (email.indexOf("@") == -1 || email.indexOf(".") == -1) {
			flag = false;
		}
		if (flag) {
			if (!(email.indexOf("@") < email.indexOf("."))) {
				flag = false;
			}
		}
		return flag;
	}
}
