package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("l")
public class class8 {

    @ObfuscatedName("l.v")
    public ExecutorService field21 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("l.c")
    public Future field19;

    @ObfuscatedName("l.i")
    public final class438 field20;

    @ObfuscatedName("l.f")
    public final class4 field18;

    public class8(class438 arg0, class4 arg1) {
        this.field20 = arg0;
        this.field18 = arg1;
        this.method40();
    }

    @ObfuscatedName("l.v(I)Z")
    public boolean method41() {
        return this.field19.isDone();
    }

    @ObfuscatedName("l.c(B)V")
    public void method45() {
        this.field21.shutdown();
        this.field21 = null;
    }

    @ObfuscatedName("l.i(I)Lpi;")
    public class438 method43() {
        try {
            return (class438) this.field19.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("l.f(B)V")
    public void method40() {
        this.field19 = this.field21.submit(new class2(this, this.field20, this.field18));
    }
}
