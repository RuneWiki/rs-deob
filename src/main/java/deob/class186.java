package deob;

@ObfuscatedName("gj")
public final class class186 {

    @ObfuscatedName("gj.q")
    public int field2934;

    @ObfuscatedName("gj.s")
    public class198[] field2932;

    @ObfuscatedName("gj.h")
    public class198 field2933;

    @ObfuscatedName("gj.e")
    public class198 field2935;

    @ObfuscatedName("gj.n")
    public int field2936 = 0;

    public class186(int arg0) {
        this.field2934 = arg0;
        this.field2932 = new class198[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class198 var3 = this.field2932[var2] = new class198();
            var3.field2959 = var3;
            var3.field2957 = var3;
        }
    }

    @ObfuscatedName("gj.q(J)Lgw;")
    public class198 method3273(long arg0) {
        class198 var3 = this.field2932[(int) (arg0 & (long) (this.field2934 - 1))];
        for (this.field2933 = var3.field2959; this.field2933 != var3; this.field2933 = this.field2933.field2959) {
            if (this.field2933.field2958 == arg0) {
                class198 var4 = this.field2933;
                this.field2933 = this.field2933.field2959;
                return var4;
            }
        }
        this.field2933 = null;
        return null;
    }

    @ObfuscatedName("gj.s(Lgw;J)V")
    public void method3274(class198 arg0, long arg1) {
        if (arg0.field2957 != null) {
            arg0.method3404();
        }
        class198 var4 = this.field2932[(int) (arg1 & (long) (this.field2934 - 1))];
        arg0.field2957 = var4.field2957;
        arg0.field2959 = var4;
        arg0.field2957.field2959 = arg0;
        arg0.field2959.field2957 = arg0;
        arg0.field2958 = arg1;
    }

    @ObfuscatedName("gj.h()V")
    public void method3275() {
        for (int var1 = 0; var1 < this.field2934; var1++) {
            class198 var2 = this.field2932[var1];
            while (true) {
                class198 var3 = var2.field2959;
                if (var2 == var3) {
                    break;
                }
                var3.method3404();
            }
        }
        this.field2933 = null;
        this.field2935 = null;
    }

    @ObfuscatedName("gj.e()Lgw;")
    public class198 method3276() {
        this.field2936 = 0;
        return this.method3277();
    }

    @ObfuscatedName("gj.n()Lgw;")
    public class198 method3277() {
        if (this.field2936 > 0 && this.field2932[this.field2936 - 1] != this.field2935) {
            class198 var1 = this.field2935;
            this.field2935 = var1.field2959;
            return var1;
        }
        class198 var2;
        do {
            if (this.field2936 >= this.field2934) {
                return null;
            }
            var2 = this.field2932[this.field2936++].field2959;
        } while (this.field2932[this.field2936 - 1] == var2);
        this.field2935 = var2.field2959;
        return var2;
    }
}
