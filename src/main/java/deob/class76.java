package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("bk")
public class class76 implements Callable {

    @ObfuscatedName("mi.k(I)Ljava/security/SecureRandom;")
    public static SecureRandom method5619() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method5619();
    }
}
