package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ct")
public class class98 {

    @ObfuscatedName("ct.f")
    public ExecutorService field1277 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ct.b")
    public Future field1275 = this.field1277.submit(new class67());

    @ObfuscatedName("ct.f(B)V")
    public void method2044() {
        this.field1277.shutdown();
        this.field1277 = null;
    }

    @ObfuscatedName("ct.b(B)Z")
    public boolean method2037() {
        return this.field1275.isDone();
    }

    @ObfuscatedName("ct.l(I)Ljava/security/SecureRandom;")
    public SecureRandom method2039() {
        try {
            return (SecureRandom) this.field1275.get();
        } catch (Exception var2) {
            return class67.method3417();
        }
    }
}
