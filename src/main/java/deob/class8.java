package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("a")
public class class8 {

    @ObfuscatedName("a.l")
    public ExecutorService field29 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("a.q")
    public Future field26;

    @ObfuscatedName("a.f")
    public final class401 field31;

    @ObfuscatedName("a.j")
    public final class4 field28;

    public class8(class401 arg0, class4 arg1) {
        this.field31 = arg0;
        this.field28 = arg1;
        this.method47();
    }

    @ObfuscatedName("a.l(I)Z")
    public boolean method44() {
        return this.field26.isDone();
    }

    @ObfuscatedName("a.q(B)V")
    public void method45() {
        this.field29.shutdown();
        this.field29 = null;
    }

    @ObfuscatedName("a.f(I)Lot;")
    public class401 method46() {
        try {
            return (class401) this.field26.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("a.j(B)V")
    public void method47() {
        this.field26 = this.field29.submit(new class2(this, this.field31, this.field28));
    }
}
