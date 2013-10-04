
public class WeatherReading {
	public double currentTemp = 0;
	public double currentWindSpeed = 0;
	public double windChill = 0;
	
	public double getCurrentTemp(){
		return currentTemp;
	}
	
	public void setCurrentTemp(double temp){
		currentTemp = temp;
	}
	
	public double getCurrentWindSpeed(){
		return currentWindSpeed;
	}
	
	public void setCurrentWindSpeed(double windSpeed){
		if(windSpeed >= 0){
		currentWindSpeed = windSpeed;
		}else{
			System.out.println("wind speed cannot be negative.");
		}
	}
	
	public double windChill(){
		double windSpeedToPower = Math.pow(currentWindSpeed, 0.16);
		windChill = (35.74 + (0.6215*currentTemp - 35.75*windSpeedToPower)) +  (0.4275*currentTemp*windSpeedToPower) ;

		
		return windChill;
	}
	
}
