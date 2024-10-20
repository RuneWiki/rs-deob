package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("r")
public class class8 {

    @ObfuscatedName("r.h")
    public ExecutorService field24 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("r.e")
    public Future field25;

    @ObfuscatedName("r.v")
    public final class467 field26;

    @ObfuscatedName("r.x")
    public final class4 field29;

    public class8(class467 arg0, class4 arg1) {
        this.field26 = arg0;
        this.field29 = arg1;
        this.method41();
    }

    @ObfuscatedName("r.h(B)Z")
    public boolean method52() {
        return this.field25.isDone();
    }

    @ObfuscatedName("r.e(B)V")
    public void method40() {
        this.field24.shutdown();
        this.field24 = null;
    }

    @ObfuscatedName("r.v(I)Lqy;")
    public class467 method51() {
        try {
            return (class467) this.field25.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("r.x(B)V")
    public void method41() {
        this.field25 = this.field24.submit(new class2(this, this.field26, this.field29));
    }
}
