package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("be")
public class class76 implements Callable {

    @ObfuscatedName("bz.w(I)Ljava/security/SecureRandom;")
    public static SecureRandom method1834() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method1834();
    }
}
