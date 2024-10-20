package deob;

@ObfuscatedName("ax")
public final class class35 extends class38 {

    @ObfuscatedName("ax.b")
    public class40 field763;

    @ObfuscatedName("ax.b(IBS)V")
    public final void method714(int arg0, byte arg1) {
        int var3 = this.field845[0];
        int var4 = this.field832[0];
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
        if (this.field802 != -1 && class43.method175(this.field802).field979 == 1) {
            this.field802 = -1;
        }
        if (this.field809 < 9) {
            this.field809++;
        }
        for (int var5 = this.field809; var5 > 0; var5--) {
            this.field845[var5] = this.field845[var5 - 1];
            this.field832[var5] = this.field832[var5 - 1];
            this.field847[var5] = this.field847[var5 - 1];
        }
        this.field845[0] = var3;
        this.field832[0] = var4;
        this.field847[0] = arg1;
    }

    @ObfuscatedName("ax.g(IIZB)V")
    public final void method716(int arg0, int arg1, boolean arg2) {
        if (this.field802 != -1 && class43.method175(this.field802).field979 == 1) {
            this.field802 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field845[0];
            int var5 = arg1 - this.field832[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field809 < 9) {
                    this.field809++;
                }
                for (int var6 = this.field809; var6 > 0; var6--) {
                    this.field845[var6] = this.field845[var6 - 1];
                    this.field832[var6] = this.field832[var6 - 1];
                    this.field847[var6] = this.field847[var6 - 1];
                }
                this.field845[0] = arg0;
                this.field832[0] = arg1;
                this.field847[0] = 1;
                return;
            }
        }
        this.field809 = 0;
        this.field837 = 0;
        this.field848 = 0;
        this.field845[0] = arg0;
        this.field832[0] = arg1;
        this.field814 = this.field845[0] * 128 + this.field833 * 64;
        this.field792 = this.field832[0] * 128 + this.field833 * 64;
    }

    @ObfuscatedName("ax.j(I)Ldd;")
    public final class106 method16() {
        if (this.field763 == null) {
            return null;
        }
        class43 var1 = this.field802 != -1 && this.field828 == 0 ? class43.method175(this.field802) : null;
        class43 var2 = this.field819 == -1 || this.field819 == this.field796 && var1 != null ? null : class43.method175(this.field819);
        class106 var3 = this.field763.method752(var1, this.field823, var2, this.field820);
        if (var3 == null) {
            return null;
        }
        var3.method2164();
        this.field840 = var3.field1437;
        if (this.field836 != -1 && this.field812 != -1) {
            class106 var4 = class44.method701(this.field836).method889(this.field812);
            if (var4 != null) {
                var4.method2157(0, -this.field835, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (this.field763.field866 == 1) {
            var3.field1812 = true;
        }
        return var3;
    }

    @ObfuscatedName("ax.r(B)Z")
    public final boolean method20() {
        return this.field763 != null;
    }
}
