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
    }

    @Test
    public void should_return_number_when_it_is_not_fizz_and_not_buzz() {
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
    }

    private class FizzBuzz {
        public String of(int number) {
            return number != 3 ? String.valueOf(number) : "Fizz";
        }
    }
}
