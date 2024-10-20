package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("bv")
public class class71 {

    @ObfuscatedName("bv.c")
    public ExecutorService field957 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("bv.l")
    public Future field958 = this.field957.submit(new class76());

    @ObfuscatedName("bv.c(I)V")
    public void method1875() {
        this.field957.shutdown();
        this.field957 = null;
    }

    @ObfuscatedName("bv.l(I)Z")
    public boolean method1881() {
        return this.field958.isDone();
    }

    @ObfuscatedName("bv.s(B)Ljava/security/SecureRandom;")
    public SecureRandom method1877() {
        try {
            return (SecureRandom) this.field958.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
