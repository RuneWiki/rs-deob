package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cn")
public class class89 {

    @ObfuscatedName("cn.f")
    public ExecutorService field1228 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cn.i")
    public Future field1224 = this.field1228.submit(new class58());

    @ObfuscatedName("cn.f(I)V")
    public void method1947() {
        this.field1228.shutdown();
        this.field1228 = null;
    }

    @ObfuscatedName("cn.i(B)Z")
    public boolean method1952() {
        return this.field1224.isDone();
    }

    @ObfuscatedName("cn.y(B)Ljava/security/SecureRandom;")
    public SecureRandom method1949() {
        try {
            return (SecureRandom) this.field1224.get();
        } catch (Exception var2) {
            return class58.method928();
        }
    }
}
