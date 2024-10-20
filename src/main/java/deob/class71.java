package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("bw")
public class class71 {

    @ObfuscatedName("bw.c")
    public ExecutorService field963 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("bw.v")
    public Future field964 = this.field963.submit(new class76());

    @ObfuscatedName("bw.c(B)V")
    public void method1881() {
        this.field963.shutdown();
        this.field963 = null;
    }

    @ObfuscatedName("bw.v(I)Z")
    public boolean method1873() {
        return this.field964.isDone();
    }

    @ObfuscatedName("bw.q(I)Ljava/security/SecureRandom;")
    public SecureRandom method1872() {
        try {
            return (SecureRandom) this.field964.get();
        } catch (Exception var2) {
            return class76.method5298();
        }
    }
}
