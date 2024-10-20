package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("do")
public class class85 implements Callable {

    @ObfuscatedName("pp.ak(I)Ljava/security/SecureRandom;")
    public static SecureRandom method6756() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method6756();
    }
}
