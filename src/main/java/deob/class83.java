package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("dy")
public class class83 implements Callable {

    @ObfuscatedName("jx.am(B)Ljava/security/SecureRandom;")
    public static SecureRandom method4718() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method4718();
    }
}
