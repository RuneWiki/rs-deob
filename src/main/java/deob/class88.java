package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cp")
public class class88 {

    @ObfuscatedName("cp.a")
    public ExecutorService field1228 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cp.s")
    public Future field1227 = this.field1228.submit(new class58());

    @ObfuscatedName("cp.a(I)V")
    public void method1974() {
        this.field1228.shutdown();
        this.field1228 = null;
    }

    @ObfuscatedName("cp.s(S)Z")
    public boolean method1969() {
        return this.field1227.isDone();
    }

    @ObfuscatedName("cp.g(I)Ljava/security/SecureRandom;")
    public SecureRandom method1968() {
        try {
            return (SecureRandom) this.field1227.get();
        } catch (Exception var2) {
            return class58.method2090();
        }
    }
}
