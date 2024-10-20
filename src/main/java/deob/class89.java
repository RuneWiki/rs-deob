package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("co")
public class class89 {

    @ObfuscatedName("co.a")
    public ExecutorService field1220 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("co.t")
    public Future field1221 = this.field1220.submit(new class58());

    @ObfuscatedName("co.a(I)V")
    public void method2046() {
        this.field1220.shutdown();
        this.field1220 = null;
    }

    @ObfuscatedName("co.t(B)Z")
    public boolean method2047() {
        return this.field1221.isDone();
    }

    @ObfuscatedName("co.n(I)Ljava/security/SecureRandom;")
    public SecureRandom method2050() {
        try {
            return (SecureRandom) this.field1221.get();
        } catch (Exception var2) {
            return Statics.method3438();
        }
    }
}
