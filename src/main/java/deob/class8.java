package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("w")
public class class8 {

    @ObfuscatedName("w.c")
    public ExecutorService field26 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("w.v")
    public Future field23;

    @ObfuscatedName("w.q")
    public final class443 field22;

    @ObfuscatedName("w.f")
    public final class4 field25;

    public class8(class443 arg0, class4 arg1) {
        this.field22 = arg0;
        this.field25 = arg1;
        this.method41();
    }

    @ObfuscatedName("w.c(I)Z")
    public boolean method44() {
        return this.field23.isDone();
    }

    @ObfuscatedName("w.v(I)V")
    public void method39() {
        this.field26.shutdown();
        this.field26 = null;
    }

    @ObfuscatedName("w.q(I)Lqt;")
    public class443 method40() {
        try {
            return (class443) this.field23.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("w.f(I)V")
    public void method41() {
        this.field23 = this.field26.submit(new class2(this, this.field22, this.field25));
    }
}
