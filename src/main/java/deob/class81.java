package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("dc")
public class class81 implements Callable {

    @ObfuscatedName("pm.ac(I)Ljava/security/SecureRandom;")
    public static SecureRandom method6805() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method6805();
    }
}
