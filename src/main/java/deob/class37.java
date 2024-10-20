package deob;

@ObfuscatedName("ak")
public final class class37 extends class40 {

    @ObfuscatedName("ak.k")
    public class42 field793;

    @ObfuscatedName("ak.k(IBI)V")
    public final void method722(int arg0, byte arg1) {
        int var3 = this.field881[0];
        int var4 = this.field882[0];
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
        if (this.field851 != -1 && class45.method726(this.field851).field1019 == 1) {
            this.field851 = -1;
        }
        if (this.field852 < 9) {
            this.field852++;
        }
        for (int var5 = this.field852; var5 > 0; var5--) {
            this.field881[var5] = this.field881[var5 - 1];
            this.field882[var5] = this.field882[var5 - 1];
            this.field883[var5] = this.field883[var5 - 1];
        }
        this.field881[0] = var3;
        this.field882[0] = var4;
        this.field883[0] = arg1;
    }

    @ObfuscatedName("ak.q(IIZB)V")
    public final void method723(int arg0, int arg1, boolean arg2) {
        if (this.field851 != -1 && class45.method726(this.field851).field1019 == 1) {
            this.field851 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field881[0];
            int var5 = arg1 - this.field882[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field852 < 9) {
                    this.field852++;
                }
                for (int var6 = this.field852; var6 > 0; var6--) {
                    this.field881[var6] = this.field881[var6 - 1];
                    this.field882[var6] = this.field882[var6 - 1];
                    this.field883[var6] = this.field883[var6 - 1];
                }
                this.field881[0] = arg0;
                this.field882[0] = arg1;
                this.field883[0] = 1;
                return;
            }
        }
        this.field852 = 0;
        this.field864 = 0;
        this.field884 = 0;
        this.field881[0] = arg0;
        this.field882[0] = arg1;
        this.field880 = this.field881[0] * 128 + this.field842 * 64;
        this.field827 = this.field882[0] * 128 + this.field842 * 64;
    }

    @ObfuscatedName("ak.f(I)Ldj;")
    public final class109 method14() {
        if (this.field793 == null) {
            return null;
        }
        class45 var1 = this.field851 != -1 && this.field861 == 0 ? class45.method726(this.field851) : null;
        class45 var2 = this.field826 == -1 || this.field831 == this.field826 && var1 != null ? null : class45.method726(this.field826);
        class109 var3 = this.field793.method774(var1, this.field860, var2, this.field855);
        if (var3 == null) {
            return null;
        }
        var3.method2233();
        this.field858 = var3.field1518;
        if (this.field863 != -1 && this.field828 != -1) {
            class109 var4 = class46.method2984(this.field863).method904(this.field828);
            if (var4 != null) {
                var4.method2242(0, -this.field867, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (this.field793.field900 == 1) {
            var3.field1912 = true;
        }
        return var3;
    }

    @ObfuscatedName("ak.m(I)Z")
    public final boolean method18() {
        return this.field793 != null;
    }
}
