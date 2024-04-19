package com.learnreactiveprogramming.service;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;


class FluxAndMonoGeneratorServiceTest {

    FluxAndMonoGeneratorService fluxAndMonoGeneratorService = new FluxAndMonoGeneratorService();

    @Test
    public void namesFlux() {
        //given

        //when
        var namesFlux = fluxAndMonoGeneratorService.namesFlex();

        //then
        StepVerifier
                .create(namesFlux)
                //.expectNext("Anand", "Neha", "Aadhya")
                .expectNextCount(3)
                .verifyComplete();
    }

    @Test
    public void namesFluxMap() {
        //given

        //when
        var namesFlux = fluxAndMonoGeneratorService.namesFluxMap();

        //then
        StepVerifier
                .create(namesFlux)
                .expectNext("ANAND", "NEHA", "AADHYA")
                //.expectNextCount(3)
                .verifyComplete();
    }

}