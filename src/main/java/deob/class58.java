package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("bf")
public class class58 {

    @ObfuscatedName("bf.s")
    public ExecutorService field858 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("bf.t")
    public Future field857 = this.field858.submit(new class63());

    @ObfuscatedName("bf.s(I)V")
    public void method1613() {
        this.field858.shutdown();
        this.field858 = null;
    }

    @ObfuscatedName("bf.t(I)Z")
    public boolean method1621() {
        return this.field857.isDone();
    }

    @ObfuscatedName("bf.v(S)Ljava/security/SecureRandom;")
    public SecureRandom method1615() {
        try {
            return (SecureRandom) this.field857.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
