package CheckAPI;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class createBooking {
	public static void main(String args[]) {

		/* CreateBooking */
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		String Response = given().log().all().header("Content-Type", "application/json")
				.header("Accept", "application/json").body(Payload.createBooking()).when().post("/booking").then().log()
				.all().assertThat().statusCode(200).extract().response().asString();
		JsonPath js = new JsonPath(Response);
		String bid = js.getString("bookingid");
		System.out.println(bid);

		/* getBooking */
		given().log().all().header("Content-Type", "application/json").when().get("/booking/" + bid + "").then().log()
				.all().statusCode(200);

		/* updateBooking */
		given().log().all().header("Content-Type", "application/json").body(Payload.updateBooking()).when()
				.put("/booking/" + bid + "").then().log().all().statusCode(200);

		/* deleteBooking */
		given().log().all().header("Content-Type", "application/json").when().delete("/booking/" + bid + "").then()
				.statusCode(201);

	}
}
