package deob;

@ObfuscatedName("ay")
public final class class35 extends class38 {

    @ObfuscatedName("ay.y")
    public class40 field777;

    @ObfuscatedName("ay.y(IBI)V")
    public final void method700(int arg0, byte arg1) {
        int var3 = this.field856[0];
        int var4 = this.field857[0];
        if (arg0 == 0) {
            var3--;
            var4++;
        }
        if (arg0 == 1) {
            var4++;
        }
        if (arg0 == 2) {
            var3++;
            var4++;
        }
        if (arg0 == 3) {
            var3--;
        }
        if (arg0 == 4) {
            var3++;
        }
        if (arg0 == 5) {
            var3--;
            var4--;
        }
        if (arg0 == 6) {
            var4--;
        }
        if (arg0 == 7) {
            var3++;
            var4--;
        }
        if (this.field833 != -1 && class43.method750(this.field833).field995 == 1) {
            this.field833 = -1;
        }
        if (this.field855 < 9) {
            this.field855++;
        }
        for (int var5 = this.field855; var5 > 0; var5--) {
            this.field856[var5] = this.field856[var5 - 1];
            this.field857[var5] = this.field857[var5 - 1];
            this.field813[var5] = this.field813[var5 - 1];
        }
        this.field856[0] = var3;
        this.field857[0] = var4;
        this.field813[0] = arg1;
    }

    @ObfuscatedName("ay.d(IIZI)V")
    public final void method698(int arg0, int arg1, boolean arg2) {
        if (this.field833 != -1 && class43.method750(this.field833).field995 == 1) {
            this.field833 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field856[0];
            int var5 = arg1 - this.field857[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field855 < 9) {
                    this.field855++;
                }
                for (int var6 = this.field855; var6 > 0; var6--) {
                    this.field856[var6] = this.field856[var6 - 1];
                    this.field857[var6] = this.field857[var6 - 1];
                    this.field813[var6] = this.field813[var6 - 1];
                }
                this.field856[0] = arg0;
                this.field857[0] = arg1;
                this.field813[0] = 1;
                return;
            }
        }
        this.field855 = 0;
        this.field802 = 0;
        this.field859 = 0;
        this.field856[0] = arg0;
        this.field857[0] = arg1;
        this.field839 = this.field856[0] * 128 + this.field806 * 64;
        this.field803 = this.field857[0] * 128 + this.field806 * 64;
    }

    @ObfuscatedName("ay.g(I)Ldg;")
    public final class105 method10() {
        if (this.field777 == null) {
            return null;
        }
        class43 var1 = this.field833 != -1 && this.field836 == 0 ? class43.method750(this.field833) : null;
        class43 var2 = this.field830 == -1 || this.field832 == this.field830 && var1 != null ? null : class43.method750(this.field830);
        class105 var3 = this.field777.method763(var1, this.field834, var2, this.field831);
        if (var3 == null) {
            return null;
        }
        var3.method2177();
        this.field851 = var3.field1450;
        if (this.field838 != -1 && this.field850 != -1) {
            class105 var4 = class44.method3639(this.field838).method874(this.field850);
            if (var4 != null) {
                var4.method2158(0, -this.field842, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field777.field889 == 1) {
            var3.field1814 = true;
        }
        return var3;
    }

    @ObfuscatedName("ay.a(I)Z")
    public final boolean method11() {
        return this.field777 != null;
    }
}
