
package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

public class InclusaoRestauranteMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
        Restaurante restaurante1 = new Restaurante();
        restaurante1.setNome("Daniels Bar");
        restaurante1.setTaxaFrete(new BigDecimal(14.3));

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setNome("Verace");
        restaurante2.setTaxaFrete(new BigDecimal(7.75));

        restaurante1 = restauranteRepository.save(restaurante1);
        restaurante2 = restauranteRepository.save(restaurante2);

        System.out.printf("%d - %s\n",restaurante1.getId(), restaurante1.getNome());
        System.out.printf("%d - %s\n",restaurante2.getId(), restaurante2.getNome());
    }
}
