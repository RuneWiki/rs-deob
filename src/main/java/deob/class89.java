package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cm")
public class class89 {

    @ObfuscatedName("cm.c")
    public ExecutorService field1230 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cm.t")
    public Future field1233 = this.field1230.submit(new class58());

    @ObfuscatedName("cm.c(I)V")
    public void method1974() {
        this.field1230.shutdown();
        this.field1230 = null;
    }

    @ObfuscatedName("cm.t(I)Z")
    public boolean method1975() {
        return this.field1233.isDone();
    }

    @ObfuscatedName("cm.o(I)Ljava/security/SecureRandom;")
    public SecureRandom method1981() {
        try {
            return (SecureRandom) this.field1233.get();
        } catch (Exception var2) {
            return class58.method749();
        }
    }
}
