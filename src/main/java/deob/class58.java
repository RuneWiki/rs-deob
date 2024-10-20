package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("bi")
public class class58 implements Callable {

    @ObfuscatedName("cr.a(I)Ljava/security/SecureRandom;")
    public static SecureRandom method2090() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        SecureRandom var1 = new SecureRandom();
        var1.nextInt();
        return var1;
    }
}
