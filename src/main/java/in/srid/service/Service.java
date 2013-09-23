package in.srid.service;

import java.util.Random;

import org.springframework.stereotype.Component;

import in.srid.model.Detail;

@Component
public class Service {

    public Detail getDetail() {
        return new Detail( "Sridhar" , 29 , new Random().nextInt() );
    }
}
