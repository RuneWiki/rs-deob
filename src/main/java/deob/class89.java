package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cb")
public class class89 {

    @ObfuscatedName("cb.z")
    public ExecutorService field1232 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cb.n")
    public Future field1230 = this.field1232.submit(new class58());

    @ObfuscatedName("cb.z(I)V")
    public void method1931() {
        this.field1232.shutdown();
        this.field1232 = null;
    }

    @ObfuscatedName("cb.n(I)Z")
    public boolean method1932() {
        return this.field1230.isDone();
    }

    @ObfuscatedName("cb.v(I)Ljava/security/SecureRandom;")
    public SecureRandom method1934() {
        try {
            return (SecureRandom) this.field1230.get();
        } catch (Exception var2) {
            return class58.method1884();
        }
    }
}
