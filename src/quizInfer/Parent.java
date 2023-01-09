package quizInfer;

	class Parent {

	
	private String familyname;
	private String jobName;
	
	
	//변수에 담지않고 그대로  같은 이름을 쓰기위해서 생성자만듬
	
	public Parent(String familyname) { //생성자를 
		this.familyname = familyname;
		this.jobName = "내 직업은 택시운전사입니다.";
	}
	public void doJob(){
		System.out.println(jobName);
	}
	 
	 

	
}
