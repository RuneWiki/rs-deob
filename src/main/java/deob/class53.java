package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("bs")
public class class53 implements Callable {

    @ObfuscatedName("jv.g(I)Ljava/security/SecureRandom;")
    public static SecureRandom method4989() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method4989();
    }
}
