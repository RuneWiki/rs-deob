package deob;

@ObfuscatedName("az")
public final class class35 extends class38 {

    @ObfuscatedName("az.a")
    public class40 field785;

    @ObfuscatedName("az.a(IBI)V")
    public final void method790(int arg0, byte arg1) {
        int var3 = this.field872[0];
        int var4 = this.field836[0];
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
        if (this.field849 != -1 && class43.method2137(this.field849).field1005 == 1) {
            this.field849 = -1;
        }
        if (this.field822 < 9) {
            this.field822++;
        }
        for (int var5 = this.field822; var5 > 0; var5--) {
            this.field872[var5] = this.field872[var5 - 1];
            this.field836[var5] = this.field836[var5 - 1];
            this.field827[var5] = this.field827[var5 - 1];
        }
        this.field872[0] = var3;
        this.field836[0] = var4;
        this.field827[0] = arg1;
    }

    @ObfuscatedName("az.w(IIZB)V")
    public final void method794(int arg0, int arg1, boolean arg2) {
        if (this.field849 != -1 && class43.method2137(this.field849).field1005 == 1) {
            this.field849 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field872[0];
            int var5 = arg1 - this.field836[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field822 < 9) {
                    this.field822++;
                }
                for (int var6 = this.field822; var6 > 0; var6--) {
                    this.field872[var6] = this.field872[var6 - 1];
                    this.field836[var6] = this.field836[var6 - 1];
                    this.field827[var6] = this.field827[var6 - 1];
                }
                this.field872[0] = arg0;
                this.field836[0] = arg1;
                this.field827[0] = 1;
                return;
            }
        }
        this.field822 = 0;
        this.field876 = 0;
        this.field875 = 0;
        this.field872[0] = arg0;
        this.field836[0] = arg1;
        this.field845 = this.field872[0] * 128 + this.field842 * 64;
        this.field820 = this.field836[0] * 128 + this.field842 * 64;
    }

    @ObfuscatedName("az.d(I)Ldr;")
    public final class106 method32() {
        if (this.field785 == null) {
            return null;
        }
        class43 var1 = this.field849 != -1 && this.field852 == 0 ? class43.method2137(this.field849) : null;
        class43 var2 = this.field846 == -1 || this.field846 == this.field823 && var1 != null ? null : class43.method2137(this.field846);
        class106 var3 = this.field785.method838(var1, this.field850, var2, this.field847);
        if (var3 == null) {
            return null;
        }
        var3.method2274();
        this.field868 = var3.field1466;
        if (this.field866 != -1 && this.field855 != -1) {
            class106 var4 = class44.method688(this.field866).method972(this.field855);
            if (var4 != null) {
                var4.method2260(0, -this.field858, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (this.field785.field888 == 1) {
            var3.field1820 = true;
        }
        return var3;
    }

    @ObfuscatedName("az.r(I)Z")
    public final boolean method29() {
        return this.field785 != null;
    }
}
