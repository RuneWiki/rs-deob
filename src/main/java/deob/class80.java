package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("dq")
public class class80 {

    @ObfuscatedName("dq.ak")
    public ExecutorService field1015 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("dq.al")
    public Future field1010 = this.field1015.submit(new class85());

    @ObfuscatedName("dq.ak(B)V")
    public void method2106() {
        this.field1015.shutdown();
        this.field1015 = null;
    }

    @ObfuscatedName("dq.al(I)Z")
    public boolean method2107() {
        return this.field1010.isDone();
    }

    @ObfuscatedName("dq.aj(B)Ljava/security/SecureRandom;")
    public SecureRandom method2116() {
        try {
            return (SecureRandom) this.field1010.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
