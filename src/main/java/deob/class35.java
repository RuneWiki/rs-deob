package deob;

@ObfuscatedName("ar")
public final class class35 extends class38 {

    @ObfuscatedName("ar.l")
    public class40 field782;

    @ObfuscatedName("ar.l(IBI)V")
    public final void method721(int arg0, byte arg1) {
        int var3 = this.field865[0];
        int var4 = this.field866[0];
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
        if (this.field842 != -1 && class43.method2304(this.field842).field996 == 1) {
            this.field842 = -1;
        }
        if (this.field864 < 9) {
            this.field864++;
        }
        for (int var5 = this.field864; var5 > 0; var5--) {
            this.field865[var5] = this.field865[var5 - 1];
            this.field866[var5] = this.field866[var5 - 1];
            this.field857[var5] = this.field857[var5 - 1];
        }
        this.field865[0] = var3;
        this.field866[0] = var4;
        this.field857[0] = arg1;
    }

    @ObfuscatedName("ar.e(IIZI)V")
    public final void method716(int arg0, int arg1, boolean arg2) {
        if (this.field842 != -1 && class43.method2304(this.field842).field996 == 1) {
            this.field842 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field865[0];
            int var5 = arg1 - this.field866[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field864 < 9) {
                    this.field864++;
                }
                for (int var6 = this.field864; var6 > 0; var6--) {
                    this.field865[var6] = this.field865[var6 - 1];
                    this.field866[var6] = this.field866[var6 - 1];
                    this.field857[var6] = this.field857[var6 - 1];
                }
                this.field865[0] = arg0;
                this.field866[0] = arg1;
                this.field857[0] = 1;
                return;
            }
        }
        this.field864 = 0;
        this.field847 = 0;
        this.field868 = 0;
        this.field865[0] = arg0;
        this.field866[0] = arg1;
        this.field861 = this.field865[0] * 128 + this.field833 * 64;
        this.field812 = this.field866[0] * 128 + this.field833 * 64;
    }

    @ObfuscatedName("ar.q(B)Ldt;")
    public final class105 method18() {
        if (this.field782 == null) {
            return null;
        }
        class43 var1 = this.field842 != -1 && this.field845 == 0 ? class43.method2304(this.field842) : null;
        class43 var2 = this.field839 == -1 || this.field839 == this.field816 && var1 != null ? null : class43.method2304(this.field839);
        class105 var3 = this.field782.method760(var1, this.field824, var2, this.field841);
        if (var3 == null) {
            return null;
        }
        var3.method2195();
        this.field860 = var3.field1442;
        if (this.field871 != -1 && this.field848 != -1) {
            class105 var4 = class44.method3632(this.field871).method902(this.field848);
            if (var4 != null) {
                var4.method2222(0, -this.field851, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field782.field887 == 1) {
            var3.field1813 = true;
        }
        return var3;
    }

    @ObfuscatedName("ar.b(B)Z")
    public final boolean method22() {
        return this.field782 != null;
    }
}
