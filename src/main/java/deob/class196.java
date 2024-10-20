package deob;

@ObfuscatedName("gs")
public final class class196 {

    @ObfuscatedName("gs.j")
    public int field3082;

    @ObfuscatedName("gs.m")
    public class208[] field3079;

    @ObfuscatedName("gs.f")
    public class208 field3080;

    @ObfuscatedName("gs.l")
    public class208 field3081;

    @ObfuscatedName("gs.u")
    public int field3078 = 0;

    public class196(int arg0) {
        this.field3082 = arg0;
        this.field3079 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3079[var2] = new class208();
            var3.field3103 = var3;
            var3.field3104 = var3;
        }
    }

    @ObfuscatedName("gs.j(J)Lgt;")
    public class208 method3571(long arg0) {
        class208 var3 = this.field3079[(int) (arg0 & (long) (this.field3082 - 1))];
        for (this.field3080 = var3.field3103; this.field3080 != var3; this.field3080 = this.field3080.field3103) {
            if (this.field3080.field3105 == arg0) {
                class208 var4 = this.field3080;
                this.field3080 = this.field3080.field3103;
                return var4;
            }
        }
        this.field3080 = null;
        return null;
    }

    @ObfuscatedName("gs.m(Lgt;J)V")
    public void method3574(class208 arg0, long arg1) {
        if (arg0.field3104 != null) {
            arg0.method3700();
        }
        class208 var4 = this.field3079[(int) (arg1 & (long) (this.field3082 - 1))];
        arg0.field3104 = var4.field3104;
        arg0.field3103 = var4;
        arg0.field3104.field3103 = arg0;
        arg0.field3103.field3104 = arg0;
        arg0.field3105 = arg1;
    }

    @ObfuscatedName("gs.f()V")
    public void method3573() {
        for (int var1 = 0; var1 < this.field3082; var1++) {
            class208 var2 = this.field3079[var1];
            while (true) {
                class208 var3 = var2.field3103;
                if (var2 == var3) {
                    break;
                }
                var3.method3700();
            }
        }
        this.field3080 = null;
        this.field3081 = null;
    }

    @ObfuscatedName("gs.l()Lgt;")
    public class208 method3570() {
        this.field3078 = 0;
        return this.method3575();
    }

    @ObfuscatedName("gs.u()Lgt;")
    public class208 method3575() {
        if (this.field3078 > 0 && this.field3079[this.field3078 - 1] != this.field3081) {
            class208 var1 = this.field3081;
            this.field3081 = var1.field3103;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3078 >= this.field3082) {
                return null;
            }
            var2 = this.field3079[this.field3078++].field3103;
        } while (this.field3079[this.field3078 - 1] == var2);
        this.field3081 = var2.field3103;
        return var2;
    }
}
