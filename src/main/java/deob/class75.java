package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("bf")
public class class75 {

    @ObfuscatedName("bf.a")
    public ExecutorService field960 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("bf.f")
    public Future field959 = this.field960.submit(new class80());

    @ObfuscatedName("bf.a(B)V")
    public void method2012() {
        this.field960.shutdown();
        this.field960 = null;
    }

    @ObfuscatedName("bf.f(I)Z")
    public boolean method2013() {
        return this.field959.isDone();
    }

    @ObfuscatedName("bf.c(I)Ljava/security/SecureRandom;")
    public SecureRandom method2024() {
        try {
            return (SecureRandom) this.field959.get();
        } catch (Exception var2) {
            return Statics.method69();
        }
    }
}
