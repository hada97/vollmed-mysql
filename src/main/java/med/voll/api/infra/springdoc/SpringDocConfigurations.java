package med.voll.api.infra.springdoc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringDocConfigurations {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key", new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")))
                        .info(new Info()
                        .title( "API Vollmed")
                        .version("v1")
                        .description(
                                "**Login Obrigatório**\n\n"+
                                        "    \"login\": \"admin@voll.med\",\n" +
                                        "    \"senha\": \"admin\"\n\n" +
                                        "[GitHub](https://github.com/hada97/spring-boot-api-rest)\n\n"
                        ));
    }
}