package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("a")
public class class8 {

    @ObfuscatedName("a.n")
    public ExecutorService field18 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("a.c")
    public Future field19;

    @ObfuscatedName("a.m")
    public final class400 field20;

    @ObfuscatedName("a.k")
    public final class4 field21;

    public class8(class400 arg0, class4 arg1) {
        this.field20 = arg0;
        this.field21 = arg1;
        this.method55();
    }

    @ObfuscatedName("a.n(I)Z")
    public boolean method52() {
        return this.field19.isDone();
    }

    @ObfuscatedName("a.c(B)V")
    public void method53() {
        this.field18.shutdown();
        this.field18 = null;
    }

    @ObfuscatedName("a.m(I)Lot;")
    public class400 method60() {
        try {
            return (class400) this.field19.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("a.k(I)V")
    public void method55() {
        this.field19 = this.field18.submit(new class2(this, this.field20, this.field21));
    }
}
