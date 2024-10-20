package deob;

@ObfuscatedName("aq")
public final class class35 extends class38 {

    @ObfuscatedName("aq.i")
    public class40 field790;

    @ObfuscatedName("aq.i(IBI)V")
    public final void method673(int arg0, byte arg1) {
        int var3 = this.field878[0];
        int var4 = this.field879[0];
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
        if (this.field839 != -1 && class43.method3831(this.field839).field1013 == 1) {
            this.field839 = -1;
        }
        if (this.field882 < 9) {
            this.field882++;
        }
        for (int var5 = this.field882; var5 > 0; var5--) {
            this.field878[var5] = this.field878[var5 - 1];
            this.field879[var5] = this.field879[var5 - 1];
            this.field880[var5] = this.field880[var5 - 1];
        }
        this.field878[0] = var3;
        this.field879[0] = var4;
        this.field880[0] = arg1;
    }

    @ObfuscatedName("aq.v(IIZI)V")
    public final void method672(int arg0, int arg1, boolean arg2) {
        if (this.field839 != -1 && class43.method3831(this.field839).field1013 == 1) {
            this.field839 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field878[0];
            int var5 = arg1 - this.field879[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field882 < 9) {
                    this.field882++;
                }
                for (int var6 = this.field882; var6 > 0; var6--) {
                    this.field878[var6] = this.field878[var6 - 1];
                    this.field879[var6] = this.field879[var6 - 1];
                    this.field880[var6] = this.field880[var6 - 1];
                }
                this.field878[0] = arg0;
                this.field879[0] = arg1;
                this.field880[0] = 1;
                return;
            }
        }
        this.field882 = 0;
        this.field851 = 0;
        this.field881 = 0;
        this.field878[0] = arg0;
        this.field879[0] = arg1;
        this.field855 = this.field878[0] * 128 + this.field828 * 64;
        this.field825 = this.field879[0] * 128 + this.field828 * 64;
    }

    @ObfuscatedName("aq.f(I)Ldo;")
    public final class105 method29() {
        if (this.field790 == null) {
            return null;
        }
        class43 var1 = this.field839 != -1 && this.field858 == 0 ? class43.method3831(this.field839) : null;
        class43 var2 = this.field832 == -1 || this.field832 == this.field829 && var1 != null ? null : class43.method3831(this.field832);
        class105 var3 = this.field790.method729(var1, this.field856, var2, this.field853);
        if (var3 == null) {
            return null;
        }
        var3.method2131();
        this.field873 = var3.field1452;
        if (this.field852 != -1 && this.field861 != -1) {
            class105 var4 = class44.method769(this.field852).method840(this.field861);
            if (var4 != null) {
                var4.method2101(0, -this.field864, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field790.field903 == 1) {
            var3.field1813 = true;
        }
        return var3;
    }

    @ObfuscatedName("aq.p(I)Z")
    public final boolean method20() {
        return this.field790 != null;
    }
}
