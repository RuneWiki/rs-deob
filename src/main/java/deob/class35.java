package deob;

@ObfuscatedName("ao")
public final class class35 extends class38 {

    @ObfuscatedName("ao.a")
    public class40 field786;

    @ObfuscatedName("ao.a(IBI)V")
    public final void method703(int arg0, byte arg1) {
        int var3 = this.field867[0];
        int var4 = this.field868[0];
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
        if (this.field870 != -1 && class43.method2701(this.field870).field993 == 1) {
            this.field870 = -1;
        }
        if (this.field866 < 9) {
            this.field866++;
        }
        for (int var5 = this.field866; var5 > 0; var5--) {
            this.field867[var5] = this.field867[var5 - 1];
            this.field868[var5] = this.field868[var5 - 1];
            this.field832[var5] = this.field832[var5 - 1];
        }
        this.field867[0] = var3;
        this.field868[0] = var4;
        this.field832[0] = arg1;
    }

    @ObfuscatedName("ao.r(IIZI)V")
    public final void method702(int arg0, int arg1, boolean arg2) {
        if (this.field870 != -1 && class43.method2701(this.field870).field993 == 1) {
            this.field870 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field867[0];
            int var5 = arg1 - this.field868[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field866 < 9) {
                    this.field866++;
                }
                for (int var6 = this.field866; var6 > 0; var6--) {
                    this.field867[var6] = this.field867[var6 - 1];
                    this.field868[var6] = this.field868[var6 - 1];
                    this.field832[var6] = this.field832[var6 - 1];
                }
                this.field867[0] = arg0;
                this.field868[0] = arg1;
                this.field832[0] = 1;
                return;
            }
        }
        this.field866 = 0;
        this.field862 = 0;
        this.field849 = 0;
        this.field867[0] = arg0;
        this.field868[0] = arg1;
        this.field871 = this.field867[0] * 128 + this.field817 * 64;
        this.field814 = this.field868[0] * 128 + this.field817 * 64;
    }

    @ObfuscatedName("ao.f(I)Ldn;")
    public final class105 method27() {
        if (this.field786 == null) {
            return null;
        }
        class43 var1 = this.field870 != -1 && this.field847 == 0 ? class43.method2701(this.field870) : null;
        class43 var2 = this.field841 == -1 || this.field841 == this.field818 && var1 != null ? null : class43.method2701(this.field841);
        class105 var3 = this.field786.method747(var1, this.field845, var2, this.field842);
        if (var3 == null) {
            return null;
        }
        var3.method2152();
        this.field846 = var3.field1449;
        if (this.field860 != -1 && this.field850 != -1) {
            class105 var4 = class44.method588(this.field860).method884(this.field850);
            if (var4 != null) {
                var4.method2166(0, -this.field853, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field786.field882 == 1) {
            var3.field1813 = true;
        }
        return var3;
    }

    @ObfuscatedName("ao.g(I)Z")
    public final boolean method25() {
        return this.field786 != null;
    }
}
