package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("dd")
public class class80 {

    @ObfuscatedName("dd.aq")
    public ExecutorService field999 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("dd.ad")
    public Future field996 = this.field999.submit(new class85());

    @ObfuscatedName("dd.aq(I)V")
    public void method2139() {
        this.field999.shutdown();
        this.field999 = null;
    }

    @ObfuscatedName("dd.ad(I)Z")
    public boolean method2146() {
        return this.field996.isDone();
    }

    @ObfuscatedName("dd.ag(S)Ljava/security/SecureRandom;")
    public SecureRandom method2143() {
        try {
            return (SecureRandom) this.field996.get();
        } catch (Exception var2) {
            return class85.method6756();
        }
    }
}
