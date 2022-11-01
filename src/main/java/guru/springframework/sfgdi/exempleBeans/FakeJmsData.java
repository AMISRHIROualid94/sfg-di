package guru.springframework.sfgdi.exempleBeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource("classpath:jmssource.properties")
public class FakeJmsData {

    @Value("${guru.jms.username}")
    private String jmsUsername;
    @Value("${guru.jms.password}")
    private String jmsPassword;

    @Value("${guru.jms.url}")
    private String jmsUrl;

    public String getJmsUsername() {
        return jmsUsername;
    }

    public void setJmsUsername(String jmsUsername) {
        this.jmsUsername = jmsUsername;
    }

    public String getJmsPassword() {
        return jmsPassword;
    }

    public void setJmsPassword(String jmsPassword) {
        this.jmsPassword = jmsPassword;
    }

    public String getJmsUrl() {
        return jmsUrl;
    }

    public void setJmsUrl(String jmsUrl) {
        this.jmsUrl = jmsUrl;
    }

    @Override
    public String toString() {
        return "FakeJmsData{" +
                "jmsUsername='" + jmsUsername + '\'' +
                ", jmsPassword='" + jmsPassword + '\'' +
                ", jmsUrl='" + jmsUrl + '\'' +
                '}';
    }
}
