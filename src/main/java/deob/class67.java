package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("bg")
public class class67 implements Callable {

    @ObfuscatedName("aw.c(B)Ljava/security/SecureRandom;")
    public static SecureRandom method580() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method580();
    }
}
