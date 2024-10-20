package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("co")
public class class98 {

    @ObfuscatedName("co.n")
    public ExecutorService field1260 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("co.v")
    public Future field1262 = this.field1260.submit(new class67());

    @ObfuscatedName("co.n(I)V")
    public void method2097() {
        this.field1260.shutdown();
        this.field1260 = null;
    }

    @ObfuscatedName("co.v(S)Z")
    public boolean method2089() {
        return this.field1262.isDone();
    }

    @ObfuscatedName("co.d(B)Ljava/security/SecureRandom;")
    public SecureRandom method2090() {
        try {
            return (SecureRandom) this.field1262.get();
        } catch (Exception var2) {
            return class67.method580();
        }
    }
}
