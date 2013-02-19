package org.amm.dp.budai.structural.fasade;

public class HotelBookingSystem {

	public int BookRoom(int roomQuality) {
		switch (roomQuality) {
		case 3:
			return 250;
		case 4:
			return 500;
		case 5:
			return 900;
		default:
			throw new IllegalArgumentException(
					"roomQuality should be in range [3;5]");
		}
	}
}