package guru.spring.course.examples;


/**
 * Created by Victor Wardi - @vwardi - on 03/09/2018.
 */
public class FakeDataSource {

    private String user;
    private String password;
    private String url;

    public FakeDataSource() {
    }

    public FakeDataSource(String user, String password, String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
