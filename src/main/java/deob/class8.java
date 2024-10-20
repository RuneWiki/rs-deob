package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("p")
public class class8 {

    @ObfuscatedName("p.i")
    public ExecutorService field18 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("p.w")
    public Future field21;

    @ObfuscatedName("p.s")
    public final class401 field19;

    @ObfuscatedName("p.a")
    public final class4 field20;

    public class8(class401 arg0, class4 arg1) {
        this.field19 = arg0;
        this.field20 = arg1;
        this.method45();
    }

    @ObfuscatedName("p.i(I)Z")
    public boolean method42() {
        return this.field21.isDone();
    }

    @ObfuscatedName("p.w(I)V")
    public void method43() {
        this.field18.shutdown();
        this.field18 = null;
    }

    @ObfuscatedName("p.s(I)Lop;")
    public class401 method44() {
        try {
            return (class401) this.field21.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("p.a(I)V")
    public void method45() {
        this.field21 = this.field18.submit(new class2(this, this.field19, this.field20));
    }
}
