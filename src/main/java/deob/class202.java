package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public final class class202 implements Iterable {

    @ObfuscatedName("gu.k")
    public int field3147;

    @ObfuscatedName("gu.q")
    public class212[] field3146;

    @ObfuscatedName("gu.f")
    public class212 field3148;

    public class202(int arg0) {
        this.field3147 = arg0;
        this.field3146 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3146[var2] = new class212();
            var3.field3167 = var3;
            var3.field3168 = var3;
        }
    }

    @ObfuscatedName("gu.k(J)Lhk;")
    public class212 method3587(long arg0) {
        class212 var3 = this.field3146[(int) (arg0 & (long) (this.field3147 - 1))];
        for (this.field3148 = var3.field3167; this.field3148 != var3; this.field3148 = this.field3148.field3167) {
            if (this.field3148.field3166 == arg0) {
                class212 var4 = this.field3148;
                this.field3148 = this.field3148.field3167;
                return var4;
            }
        }
        this.field3148 = null;
        return null;
    }

    @ObfuscatedName("gu.q(Lhk;J)V")
    public void method3589(class212 arg0, long arg1) {
        if (arg0.field3168 != null) {
            arg0.method3703();
        }
        class212 var4 = this.field3146[(int) (arg1 & (long) (this.field3147 - 1))];
        arg0.field3168 = var4.field3168;
        arg0.field3167 = var4;
        arg0.field3168.field3167 = arg0;
        arg0.field3167.field3168 = arg0;
        arg0.field3166 = arg1;
    }

    @ObfuscatedName("gu.f()V")
    public void method3590() {
        for (int var1 = 0; var1 < this.field3147; var1++) {
            class212 var2 = this.field3146[var1];
            while (true) {
                class212 var3 = var2.field3167;
                if (var2 == var3) {
                    break;
                }
                var3.method3703();
            }
        }
        this.field3148 = null;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
