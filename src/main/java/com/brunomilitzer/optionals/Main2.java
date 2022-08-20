package com.brunomilitzer.optionals;

import java.util.Optional;

public class Main2 {

    public static void main( String[] args ) {
        Person person = new Person( "Vanessa", "vanessa@gmail.com" );
        String email = person.getEmail().map( String::toUpperCase ).orElse( "email not provided" );

        System.out.println(email);

        if (person.getEmail().isPresent()) {
            String email2 = person.getEmail().get();
            System.out.println(email2.toUpperCase());
        } else {
            System.out.println("email2 not provided");
        }
    }
}

class Person {
    private final String name;
    private final String email;

    public Person( String name, String email ) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable( email );
    }

}
