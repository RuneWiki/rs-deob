package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ca")
public class class78 {

    @ObfuscatedName("ca.am")
    public ExecutorService field977 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ca.ap")
    public Future field978 = this.field977.submit(new class83());

    @ObfuscatedName("ca.am(I)V")
    public void method2139() {
        this.field977.shutdown();
        this.field977 = null;
    }

    @ObfuscatedName("ca.ap(I)Z")
    public boolean method2141() {
        return this.field978.isDone();
    }

    @ObfuscatedName("ca.af(I)Ljava/security/SecureRandom;")
    public SecureRandom method2142() {
        try {
            return (SecureRandom) this.field978.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
