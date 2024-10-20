package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ca")
public class class98 {

    @ObfuscatedName("ca.x")
    public ExecutorService field1265 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ca.m")
    public Future field1260 = this.field1265.submit(new class67());

    @ObfuscatedName("ca.x(B)V")
    public void method2019() {
        this.field1265.shutdown();
        this.field1265 = null;
    }

    @ObfuscatedName("ca.m(B)Z")
    public boolean method2016() {
        return this.field1260.isDone();
    }

    @ObfuscatedName("ca.k(I)Ljava/security/SecureRandom;")
    public SecureRandom method2017() {
        try {
            return (SecureRandom) this.field1260.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
