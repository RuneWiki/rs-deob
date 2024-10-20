package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cc")
public class class78 {

    @ObfuscatedName("cc.au")
    public ExecutorService field1004 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cc.ae")
    public Future field1007 = this.field1004.submit(new class83());

    @ObfuscatedName("cc.au(I)V")
    public void method2072() {
        this.field1004.shutdown();
        this.field1004 = null;
    }

    @ObfuscatedName("cc.ae(I)Z")
    public boolean method2061() {
        return this.field1007.isDone();
    }

    @ObfuscatedName("cc.ao(B)Ljava/security/SecureRandom;")
    public SecureRandom method2062() {
        try {
            return (SecureRandom) this.field1007.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
