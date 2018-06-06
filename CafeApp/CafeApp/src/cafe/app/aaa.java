package cafe.app;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class aaa {

	public static void main(String[] args) {

		 LocalDateTime a = LocalDateTime.now();
	        System.out.println(Duration.between(a, LocalDateTime.now()).toMinutes());
	}

}
