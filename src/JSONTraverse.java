import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class JSONTraverse {

    public static void main(String[] args) {

        String response = "{\n" +
                "    \"id\": 1024,\n" +
                "    \"name\": \"Arjun Mehta\",\n" +
                "    \"isActive\": true,\n" +
                "    \"rating\": 4.7,\n" +
                "    \"email\": null,\n" +
                "    \"tags\": [\n" +
                "        \"premium\",\n" +
                "        \"beta-user\",\n" +
                "        \"north-region\"\n" +
                "    ],\n" +
                "    \"address\": {\n" +
                "        \"street\": \"42 MG Road\",\n" +
                "        \"city\": \"Gurgaon\",\n" +
                "        \"state\": \"Haryana\",\n" +
                "        \"postalCode\": \"122002\",\n" +
                "        \"coordinates\": {\n" +
                "            \"lat\": 28.4595,\n" +
                "            \"lng\": 77.0266\n" +
                "        }\n" +
                "    },\n" +
                "    \"orders\": [\n" +
                "        {\n" +
                "            \"orderId\": \"ORD-001\",\n" +
                "            \"amount\": 2599.99,\n" +
                "            \"currency\": \"INR\",\n" +
                "            \"items\": [\n" +
                "                {\n" +
                "                    \"productId\": \"P100\",\n" +
                "                    \"quantity\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"productId\": \"P200\",\n" +
                "                    \"quantity\": 1\n" +
                "                }\n" +
                "            ],\n" +
                "            \"delivered\": false\n" +
                "        },\n" +
                "        {\n" +
                "            \"orderId\": \"ORD-002\",\n" +
                "            \"amount\": 499.5,\n" +
                "            \"currency\": \"INR\",\n" +
                "            \"items\": [],\n" +
                "            \"delivered\": true\n" +
                "        }\n" +
                "    ],\n" +
                "    \"preferences\": {\n" +
                "        \"notifications\": {\n" +
                "            \"email\": true,\n" +
                "            \"sms\": false,\n" +
                "            \"push\": true\n" +
                "        },\n" +
                "        \"theme\": \"dark\"\n" +
                "    },\n" +
                "    \"lastLogin\": \"2026-03-25T15:30:00Z\"\n" +
                "}";

        JsonPath jsonPath = new JsonPath(response);

        // Validate ID is Integer
        Object id = jsonPath.get("id");
        Assert.assertTrue(id instanceof Integer,
                "ID should be Integer");

        System.out.println("ID Validation Passed. ID = " + id);

        // Calculate total quantity
        int totalQuantity = 0;

        List<Map<String, Object>> orders = jsonPath.getList("orders");

        for (Map<String, Object> order : orders) {

            List<Map<String, Object>> items =
                    (List<Map<String, Object>>) order.get("items");

            for (Map<String, Object> item : items) {
                totalQuantity += (Integer) item.get("quantity");
            }
        }

        // Validate total quantity
        Assert.assertEquals(totalQuantity, 3,
                "Total quantity mismatch");

        System.out.println("Total Quantity = " + totalQuantity);
        System.out.println("Quantity Validation Passed");

        System.out.println("All Validations Passed Successfully!");
    }
}