package com.questions;

import io.vavr.control.Option;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MonadsTest {

    @Test
    public void testOptionWithValueFromProducer() {
        Monads monads = new Monads() {
            private Optional<String> producer() {
                return Optional.of("Test Value");
            }

            @Override
            public void option() {
                Option<String> optionString = Option.ofOptional(producer());
                optionString
                        .orElse(Option.of("Default"))
                        .peek(v -> System.out.println("Value: " + v))
                        .onEmpty(() -> {
                            throw new RuntimeException("No value present");
                        });
            }
        };

        assertDoesNotThrow(monads::option);
    }

    @Test
    public void testOptionWithDefaultValue() {
        Monads monads = new Monads() {
            private Optional<String> producer() {
                return Optional.empty();
            }

            @Override
            public void option() {
                Option<String> optionString = Option.ofOptional(producer());
                optionString
                        .orElse(Option.of("Default"))
                        .peek(v -> System.out.println("Value: " + v))
                        .onEmpty(() -> {
                            throw new RuntimeException("No value present");
                        });
            }
        };

        assertDoesNotThrow(monads::option);
    }

    @Test
    public void testOptionThrowsExceptionWhenEmpty() {
        Monads monads = new Monads() {
            private Optional<String> producer() {
                return Optional.ofNullable(null);
            }

            @Override
            public void option() {
                Option<String> optionString = Option.ofOptional(producer());
                optionString
                        .orElse(Option.none())
                        .peek(v -> System.out.println("Value: " + v))
                        .onEmpty(() -> {
                            throw new RuntimeException("No value present");
                        });
            }
        };

        assertThrows(RuntimeException.class, monads::option);
    }
}