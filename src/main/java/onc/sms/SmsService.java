package onc.sms;

import com.twilio.exception.TwilioException;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import onc.config.ConfigManager;

public class SmsService
{
    public static String sendMessage(
        String message) {
        try {
            Message.creator(
                new PhoneNumber(ConfigManager.getInstance().getProperty("ANDREWS_NUMBER")),
                new PhoneNumber(ConfigManager.getInstance().getProperty("PHONE_NUMBER")), 
                message
            ).create();

            return "Worked!";
        } 
        catch (TwilioException e) {
            e.printStackTrace();

            return "Error: " + e.getMessage();
        }
    }
}