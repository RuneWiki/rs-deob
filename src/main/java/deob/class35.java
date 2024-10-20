package deob;

@ObfuscatedName("aj")
public final class class35 extends class38 {

    @ObfuscatedName("aj.n")
    public class40 field754;

    @ObfuscatedName("aj.n(IBB)V")
    public final void method702(int arg0, byte arg1) {
        int var3 = this.field844[0];
        int var4 = this.field809[0];
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
        if (this.field821 != -1 && class43.method2827(this.field821).field983 == 1) {
            this.field821 = -1;
        }
        if (this.field843 < 9) {
            this.field843++;
        }
        for (int var5 = this.field843; var5 > 0; var5--) {
            this.field844[var5] = this.field844[var5 - 1];
            this.field809[var5] = this.field809[var5 - 1];
            this.field817[var5] = this.field817[var5 - 1];
        }
        this.field844[0] = var3;
        this.field809[0] = var4;
        this.field817[0] = arg1;
    }

    @ObfuscatedName("aj.d(IIZI)V")
    public final void method703(int arg0, int arg1, boolean arg2) {
        if (this.field821 != -1 && class43.method2827(this.field821).field983 == 1) {
            this.field821 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field844[0];
            int var5 = arg1 - this.field809[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field843 < 9) {
                    this.field843++;
                }
                for (int var6 = this.field843; var6 > 0; var6--) {
                    this.field844[var6] = this.field844[var6 - 1];
                    this.field809[var6] = this.field809[var6 - 1];
                    this.field817[var6] = this.field817[var6 - 1];
                }
                this.field844[0] = arg0;
                this.field809[0] = arg1;
                this.field817[0] = 1;
                return;
            }
        }
        this.field843 = 0;
        this.field820 = 0;
        this.field847 = 0;
        this.field844[0] = arg0;
        this.field809[0] = arg1;
        this.field816 = this.field844[0] * 128 + this.field793 * 64;
        this.field815 = this.field809[0] * 128 + this.field793 * 64;
    }

    @ObfuscatedName("aj.s(I)Ldb;")
    public final class105 method36() {
        if (this.field754 == null) {
            return null;
        }
        class43 var1 = this.field821 != -1 && this.field824 == 0 ? class43.method2827(this.field821) : null;
        class43 var2 = this.field818 == -1 || this.field818 == this.field795 && var1 != null ? null : class43.method2827(this.field818);
        class105 var3 = this.field754.method754(var1, this.field822, var2, this.field819);
        if (var3 == null) {
            return null;
        }
        var3.method2168();
        this.field833 = var3.field1442;
        if (this.field810 != -1 && this.field839 != -1) {
            class105 var4 = class44.method17(this.field810).method866(this.field839);
            if (var4 != null) {
                var4.method2137(0, -this.field830, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field754.field866 == 1) {
            var3.field1802 = true;
        }
        return var3;
    }

    @ObfuscatedName("aj.i(I)Z")
    public final boolean method21() {
        return this.field754 != null;
    }
}
