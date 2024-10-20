package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("by")
public class class76 implements Callable {

    @ObfuscatedName("le.v(I)Ljava/security/SecureRandom;")
    public static SecureRandom method5298() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method5298();
    }
}
