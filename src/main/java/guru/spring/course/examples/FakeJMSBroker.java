package guru.spring.course.examples;

/**
 * Created by Victor Wardi - @vwardi - on 03/09/2018.
 */
public class FakeJMSBroker {

    private String userJMS;
    private String passwordJMS;
    private String urlJMS;

    public FakeJMSBroker(String userJMS, String passwordJMS, String urlJMS) {
        this.userJMS = userJMS;
        this.passwordJMS = passwordJMS;
        this.urlJMS = urlJMS;
    }

    public String getUserJMS() {
        return userJMS;
    }

    public void setUserJMS(String userJMS) {
        this.userJMS = userJMS;
    }

    public String getPasswordJMS() {
        return passwordJMS;
    }

    public void setPasswordJMS(String passwordJMS) {
        this.passwordJMS = passwordJMS;
    }

    public String getUrlJMS() {
        return urlJMS;
    }

    public void setUrlJMS(String urlJMS) {
        this.urlJMS = urlJMS;
    }
}
