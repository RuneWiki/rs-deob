package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cv")
public class class86 {

    @ObfuscatedName("cv.f")
    public ExecutorService field1067 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cv.e")
    public Future field1065 = this.field1067.submit(new class91());

    @ObfuscatedName("cv.f(B)V")
    public void method1818() {
        this.field1067.shutdown();
        this.field1067 = null;
    }

    @ObfuscatedName("cv.e(I)Z")
    public boolean method1819() {
        return this.field1065.isDone();
    }

    @ObfuscatedName("cv.v(I)Ljava/security/SecureRandom;")
    public SecureRandom method1823() {
        try {
            return (SecureRandom) this.field1065.get();
        } catch (Exception var2) {
            return class91.method1042();
        }
    }
}
