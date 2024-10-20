package deob;

@ObfuscatedName("gr")
public final class class200 {

    @ObfuscatedName("gr.x")
    public int field3151;

    @ObfuscatedName("gr.r")
    public class212[] field3148;

    @ObfuscatedName("gr.j")
    public class212 field3149;

    @ObfuscatedName("gr.z")
    public class212 field3150;

    @ObfuscatedName("gr.i")
    public int field3147 = 0;

    public class200(int arg0) {
        this.field3151 = arg0;
        this.field3148 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3148[var2] = new class212();
            var3.field3175 = var3;
            var3.field3173 = var3;
        }
    }

    @ObfuscatedName("gr.x(J)Lhn;")
    public class212 method3580(long arg0) {
        class212 var3 = this.field3148[(int) (arg0 & (long) (this.field3151 - 1))];
        for (this.field3149 = var3.field3175; this.field3149 != var3; this.field3149 = this.field3149.field3175) {
            if (this.field3149.field3174 == arg0) {
                class212 var4 = this.field3149;
                this.field3149 = this.field3149.field3175;
                return var4;
            }
        }
        this.field3149 = null;
        return null;
    }

    @ObfuscatedName("gr.r(Lhn;J)V")
    public void method3569(class212 arg0, long arg1) {
        if (arg0.field3173 != null) {
            arg0.method3695();
        }
        class212 var4 = this.field3148[(int) (arg1 & (long) (this.field3151 - 1))];
        arg0.field3173 = var4.field3173;
        arg0.field3175 = var4;
        arg0.field3173.field3175 = arg0;
        arg0.field3175.field3173 = arg0;
        arg0.field3174 = arg1;
    }

    @ObfuscatedName("gr.j()V")
    public void method3570() {
        for (int var1 = 0; var1 < this.field3151; var1++) {
            class212 var2 = this.field3148[var1];
            while (true) {
                class212 var3 = var2.field3175;
                if (var2 == var3) {
                    break;
                }
                var3.method3695();
            }
        }
        this.field3149 = null;
        this.field3150 = null;
    }

    @ObfuscatedName("gr.z()Lhn;")
    public class212 method3571() {
        this.field3147 = 0;
        return this.method3572();
    }

    @ObfuscatedName("gr.i()Lhn;")
    public class212 method3572() {
        if (this.field3147 > 0 && this.field3148[this.field3147 - 1] != this.field3150) {
            class212 var1 = this.field3150;
            this.field3150 = var1.field3175;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3147 >= this.field3151) {
                return null;
            }
            var2 = this.field3148[this.field3147++].field3175;
        } while (this.field3148[this.field3147 - 1] == var2);
        this.field3150 = var2.field3175;
        return var2;
    }
}
