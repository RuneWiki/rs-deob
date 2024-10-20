package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("bj")
public class class58 implements Callable {

    @ObfuscatedName("cn.z(I)Ljava/security/SecureRandom;")
    public static SecureRandom method1884() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method1884();
    }
}
