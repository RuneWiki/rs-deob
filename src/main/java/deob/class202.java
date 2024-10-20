package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public final class class202 implements Iterable {

    @ObfuscatedName("gu.m")
    public int field3147;

    @ObfuscatedName("gu.w")
    public class212[] field3148;

    @ObfuscatedName("gu.e")
    public class212 field3149;

    public class202(int arg0) {
        this.field3147 = arg0;
        this.field3148 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3148[var2] = new class212();
            var3.field3169 = var3;
            var3.field3167 = var3;
        }
    }

    @ObfuscatedName("gu.m(J)Lhf;")
    public class212 method3603(long arg0) {
        class212 var3 = this.field3148[(int) (arg0 & (long) (this.field3147 - 1))];
        for (this.field3149 = var3.field3169; this.field3149 != var3; this.field3149 = this.field3149.field3169) {
            if (this.field3149.field3168 == arg0) {
                class212 var4 = this.field3149;
                this.field3149 = this.field3149.field3169;
                return var4;
            }
        }
        this.field3149 = null;
        return null;
    }

    @ObfuscatedName("gu.w(Lhf;J)V")
    public void method3600(class212 arg0, long arg1) {
        if (arg0.field3167 != null) {
            arg0.method3729();
        }
        class212 var4 = this.field3148[(int) (arg1 & (long) (this.field3147 - 1))];
        arg0.field3167 = var4.field3167;
        arg0.field3169 = var4;
        arg0.field3167.field3169 = arg0;
        arg0.field3169.field3167 = arg0;
        arg0.field3168 = arg1;
    }

    @ObfuscatedName("gu.e()V")
    public void method3602() {
        for (int var1 = 0; var1 < this.field3147; var1++) {
            class212 var2 = this.field3148[var1];
            while (true) {
                class212 var3 = var2.field3169;
                if (var2 == var3) {
                    break;
                }
                var3.method3729();
            }
        }
        this.field3149 = null;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
