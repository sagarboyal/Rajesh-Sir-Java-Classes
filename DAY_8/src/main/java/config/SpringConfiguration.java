package config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hit.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "org.hit")
public class SpringConfiguration {
    @Bean
    public SessionFactory getSessionFactory(){
        Map<String,Object> settings = new HashMap<>();

        settings.put("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
        settings.put("hibernate.connection.url","jdbc:mysql://localhost:3306/hitbatch4");
        settings.put("hibernate.connection.username","batch4");
        settings.put("hibernate.connection.password","batch1234");

        settings.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
        settings.put("hibernate.format_sql","true");
        settings.put("hibernate.show_sql","true");
        settings.put("hibernate.hbm2ddl.auto","update");
        settings.put("hibernate.current_session_context_class","thread");
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(settings).build();
        Metadata metadata = new MetadataSources(serviceRegistry).addAnnotatedClass(Employee.class).getMetadataBuilder().build();
        return metadata.getSessionFactoryBuilder().build();
    }
}
