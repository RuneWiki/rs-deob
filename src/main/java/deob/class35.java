package deob;

@ObfuscatedName("am")
public final class class35 extends class38 {

    @ObfuscatedName("am.c")
    public class40 field781;

    @ObfuscatedName("am.c(IBI)V")
    public final void method690(int arg0, byte arg1) {
        int var3 = this.field866[0];
        int var4 = this.field867[0];
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
        if (this.field846 != -1 && class43.method2648(this.field846).field1001 == 1) {
            this.field846 = -1;
        }
        if (this.field829 < 9) {
            this.field829++;
        }
        for (int var5 = this.field829; var5 > 0; var5--) {
            this.field866[var5] = this.field866[var5 - 1];
            this.field867[var5] = this.field867[var5 - 1];
            this.field868[var5] = this.field868[var5 - 1];
        }
        this.field866[0] = var3;
        this.field867[0] = var4;
        this.field868[0] = arg1;
    }

    @ObfuscatedName("am.h(IIZB)V")
    public final void method689(int arg0, int arg1, boolean arg2) {
        if (this.field846 != -1 && class43.method2648(this.field846).field1001 == 1) {
            this.field846 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field866[0];
            int var5 = arg1 - this.field867[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field829 < 9) {
                    this.field829++;
                }
                for (int var6 = this.field829; var6 > 0; var6--) {
                    this.field866[var6] = this.field866[var6 - 1];
                    this.field867[var6] = this.field867[var6 - 1];
                    this.field868[var6] = this.field868[var6 - 1];
                }
                this.field866[0] = arg0;
                this.field867[0] = arg1;
                this.field868[0] = 1;
                return;
            }
        }
        this.field829 = 0;
        this.field870 = 0;
        this.field812 = 0;
        this.field866[0] = arg0;
        this.field867[0] = arg1;
        this.field859 = this.field866[0] * 128 + this.field816 * 64;
        this.field839 = this.field867[0] * 128 + this.field816 * 64;
    }

    @ObfuscatedName("am.k(B)Ldt;")
    public final class105 method13() {
        if (this.field781 == null) {
            return null;
        }
        class43 var1 = this.field846 != -1 && this.field858 == 0 ? class43.method2648(this.field846) : null;
        class43 var2 = this.field850 == -1 || this.field850 == this.field817 && var1 != null ? null : class43.method2648(this.field850);
        class105 var3 = this.field781.method742(var1, this.field844, var2, this.field841);
        if (var3 == null) {
            return null;
        }
        var3.method2095();
        this.field861 = var3.field1437;
        if (this.field848 != -1 && this.field849 != -1) {
            class105 var4 = class44.method1037(this.field848).method876(this.field849);
            if (var4 != null) {
                var4.method2105(0, -this.field855, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field781.field890 == 1) {
            var3.field1795 = true;
        }
        return var3;
    }

    @ObfuscatedName("am.i(I)Z")
    public final boolean method17() {
        return this.field781 != null;
    }
}
