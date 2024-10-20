package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("n")
public class class8 {

    @ObfuscatedName("n.f")
    public ExecutorService field25 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("n.w")
    public Future field24;

    @ObfuscatedName("n.v")
    public final class474 field23;

    @ObfuscatedName("n.s")
    public final class4 field26;

    public class8(class474 arg0, class4 arg1) {
        this.field23 = arg0;
        this.field26 = arg1;
        this.method62();
    }

    @ObfuscatedName("n.f(I)Z")
    public boolean method49() {
        return this.field24.isDone();
    }

    @ObfuscatedName("n.w(I)V")
    public void method50() {
        this.field25.shutdown();
        this.field25 = null;
    }

    @ObfuscatedName("n.v(I)Lrd;")
    public class474 method61() {
        try {
            return (class474) this.field24.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("n.s(I)V")
    public void method62() {
        this.field24 = this.field25.submit(new class2(this, this.field23, this.field26));
    }
}
