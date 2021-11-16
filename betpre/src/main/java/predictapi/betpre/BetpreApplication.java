package predictapi.betpre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BetpreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BetpreApplication.class, args);
    }
    /*
    @Bean
	public FilterRegistrationBean simpleCorsFilter() {
		UrlBasedCorsConfigurationSource source= new UrlBasedCorsConfigurationSource();
		CorsConfiguration config= new CorsConfiguration ();
		config.setAllowCredentials(true);
		config.setAllowedOrigins(Collections.singletonList("http://localhost:8080"));
		config.setAllowedOrigins(Collections.singletonList("*"));
		config.setAllowedOrigins(Collections.singletonList("*"));
		source.registerCorsConfiguration("/**", config);
		FilterRegistrationBean bean= new FilterRegistrationBean<>(new CorsFilter(source));
		bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
		
		return bean;

}*/
}
