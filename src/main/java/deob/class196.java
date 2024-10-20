package deob;

@ObfuscatedName("gy")
public final class class196 {

    @ObfuscatedName("gy.h")
    public int field3071;

    @ObfuscatedName("gy.q")
    public class208[] field3069;

    @ObfuscatedName("gy.v")
    public class208 field3070;

    @ObfuscatedName("gy.n")
    public class208 field3068;

    @ObfuscatedName("gy.f")
    public int field3072 = 0;

    public class196(int arg0) {
        this.field3071 = arg0;
        this.field3069 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3069[var2] = new class208();
            var3.field3094 = var3;
            var3.field3095 = var3;
        }
    }

    @ObfuscatedName("gy.h(J)Lgm;")
    public class208 method3584(long arg0) {
        class208 var3 = this.field3069[(int) (arg0 & (long) (this.field3071 - 1))];
        for (this.field3070 = var3.field3094; this.field3070 != var3; this.field3070 = this.field3070.field3094) {
            if (this.field3070.field3093 == arg0) {
                class208 var4 = this.field3070;
                this.field3070 = this.field3070.field3094;
                return var4;
            }
        }
        this.field3070 = null;
        return null;
    }

    @ObfuscatedName("gy.q(Lgm;J)V")
    public void method3575(class208 arg0, long arg1) {
        if (arg0.field3095 != null) {
            arg0.method3711();
        }
        class208 var4 = this.field3069[(int) (arg1 & (long) (this.field3071 - 1))];
        arg0.field3095 = var4.field3095;
        arg0.field3094 = var4;
        arg0.field3095.field3094 = arg0;
        arg0.field3094.field3095 = arg0;
        arg0.field3093 = arg1;
    }

    @ObfuscatedName("gy.v()V")
    public void method3576() {
        for (int var1 = 0; var1 < this.field3071; var1++) {
            class208 var2 = this.field3069[var1];
            while (true) {
                class208 var3 = var2.field3094;
                if (var2 == var3) {
                    break;
                }
                var3.method3711();
            }
        }
        this.field3070 = null;
        this.field3068 = null;
    }

    @ObfuscatedName("gy.n()Lgm;")
    public class208 method3577() {
        this.field3072 = 0;
        return this.method3578();
    }

    @ObfuscatedName("gy.f()Lgm;")
    public class208 method3578() {
        if (this.field3072 > 0 && this.field3069[this.field3072 - 1] != this.field3068) {
            class208 var1 = this.field3068;
            this.field3068 = var1.field3094;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3072 >= this.field3071) {
                return null;
            }
            var2 = this.field3069[this.field3072++].field3094;
        } while (this.field3069[this.field3072 - 1] == var2);
        this.field3068 = var2.field3094;
        return var2;
    }
}
