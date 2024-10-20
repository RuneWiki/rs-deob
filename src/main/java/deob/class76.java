package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("bs")
public class class76 implements Callable {

    @ObfuscatedName("fx.o(B)Ljava/security/SecureRandom;")
    public static SecureRandom method3030() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method3030();
    }
}
