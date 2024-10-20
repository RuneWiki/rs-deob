package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ax")
public class class36 {

    @ObfuscatedName("ax.f")
    public ExecutorService field240 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ax.o")
    public Future field239;

    @ObfuscatedName("ax.u")
    public final class382 field238;

    @ObfuscatedName("ax.p")
    public final class32 field241;

    public class36(class382 arg0, class32 arg1) {
        this.field238 = arg0;
        this.field241 = arg1;
        this.method256();
    }

    @ObfuscatedName("ax.f(I)Z")
    public boolean method250() {
        return this.field239.isDone();
    }

    @ObfuscatedName("ax.o(B)V")
    public void method251() {
        this.field240.shutdown();
        this.field240 = null;
    }

    @ObfuscatedName("ax.u(B)Lnu;")
    public class382 method249() {
        try {
            return (class382) this.field239.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("ax.p(I)V")
    public void method256() {
        this.field239 = this.field240.submit(new class30(this, this.field238, this.field241));
    }
}
