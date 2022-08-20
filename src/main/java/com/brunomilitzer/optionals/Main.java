package com.brunomilitzer.optionals;

import java.util.Optional;

public class Main {

    public static void main( String[] args ) {

        Optional<String> empty = Optional.empty();

        //System.out.println( empty.isPresent() );
        //System.out.println( empty.isEmpty() );

        Optional<String> hello = Optional.ofNullable( null );

        //System.out.println( hello.isPresent() );
        //System.out.println( hello.isEmpty() );

        hello.ifPresent( System.out::println );
        hello.ifPresentOrElse( word -> {
            System.out.println(word);
        }, () -> System.out.println("World") );

        String orElseThrow = hello.map( String::toUpperCase ).orElseThrow( IllegalStateException::new );

        String orElse = hello.map( String::toUpperCase )
                .orElse( "World" );


        String orElseGet = hello.map( String::toUpperCase )
                .orElseGet( () -> {
                    // ... extra computation to retrieve the value
                    return "world";
                } );

        /*System.out.println( orElse );
        System.out.println( orElseGet );*/
    }

}
