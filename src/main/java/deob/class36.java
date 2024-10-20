package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("aq")
public class class36 {

    @ObfuscatedName("aq.f")
    public ExecutorService field246 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("aq.e")
    public Future field240;

    @ObfuscatedName("aq.v")
    public final class384 field248;

    @ObfuscatedName("aq.y")
    public final class32 field242;

    public class36(class384 arg0, class32 arg1) {
        this.field248 = arg0;
        this.field242 = arg1;
        this.method250();
    }

    @ObfuscatedName("aq.f(I)Z")
    public boolean method257() {
        return this.field240.isDone();
    }

    @ObfuscatedName("aq.e(B)V")
    public void method247() {
        this.field246.shutdown();
        this.field246 = null;
    }

    @ObfuscatedName("aq.v(I)Lnt;")
    public class384 method253() {
        try {
            return (class384) this.field240.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("aq.y(I)V")
    public void method250() {
        this.field240 = this.field246.submit(new class30(this, this.field248, this.field242));
    }
}
