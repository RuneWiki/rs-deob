package deob;

@ObfuscatedName("ah")
public final class class35 extends class38 {

    @ObfuscatedName("ah.w")
    public class40 field782;

    @ObfuscatedName("ah.w(IBI)V")
    public final void method726(int arg0, byte arg1) {
        int var3 = this.field873[0];
        int var4 = this.field874[0];
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
        if (this.field822 != -1 && class43.method2054(this.field822).field1005 == 1) {
            this.field822 = -1;
        }
        if (this.field819 < 9) {
            this.field819++;
        }
        for (int var5 = this.field819; var5 > 0; var5--) {
            this.field873[var5] = this.field873[var5 - 1];
            this.field874[var5] = this.field874[var5 - 1];
            this.field875[var5] = this.field875[var5 - 1];
        }
        this.field873[0] = var3;
        this.field874[0] = var4;
        this.field875[0] = arg1;
    }

    @ObfuscatedName("ah.x(IIZB)V")
    public final void method725(int arg0, int arg1, boolean arg2) {
        if (this.field822 != -1 && class43.method2054(this.field822).field1005 == 1) {
            this.field822 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field873[0];
            int var5 = arg1 - this.field874[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field819 < 9) {
                    this.field819++;
                }
                for (int var6 = this.field819; var6 > 0; var6--) {
                    this.field873[var6] = this.field873[var6 - 1];
                    this.field874[var6] = this.field874[var6 - 1];
                    this.field875[var6] = this.field875[var6 - 1];
                }
                this.field873[0] = arg0;
                this.field874[0] = arg1;
                this.field875[0] = 1;
                return;
            }
        }
        this.field819 = 0;
        this.field876 = 0;
        this.field846 = 0;
        this.field873[0] = arg0;
        this.field874[0] = arg1;
        this.field850 = this.field873[0] * 128 + this.field823 * 64;
        this.field820 = this.field874[0] * 128 + this.field823 * 64;
    }

    @ObfuscatedName("ah.t(I)Ldp;")
    public final class106 method34() {
        if (this.field782 == null) {
            return null;
        }
        class43 var1 = this.field822 != -1 && this.field853 == 0 ? class43.method2054(this.field822) : null;
        class43 var2 = this.field847 == -1 || this.field847 == this.field824 && var1 != null ? null : class43.method2054(this.field847);
        class106 var3 = this.field782.method773(var1, this.field851, var2, this.field838);
        if (var3 == null) {
            return null;
        }
        var3.method2189();
        this.field868 = var3.field1468;
        if (this.field855 != -1 && this.field870 != -1) {
            class106 var4 = class44.method662(this.field855).method918(this.field870);
            if (var4 != null) {
                var4.method2205(0, -this.field859, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (this.field782.field886 == 1) {
            var3.field1871 = true;
        }
        return var3;
    }

    @ObfuscatedName("ah.m(B)Z")
    public final boolean method20() {
        return this.field782 != null;
    }
}
