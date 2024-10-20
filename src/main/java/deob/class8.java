package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("w")
public class class8 {

    @ObfuscatedName("w.c")
    public ExecutorService field35 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("w.l")
    public Future field43;

    @ObfuscatedName("w.s")
    public final class421 field31;

    @ObfuscatedName("w.e")
    public final class4 field32;

    public class8(class421 arg0, class4 arg1) {
        this.field31 = arg0;
        this.field32 = arg1;
        this.method45();
    }

    @ObfuscatedName("w.c(I)Z")
    public boolean method42() {
        return this.field43.isDone();
    }

    @ObfuscatedName("w.l(B)V")
    public void method43() {
        this.field35.shutdown();
        this.field35 = null;
    }

    @ObfuscatedName("w.s(I)Lpi;")
    public class421 method44() {
        try {
            return (class421) this.field43.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("w.e(I)V")
    public void method45() {
        this.field43 = this.field35.submit(new class2(this, this.field31, this.field32));
    }
}
