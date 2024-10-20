package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("bt")
public class class71 {

    @ObfuscatedName("bt.v")
    public ExecutorService field954 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("bt.c")
    public Future field953 = this.field954.submit(new class76());

    @ObfuscatedName("bt.v(B)V")
    public void method1889() {
        this.field954.shutdown();
        this.field954 = null;
    }

    @ObfuscatedName("bt.c(I)Z")
    public boolean method1891() {
        return this.field953.isDone();
    }

    @ObfuscatedName("bt.i(B)Ljava/security/SecureRandom;")
    public SecureRandom method1892() {
        try {
            return (SecureRandom) this.field953.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
