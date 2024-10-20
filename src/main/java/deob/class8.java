package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("ac")
public class class8 {

    @ObfuscatedName("ac.ab")
    public ExecutorService field15 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("ac.ay")
    public Future field16;

    @ObfuscatedName("ac.an")
    public final class549 field17;

    @ObfuscatedName("ac.au")
    public final class4 field21;

    public class8(class549 arg0, class4 arg1) {
        this.field17 = arg0;
        this.field21 = arg1;
        this.method42();
    }

    @ObfuscatedName("ac.ab(B)Z")
    public boolean method49() {
        return this.field16.isDone();
    }

    @ObfuscatedName("ac.ay(I)V")
    public void method40() {
        this.field15.shutdown();
        this.field15 = null;
    }

    @ObfuscatedName("ac.an(I)Lvg;")
    public class549 method41() {
        try {
            return (class549) this.field16.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("ac.au(I)V")
    public void method42() {
        this.field16 = this.field15.submit(new class2(this, this.field17, this.field21));
    }
}
