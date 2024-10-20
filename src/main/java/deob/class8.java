package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("f")
public class class8 {

    @ObfuscatedName("f.s")
    public ExecutorService field22 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("f.t")
    public Future field24;

    @ObfuscatedName("f.v")
    public final class385 field23;

    @ObfuscatedName("f.j")
    public final class4 field25;

    public class8(class385 arg0, class4 arg1) {
        this.field23 = arg0;
        this.field25 = arg1;
        this.method44();
    }

    @ObfuscatedName("f.s(B)Z")
    public boolean method42() {
        return this.field24.isDone();
    }

    @ObfuscatedName("f.t(I)V")
    public void method45() {
        this.field22.shutdown();
        this.field22 = null;
    }

    @ObfuscatedName("f.v(B)Lnv;")
    public class385 method53() {
        try {
            return (class385) this.field24.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("f.j(B)V")
    public void method44() {
        this.field24 = this.field22.submit(new class2(this, this.field23, this.field25));
    }
}
