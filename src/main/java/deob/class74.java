package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("bc")
public class class74 {

    @ObfuscatedName("bc.f")
    public ExecutorService field974 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("bc.w")
    public Future field973 = this.field974.submit(new class79());

    @ObfuscatedName("bc.f(I)V")
    public void method2084() {
        this.field974.shutdown();
        this.field974 = null;
    }

    @ObfuscatedName("bc.w(B)Z")
    public boolean method2085() {
        return this.field973.isDone();
    }

    @ObfuscatedName("bc.v(I)Ljava/security/SecureRandom;")
    public SecureRandom method2087() {
        try {
            return (SecureRandom) this.field973.get();
        } catch (Exception var2) {
            return class79.method3004();
        }
    }
}
