package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public final class class202 implements Iterable {

    @ObfuscatedName("gc.x")
    public int field3155;

    @ObfuscatedName("gc.r")
    public class212[] field3153;

    @ObfuscatedName("gc.j")
    public class212 field3154;

    public class202(int arg0) {
        this.field3155 = arg0;
        this.field3153 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3153[var2] = new class212();
            var3.field3175 = var3;
            var3.field3173 = var3;
        }
    }

    @ObfuscatedName("gc.x(J)Lhn;")
    public class212 method3589(long arg0) {
        class212 var3 = this.field3153[(int) (arg0 & (long) (this.field3155 - 1))];
        for (this.field3154 = var3.field3175; this.field3154 != var3; this.field3154 = this.field3154.field3175) {
            if (this.field3154.field3174 == arg0) {
                class212 var4 = this.field3154;
                this.field3154 = this.field3154.field3175;
                return var4;
            }
        }
        this.field3154 = null;
        return null;
    }

    @ObfuscatedName("gc.r(Lhn;J)V")
    public void method3584(class212 arg0, long arg1) {
        if (arg0.field3173 != null) {
            arg0.method3695();
        }
        class212 var4 = this.field3153[(int) (arg1 & (long) (this.field3155 - 1))];
        arg0.field3173 = var4.field3173;
        arg0.field3175 = var4;
        arg0.field3173.field3175 = arg0;
        arg0.field3175.field3173 = arg0;
        arg0.field3174 = arg1;
    }

    @ObfuscatedName("gc.j()V")
    public void method3585() {
        for (int var1 = 0; var1 < this.field3155; var1++) {
            class212 var2 = this.field3153[var1];
            while (true) {
                class212 var3 = var2.field3175;
                if (var2 == var3) {
                    break;
                }
                var3.method3695();
            }
        }
        this.field3154 = null;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
