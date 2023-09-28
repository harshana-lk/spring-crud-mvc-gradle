package lk.ijse.gdse.spring_crud.config;

import lk.ijse.gdse.spring_crud.AppInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = AppInitializer.class)
public class WebRootConfig {
}
