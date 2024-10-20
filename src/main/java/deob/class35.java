package deob;

@ObfuscatedName("ac")
public final class class35 extends class38 {

    @ObfuscatedName("ac.i")
    public class40 field779;

    @ObfuscatedName("ac.i(IBI)V")
    public final void method733(int arg0, byte arg1) {
        int var3 = this.field857[0];
        int var4 = this.field865[0];
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
        if (this.field841 != -1 && class43.method2299(this.field841).field979 == 1) {
            this.field841 = -1;
        }
        if (this.field863 < 9) {
            this.field863++;
        }
        for (int var5 = this.field863; var5 > 0; var5--) {
            this.field857[var5] = this.field857[var5 - 1];
            this.field865[var5] = this.field865[var5 - 1];
            this.field861[var5] = this.field861[var5 - 1];
        }
        this.field857[0] = var3;
        this.field865[0] = var4;
        this.field861[0] = arg1;
    }

    @ObfuscatedName("ac.v(IIZI)V")
    public final void method734(int arg0, int arg1, boolean arg2) {
        if (this.field841 != -1 && class43.method2299(this.field841).field979 == 1) {
            this.field841 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field857[0];
            int var5 = arg1 - this.field865[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field863 < 9) {
                    this.field863++;
                }
                for (int var6 = this.field863; var6 > 0; var6--) {
                    this.field857[var6] = this.field857[var6 - 1];
                    this.field865[var6] = this.field865[var6 - 1];
                    this.field861[var6] = this.field861[var6 - 1];
                }
                this.field857[0] = arg0;
                this.field865[0] = arg1;
                this.field861[0] = 1;
                return;
            }
        }
        this.field863 = 0;
        this.field824 = 0;
        this.field867 = 0;
        this.field857[0] = arg0;
        this.field865[0] = arg1;
        this.field866 = this.field857[0] * 128 + this.field853 * 64;
        this.field814 = this.field865[0] * 128 + this.field853 * 64;
    }

    @ObfuscatedName("ac.r(I)Ldj;")
    public final class105 method18() {
        if (this.field779 == null) {
            return null;
        }
        class43 var1 = this.field841 != -1 && this.field844 == 0 ? class43.method2299(this.field841) : null;
        class43 var2 = this.field838 == -1 || this.field838 == this.field815 && var1 != null ? null : class43.method2299(this.field838);
        class105 var3 = this.field779.method774(var1, this.field842, var2, this.field810);
        if (var3 == null) {
            return null;
        }
        var3.method2153();
        this.field859 = var3.field1451;
        if (this.field843 != -1 && this.field847 != -1) {
            class105 var4 = class44.method2267(this.field843).method900(this.field847);
            if (var4 != null) {
                var4.method2162(0, -this.field850, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field779.field906 == 1) {
            var3.field1810 = true;
        }
        return var3;
    }

    @ObfuscatedName("ac.h(I)Z")
    public final boolean method36() {
        return this.field779 != null;
    }
}
