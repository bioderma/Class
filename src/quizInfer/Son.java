package quizInfer;

class Son extends Parent{
	String name;
	int age;
	public String jobName;
	public Son(String name, int age) {
		super("미국Ja");
		this.name = name;
		this.age = age;
		this.jobName = "프로그래머";
	}
	@Override
	public void doJob() {
		System.out.println("Son 의 직업은 " + this.jobName);
	}
}
