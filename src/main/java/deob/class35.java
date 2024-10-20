package deob;

@ObfuscatedName("ao")
public final class class35 extends class38 {

    @ObfuscatedName("ao.m")
    public class40 field747;

    @ObfuscatedName("ao.m(IBI)V")
    public final void method736(int arg0, byte arg1) {
        int var3 = this.field831[0];
        int var4 = this.field832[0];
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
        if (this.field808 != -1 && class43.method2262(this.field808).field967 == 1) {
            this.field808 = -1;
        }
        if (this.field830 < 9) {
            this.field830++;
        }
        for (int var5 = this.field830; var5 > 0; var5--) {
            this.field831[var5] = this.field831[var5 - 1];
            this.field832[var5] = this.field832[var5 - 1];
            this.field834[var5] = this.field834[var5 - 1];
        }
        this.field831[0] = var3;
        this.field832[0] = var4;
        this.field834[0] = arg1;
    }

    @ObfuscatedName("ao.l(IIZI)V")
    public final void method737(int arg0, int arg1, boolean arg2) {
        if (this.field808 != -1 && class43.method2262(this.field808).field967 == 1) {
            this.field808 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field831[0];
            int var5 = arg1 - this.field832[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field830 < 9) {
                    this.field830++;
                }
                for (int var6 = this.field830; var6 > 0; var6--) {
                    this.field831[var6] = this.field831[var6 - 1];
                    this.field832[var6] = this.field832[var6 - 1];
                    this.field834[var6] = this.field834[var6 - 1];
                }
                this.field831[0] = arg0;
                this.field832[0] = arg1;
                this.field834[0] = 1;
                return;
            }
        }
        this.field830 = 0;
        this.field825 = 0;
        this.field817 = 0;
        this.field831[0] = arg0;
        this.field832[0] = arg1;
        this.field815 = this.field831[0] * 128 + this.field801 * 64;
        this.field805 = this.field832[0] * 128 + this.field801 * 64;
    }

    @ObfuscatedName("ao.y(I)Ldb;")
    public final class105 method16() {
        if (this.field747 == null) {
            return null;
        }
        class43 var1 = this.field808 != -1 && this.field811 == 0 ? class43.method2262(this.field808) : null;
        class43 var2 = this.field792 == -1 || this.field792 == this.field782 && var1 != null ? null : class43.method2262(this.field792);
        class105 var3 = this.field747.method810(var1, this.field828, var2, this.field806);
        if (var3 == null) {
            return null;
        }
        var3.method2188();
        this.field826 = var3.field1408;
        if (this.field813 != -1 && this.field814 != -1) {
            class105 var4 = class44.method875(this.field813).method922(this.field814);
            if (var4 != null) {
                var4.method2198(0, -this.field809, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field747.field876 == 1) {
            var3.field1772 = true;
        }
        return var3;
    }

    @ObfuscatedName("ao.i(I)Z")
    public final boolean method20() {
        return this.field747 != null;
    }
}
