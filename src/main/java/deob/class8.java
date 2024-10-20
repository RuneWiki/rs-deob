package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("av")
public class class8 {

    @ObfuscatedName("av.aq")
    public ExecutorService field23 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("av.ad")
    public Future field29;

    @ObfuscatedName("av.ag")
    public final class547 field24;

    @ObfuscatedName("av.ak")
    public final class4 field28;

    public class8(class547 arg0, class4 arg1) {
        this.field24 = arg0;
        this.field28 = arg1;
        this.method43();
    }

    @ObfuscatedName("av.aq(I)Z")
    public boolean method40() {
        return this.field29.isDone();
    }

    @ObfuscatedName("av.ad(I)V")
    public void method41() {
        this.field23.shutdown();
        this.field23 = null;
    }

    @ObfuscatedName("av.ag(B)Lvp;")
    public class547 method42() {
        try {
            return (class547) this.field29.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("av.ak(B)V")
    public void method43() {
        this.field29 = this.field23.submit(new class2(this, this.field24, this.field28));
    }
}
