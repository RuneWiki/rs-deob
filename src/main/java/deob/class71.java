package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("bh")
public class class71 {

    @ObfuscatedName("bh.o")
    public ExecutorService field948 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("bh.q")
    public Future field944 = this.field948.submit(new class76());

    @ObfuscatedName("bh.o(I)V")
    public void method1836() {
        this.field948.shutdown();
        this.field948 = null;
    }

    @ObfuscatedName("bh.q(I)Z")
    public boolean method1837() {
        return this.field944.isDone();
    }

    @ObfuscatedName("bh.l(B)Ljava/security/SecureRandom;")
    public SecureRandom method1838() {
        try {
            return (SecureRandom) this.field944.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
