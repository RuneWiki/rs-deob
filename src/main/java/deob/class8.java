package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("at")
public class class8 {

    @ObfuscatedName("at.ac")
    public ExecutorService field20 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("at.ae")
    public Future field17;

    @ObfuscatedName("at.ag")
    public final class551 field16;

    @ObfuscatedName("at.am")
    public final class4 field19;

    public class8(class551 arg0, class4 arg1) {
        this.field16 = arg0;
        this.field19 = arg1;
        this.method45();
    }

    @ObfuscatedName("at.ac(B)Z")
    public boolean method42() {
        return this.field17.isDone();
    }

    @ObfuscatedName("at.ae(I)V")
    public void method43() {
        this.field20.shutdown();
        this.field20 = null;
    }

    @ObfuscatedName("at.ag(I)Lvf;")
    public class551 method55() {
        try {
            return (class551) this.field17.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("at.am(I)V")
    public void method45() {
        this.field17 = this.field20.submit(new class2(this, this.field16, this.field19));
    }
}
