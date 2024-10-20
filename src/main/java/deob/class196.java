package deob;

@ObfuscatedName("gh")
public final class class196 {

    @ObfuscatedName("gh.m")
    public int field3072;

    @ObfuscatedName("gh.l")
    public class208[] field3069;

    @ObfuscatedName("gh.y")
    public class208 field3070;

    @ObfuscatedName("gh.u")
    public class208 field3068;

    @ObfuscatedName("gh.k")
    public int field3071 = 0;

    public class196(int arg0) {
        this.field3072 = arg0;
        this.field3069 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3069[var2] = new class208();
            var3.field3094 = var3;
            var3.field3093 = var3;
        }
    }

    @ObfuscatedName("gh.m(J)Lgs;")
    public class208 method3571(long arg0) {
        class208 var3 = this.field3069[(int) (arg0 & (long) (this.field3072 - 1))];
        for (this.field3070 = var3.field3094; this.field3070 != var3; this.field3070 = this.field3070.field3094) {
            if (this.field3070.field3095 == arg0) {
                class208 var4 = this.field3070;
                this.field3070 = this.field3070.field3094;
                return var4;
            }
        }
        this.field3070 = null;
        return null;
    }

    @ObfuscatedName("gh.l(Lgs;J)V")
    public void method3572(class208 arg0, long arg1) {
        if (arg0.field3093 != null) {
            arg0.method3702();
        }
        class208 var4 = this.field3069[(int) (arg1 & (long) (this.field3072 - 1))];
        arg0.field3093 = var4.field3093;
        arg0.field3094 = var4;
        arg0.field3093.field3094 = arg0;
        arg0.field3094.field3093 = arg0;
        arg0.field3095 = arg1;
    }

    @ObfuscatedName("gh.y()V")
    public void method3587() {
        for (int var1 = 0; var1 < this.field3072; var1++) {
            class208 var2 = this.field3069[var1];
            while (true) {
                class208 var3 = var2.field3094;
                if (var2 == var3) {
                    break;
                }
                var3.method3702();
            }
        }
        this.field3070 = null;
        this.field3068 = null;
    }

    @ObfuscatedName("gh.u()Lgs;")
    public class208 method3574() {
        this.field3071 = 0;
        return this.method3573();
    }

    @ObfuscatedName("gh.k()Lgs;")
    public class208 method3573() {
        if (this.field3071 > 0 && this.field3069[this.field3071 - 1] != this.field3068) {
            class208 var1 = this.field3068;
            this.field3068 = var1.field3094;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3071 >= this.field3072) {
                return null;
            }
            var2 = this.field3069[this.field3071++].field3094;
        } while (this.field3069[this.field3071 - 1] == var2);
        this.field3068 = var2.field3094;
        return var2;
    }
}
