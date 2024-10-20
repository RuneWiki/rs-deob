package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ce")
public class class89 {

    @ObfuscatedName("ce.c")
    public ExecutorService field1216 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ce.x")
    public Future field1217 = this.field1216.submit(new class58());

    @ObfuscatedName("ce.c(B)V")
    public void method1946() {
        this.field1216.shutdown();
        this.field1216 = null;
    }

    @ObfuscatedName("ce.x(I)Z")
    public boolean method1947() {
        return this.field1217.isDone();
    }

    @ObfuscatedName("ce.t(I)Ljava/security/SecureRandom;")
    public SecureRandom method1948() {
        try {
            return (SecureRandom) this.field1217.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
