package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("bq")
public class class58 implements Callable {

    @ObfuscatedName("bj.f(I)Ljava/security/SecureRandom;")
    public static SecureRandom method928() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method928();
    }
}
