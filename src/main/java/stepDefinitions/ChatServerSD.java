package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class ChatServerSD {

    @Given("Add User Payload for is created with below data")
    public void add_user_payload_for_is_created_with_below_data(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<List<String>> data = dataTable.asLists();
        System.out.println("username="+data.get(0).get(0));
        System.out.println("password="+data.get(0).get(1));
        System.out.println("name="+data.get(0).get(2));
        System.out.println("surname="+data.get(0).get(3));
        System.out.println("email="+data.get(0).get(4));
        System.out.println("nick name="+data.get(0).get(5));

    }
    @When("user calls {string} with {string} http request")
    public void user_calls_with_http_request(String request, String method) {

        System.out.println("Request="+request);
        System.out.println("Method="+method);
    }
    @Then("the API call got success with status code {string}")
    public void the_api_call_got_success_with_status_code(String statusCode) {
        System.out.println("statusCode="+statusCode);
    }



  /*  @Given("Add User Payload for is created with (.+) and (.+)")
    public void addUserPayloadForIsCreatedWithNameAndJob(String name,String job) {
    }*/
}
