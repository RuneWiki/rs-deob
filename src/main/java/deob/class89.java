package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("co")
public class class89 {

    @ObfuscatedName("co.q")
    public ExecutorService field1250 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("co.w")
    public Future field1248 = this.field1250.submit(new class58());

    @ObfuscatedName("co.q(I)V")
    public void method1873() {
        this.field1250.shutdown();
        this.field1250 = null;
    }

    @ObfuscatedName("co.w(I)Z")
    public boolean method1876() {
        return this.field1248.isDone();
    }

    @ObfuscatedName("co.e(I)Ljava/security/SecureRandom;")
    public SecureRandom method1866() {
        try {
            return (SecureRandom) this.field1248.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
