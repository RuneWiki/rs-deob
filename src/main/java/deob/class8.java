package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("s")
public class class8 {

    @ObfuscatedName("s.o")
    public ExecutorService field26 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("s.q")
    public Future field21;

    @ObfuscatedName("s.l")
    public final class440 field20;

    @ObfuscatedName("s.k")
    public final class4 field23;

    public class8(class440 arg0, class4 arg1) {
        this.field20 = arg0;
        this.field23 = arg1;
        this.method48();
    }

    @ObfuscatedName("s.o(B)Z")
    public boolean method45() {
        return this.field21.isDone();
    }

    @ObfuscatedName("s.q(B)V")
    public void method46() {
        this.field26.shutdown();
        this.field26 = null;
    }

    @ObfuscatedName("s.l(S)Lpx;")
    public class440 method47() {
        try {
            return (class440) this.field21.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("s.k(S)V")
    public void method48() {
        this.field21 = this.field26.submit(new class2(this, this.field20, this.field23));
    }
}
