package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.exempleBeans.FakeData;
import guru.springframework.sfgdi.exempleBeans.FakeJmsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath:datasource.properties")
/*@PropertySources({
        @PropertySource("classpath:datasource.properties")
        @PropertySource("classpath:jmssource.properties")
})*/
public class PropertyConfig {

   /* @Autowired //Injection of Environment instance for getting configured property
    Environment environment;
    */

    @Autowired
    FakeJmsData fakeJmsData;

    @Value("${guru.username}")
    String username;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    @Bean
    public FakeData fakeData(){
        FakeData fakeData = new FakeData();
        //fakeData.setUsername(environment.getProperty("USERNAME")); // get the configured property
        fakeData.setUsername(username);
        fakeData.setPassword(password);
        fakeData.setUrl(url);
        return fakeData;
    }

}
