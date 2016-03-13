public class ArrowDistanceAndHeight {
	public static void main (String args[]) {
		final double gravityConstant = 9.8D;
		
		//Properties of the arrow
		final double mass = 0.06D;
		final double velocity = 60D;
		final double angleDegree = 45D;
		double angleRadians = toRadians(angleDegree);
		
		//Calculate maximum height
		double velocityY = Math.sin(angleRadians) * velocity;
		double timeH = velocityY / gravityConstant;
		double maximumHeight = 0.5 * gravityConstant * Math.pow(timeH, 2);
		
		//Calculate distance traveled
		double velocityX = Math.cos(angleRadians) * velocity;
		double timeD = 2*timeH;
		double distance = velocityX * timeD;
		
		//Energy
		double startingKineticEnergy = 0.5 * mass * Math.pow(velocity, 2);
		double maximumPotentialEnergy = mass * gravityConstant * maximumHeight;
		
		//Print info
		System.out.println("Mass of the arrow: " + mass);
		System.out.println("Enter velocity of the arrow: " + velocity);
		System.out.println("Angle of shooting in degrees: " + angleDegree);
		
		System.out.println();
		
		System.out.println("Maximum height: " + maximumHeight);
		System.out.println("Distance travelled: " + distance);
		System.out.println("Time: " + timeD);
		
		System.out.println();
		
		System.out.println("Starting kinetic energy: " + startingKineticEnergy);
		System.out.println("Maximum potential energy: " + maximumPotentialEnergy);
	}
	
	public static double toRadians(double d) {
		return d * (Math.PI / 180);
	}
	
	public static double toDegrees(double d) {
		return d * (180 / Math.PI);
	}
}
