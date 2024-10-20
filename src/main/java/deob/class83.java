package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cj")
public class class83 {

    @ObfuscatedName("cj.f")
    public ExecutorService field1207 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cj.l")
    public Future field1206 = this.field1207.submit(new class53());

    @ObfuscatedName("cj.f(I)V")
    public void method1831() {
        this.field1207.shutdown();
        this.field1207 = null;
    }

    @ObfuscatedName("cj.l(B)Z")
    public boolean method1832() {
        return this.field1206.isDone();
    }

    @ObfuscatedName("cj.w(B)Ljava/security/SecureRandom;")
    public SecureRandom method1836() {
        try {
            return (SecureRandom) this.field1206.get();
        } catch (Exception var2) {
            return class53.method180();
        }
    }
}
