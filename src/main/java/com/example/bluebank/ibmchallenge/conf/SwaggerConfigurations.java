package com.example.bluebank.ibmchallenge.conf;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfigurations {

	@Bean
	public Docket centralErrosApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.bluebank.ibmchallenge"))
				.paths(PathSelectors.ant("/**")).build().useDefaultResponseMessages(true).apiInfo(metaInfo())
				.globalOperationParameters(
						Arrays.asList(new ParameterBuilder().name("Authorization").description("Header para Token JWT")
								.modelRef(new ModelRef("string")).parameterType("header").required(false).build()));

	}

	private ApiInfo metaInfo() {
		return new ApiInfoBuilder().title("Bluebank - REST API")
				.description("Projeto desenvolvido no programa Blue Academy oferecido pela GAMA com o apoio da IBM."
						+ " O objetivo desta API é ...")
				.version("1.0.0").license("Apache License Version 2.0")
				.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
				.contact(new Contact("Grupo 5 ", " https://github.com/marleiSilveira/bluebankibm", null)).build();
	}

}
