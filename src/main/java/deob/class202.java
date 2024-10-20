package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public final class class202 implements Iterable {

    @ObfuscatedName("gx.l")
    public int field3156;

    @ObfuscatedName("gx.g")
    public class212[] field3155;

    @ObfuscatedName("gx.r")
    public class212 field3154;

    public class202(int arg0) {
        this.field3156 = arg0;
        this.field3155 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3155[var2] = new class212();
            var3.field3174 = var3;
            var3.field3175 = var3;
        }
    }

    @ObfuscatedName("gx.l(J)Lhb;")
    public class212 method3698(long arg0) {
        class212 var3 = this.field3155[(int) (arg0 & (long) (this.field3156 - 1))];
        for (this.field3154 = var3.field3174; this.field3154 != var3; this.field3154 = this.field3154.field3174) {
            if (this.field3154.field3176 == arg0) {
                class212 var4 = this.field3154;
                this.field3154 = this.field3154.field3174;
                return var4;
            }
        }
        this.field3154 = null;
        return null;
    }

    @ObfuscatedName("gx.g(Lhb;J)V")
    public void method3696(class212 arg0, long arg1) {
        if (arg0.field3175 != null) {
            arg0.method3815();
        }
        class212 var4 = this.field3155[(int) (arg1 & (long) (this.field3156 - 1))];
        arg0.field3175 = var4.field3175;
        arg0.field3174 = var4;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
        arg0.field3176 = arg1;
    }

    @ObfuscatedName("gx.r()V")
    public void method3697() {
        for (int var1 = 0; var1 < this.field3156; var1++) {
            class212 var2 = this.field3155[var1];
            while (true) {
                class212 var3 = var2.field3174;
                if (var2 == var3) {
                    break;
                }
                var3.method3815();
            }
        }
        this.field3154 = null;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
