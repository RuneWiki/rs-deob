package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("bn")
public class class58 implements Callable {

    @ObfuscatedName("im.u(I)Ljava/security/SecureRandom;")
    public static SecureRandom method3994() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method3994();
    }
}
