package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ba")
public class class71 {

    @ObfuscatedName("ba.n")
    public ExecutorService field934 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ba.c")
    public Future field936 = this.field934.submit(new class76());

    @ObfuscatedName("ba.n(I)V")
    public void method1832() {
        this.field934.shutdown();
        this.field934 = null;
    }

    @ObfuscatedName("ba.c(I)Z")
    public boolean method1828() {
        return this.field936.isDone();
    }

    @ObfuscatedName("ba.m(I)Ljava/security/SecureRandom;")
    public SecureRandom method1829() {
        try {
            return (SecureRandom) this.field936.get();
        } catch (Exception var2) {
            return class76.method3030();
        }
    }
}
