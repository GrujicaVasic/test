package is.nutritivna_zona;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NutritivnaZonaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NutritivnaZonaApplication.class, args);
        //System.out.println("VERZIJA SPRINGA: " + SpringVersion.getVersion());
        //Spring Framework 6.2.3 ships with 60 fixes and documentation improvements.
        //This version will be shipped next week with Spring Boot 3.4.3 and 3.5.0-M2.
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setAmbiguityIgnored(true);
        return mapper;
    }
}
