//package org.API_Rest.restAPI.doc;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.Arrays;
//import java.util.HashSet;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    private Contact contact(){
//        return new Contact(
//                "DANIEL",
//                "http://www.meusite.com.br",
//                "danielchipolesk@gmail.com"
//        );
//    }
//    private ApiInfoBuilder informacoesApi(){
//        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
//
//        apiInfoBuilder.title("TITLE - REST API");
//        apiInfoBuilder.description("API EXEMPLO DE USO DE SPRINGBOOT REST API");
//        apiInfoBuilder.version("1.0");
//        apiInfoBuilder.termsOfServiceUrl("TERMOS DE USO - OPEN SOURCE");
//        apiInfoBuilder.license("LICENÇA - SUA EMPRESA");
//        apiInfoBuilder.licenseUrl("http://www.meusite.com.br");
//        apiInfoBuilder.contact(this.contact());
//
//        return apiInfoBuilder;
//    }
//
//    @Bean
//    public Docket detalheApi(){
//        Docket docket = new Docket(DocumentationType.SWAGGER_2);
//
//        docket
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("org.API_Rest.restAPI.Controller"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(this.informacoesApi().build())
//                .consumes(new HashSet<String>(Arrays.asList("application/json")))
//                .produces(new HashSet<String>(Arrays.asList("application/json")));
//
//        return docket;
//
//    }
//
//
//}
