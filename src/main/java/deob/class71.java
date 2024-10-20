package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("bk")
public class class71 {

    @ObfuscatedName("bk.i")
    public ExecutorService field925 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("bk.w")
    public Future field921 = this.field925.submit(new class76());

    @ObfuscatedName("bk.i(B)V")
    public void method1866() {
        this.field925.shutdown();
        this.field925 = null;
    }

    @ObfuscatedName("bk.w(I)Z")
    public boolean method1871() {
        return this.field921.isDone();
    }

    @ObfuscatedName("bk.s(B)Ljava/security/SecureRandom;")
    public SecureRandom method1865() {
        try {
            return (SecureRandom) this.field921.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
