package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cz")
public class class86 {

    @ObfuscatedName("cz.f")
    public ExecutorService field1055 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cz.o")
    public Future field1051 = this.field1055.submit(new class91());

    @ObfuscatedName("cz.f(I)V")
    public void method1721() {
        this.field1055.shutdown();
        this.field1055 = null;
    }

    @ObfuscatedName("cz.o(I)Z")
    public boolean method1722() {
        return this.field1051.isDone();
    }

    @ObfuscatedName("cz.u(B)Ljava/security/SecureRandom;")
    public SecureRandom method1731() {
        try {
            return (SecureRandom) this.field1051.get();
        } catch (Exception var2) {
            return class91.method3850();
        }
    }
}
