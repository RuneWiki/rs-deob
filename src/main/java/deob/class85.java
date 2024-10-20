package deob;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("df")
public class class85 implements Callable {

    @ObfuscatedName("jd.ay(I)Ljava/security/SecureRandom;")
    public static SecureRandom method4463() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    public Object call() {
        return method4463();
    }
}
