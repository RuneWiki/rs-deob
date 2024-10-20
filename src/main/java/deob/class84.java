package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("da")
public class class84 implements Callable {

    @ObfuscatedName("eu.at(I)Ljava/security/SecureRandom;")
    public static SecureRandom method2749() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method2749();
    }
}
