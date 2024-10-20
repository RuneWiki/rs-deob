package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("bk")
public class class58 implements Callable {

    @ObfuscatedName("cj.m(I)Ljava/security/SecureRandom;")
    public static SecureRandom method1856() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method1856();
    }
}
