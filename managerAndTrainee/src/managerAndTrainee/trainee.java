package managerAndTrainee;

public class trainee extends employee {
	protected static double getBasicSalary() {
		return basicSalary;
	}

	protected void setBasicSalary(double basicSalary) {
		trainee.basicSalary = basicSalary;
	}

	@Override
	public double calculateTransportAllowance() {
		double transportAllowance = 10 * basicSalary / 100;
		return transportAllowance;
	}
}
