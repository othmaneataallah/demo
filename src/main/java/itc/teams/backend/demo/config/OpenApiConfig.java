package itc.teams.backend.demo.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = 

@Info(contact = 
@Contact(name = "Maria", email = "", url = ""),
          description = "My App Description", 
          title = "ITC Management App", 
          version = "1.0", 
          termsOfService = "Terms of service"), 
          
          servers = {
        @Server
        (description = "Local ENV", url = "localhost:8090"),

        @Server
        (description = "PROD ENV", url = "")
}, 

    security = {
        @SecurityRequirement(name = "bearerAuth")
})


public class OpenApiConfig {
}
