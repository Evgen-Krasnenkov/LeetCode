package com.questions;

import io.vavr.control.Either;
import io.vavr.control.Option;
import io.vavr.control.Try;

import java.util.Optional;
import java.util.function.Function;


public class Monads {
    public void option() {
        Option<String> optionString = Option.ofOptional(producer());
        optionString
                .orElse(Option.of("Default"))
                .peek(v -> System.out.println("Value: " + v))
                .onEmpty(() -> {
                            throw new RuntimeException("No value present");
                        }
                );
    }

    private Optional<String> producer() {
        return Optional.ofNullable(Math.random() < 0.5 ? "Hello" : null);
    }

    public void either() {
        Either<String, JavaVersion> javaVersions = producerEither();
        String resultVersion = javaVersions
                .peekLeft(unknownJavaVersion -> System.out.println("Unknown Java version: " + unknownJavaVersion))
                .fold(
                        Function.identity(),
                        JavaVersion::getVersion
                );
    }

    private Either<String, JavaVersion> producerEither() {
        return Math.random() < 0.5 ? Either.right(JavaVersion.JAVA_8) : Either.left("Error");
    }

    public void tryMonad() {
        Try<String> strings = Try.ofSupplier(this::producerTry);
        strings
                .recover(t -> {
                    System.out.println("Error occurred: " + t.getMessage());
                    return "Default value";
                })
                .get();

    }

    private String producerTry() {
        if (Math.random() < 0.5) {
            throw new RuntimeException("Error occurred");
        }
        return "Success";
    }

    private enum JavaVersion {
        JAVA_8("Java 8"),
        JAVA_11("Java 11"),
        JAVA_17("Java 17");

        private final String version;

        JavaVersion(String version) {
            this.version = version;
        }

        public String getVersion() {
            return version;
        }
    }
}
