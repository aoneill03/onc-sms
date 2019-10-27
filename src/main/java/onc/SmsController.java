package onc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import onc.sms.SmsResponse;
import onc.sms.SmsService;

@RestController
public class SmsController {

	/**
	 * Send a Test SMS Message
	 * @param name
	 * @return sms send status
	 */
	@RequestMapping(value="/send", method=RequestMethod.GET)
	public SmsResponse getFamily(@RequestParam(value="msg", defaultValue="") String msg) {
		return new SmsResponse(SmsService.sendMessage(msg));
	}
}
