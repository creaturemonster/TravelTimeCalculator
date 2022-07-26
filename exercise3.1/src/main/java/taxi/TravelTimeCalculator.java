package taxi;

public class TravelTimeCalculator {
	int traffic=10; //extreme traffic conditions
	int speed=80;
	int distance=10;
	int result=60;
	
	// Calculate with miles, and miles/hour. Traffic index=0 means not traffic,
	// 10 means "parking lot"
	public int calculate(int distance, int speed, int trafficIndex) {
		int result= 60 * (distance / speed);
		return result;
	}
	
	public boolean getHighTraffic(int trafficIndex) {
		trafficIndex=this.traffic;
		if(trafficIndex == 10) {
			return true;
		}
		
		return false;
	}
	
	public boolean getHighWayScenario(int speed) {
		speed=this.speed;
		if(speed == 80) {
			return true;
		}
		return false;
	}
	
	public boolean getCityScenario(int speed) {
		if(speed < 80) {
			return true;
		}
		
		return false;
	}

}
