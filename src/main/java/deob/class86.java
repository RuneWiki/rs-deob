package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cr")
public class class86 {

    @ObfuscatedName("cr.v")
    public ExecutorService field1084 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cr.n")
    public Future field1083 = this.field1084.submit(new class91());

    @ObfuscatedName("cr.v(B)V")
    public void method1781() {
        this.field1084.shutdown();
        this.field1084 = null;
    }

    @ObfuscatedName("cr.n(I)Z")
    public boolean method1782() {
        return this.field1083.isDone();
    }

    @ObfuscatedName("cr.f(B)Ljava/security/SecureRandom;")
    public SecureRandom method1784() {
        try {
            return (SecureRandom) this.field1083.get();
        } catch (Exception var2) {
            return class91.method4285();
        }
    }
}
