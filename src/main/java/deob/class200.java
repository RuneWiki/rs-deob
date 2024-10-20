package deob;

@ObfuscatedName("ga")
public final class class200 {

    @ObfuscatedName("ga.f")
    public int field3142;

    @ObfuscatedName("ga.e")
    public class212[] field3141;

    @ObfuscatedName("ga.n")
    public class212 field3144;

    @ObfuscatedName("ga.t")
    public class212 field3143;

    @ObfuscatedName("ga.v")
    public int field3140 = 0;

    public class200(int arg0) {
        this.field3142 = arg0;
        this.field3141 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3141[var2] = new class212();
            var3.field3166 = var3;
            var3.field3168 = var3;
        }
    }

    @ObfuscatedName("ga.f(J)Lhs;")
    public class212 method3605(long arg0) {
        class212 var3 = this.field3141[(int) (arg0 & (long) (this.field3142 - 1))];
        for (this.field3144 = var3.field3166; this.field3144 != var3; this.field3144 = this.field3144.field3166) {
            if (this.field3144.field3167 == arg0) {
                class212 var4 = this.field3144;
                this.field3144 = this.field3144.field3166;
                return var4;
            }
        }
        this.field3144 = null;
        return null;
    }

    @ObfuscatedName("ga.e(Lhs;J)V")
    public void method3606(class212 arg0, long arg1) {
        if (arg0.field3168 != null) {
            arg0.method3744();
        }
        class212 var4 = this.field3141[(int) (arg1 & (long) (this.field3142 - 1))];
        arg0.field3168 = var4.field3168;
        arg0.field3166 = var4;
        arg0.field3168.field3166 = arg0;
        arg0.field3166.field3168 = arg0;
        arg0.field3167 = arg1;
    }

    @ObfuscatedName("ga.n()V")
    public void method3607() {
        for (int var1 = 0; var1 < this.field3142; var1++) {
            class212 var2 = this.field3141[var1];
            while (true) {
                class212 var3 = var2.field3166;
                if (var2 == var3) {
                    break;
                }
                var3.method3744();
            }
        }
        this.field3144 = null;
        this.field3143 = null;
    }

    @ObfuscatedName("ga.t()Lhs;")
    public class212 method3608() {
        this.field3140 = 0;
        return this.method3613();
    }

    @ObfuscatedName("ga.v()Lhs;")
    public class212 method3613() {
        if (this.field3140 > 0 && this.field3141[this.field3140 - 1] != this.field3143) {
            class212 var1 = this.field3143;
            this.field3143 = var1.field3166;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3140 >= this.field3142) {
                return null;
            }
            var2 = this.field3141[this.field3140++].field3166;
        } while (this.field3141[this.field3140 - 1] == var2);
        this.field3143 = var2.field3166;
        return var2;
    }
}
