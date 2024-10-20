package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cq")
public class class83 {

    @ObfuscatedName("cq.y")
    public ExecutorService field1209 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cq.c")
    public Future field1207 = this.field1209.submit(new class53());

    @ObfuscatedName("cq.y(I)V")
    public void method1773() {
        this.field1209.shutdown();
        this.field1209 = null;
    }

    @ObfuscatedName("cq.c(I)Z")
    public boolean method1781() {
        return this.field1207.isDone();
    }

    @ObfuscatedName("cq.n(I)Ljava/security/SecureRandom;")
    public SecureRandom method1775() {
        try {
            return (SecureRandom) this.field1207.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
