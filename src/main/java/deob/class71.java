package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("by")
public class class71 {

    @ObfuscatedName("by.l")
    public ExecutorService field940 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("by.q")
    public Future field943 = this.field940.submit(new class76());

    @ObfuscatedName("by.l(B)V")
    public void method1859() {
        this.field940.shutdown();
        this.field940 = null;
    }

    @ObfuscatedName("by.q(B)Z")
    public boolean method1854() {
        return this.field943.isDone();
    }

    @ObfuscatedName("by.f(I)Ljava/security/SecureRandom;")
    public SecureRandom method1855() {
        try {
            return (SecureRandom) this.field943.get();
        } catch (Exception var2) {
            return class76.method5619();
        }
    }
}
