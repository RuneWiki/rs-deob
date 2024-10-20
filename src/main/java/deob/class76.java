package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("bq")
public class class76 implements Callable {

    @ObfuscatedName("jy.p(I)Ljava/security/SecureRandom;")
    public static SecureRandom method4837() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method4837();
    }
}
