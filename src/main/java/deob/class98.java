package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ct")
public class class98 {

    @ObfuscatedName("ct.m")
    public ExecutorService field1270 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ct.o")
    public Future field1274 = this.field1270.submit(new class67());

    @ObfuscatedName("ct.m(I)V")
    public void method2041() {
        this.field1270.shutdown();
        this.field1270 = null;
    }

    @ObfuscatedName("ct.o(I)Z")
    public boolean method2040() {
        return this.field1274.isDone();
    }

    @ObfuscatedName("ct.q(B)Ljava/security/SecureRandom;")
    public SecureRandom method2039() {
        try {
            return (SecureRandom) this.field1274.get();
        } catch (Exception var2) {
            return class67.method311();
        }
    }
}
