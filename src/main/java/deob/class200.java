package deob;

@ObfuscatedName("gt")
public final class class200 {

    @ObfuscatedName("gt.l")
    public int field3151;

    @ObfuscatedName("gt.g")
    public class212[] field3149;

    @ObfuscatedName("gt.r")
    public class212 field3148;

    @ObfuscatedName("gt.e")
    public class212 field3150;

    @ObfuscatedName("gt.h")
    public int field3152 = 0;

    public class200(int arg0) {
        this.field3151 = arg0;
        this.field3149 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3149[var2] = new class212();
            var3.field3174 = var3;
            var3.field3175 = var3;
        }
    }

    @ObfuscatedName("gt.l(J)Lhb;")
    public class212 method3684(long arg0) {
        class212 var3 = this.field3149[(int) (arg0 & (long) (this.field3151 - 1))];
        for (this.field3148 = var3.field3174; this.field3148 != var3; this.field3148 = this.field3148.field3174) {
            if (this.field3148.field3176 == arg0) {
                class212 var4 = this.field3148;
                this.field3148 = this.field3148.field3174;
                return var4;
            }
        }
        this.field3148 = null;
        return null;
    }

    @ObfuscatedName("gt.g(Lhb;J)V")
    public void method3688(class212 arg0, long arg1) {
        if (arg0.field3175 != null) {
            arg0.method3815();
        }
        class212 var4 = this.field3149[(int) (arg1 & (long) (this.field3151 - 1))];
        arg0.field3175 = var4.field3175;
        arg0.field3174 = var4;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
        arg0.field3176 = arg1;
    }

    @ObfuscatedName("gt.r()V")
    public void method3686() {
        for (int var1 = 0; var1 < this.field3151; var1++) {
            class212 var2 = this.field3149[var1];
            while (true) {
                class212 var3 = var2.field3174;
                if (var2 == var3) {
                    break;
                }
                var3.method3815();
            }
        }
        this.field3148 = null;
        this.field3150 = null;
    }

    @ObfuscatedName("gt.e()Lhb;")
    public class212 method3687() {
        this.field3152 = 0;
        return this.method3683();
    }

    @ObfuscatedName("gt.h()Lhb;")
    public class212 method3683() {
        if (this.field3152 > 0 && this.field3149[this.field3152 - 1] != this.field3150) {
            class212 var1 = this.field3150;
            this.field3150 = var1.field3174;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3152 >= this.field3151) {
                return null;
            }
            var2 = this.field3149[this.field3152++].field3174;
        } while (this.field3149[this.field3152 - 1] == var2);
        this.field3150 = var2.field3174;
        return var2;
    }
}
