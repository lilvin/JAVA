package com.Sms;
import org.json.*;
import org.*;
import java.util.HashMap;



/* Make sure the downloaded jar file is in the classpath or has been added to
   referenced libraries if you are using an SDK like eclipse or netbeans*/

    public class TestSending

    {
        public static void main(String[] args_)
        {
            // Specify your login credentials
            String username = "lilianKirito";
            String apiKey   = "a28cd60716ecc51d928b7827e4e25ee2284aa153f16ef657cde5165c7e36d0b2";
            // Specify the numbers that you want to send to in a comma-separated list
            // Please ensure you include the country code (+254 for Kenya in this case)
            String recipients = "+254705895190,+254712940267";
            // And of course we want our recipients to know what we really do
            String message = "Hey there bby...its me.just testing my code." +
                    "today this is what i have been doing in the afternoon";
            // Create a new instance of our awesome gateway class
            AfricasTalkingGateway gateway  = new AfricasTalkingGateway(username, apiKey);
            /*************************************************************************************
             NOTE: If connecting to the sandbox:
             1. Use "sandbox" as the username
             2. Use the apiKey generated from your sandbox application
             https://account.africastalking.com/apps/sandbox/settings/key
             3. Add the "sandbox" flag to the constructor
             AfricasTalkingGateway gateway = new AfricasTalkingGateway(username, apiKey, "sandbox");
             **************************************************************************************/
            // Thats it, hit send and we'll take care of the rest. Any errors will
            // be captured in the Exception class below
            try {
                JSONArray results = gateway.sendMessage(recipients, message);
                for( int i = 0; i < results.length(); ++i ) {
                    JSONObject result = results.getJSONObject(i);
                    System.out.print(result.getString("status") + ","); // status is either "Success" or "error message"
                    System.out.print(result.getString("statusCode") + ",");
                    System.out.print(result.getString("number") + ",");
                    System.out.print(result.getString("messageId") + ",");
                    System.out.println(result.getString("cost"));
                }
            } catch (Exception e) {
                System.out.println("Encountered an error while sending " + e.getMessage());
            }
        }
    }


