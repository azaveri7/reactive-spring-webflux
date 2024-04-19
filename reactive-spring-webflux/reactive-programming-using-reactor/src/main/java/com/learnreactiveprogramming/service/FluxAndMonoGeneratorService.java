package com.learnreactiveprogramming.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class FluxAndMonoGeneratorService {

    public Flux<String> namesFlex() {
        Flux<String> stringFlux =
                Flux.fromIterable(Arrays.asList("Anand", "Neha", "Aadhya"))
                        .log();
        return stringFlux;
    }

    public Flux<String> namesFluxMap() {
        Flux<String> stringFlux =
                Flux.fromIterable(Arrays.asList("Anand", "Neha", "Aadhya"))
                        //.map(s -> s.toUpperCase())
                        .map(String::toUpperCase)
                        .log();
        return stringFlux;
    }

    public Mono<String> nameMono() {
        Mono<String> stringMono =
                Mono.just("anand").log();
        return stringMono;
    }

    public static void main(String[] args) {
        FluxAndMonoGeneratorService fluxAndMonoGeneratorService = new FluxAndMonoGeneratorService();
        fluxAndMonoGeneratorService.namesFlex()
                .subscribe(name -> System.out.println("flux name is " + name));
        fluxAndMonoGeneratorService.nameMono()
                .subscribe(name -> System.out.println("mono name is " + name));
    }
}
