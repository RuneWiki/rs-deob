package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("da")
public class class80 {

    @ObfuscatedName("da.ab")
    public ExecutorService field979 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("da.ay")
    public Future field978 = this.field979.submit(new class85());

    @ObfuscatedName("da.ab(I)V")
    public void method2189() {
        this.field979.shutdown();
        this.field979 = null;
    }

    @ObfuscatedName("da.ay(I)Z")
    public boolean method2195() {
        return this.field978.isDone();
    }

    @ObfuscatedName("da.an(B)Ljava/security/SecureRandom;")
    public SecureRandom method2191() {
        try {
            return (SecureRandom) this.field978.get();
        } catch (Exception var2) {
            return class85.method4463();
        }
    }
}
