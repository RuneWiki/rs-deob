package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("bb")
public class class75 {

    @ObfuscatedName("bb.h")
    public ExecutorService field988 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("bb.e")
    public Future field985 = this.field988.submit(new class80());

    @ObfuscatedName("bb.h(B)V")
    public void method1997() {
        this.field988.shutdown();
        this.field988 = null;
    }

    @ObfuscatedName("bb.e(I)Z")
    public boolean method1998() {
        return this.field985.isDone();
    }

    @ObfuscatedName("bb.v(I)Ljava/security/SecureRandom;")
    public SecureRandom method1999() {
        try {
            return (SecureRandom) this.field985.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
