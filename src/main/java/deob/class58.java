package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("bi")
public class class58 implements Callable {

    @ObfuscatedName("ah.c(I)Ljava/security/SecureRandom;")
    public static SecureRandom method749() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method749();
    }
}
