package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("cq")
public class class91 implements Callable {

    @ObfuscatedName("il.o(B)Ljava/security/SecureRandom;")
    public static SecureRandom method3850() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method3850();
    }
}
