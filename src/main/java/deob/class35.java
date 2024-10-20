package deob;

@ObfuscatedName("aj")
public final class class35 extends class38 {

    @ObfuscatedName("aj.e")
    public class40 field756;

    @ObfuscatedName("aj.e(IBS)V")
    public final void method699(int arg0, byte arg1) {
        int var3 = this.field843[0];
        int var4 = this.field844[0];
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
        if (this.field820 != -1 && class43.method949(this.field820).field979 == 1) {
            this.field820 = -1;
        }
        if (this.field835 < 9) {
            this.field835++;
        }
        for (int var5 = this.field835; var5 > 0; var5--) {
            this.field843[var5] = this.field843[var5 - 1];
            this.field844[var5] = this.field844[var5 - 1];
            this.field845[var5] = this.field845[var5 - 1];
        }
        this.field843[0] = var3;
        this.field844[0] = var4;
        this.field845[0] = arg1;
    }

    @ObfuscatedName("aj.w(IIZI)V")
    public final void method697(int arg0, int arg1, boolean arg2) {
        if (this.field820 != -1 && class43.method949(this.field820).field979 == 1) {
            this.field820 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field843[0];
            int var5 = arg1 - this.field844[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field835 < 9) {
                    this.field835++;
                }
                for (int var6 = this.field835; var6 > 0; var6--) {
                    this.field843[var6] = this.field843[var6 - 1];
                    this.field844[var6] = this.field844[var6 - 1];
                    this.field845[var6] = this.field845[var6 - 1];
                }
                this.field843[0] = arg0;
                this.field844[0] = arg1;
                this.field845[0] = 1;
                return;
            }
        }
        this.field835 = 0;
        this.field812 = 0;
        this.field833 = 0;
        this.field843[0] = arg0;
        this.field844[0] = arg1;
        this.field805 = this.field843[0] * 128 + this.field793 * 64;
        this.field815 = this.field844[0] * 128 + this.field793 * 64;
    }

    @ObfuscatedName("aj.f(B)Ldy;")
    public final class106 method25() {
        if (this.field756 == null) {
            return null;
        }
        class43 var1 = this.field820 != -1 && this.field823 == 0 ? class43.method949(this.field820) : null;
        class43 var2 = this.field839 == -1 || this.field848 == this.field839 && var1 != null ? null : class43.method949(this.field839);
        class106 var3 = this.field756.method735(var1, this.field790, var2, this.field840);
        if (var3 == null) {
            return null;
        }
        var3.method2183();
        this.field809 = var3.field1439;
        if (this.field825 != -1 && this.field818 != -1) {
            class106 var4 = class44.method1763(this.field825).method889(this.field818);
            if (var4 != null) {
                var4.method2179(0, -this.field829, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (this.field756.field872 == 1) {
            var3.field1802 = true;
        }
        return var3;
    }

    @ObfuscatedName("aj.g(I)Z")
    public final boolean method30() {
        return this.field756 != null;
    }
}
