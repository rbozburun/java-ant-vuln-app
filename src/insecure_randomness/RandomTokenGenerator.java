package insecure_randomness;

import java.util.Random;

public class RandomTokenGenerator {
    public String generateToken() {
        Random random = new Random();
        return String.valueOf(random.nextInt());
    }
}
