import java.util.Scanner;


public class Lab2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		WeatherReading current = new WeatherReading();
		
		System.out.print("Enter current temperature (deg. F): ");
		current.setCurrentTemp(input.nextDouble());
		
		System.out.print("Enter current wind speed (mph): ");
		current.setCurrentWindSpeed(input.nextDouble());
		
		System.out.printf("Temp = %.1f, Wind = %.1f, Wind Chill = %.1f\n", current.getCurrentTemp(), current.getCurrentWindSpeed(), current.windChill());
	}
}
