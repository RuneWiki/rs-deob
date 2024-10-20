package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("dg")
public class class79 {

    @ObfuscatedName("dg.aq")
    public ExecutorService field1014 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("dg.aw")
    public Future field1015 = this.field1014.submit(new class84());

    @ObfuscatedName("dg.aq(S)V")
    public void method2121() {
        this.field1014.shutdown();
        this.field1014 = null;
    }

    @ObfuscatedName("dg.aw(S)Z")
    public boolean method2124() {
        return this.field1015.isDone();
    }

    @ObfuscatedName("dg.al(I)Ljava/security/SecureRandom;")
    public SecureRandom method2123() {
        try {
            return (SecureRandom) this.field1015.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
