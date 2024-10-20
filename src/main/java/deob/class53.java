package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("be")
public class class53 implements Callable {

    @ObfuscatedName("t.f(B)Ljava/security/SecureRandom;")
    public static SecureRandom method180() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method180();
    }
}
