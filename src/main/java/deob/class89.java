package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cn")
public class class89 {

    @ObfuscatedName("cn.m")
    public ExecutorService field1216 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cn.f")
    public Future field1221 = this.field1216.submit(new class58());

    @ObfuscatedName("cn.m(I)V")
    public void method1913() {
        this.field1216.shutdown();
        this.field1216 = null;
    }

    @ObfuscatedName("cn.f(I)Z")
    public boolean method1921() {
        return this.field1221.isDone();
    }

    @ObfuscatedName("cn.q(I)Ljava/security/SecureRandom;")
    public SecureRandom method1912() {
        try {
            return (SecureRandom) this.field1221.get();
        } catch (Exception var2) {
            return class58.method1856();
        }
    }
}
