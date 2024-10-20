package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("bh")
public class class71 {

    @ObfuscatedName("bh.c")
    public ExecutorService field926 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("bh.b")
    public Future field927 = this.field926.submit(new class76());

    @ObfuscatedName("bh.c(I)V")
    public void method1924() {
        this.field926.shutdown();
        this.field926 = null;
    }

    @ObfuscatedName("bh.b(I)Z")
    public boolean method1926() {
        return this.field927.isDone();
    }

    @ObfuscatedName("bh.p(I)Ljava/security/SecureRandom;")
    public SecureRandom method1922() {
        try {
            return (SecureRandom) this.field927.get();
        } catch (Exception var2) {
            return class76.method3998();
        }
    }
}
