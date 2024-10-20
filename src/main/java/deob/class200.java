package deob;

@ObfuscatedName("gy")
public final class class200 {

    @ObfuscatedName("gy.k")
    public int field3144;

    @ObfuscatedName("gy.q")
    public class212[] field3141;

    @ObfuscatedName("gy.f")
    public class212 field3142;

    @ObfuscatedName("gy.c")
    public class212 field3140;

    @ObfuscatedName("gy.v")
    public int field3143 = 0;

    public class200(int arg0) {
        this.field3144 = arg0;
        this.field3141 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3141[var2] = new class212();
            var3.field3167 = var3;
            var3.field3168 = var3;
        }
    }

    @ObfuscatedName("gy.k(J)Lhk;")
    public class212 method3580(long arg0) {
        class212 var3 = this.field3141[(int) (arg0 & (long) (this.field3144 - 1))];
        for (this.field3142 = var3.field3167; this.field3142 != var3; this.field3142 = this.field3142.field3167) {
            if (this.field3142.field3166 == arg0) {
                class212 var4 = this.field3142;
                this.field3142 = this.field3142.field3167;
                return var4;
            }
        }
        this.field3142 = null;
        return null;
    }

    @ObfuscatedName("gy.q(Lhk;J)V")
    public void method3574(class212 arg0, long arg1) {
        if (arg0.field3168 != null) {
            arg0.method3703();
        }
        class212 var4 = this.field3141[(int) (arg1 & (long) (this.field3144 - 1))];
        arg0.field3168 = var4.field3168;
        arg0.field3167 = var4;
        arg0.field3168.field3167 = arg0;
        arg0.field3167.field3168 = arg0;
        arg0.field3166 = arg1;
    }

    @ObfuscatedName("gy.f()V")
    public void method3576() {
        for (int var1 = 0; var1 < this.field3144; var1++) {
            class212 var2 = this.field3141[var1];
            while (true) {
                class212 var3 = var2.field3167;
                if (var2 == var3) {
                    break;
                }
                var3.method3703();
            }
        }
        this.field3142 = null;
        this.field3140 = null;
    }

    @ObfuscatedName("gy.c()Lhk;")
    public class212 method3577() {
        this.field3143 = 0;
        return this.method3578();
    }

    @ObfuscatedName("gy.v()Lhk;")
    public class212 method3578() {
        if (this.field3143 > 0 && this.field3141[this.field3143 - 1] != this.field3140) {
            class212 var1 = this.field3140;
            this.field3140 = var1.field3167;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3143 >= this.field3144) {
                return null;
            }
            var2 = this.field3141[this.field3143++].field3167;
        } while (this.field3141[this.field3143 - 1] == var2);
        this.field3140 = var2.field3167;
        return var2;
    }
}
