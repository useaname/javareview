package enum_keywords;

public enum Gender2 {
	MALE, FEMALE;
	private String name;

	public void setName(String name) {
		switch(this){
			case MALE:
				if(name.equals("��")){
					this.name = name ;
				}else{
					System.out.println("��������");
					return;
				}
				break;
		}
	}
}
