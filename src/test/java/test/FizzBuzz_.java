package test;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_ {
    FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_fizz_when_it_is_multiple_of_three() {
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.of(6)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_number_when_it_is_not_fizz_and_not_buzz() {
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    public void should_return_buzz_when_it_is_multiple_of_five() {
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.of(10)).isEqualTo("Buzz");
    }

    private class FizzBuzz {
        public String of(int number) {
            return isMultipleOfFive(number) ? isMultipleOfThree(number) ? String.valueOf(number) : "Fizz" : "Buzz";
        }

        private boolean isMultipleOfFive(int number) {
            return number % 5 != 0;
        }

        private boolean isMultipleOfThree(int number) {
            return number % 3 != 0;
        }
    }
}
