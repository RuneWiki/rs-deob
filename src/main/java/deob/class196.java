package deob;

@ObfuscatedName("ga")
public final class class196 {

    @ObfuscatedName("ga.y")
    public int field3069;

    @ObfuscatedName("ga.d")
    public class208[] field3067;

    @ObfuscatedName("ga.g")
    public class208 field3070;

    @ObfuscatedName("ga.w")
    public class208 field3068;

    @ObfuscatedName("ga.e")
    public int field3066 = 0;

    public class196(int arg0) {
        this.field3069 = arg0;
        this.field3067 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3067[var2] = new class208();
            var3.field3092 = var3;
            var3.field3093 = var3;
        }
    }

    @ObfuscatedName("ga.y(J)Lgx;")
    public class208 method3459(long arg0) {
        class208 var3 = this.field3067[(int) (arg0 & (long) (this.field3069 - 1))];
        for (this.field3070 = var3.field3092; this.field3070 != var3; this.field3070 = this.field3070.field3092) {
            if (this.field3070.field3091 == arg0) {
                class208 var4 = this.field3070;
                this.field3070 = this.field3070.field3092;
                return var4;
            }
        }
        this.field3070 = null;
        return null;
    }

    @ObfuscatedName("ga.d(Lgx;J)V")
    public void method3460(class208 arg0, long arg1) {
        if (arg0.field3093 != null) {
            arg0.method3588();
        }
        class208 var4 = this.field3067[(int) (arg1 & (long) (this.field3069 - 1))];
        arg0.field3093 = var4.field3093;
        arg0.field3092 = var4;
        arg0.field3093.field3092 = arg0;
        arg0.field3092.field3093 = arg0;
        arg0.field3091 = arg1;
    }

    @ObfuscatedName("ga.g()V")
    public void method3467() {
        for (int var1 = 0; var1 < this.field3069; var1++) {
            class208 var2 = this.field3067[var1];
            while (true) {
                class208 var3 = var2.field3092;
                if (var2 == var3) {
                    break;
                }
                var3.method3588();
            }
        }
        this.field3070 = null;
        this.field3068 = null;
    }

    @ObfuscatedName("ga.w()Lgx;")
    public class208 method3461() {
        this.field3066 = 0;
        return this.method3462();
    }

    @ObfuscatedName("ga.e()Lgx;")
    public class208 method3462() {
        if (this.field3066 > 0 && this.field3067[this.field3066 - 1] != this.field3068) {
            class208 var1 = this.field3068;
            this.field3068 = var1.field3092;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3066 >= this.field3069) {
                return null;
            }
            var2 = this.field3067[this.field3066++].field3092;
        } while (this.field3067[this.field3066 - 1] == var2);
        this.field3068 = var2.field3092;
        return var2;
    }
}
