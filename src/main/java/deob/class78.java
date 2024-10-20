package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cd")
public class class78 {

    @ObfuscatedName("cd.at")
    public ExecutorService field972 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cd.ah")
    public Future field970 = this.field972.submit(new class83());

    @ObfuscatedName("cd.at(I)V")
    public void method2103() {
        this.field972.shutdown();
        this.field972 = null;
    }

    @ObfuscatedName("cd.ah(B)Z")
    public boolean method2102() {
        return this.field970.isDone();
    }

    @ObfuscatedName("cd.ar(I)Ljava/security/SecureRandom;")
    public SecureRandom method2105() {
        try {
            return (SecureRandom) this.field970.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
