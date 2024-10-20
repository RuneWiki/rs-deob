package deob;

@ObfuscatedName("az")
public final class class35 extends class38 {

    @ObfuscatedName("az.j")
    public class40 field762;

    @ObfuscatedName("az.j(IBI)V")
    public final void method739(int arg0, byte arg1) {
        int var3 = this.field810[0];
        int var4 = this.field817[0];
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
        if (this.field830 != -1 && class43.method575(this.field830).field986 == 1) {
            this.field830 = -1;
        }
        if (this.field852 < 9) {
            this.field852++;
        }
        for (int var5 = this.field852; var5 > 0; var5--) {
            this.field810[var5] = this.field810[var5 - 1];
            this.field817[var5] = this.field817[var5 - 1];
            this.field856[var5] = this.field856[var5 - 1];
        }
        this.field810[0] = var3;
        this.field817[0] = var4;
        this.field856[0] = arg1;
    }

    @ObfuscatedName("az.m(IIZB)V")
    public final void method738(int arg0, int arg1, boolean arg2) {
        if (this.field830 != -1 && class43.method575(this.field830).field986 == 1) {
            this.field830 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field810[0];
            int var5 = arg1 - this.field817[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field852 < 9) {
                    this.field852++;
                }
                for (int var6 = this.field852; var6 > 0; var6--) {
                    this.field810[var6] = this.field810[var6 - 1];
                    this.field817[var6] = this.field817[var6 - 1];
                    this.field856[var6] = this.field856[var6 - 1];
                }
                this.field810[0] = arg0;
                this.field817[0] = arg1;
                this.field856[0] = 1;
                return;
            }
        }
        this.field852 = 0;
        this.field857 = 0;
        this.field832 = 0;
        this.field810[0] = arg0;
        this.field817[0] = arg1;
        this.field847 = this.field810[0] * 128 + this.field803 * 64;
        this.field835 = this.field817[0] * 128 + this.field803 * 64;
    }

    @ObfuscatedName("az.f(I)Lda;")
    public final class105 method17() {
        if (this.field762 == null) {
            return null;
        }
        class43 var1 = this.field830 != -1 && this.field833 == 0 ? class43.method575(this.field830) : null;
        class43 var2 = this.field827 == -1 || this.field827 == this.field804 && var1 != null ? null : class43.method575(this.field827);
        class105 var3 = this.field762.method789(var1, this.field831, var2, this.field828);
        if (var3 == null) {
            return null;
        }
        var3.method2179();
        this.field812 = var3.field1442;
        if (this.field806 != -1 && this.field836 != -1) {
            class105 var4 = class44.method152(this.field806).method914(this.field836);
            if (var4 != null) {
                var4.method2189(0, -this.field839, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field762.field872 == 1) {
            var3.field1822 = true;
        }
        return var3;
    }

    @ObfuscatedName("az.h(B)Z")
    public final boolean method21() {
        return this.field762 != null;
    }
}
