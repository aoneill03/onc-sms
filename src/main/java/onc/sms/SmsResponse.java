package onc.sms;

public class SmsResponse
{
    private String status;

    public SmsResponse(String _status) {
        this.status = _status;
    }

    public String getStatus() {
        return this.status;
    }
}