package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cc")
public class class78 {

    @ObfuscatedName("cc.aw")
    public ExecutorService field992 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("cc.ay")
    public Future field990 = this.field992.submit(new class83());

    @ObfuscatedName("cc.aw(I)V")
    public void method2054() {
        this.field992.shutdown();
        this.field992 = null;
    }

    @ObfuscatedName("cc.ay(I)Z")
    public boolean method2055() {
        return this.field990.isDone();
    }

    @ObfuscatedName("cc.ar(I)Ljava/security/SecureRandom;")
    public SecureRandom method2056() {
        try {
            return (SecureRandom) this.field990.get();
        } catch (Exception var2) {
            return class83.method4718();
        }
    }
}
