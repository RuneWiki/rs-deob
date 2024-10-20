package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("cd")
public class class91 implements Callable {

    @ObfuscatedName("bp.y(I)Ljava/security/SecureRandom;")
    public static SecureRandom method1042() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method1042();
    }
}
