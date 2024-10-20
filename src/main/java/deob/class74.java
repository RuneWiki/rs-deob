package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cj")
public class class74 {

    @ObfuscatedName("cj.af")
    public ExecutorService field961 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cj.an")
    public Future field957 = this.field961.submit(new class79());

    @ObfuscatedName("cj.af(I)V")
    public void method2018() {
        this.field961.shutdown();
        this.field961 = null;
    }

    @ObfuscatedName("cj.an(B)Z")
    public boolean method2019() {
        return this.field957.isDone();
    }

    @ObfuscatedName("cj.aw(B)Ljava/security/SecureRandom;")
    public SecureRandom method2020() {
        try {
            return (SecureRandom) this.field957.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
