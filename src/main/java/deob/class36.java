package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("as")
public class class36 {

    @ObfuscatedName("as.v")
    public ExecutorService field263 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("as.n")
    public Future field261;

    @ObfuscatedName("as.f")
    public final class383 field262;

    @ObfuscatedName("as.y")
    public final class32 field269;

    public class36(class383 arg0, class32 arg1) {
        this.field262 = arg0;
        this.field269 = arg1;
        this.method236();
    }

    @ObfuscatedName("as.v(B)Z")
    public boolean method243() {
        return this.field261.isDone();
    }

    @ObfuscatedName("as.n(B)V")
    public void method233() {
        this.field263.shutdown();
        this.field263 = null;
    }

    @ObfuscatedName("as.f(I)Lnd;")
    public class383 method232() {
        try {
            return (class383) this.field261.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("as.y(B)V")
    public void method236() {
        this.field261 = this.field263.submit(new class30(this, this.field262, this.field269));
    }
}
