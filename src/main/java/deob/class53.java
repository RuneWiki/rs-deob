package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("bw")
public class class53 implements Callable {

    @ObfuscatedName("dy.c(B)Ljava/security/SecureRandom;")
    public static SecureRandom method2824() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method2824();
    }
}
