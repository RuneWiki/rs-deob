package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("bp")
public class class71 {

    @ObfuscatedName("bp.s")
    public ExecutorService field944 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("bp.h")
    public Future field942 = this.field944.submit(new class76());

    @ObfuscatedName("bp.s(B)V")
    public void method1833() {
        this.field944.shutdown();
        this.field944 = null;
    }

    @ObfuscatedName("bp.h(I)Z")
    public boolean method1826() {
        return this.field942.isDone();
    }

    @ObfuscatedName("bp.w(S)Ljava/security/SecureRandom;")
    public SecureRandom method1827() {
        try {
            return (SecureRandom) this.field942.get();
        } catch (Exception var2) {
            return class76.method1834();
        }
    }
}
