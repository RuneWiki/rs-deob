package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cl")
public class class83 {

    @ObfuscatedName("cl.g")
    public ExecutorService field1220 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cl.r")
    public Future field1217 = this.field1220.submit(new class53());

    @ObfuscatedName("cl.g(I)V")
    public void method1927() {
        this.field1220.shutdown();
        this.field1220 = null;
    }

    @ObfuscatedName("cl.r(B)Z")
    public boolean method1928() {
        return this.field1217.isDone();
    }

    @ObfuscatedName("cl.e(B)Ljava/security/SecureRandom;")
    public SecureRandom method1929() {
        try {
            return (SecureRandom) this.field1217.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
