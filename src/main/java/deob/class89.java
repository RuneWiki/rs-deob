package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cm")
public class class89 {

    @ObfuscatedName("cm.s")
    public ExecutorService field1218 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cm.j")
    public Future field1215 = this.field1218.submit(new class58());

    @ObfuscatedName("cm.s(I)V")
    public void method1933() {
        this.field1218.shutdown();
        this.field1218 = null;
    }

    @ObfuscatedName("cm.j(I)Z")
    public boolean method1925() {
        return this.field1215.isDone();
    }

    @ObfuscatedName("cm.i(I)Ljava/security/SecureRandom;")
    public SecureRandom method1924() {
        try {
            return (SecureRandom) this.field1215.get();
        } catch (Exception var4) {
            SecureRandom var2 = new SecureRandom();
            var2.nextInt();
            return var2;
        }
    }
}
