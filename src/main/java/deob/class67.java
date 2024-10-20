package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("by")
public class class67 implements Callable {

    @ObfuscatedName("gw.m(B)Ljava/security/SecureRandom;")
    public static SecureRandom method3417() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method3417();
    }
}
