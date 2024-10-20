package deob;

import java.util.Iterator;

@ObfuscatedName("rz")
public final class class454 implements Iterable {

    @ObfuscatedName("rz.aj")
    public int field4807;

    @ObfuscatedName("rz.al")
    public class444[] field4806;

    @ObfuscatedName("rz.ac")
    public class444 field4808;

    @ObfuscatedName("rz.ab")
    public class444 field4809;

    @ObfuscatedName("rz.an")
    public int field4810 = 0;

    public class454(int arg0) {
        this.field4807 = arg0;
        this.field4806 = new class444[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class444 var3 = this.field4806[var2] = new class444();
            var3.field4672 = var3;
            var3.field4674 = var3;
        }
    }

    @ObfuscatedName("rz.aj(J)Lru;")
    public class444 method7611(long arg0) {
        class444 var3 = this.field4806[(int) (arg0 & (long) (this.field4807 - 1))];
        for (this.field4808 = var3.field4672; this.field4808 != var3; this.field4808 = this.field4808.field4672) {
            if (this.field4808.field4673 == arg0) {
                class444 var4 = this.field4808;
                this.field4808 = this.field4808.field4672;
                return var4;
            }
        }
        this.field4808 = null;
        return null;
    }

    @ObfuscatedName("rz.al(Lru;J)V")
    public void method7595(class444 arg0, long arg1) {
        if (arg0.field4674 != null) {
            arg0.method7335();
        }
        class444 var4 = this.field4806[(int) (arg1 & (long) (this.field4807 - 1))];
        arg0.field4674 = var4.field4674;
        arg0.field4672 = var4;
        arg0.field4674.field4672 = arg0;
        arg0.field4672.field4674 = arg0;
        arg0.field4673 = arg1;
    }

    @ObfuscatedName("rz.ac()V")
    public void method7596() {
        for (int var1 = 0; var1 < this.field4807; var1++) {
            class444 var2 = this.field4806[var1];
            while (true) {
                class444 var3 = var2.field4672;
                if (var2 == var3) {
                    break;
                }
                var3.method7335();
            }
        }
        this.field4808 = null;
        this.field4809 = null;
    }

    @ObfuscatedName("rz.ab()Lru;")
    public class444 method7597() {
        this.field4810 = 0;
        return this.method7598();
    }

    @ObfuscatedName("rz.an()Lru;")
    public class444 method7598() {
        if (this.field4810 > 0 && this.field4806[this.field4810 - 1] != this.field4809) {
            class444 var1 = this.field4809;
            this.field4809 = var1.field4672;
            return var1;
        }
        class444 var2;
        do {
            if (this.field4810 >= this.field4807) {
                return null;
            }
            var2 = this.field4806[this.field4810++].field4672;
        } while (this.field4806[this.field4810 - 1] == var2);
        this.field4809 = var2.field4672;
        return var2;
    }

    public Iterator iterator() {
        return new class453(this);
    }
}
