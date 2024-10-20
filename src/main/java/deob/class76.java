package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cf")
public class class76 {

    @ObfuscatedName("cf.aj")
    public ExecutorService field958 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cf.al")
    public Future field959 = this.field958.submit(new class81());

    @ObfuscatedName("cf.aj(I)V")
    public void method2019() {
        this.field958.shutdown();
        this.field958 = null;
    }

    @ObfuscatedName("cf.al(I)Z")
    public boolean method2021() {
        return this.field959.isDone();
    }

    @ObfuscatedName("cf.ac(I)Ljava/security/SecureRandom;")
    public SecureRandom method2024() {
        try {
            return (SecureRandom) this.field959.get();
        } catch (Exception var2) {
            return class81.method6805();
        }
    }
}
