package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("bm")
public class class67 implements Callable {

    @ObfuscatedName("eb.t(I)Ljava/security/SecureRandom;")
    public static SecureRandom method3140() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method3140();
    }
}
