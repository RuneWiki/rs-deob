package deob;

@ObfuscatedName("am")
public final class class35 extends class38 {

    @ObfuscatedName("am.z")
    public class40 field765;

    @ObfuscatedName("am.z(IBB)V")
    public final void method686(int arg0, byte arg1) {
        int var3 = this.field854[0];
        int var4 = this.field855[0];
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
        if (this.field831 != -1 && class43.method72(this.field831).field991 == 1) {
            this.field831 = -1;
        }
        if (this.field853 < 9) {
            this.field853++;
        }
        for (int var5 = this.field853; var5 > 0; var5--) {
            this.field854[var5] = this.field854[var5 - 1];
            this.field855[var5] = this.field855[var5 - 1];
            this.field856[var5] = this.field856[var5 - 1];
        }
        this.field854[0] = var3;
        this.field855[0] = var4;
        this.field856[0] = arg1;
    }

    @ObfuscatedName("am.q(IIZB)V")
    public final void method685(int arg0, int arg1, boolean arg2) {
        if (this.field831 != -1 && class43.method72(this.field831).field991 == 1) {
            this.field831 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field854[0];
            int var5 = arg1 - this.field855[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field853 < 9) {
                    this.field853++;
                }
                for (int var6 = this.field853; var6 > 0; var6--) {
                    this.field854[var6] = this.field854[var6 - 1];
                    this.field855[var6] = this.field855[var6 - 1];
                    this.field856[var6] = this.field856[var6 - 1];
                }
                this.field854[0] = arg0;
                this.field855[0] = arg1;
                this.field856[0] = 1;
                return;
            }
        }
        this.field853 = 0;
        this.field858 = 0;
        this.field810 = 0;
        this.field854[0] = arg0;
        this.field855[0] = arg1;
        this.field826 = this.field854[0] * 128 + this.field804 * 64;
        this.field801 = this.field855[0] * 128 + this.field804 * 64;
    }

    @ObfuscatedName("am.k(I)Ldb;")
    public final class105 method18() {
        if (this.field765 == null) {
            return null;
        }
        class43 var1 = this.field831 != -1 && this.field833 == 0 ? class43.method72(this.field831) : null;
        class43 var2 = this.field828 == -1 || this.field828 == this.field805 && var1 != null ? null : class43.method72(this.field828);
        class105 var3 = this.field765.method730(var1, this.field852, var2, this.field846);
        if (var3 == null) {
            return null;
        }
        var3.method2106();
        this.field849 = var3.field1453;
        if (this.field829 != -1 && this.field802 != -1) {
            class105 var4 = class44.method216(this.field829).method860(this.field802);
            if (var4 != null) {
                var4.method2116(0, -this.field840, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field765.field878 == 1) {
            var3.field1819 = true;
        }
        return var3;
    }

    @ObfuscatedName("am.r(I)Z")
    public final boolean method22() {
        return this.field765 != null;
    }
}
