package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("co")
public class class91 implements Callable {

    @ObfuscatedName("ic.n(I)Ljava/security/SecureRandom;")
    public static SecureRandom method4285() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        SecureRandom var1 = new SecureRandom();
        var1.nextInt();
        return var1;
    }
}
