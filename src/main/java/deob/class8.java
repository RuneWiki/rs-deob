package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("az")
public class class8 {

    @ObfuscatedName("az.aw")
    public ExecutorService field32 = Executors.newSingleThreadExecutor();

    @ObfuscatedName("az.ay")
    public Future field30;

    @ObfuscatedName("az.ar")
    public final class514 field28;

    @ObfuscatedName("az.am")
    public final class4 field29;

    public class8(class514 arg0, class4 arg1) {
        this.field28 = arg0;
        this.field29 = arg1;
        this.method50();
    }

    @ObfuscatedName("az.aw(I)Z")
    public boolean method52() {
        return this.field30.isDone();
    }

    @ObfuscatedName("az.ay(B)V")
    public void method45() {
        this.field32.shutdown();
        this.field32 = null;
    }

    @ObfuscatedName("az.ar(I)Lty;")
    public class514 method46() {
        try {
            return (class514) this.field30.get();
        } catch (Exception var2) {
            return null;
        }
    }

    @ObfuscatedName("az.am(I)V")
    public void method50() {
        this.field30 = this.field32.submit(new class2(this, this.field28, this.field29));
    }
}
