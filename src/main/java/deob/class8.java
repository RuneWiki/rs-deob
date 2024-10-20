package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("k")
public class class8 {

    @ObfuscatedName("k.s")
    public ExecutorService field30 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("k.h")
    public Future field26;

    @ObfuscatedName("k.w")
    public final class444 field27;

    @ObfuscatedName("k.v")
    public final class4 field28;

    public class8(class444 arg0, class4 arg1) {
        this.field27 = arg0;
        this.field28 = arg1;
        this.method49();
    }

    @ObfuscatedName("k.s(B)Z")
    public boolean method54() {
        return this.field26.isDone();
    }

    @ObfuscatedName("k.h(I)V")
    public void method47() {
        this.field30.shutdown();
        this.field30 = null;
    }

    @ObfuscatedName("k.w(B)Lqr;")
    public class444 method46() {
        try {
            return (class444) this.field26.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("k.v(I)V")
    public void method49() {
        this.field26 = this.field30.submit(new class2(this, this.field27, this.field28));
    }
}
