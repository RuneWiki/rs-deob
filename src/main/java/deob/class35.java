package deob;

@ObfuscatedName("ad")
public final class class35 extends class38 {

    @ObfuscatedName("ad.g")
    public class40 field790;

    @ObfuscatedName("ad.g(IBI)V")
    public final void method722(int arg0, byte arg1) {
        int var3 = this.field872[0];
        int var4 = this.field873[0];
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
        if (this.field859 != -1 && class43.method2054(this.field859).field1006 == 1) {
            this.field859 = -1;
        }
        if (this.field871 < 9) {
            this.field871++;
        }
        for (int var5 = this.field871; var5 > 0; var5--) {
            this.field872[var5] = this.field872[var5 - 1];
            this.field873[var5] = this.field873[var5 - 1];
            this.field874[var5] = this.field874[var5 - 1];
        }
        this.field872[0] = var3;
        this.field873[0] = var4;
        this.field874[0] = arg1;
    }

    @ObfuscatedName("ad.b(IIZI)V")
    public final void method721(int arg0, int arg1, boolean arg2) {
        if (this.field859 != -1 && class43.method2054(this.field859).field1006 == 1) {
            this.field859 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field872[0];
            int var5 = arg1 - this.field873[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field871 < 9) {
                    this.field871++;
                }
                for (int var6 = this.field871; var6 > 0; var6--) {
                    this.field872[var6] = this.field872[var6 - 1];
                    this.field873[var6] = this.field873[var6 - 1];
                    this.field874[var6] = this.field874[var6 - 1];
                }
                this.field872[0] = arg0;
                this.field873[0] = arg1;
                this.field874[0] = 1;
                return;
            }
        }
        this.field871 = 0;
        this.field849 = 0;
        this.field842 = 0;
        this.field872[0] = arg0;
        this.field873[0] = arg1;
        this.field875 = this.field872[0] * 128 + this.field822 * 64;
        this.field819 = this.field873[0] * 128 + this.field822 * 64;
    }

    @ObfuscatedName("ad.w(I)Ldd;")
    public final class105 method19() {
        if (this.field790 == null) {
            return null;
        }
        class43 var1 = this.field859 != -1 && this.field826 == 0 ? class43.method2054(this.field859) : null;
        class43 var2 = this.field846 == -1 || this.field846 == this.field823 && var1 != null ? null : class43.method2054(this.field846);
        class105 var3 = this.field790.method768(var1, this.field850, var2, this.field852);
        if (var3 == null) {
            return null;
        }
        var3.method2208();
        this.field867 = var3.field1452;
        if (this.field854 != -1 && this.field855 != -1) {
            class105 var4 = class44.method2656(this.field854).method917(this.field855);
            if (var4 != null) {
                var4.method2189(0, -this.field858, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field790.field894 == 1) {
            var3.field1797 = true;
        }
        return var3;
    }

    @ObfuscatedName("ad.m(I)Z")
    public final boolean method44() {
        return this.field790 != null;
    }
}
