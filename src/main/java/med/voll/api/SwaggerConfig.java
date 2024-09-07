package med.voll.api;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SwaggerConfig {

    @Bean
    @Primary
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title( "API Vollmed em Produção")
                        .version("v1")
                        .description("API Rest desenvolvida por A. Guimaraes" +
                                "LOGIN OBRIGATORIO")
                );
    }
}
