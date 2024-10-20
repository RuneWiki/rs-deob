package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ck")
public class class98 {

    @ObfuscatedName("ck.h")
    public ExecutorService field1244 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ck.v")
    public Future field1243 = this.field1244.submit(new class67());

    @ObfuscatedName("ck.h(I)V")
    public void method2029() {
        this.field1244.shutdown();
        this.field1244 = null;
    }

    @ObfuscatedName("ck.v(I)Z")
    public boolean method2037() {
        return this.field1243.isDone();
    }

    @ObfuscatedName("ck.x(I)Ljava/security/SecureRandom;")
    public SecureRandom method2039() {
        try {
            return (SecureRandom) this.field1243.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
