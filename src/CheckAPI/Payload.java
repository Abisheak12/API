package CheckAPI;

public class Payload {
	public static String createBooking()

	{
		return "{\r\n" + "   \"firstname\": \"Jim\",\r\n" + "   \"lastname\": \"Brown\",\r\n"
				+ "   \"totalprice\": 111,\r\n" + "   \"depositpaid\": true,\r\n" + "   \"bookingdates\": {\r\n"
				+ "      \"checkin\": \"2018-01-01\",\r\n" + "      \"checkout\": \"2019-01-01\"\r\n" + "   },\r\n"
				+ "   \"additionalneeds\": \"Breakfast\"\r\n" + "}";
	}

	public static String updateBooking() {
		return "{\r\n" + "    \"firstname\" : \"James\",\r\n" + "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n" + "    \"depositpaid\" : true,\r\n" + "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n" + "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n" + "    \"additionalneeds\" : \"Breakfast\"\r\n" + "}";
	}
}
