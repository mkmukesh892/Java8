package com.java8.datatime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIDExample {
public static void main(String[] args) {
	ZoneId id = ZoneId.systemDefault();
	System.out.println(id);
	System.out.println(ZoneId.getAvailableZoneIds());
	ZoneId id2 = ZoneId.of("America/Cuiaba");
	System.out.println(id2);
	ZonedDateTime dt = ZonedDateTime.now(id2);
	System.out.println(dt);
}

}
