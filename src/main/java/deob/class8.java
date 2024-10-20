package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ak")
public class class8 {

    @ObfuscatedName("ak.at")
    public ExecutorService field21 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ak.an")
    public Future field22;

    @ObfuscatedName("ak.av")
    public final class501 field20;

    @ObfuscatedName("ak.as")
    public final class4 field23;

    public class8(class501 arg0, class4 arg1) {
        this.field20 = arg0;
        this.field23 = arg1;
        this.method40();
    }

    @ObfuscatedName("ak.at(I)Z")
    public boolean method36() {
        return this.field22.isDone();
    }

    @ObfuscatedName("ak.an(I)V")
    public void method49() {
        this.field21.shutdown();
        this.field21 = null;
    }

    @ObfuscatedName("ak.av(I)Ltz;")
    public class501 method39() {
        try {
            return (class501) this.field22.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("ak.as(S)V")
    public void method40() {
        this.field22 = this.field21.submit(new class2(this, this.field20, this.field23));
    }
}
