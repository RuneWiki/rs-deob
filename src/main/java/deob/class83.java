package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cc")
public class class83 {

    @ObfuscatedName("cc.f")
    public ExecutorService field1195 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cc.h")
    public Future field1194 = this.field1195.submit(new class53());

    @ObfuscatedName("cc.f(I)V")
    public void method1777() {
        this.field1195.shutdown();
        this.field1195 = null;
    }

    @ObfuscatedName("cc.h(B)Z")
    public boolean method1778() {
        return this.field1194.isDone();
    }

    @ObfuscatedName("cc.e(B)Ljava/security/SecureRandom;")
    public SecureRandom method1779() {
        try {
            return (SecureRandom) this.field1194.get();
        } catch (Exception var2) {
            return Statics.method296();
        }
    }
}
