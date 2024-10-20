package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cs")
public class class98 {

    @ObfuscatedName("cs.z")
    public ExecutorService field1272 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cs.k")
    public Future field1271 = this.field1272.submit(new class67());

    @ObfuscatedName("cs.z(I)V")
    public void method2026() {
        this.field1272.shutdown();
        this.field1272 = null;
    }

    @ObfuscatedName("cs.k(B)Z")
    public boolean method2038() {
        return this.field1271.isDone();
    }

    @ObfuscatedName("cs.s(S)Ljava/security/SecureRandom;")
    public SecureRandom method2028() {
        try {
            return (SecureRandom) this.field1271.get();
        } catch (Exception var2) {
            return class67.method3140();
        }
    }
}
