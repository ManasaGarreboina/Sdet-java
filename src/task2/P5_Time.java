package task2;

public class P5_Time {

	int seconds;
	int minutes;
	int hours;

	public P5_Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public static void main(String[] args) {

		// create objects of Time class

		P5_Time start = new P5_Time(3, 00, 15);
		P5_Time stop = new P5_Time(10, 30, 50);
		P5_Time diff;

		// call difference method
		diff = difference(start, stop);

		System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
		System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
		System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
	}

	public static P5_Time difference(P5_Time start, P5_Time stop) {
		P5_Time diff = new P5_Time(0, 0, 0);

		// if start second is greater
		// convert minute of stop into seconds
		// and add seconds to stop second
		if (start.seconds > stop.seconds) {
			--stop.minutes;
			stop.seconds += 60;
		}

		diff.seconds = stop.seconds - start.seconds;

		// if start minute is greater
		// convert stop hour into minutes
		// and add minutes to stop minutes
		if (start.minutes > stop.minutes) {
			--stop.hours;
			stop.minutes += 60;
		}

		diff.minutes = stop.minutes - start.minutes;
		diff.hours = stop.hours - start.hours;

		// return the difference time
		return (diff);
	}
}
