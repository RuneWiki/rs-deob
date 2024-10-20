package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ba")
public class class71 {

    @ObfuscatedName("ba.c")
    public ExecutorService field960 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ba.p")
    public Future field959 = this.field960.submit(new class76());

    @ObfuscatedName("ba.c(B)V")
    public void method2018() {
        this.field960.shutdown();
        this.field960 = null;
    }

    @ObfuscatedName("ba.p(I)Z")
    public boolean method2009() {
        return this.field959.isDone();
    }

    @ObfuscatedName("ba.f(I)Ljava/security/SecureRandom;")
    public SecureRandom method2008() {
        try {
            return (SecureRandom) this.field959.get();
        } catch (Exception var2) {
            return class76.method4837();
        }
    }
}
