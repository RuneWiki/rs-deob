package deob;

@ObfuscatedName("ag")
public final class class35 extends class38 {

    @ObfuscatedName("ag.j")
    public class40 field762;

    @ObfuscatedName("ag.j(IBI)V")
    public final void method702(int arg0, byte arg1) {
        int var3 = this.field849[0];
        int var4 = this.field823[0];
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
        if (this.field826 != -1 && class43.method2947(this.field826).field977 == 1) {
            this.field826 = -1;
        }
        if (this.field821 < 9) {
            this.field821++;
        }
        for (int var5 = this.field821; var5 > 0; var5--) {
            this.field849[var5] = this.field849[var5 - 1];
            this.field823[var5] = this.field823[var5 - 1];
            this.field851[var5] = this.field851[var5 - 1];
        }
        this.field849[0] = var3;
        this.field823[0] = var4;
        this.field851[0] = arg1;
    }

    @ObfuscatedName("ag.h(IIZI)V")
    public final void method703(int arg0, int arg1, boolean arg2) {
        if (this.field826 != -1 && class43.method2947(this.field826).field977 == 1) {
            this.field826 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field849[0];
            int var5 = arg1 - this.field823[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field821 < 9) {
                    this.field821++;
                }
                for (int var6 = this.field821; var6 > 0; var6--) {
                    this.field849[var6] = this.field849[var6 - 1];
                    this.field823[var6] = this.field823[var6 - 1];
                    this.field851[var6] = this.field851[var6 - 1];
                }
                this.field849[0] = arg0;
                this.field823[0] = arg1;
                this.field851[0] = 1;
                return;
            }
        }
        this.field821 = 0;
        this.field853 = 0;
        this.field824 = 0;
        this.field849[0] = arg0;
        this.field823[0] = arg1;
        this.field817 = this.field849[0] * 128 + this.field796 * 64;
        this.field841 = this.field823[0] * 128 + this.field796 * 64;
    }

    @ObfuscatedName("ag.m(I)Ldf;")
    public final class106 method12() {
        if (this.field762 == null) {
            return null;
        }
        class43 var1 = this.field826 != -1 && this.field850 == 0 ? class43.method2947(this.field826) : null;
        class43 var2 = this.field855 == -1 || this.field855 == this.field800 && var1 != null ? null : class43.method2947(this.field855);
        class106 var3 = this.field762.method742(var1, this.field827, var2, this.field799);
        if (var3 == null) {
            return null;
        }
        var3.method2203();
        this.field795 = var3.field1444;
        if (this.field857 != -1 && this.field832 != -1) {
            class106 var4 = class44.method236(this.field857).method875(this.field832);
            if (var4 != null) {
                var4.method2168(0, -this.field835, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (this.field762.field869 == 1) {
            var3.field1810 = true;
        }
        return var3;
    }

    @ObfuscatedName("ag.i(I)Z")
    public final boolean method22() {
        return this.field762 != null;
    }
}
