package deob;

@ObfuscatedName("gf")
public final class class186 {

    @ObfuscatedName("gf.e")
    public int field2940;

    @ObfuscatedName("gf.a")
    public class198[] field2938;

    @ObfuscatedName("gf.l")
    public class198 field2939;

    @ObfuscatedName("gf.c")
    public class198 field2937;

    @ObfuscatedName("gf.u")
    public int field2941 = 0;

    public class186(int arg0) {
        this.field2940 = arg0;
        this.field2938 = new class198[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class198 var3 = this.field2938[var2] = new class198();
            var3.field2962 = var3;
            var3.field2964 = var3;
        }
    }

    @ObfuscatedName("gf.e(J)Lgm;")
    public class198 method3339(long arg0) {
        class198 var3 = this.field2938[(int) (arg0 & (long) (this.field2940 - 1))];
        for (this.field2939 = var3.field2962; this.field2939 != var3; this.field2939 = this.field2939.field2962) {
            if (this.field2939.field2963 == arg0) {
                class198 var4 = this.field2939;
                this.field2939 = this.field2939.field2962;
                return var4;
            }
        }
        this.field2939 = null;
        return null;
    }

    @ObfuscatedName("gf.a(Lgm;J)V")
    public void method3338(class198 arg0, long arg1) {
        if (arg0.field2964 != null) {
            arg0.method3463();
        }
        class198 var4 = this.field2938[(int) (arg1 & (long) (this.field2940 - 1))];
        arg0.field2964 = var4.field2964;
        arg0.field2962 = var4;
        arg0.field2964.field2962 = arg0;
        arg0.field2962.field2964 = arg0;
        arg0.field2963 = arg1;
    }

    @ObfuscatedName("gf.l()V")
    public void method3340() {
        for (int var1 = 0; var1 < this.field2940; var1++) {
            class198 var2 = this.field2938[var1];
            while (true) {
                class198 var3 = var2.field2962;
                if (var2 == var3) {
                    break;
                }
                var3.method3463();
            }
        }
        this.field2939 = null;
        this.field2937 = null;
    }

    @ObfuscatedName("gf.c()Lgm;")
    public class198 method3341() {
        this.field2941 = 0;
        return this.method3346();
    }

    @ObfuscatedName("gf.u()Lgm;")
    public class198 method3346() {
        if (this.field2941 > 0 && this.field2938[this.field2941 - 1] != this.field2937) {
            class198 var1 = this.field2937;
            this.field2937 = var1.field2962;
            return var1;
        }
        class198 var2;
        do {
            if (this.field2941 >= this.field2940) {
                return null;
            }
            var2 = this.field2938[this.field2941++].field2962;
        } while (this.field2938[this.field2941 - 1] == var2);
        this.field2937 = var2.field2962;
        return var2;
    }
}
