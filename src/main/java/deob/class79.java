package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("dj")
public class class79 {

    @ObfuscatedName("dj.az")
    public ExecutorService field997 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("dj.ah")
    public Future field998 = this.field997.submit(new class84());

    @ObfuscatedName("dj.az(B)V")
    public void method2085() {
        this.field997.shutdown();
        this.field997 = null;
    }

    @ObfuscatedName("dj.ah(I)Z")
    public boolean method2094() {
        return this.field998.isDone();
    }

    @ObfuscatedName("dj.af(I)Ljava/security/SecureRandom;")
    public SecureRandom method2087() {
        try {
            return (SecureRandom) this.field998.get();
        } catch (Exception var2) {
            return class84.method2749();
        }
    }
}
