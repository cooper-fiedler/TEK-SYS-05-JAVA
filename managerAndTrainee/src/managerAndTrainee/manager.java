package managerAndTrainee;

public class manager extends employee {
	protected static double getBasicSalary() {
		return basicSalary;
	}

	protected void setBasicSalary(double basicSalary) {
		manager.basicSalary = basicSalary;
	}

	@Override
	public double calculateTransportAllowance() {
		double transportAllowance = 15 * basicSalary / 100;
		return transportAllowance;
	}
}
