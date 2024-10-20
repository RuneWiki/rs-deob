package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cz")
public class class78 {

    @ObfuscatedName("cz.at")
    public ExecutorService field988 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cz.an")
    public Future field989 = this.field988.submit(new class83());

    @ObfuscatedName("cz.at(I)V")
    public void method2028() {
        this.field988.shutdown();
        this.field988 = null;
    }

    @ObfuscatedName("cz.an(I)Z")
    public boolean method2031() {
        return this.field989.isDone();
    }

    @ObfuscatedName("cz.av(S)Ljava/security/SecureRandom;")
    public SecureRandom method2029() {
        try {
            return (SecureRandom) this.field989.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
