package deob;

import java.util.Iterator;

@ObfuscatedName("gy")
public final class class202 implements Iterable {

    @ObfuscatedName("gy.i")
    public int field3155;

    @ObfuscatedName("gy.h")
    public class212[] field3154;

    @ObfuscatedName("gy.e")
    public class212 field3156;

    public class202(int arg0) {
        this.field3155 = arg0;
        this.field3154 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3154[var2] = new class212();
            var3.field3174 = var3;
            var3.field3175 = var3;
        }
    }

    @ObfuscatedName("gy.i(J)Lhk;")
    public class212 method3579(long arg0) {
        class212 var3 = this.field3154[(int) (arg0 & (long) (this.field3155 - 1))];
        for (this.field3156 = var3.field3174; this.field3156 != var3; this.field3156 = this.field3156.field3174) {
            if (this.field3156.field3176 == arg0) {
                class212 var4 = this.field3156;
                this.field3156 = this.field3156.field3174;
                return var4;
            }
        }
        this.field3156 = null;
        return null;
    }

    @ObfuscatedName("gy.h(Lhk;J)V")
    public void method3582(class212 arg0, long arg1) {
        if (arg0.field3175 != null) {
            arg0.method3706();
        }
        class212 var4 = this.field3154[(int) (arg1 & (long) (this.field3155 - 1))];
        arg0.field3175 = var4.field3175;
        arg0.field3174 = var4;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
        arg0.field3176 = arg1;
    }

    @ObfuscatedName("gy.e()V")
    public void method3588() {
        for (int var1 = 0; var1 < this.field3155; var1++) {
            class212 var2 = this.field3154[var1];
            while (true) {
                class212 var3 = var2.field3174;
                if (var2 == var3) {
                    break;
                }
                var3.method3706();
            }
        }
        this.field3156 = null;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
