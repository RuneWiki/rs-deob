package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("df")
public class class86 implements Callable {

    @ObfuscatedName("mv.ai(I)Ljava/security/SecureRandom;")
    public static SecureRandom method5966() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method5966();
    }
}
