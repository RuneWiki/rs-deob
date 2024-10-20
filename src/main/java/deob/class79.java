package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("cu")
public class class79 implements Callable {

    @ObfuscatedName("eh.w(I)Ljava/security/SecureRandom;")
    public static SecureRandom method3004() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method3004();
    }
}
