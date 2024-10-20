package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("aq")
public class class8 {

    @ObfuscatedName("aq.aj")
    public ExecutorService field25 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("aq.al")
    public Future field20;

    @ObfuscatedName("aq.ac")
    public final class478 field21;

    @ObfuscatedName("aq.ab")
    public final class4 field22;

    public class8(class478 arg0, class4 arg1) {
        this.field21 = arg0;
        this.field22 = arg1;
        this.method40();
    }

    @ObfuscatedName("aq.aj(B)Z")
    public boolean method47() {
        return this.field20.isDone();
    }

    @ObfuscatedName("aq.al(I)V")
    public void method45() {
        this.field25.shutdown();
        this.field25 = null;
    }

    @ObfuscatedName("aq.ac(I)Lsy;")
    public class478 method36() {
        try {
            return (class478) this.field20.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("aq.ab(I)V")
    public void method40() {
        this.field20 = this.field25.submit(new class2(this, this.field21, this.field22));
    }
}
