package deob;

@ObfuscatedName("az")
public final class class35 extends class38 {

    @ObfuscatedName("az.k")
    public class40 field756;

    @ObfuscatedName("az.k(IBI)V")
    public final void method671(int arg0, byte arg1) {
        int var3 = this.field842[0];
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
        if (this.field811 != -1 && class43.method3491(this.field811).field973 == 1) {
            this.field811 = -1;
        }
        if (this.field840 < 9) {
            this.field840++;
        }
        for (int var5 = this.field840; var5 > 0; var5--) {
            this.field842[var5] = this.field842[var5 - 1];
            this.field844[var5] = this.field844[var5 - 1];
            this.field843[var5] = this.field843[var5 - 1];
        }
        this.field842[0] = var3;
        this.field844[0] = var4;
        this.field843[0] = arg1;
    }

    @ObfuscatedName("az.h(IIZB)V")
    public final void method672(int arg0, int arg1, boolean arg2) {
        if (this.field811 != -1 && class43.method3491(this.field811).field973 == 1) {
            this.field811 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field842[0];
            int var5 = arg1 - this.field844[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field840 < 9) {
                    this.field840++;
                }
                for (int var6 = this.field840; var6 > 0; var6--) {
                    this.field842[var6] = this.field842[var6 - 1];
                    this.field844[var6] = this.field844[var6 - 1];
                    this.field843[var6] = this.field843[var6 - 1];
                }
                this.field842[0] = arg0;
                this.field844[0] = arg1;
                this.field843[0] = 1;
                return;
            }
        }
        this.field840 = 0;
        this.field823 = 0;
        this.field787 = 0;
        this.field842[0] = arg0;
        this.field844[0] = arg1;
        this.field818 = this.field842[0] * 128 + this.field829 * 64;
        this.field788 = this.field844[0] * 128 + this.field829 * 64;
    }

    @ObfuscatedName("az.o(I)Ldl;")
    public final class105 method11() {
        if (this.field756 == null) {
            return null;
        }
        class43 var1 = this.field811 != -1 && this.field821 == 0 ? class43.method3491(this.field811) : null;
        class43 var2 = this.field814 == -1 || this.field814 == this.field792 && var1 != null ? null : class43.method3491(this.field814);
        class105 var3 = this.field756.method726(var1, this.field816, var2, this.field841);
        if (var3 == null) {
            return null;
        }
        var3.method2149();
        this.field800 = var3.field1420;
        if (this.field802 != -1 && this.field824 != -1) {
            class105 var4 = class44.method520(this.field802).method847(this.field824);
            if (var4 != null) {
                var4.method2141(0, -this.field836, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field756.field863 == 1) {
            var3.field1777 = true;
        }
        return var3;
    }

    @ObfuscatedName("az.l(B)Z")
    public final boolean method15() {
        return this.field756 != null;
    }
}
