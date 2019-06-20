import java.math.BigDecimal;

public class Employee {
	private int id;
	private String name;
	private BigDecimal salary;
	private String companyName;
	public String printReport() {
		return "Date is "+Formatting.dateFormat()+"\nId "+id+ "Name "+name+"\n"+
				"Basic Salary "+Formatting.currencyFormat(salary)+"\n"+
				"HRA "+Formatting.currencyFormat(hra())+"\n"+
				"DA "+Formatting.currencyFormat(da())+"\n"+
				"GS "+Formatting.currencyFormat(gs());
	}
	private BigDecimal gs() {
		return salary.add(hra()).add(da());
	}
	private BigDecimal hra() {
		BigDecimal hraValue = new BigDecimal("0.30");
		return salary.multiply(hraValue);
	}
	private BigDecimal da() {
		BigDecimal daValue = new BigDecimal("0.20");
		return salary.multiply(daValue);
	}
	Employee(){
		companyName= "Brain Mentors";
	}
	public Employee(int id, String name, BigDecimal salary) {
		this();
		this.id = id;
		this.name = StringUtil.titleCase(name);
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getId() {
		return id;
	}
	

}
