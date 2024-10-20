package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("dm")
public class class80 {

    @ObfuscatedName("dm.ac")
    public ExecutorService field1000 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("dm.al")
    public Future field999 = this.field1000.submit(new class85());

    @ObfuscatedName("dm.ac(B)V")
    public void method2092() {
        this.field1000.shutdown();
        this.field1000 = null;
    }

    @ObfuscatedName("dm.al(I)Z")
    public boolean method2093() {
        return this.field999.isDone();
    }

    @ObfuscatedName("dm.ak(I)Ljava/security/SecureRandom;")
    public SecureRandom method2094() {
        try {
            return (SecureRandom) this.field999.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
