package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cf")
public class class83 {

    @ObfuscatedName("cf.c")
    public ExecutorService field1206 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cf.q")
    public Future field1205 = this.field1206.submit(new class53());

    @ObfuscatedName("cf.c(I)V")
    public void method1740() {
        this.field1206.shutdown();
        this.field1206 = null;
    }

    @ObfuscatedName("cf.q(I)Z")
    public boolean method1734() {
        return this.field1205.isDone();
    }

    @ObfuscatedName("cf.m(I)Ljava/security/SecureRandom;")
    public SecureRandom method1731() {
        try {
            return (SecureRandom) this.field1205.get();
        } catch (Exception var2) {
            return class53.method2824();
        }
    }
}
