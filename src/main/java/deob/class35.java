package deob;

@ObfuscatedName("am")
public final class class35 extends class38 {

    @ObfuscatedName("am.h")
    public class40 field785;

    @ObfuscatedName("am.h(IBS)V")
    public final void method691(int arg0, byte arg1) {
        int var3 = this.field871[0];
        int var4 = this.field872[0];
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
        if (this.field848 != -1 && class43.method2257(this.field848).field1005 == 1) {
            this.field848 = -1;
        }
        if (this.field870 < 9) {
            this.field870++;
        }
        for (int var5 = this.field870; var5 > 0; var5--) {
            this.field871[var5] = this.field871[var5 - 1];
            this.field872[var5] = this.field872[var5 - 1];
            this.field873[var5] = this.field873[var5 - 1];
        }
        this.field871[0] = var3;
        this.field872[0] = var4;
        this.field873[0] = arg1;
    }

    @ObfuscatedName("am.m(IIZI)V")
    public final void method692(int arg0, int arg1, boolean arg2) {
        if (this.field848 != -1 && class43.method2257(this.field848).field1005 == 1) {
            this.field848 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field871[0];
            int var5 = arg1 - this.field872[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field870 < 9) {
                    this.field870++;
                }
                for (int var6 = this.field870; var6 > 0; var6--) {
                    this.field871[var6] = this.field871[var6 - 1];
                    this.field872[var6] = this.field872[var6 - 1];
                    this.field873[var6] = this.field873[var6 - 1];
                }
                this.field871[0] = arg0;
                this.field872[0] = arg1;
                this.field873[0] = 1;
                return;
            }
        }
        this.field870 = 0;
        this.field875 = 0;
        this.field874 = 0;
        this.field871[0] = arg0;
        this.field872[0] = arg1;
        this.field861 = this.field871[0] * 128 + this.field821 * 64;
        this.field818 = this.field872[0] * 128 + this.field821 * 64;
    }

    @ObfuscatedName("am.i(B)Ldb;")
    public final class105 method34() {
        if (this.field785 == null) {
            return null;
        }
        class43 var1 = this.field848 != -1 && this.field855 == 0 ? class43.method2257(this.field848) : null;
        class43 var2 = this.field849 == -1 || this.field849 == this.field822 && var1 != null ? null : class43.method2257(this.field849);
        class105 var3 = this.field785.method747(var1, this.field856, var2, this.field846);
        if (var3 == null) {
            return null;
        }
        var3.method2121();
        this.field866 = var3.field1458;
        if (this.field853 != -1 && this.field876 != -1) {
            class105 var4 = class44.method2239(this.field853).method870(this.field876);
            if (var4 != null) {
                var4.method2130(0, -this.field857, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field785.field894 == 1) {
            var3.field1807 = true;
        }
        return var3;
    }

    @ObfuscatedName("am.f(I)Z")
    public final boolean method14() {
        return this.field785 != null;
    }
}
