package deob;

@ObfuscatedName("gv")
public final class class196 {

    @ObfuscatedName("gv.v")
    public int field3091;

    @ObfuscatedName("gv.f")
    public class208[] field3089;

    @ObfuscatedName("gv.i")
    public class208 field3093;

    @ObfuscatedName("gv.d")
    public class208 field3092;

    @ObfuscatedName("gv.o")
    public int field3090 = 0;

    public class196(int arg0) {
        this.field3091 = arg0;
        this.field3089 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3089[var2] = new class208();
            var3.field3116 = var3;
            var3.field3114 = var3;
        }
    }

    @ObfuscatedName("gv.v(J)Lgq;")
    public class208 method3524(long arg0) {
        class208 var3 = this.field3089[(int) (arg0 & (long) (this.field3091 - 1))];
        for (this.field3093 = var3.field3116; this.field3093 != var3; this.field3093 = this.field3093.field3116) {
            if (this.field3093.field3115 == arg0) {
                class208 var4 = this.field3093;
                this.field3093 = this.field3093.field3116;
                return var4;
            }
        }
        this.field3093 = null;
        return null;
    }

    @ObfuscatedName("gv.f(Lgq;J)V")
    public void method3526(class208 arg0, long arg1) {
        if (arg0.field3114 != null) {
            arg0.method3645();
        }
        class208 var4 = this.field3089[(int) (arg1 & (long) (this.field3091 - 1))];
        arg0.field3114 = var4.field3114;
        arg0.field3116 = var4;
        arg0.field3114.field3116 = arg0;
        arg0.field3116.field3114 = arg0;
        arg0.field3115 = arg1;
    }

    @ObfuscatedName("gv.i()V")
    public void method3527() {
        for (int var1 = 0; var1 < this.field3091; var1++) {
            class208 var2 = this.field3089[var1];
            while (true) {
                class208 var3 = var2.field3116;
                if (var2 == var3) {
                    break;
                }
                var3.method3645();
            }
        }
        this.field3093 = null;
        this.field3092 = null;
    }

    @ObfuscatedName("gv.d()Lgq;")
    public class208 method3525() {
        this.field3090 = 0;
        return this.method3528();
    }

    @ObfuscatedName("gv.o()Lgq;")
    public class208 method3528() {
        if (this.field3090 > 0 && this.field3089[this.field3090 - 1] != this.field3092) {
            class208 var1 = this.field3092;
            this.field3092 = var1.field3116;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3090 >= this.field3091) {
                return null;
            }
            var2 = this.field3089[this.field3090++].field3116;
        } while (this.field3089[this.field3090 - 1] == var2);
        this.field3092 = var2.field3116;
        return var2;
    }
}
