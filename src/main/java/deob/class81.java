package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("dc")
public class class81 {

    @ObfuscatedName("dc.ap")
    public ExecutorService field997 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("dc.aw")
    public Future field998 = this.field997.submit(new class86());

    @ObfuscatedName("dc.ap(B)V")
    public void method2341() {
        this.field997.shutdown();
        this.field997 = null;
    }

    @ObfuscatedName("dc.aw(I)Z")
    public boolean method2350() {
        return this.field998.isDone();
    }

    @ObfuscatedName("dc.ak(I)Ljava/security/SecureRandom;")
    public SecureRandom method2343() {
        try {
            return (SecureRandom) this.field998.get();
        } catch (Exception var2) {
            return class86.method5966();
        }
    }
}
