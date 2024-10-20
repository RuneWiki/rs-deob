package deob;

@ObfuscatedName("gg")
public final class class200 {

    @ObfuscatedName("gg.i")
    public int field3152;

    @ObfuscatedName("gg.h")
    public class212[] field3149;

    @ObfuscatedName("gg.e")
    public class212 field3150;

    @ObfuscatedName("gg.g")
    public class212 field3151;

    @ObfuscatedName("gg.n")
    public int field3148 = 0;

    public class200(int arg0) {
        this.field3152 = arg0;
        this.field3149 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3149[var2] = new class212();
            var3.field3174 = var3;
            var3.field3175 = var3;
        }
    }

    @ObfuscatedName("gg.i(J)Lhk;")
    public class212 method3564(long arg0) {
        class212 var3 = this.field3149[(int) (arg0 & (long) (this.field3152 - 1))];
        for (this.field3150 = var3.field3174; this.field3150 != var3; this.field3150 = this.field3150.field3174) {
            if (this.field3150.field3176 == arg0) {
                class212 var4 = this.field3150;
                this.field3150 = this.field3150.field3174;
                return var4;
            }
        }
        this.field3150 = null;
        return null;
    }

    @ObfuscatedName("gg.h(Lhk;J)V")
    public void method3565(class212 arg0, long arg1) {
        if (arg0.field3175 != null) {
            arg0.method3706();
        }
        class212 var4 = this.field3149[(int) (arg1 & (long) (this.field3152 - 1))];
        arg0.field3175 = var4.field3175;
        arg0.field3174 = var4;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
        arg0.field3176 = arg1;
    }

    @ObfuscatedName("gg.e()V")
    public void method3572() {
        for (int var1 = 0; var1 < this.field3152; var1++) {
            class212 var2 = this.field3149[var1];
            while (true) {
                class212 var3 = var2.field3174;
                if (var2 == var3) {
                    break;
                }
                var3.method3706();
            }
        }
        this.field3150 = null;
        this.field3151 = null;
    }

    @ObfuscatedName("gg.g()Lhk;")
    public class212 method3567() {
        this.field3148 = 0;
        return this.method3568();
    }

    @ObfuscatedName("gg.n()Lhk;")
    public class212 method3568() {
        if (this.field3148 > 0 && this.field3149[this.field3148 - 1] != this.field3151) {
            class212 var1 = this.field3151;
            this.field3151 = var1.field3174;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3148 >= this.field3152) {
                return null;
            }
            var2 = this.field3149[this.field3148++].field3174;
        } while (this.field3149[this.field3148 - 1] == var2);
        this.field3151 = var2.field3174;
        return var2;
    }
}
