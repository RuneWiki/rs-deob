package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("d")
public class class8 {

    @ObfuscatedName("d.a")
    public ExecutorService field26 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("d.f")
    public Future field34;

    @ObfuscatedName("d.c")
    public final class464 field28;

    @ObfuscatedName("d.x")
    public final class4 field29;

    public class8(class464 arg0, class4 arg1) {
        this.field28 = arg0;
        this.field29 = arg1;
        this.method43();
    }

    @ObfuscatedName("d.a(I)Z")
    public boolean method30() {
        return this.field34.isDone();
    }

    @ObfuscatedName("d.f(B)V")
    public void method31() {
        this.field26.shutdown();
        this.field26 = null;
    }

    @ObfuscatedName("d.c(I)Lqr;")
    public class464 method32() {
        try {
            return (class464) this.field34.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("d.x(B)V")
    public void method43() {
        this.field34 = this.field26.submit(new class2(this, this.field28, this.field29));
    }
}
