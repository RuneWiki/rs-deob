package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("dv")
public class class81 {

    @ObfuscatedName("dv.ac")
    public ExecutorService field1024 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("dv.ae")
    public Future field1021 = this.field1024.submit(new class86());

    @ObfuscatedName("dv.ac(I)V")
    public void method2260() {
        this.field1024.shutdown();
        this.field1024 = null;
    }

    @ObfuscatedName("dv.ae(I)Z")
    public boolean method2271() {
        return this.field1021.isDone();
    }

    @ObfuscatedName("dv.ag(I)Ljava/security/SecureRandom;")
    public SecureRandom method2261() {
        try {
            return (SecureRandom) this.field1021.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
