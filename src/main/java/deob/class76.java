package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("bo")
public class class76 implements Callable {

    @ObfuscatedName("hp.m(B)Ljava/security/SecureRandom;")
    public static SecureRandom method3998() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method3998();
    }
}
