package edu.yaksha.starPerformer;

public class Agent {
	private String name;
	private Long generatedFund;
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Agent(String name, Long generatedFund) {
		super();
		this.name = name;
		this.generatedFund = generatedFund;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getGeneratedFund() {
		return generatedFund;
	}
	public void setGeneratedFund(Long generatedFund) {
		this.generatedFund = generatedFund;
	}
	

}
