package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("dx")
public class class83 implements Callable {

    @ObfuscatedName("gh.ao(I)Ljava/security/SecureRandom;")
    public static SecureRandom method3328() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method3328();
    }
}
