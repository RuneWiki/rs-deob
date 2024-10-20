package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ce")
public class class88 {

    @ObfuscatedName("ce.n")
    public ExecutorService field1207 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ce.h")
    public Future field1204 = this.field1207.submit(new class58());

    @ObfuscatedName("ce.n(S)V")
    public void method1943() {
        this.field1207.shutdown();
        this.field1207 = null;
    }

    @ObfuscatedName("ce.h(B)Z")
    public boolean method1945() {
        return this.field1204.isDone();
    }

    @ObfuscatedName("ce.l(I)Ljava/security/SecureRandom;")
    public SecureRandom method1936() {
        try {
            return (SecureRandom) this.field1204.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
