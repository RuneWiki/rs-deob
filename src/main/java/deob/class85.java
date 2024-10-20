package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("ds")
public class class85 implements Callable {

    public Object call() {
        SecureRandom var1 = new SecureRandom();
        var1.nextInt();
        return var1;
    }
}
