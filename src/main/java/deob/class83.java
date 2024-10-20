package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ch")
public class class83 {

    @ObfuscatedName("ch.v")
    public ExecutorService field1196 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ch.s")
    public Future field1195 = this.field1196.submit(new class53());

    @ObfuscatedName("ch.v(B)V")
    public void method1779() {
        this.field1196.shutdown();
        this.field1196 = null;
    }

    @ObfuscatedName("ch.s(I)Z")
    public boolean method1781() {
        return this.field1195.isDone();
    }

    @ObfuscatedName("ch.o(I)Ljava/security/SecureRandom;")
    public SecureRandom method1776() {
        try {
            return (SecureRandom) this.field1195.get();
        } catch (Exception var2) {
            return class53.method1715();
        }
    }
}
