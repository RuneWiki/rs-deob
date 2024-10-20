package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("w")
public class class8 {

    @ObfuscatedName("w.c")
    public ExecutorService field31 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("w.b")
    public Future field32;

    @ObfuscatedName("w.p")
    public final class419 field26;

    @ObfuscatedName("w.m")
    public final class4 field27;

    public class8(class419 arg0, class4 arg1) {
        this.field26 = arg0;
        this.field27 = arg1;
        this.method59();
    }

    @ObfuscatedName("w.c(I)Z")
    public boolean method58() {
        return this.field32.isDone();
    }

    @ObfuscatedName("w.b(I)V")
    public void method62() {
        this.field31.shutdown();
        this.field31 = null;
    }

    @ObfuscatedName("w.p(B)Lpi;")
    public class419 method72() {
        try {
            return (class419) this.field32.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("w.m(I)V")
    public void method59() {
        this.field32 = this.field31.submit(new class2(this, this.field26, this.field27));
    }
}
