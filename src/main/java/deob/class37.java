package deob;

@ObfuscatedName("au")
public final class class37 extends class40 {

    @ObfuscatedName("au.x")
    public class42 field793;

    @ObfuscatedName("au.x(IBI)V")
    public final void method700(int arg0, byte arg1) {
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
        if (this.field850 != -1 && class45.method2337(this.field850).field1010 == 1) {
            this.field850 = -1;
        }
        if (this.field872 < 9) {
            this.field872++;
        }
        for (int var5 = this.field872; var5 > 0; var5--) {
            this.field873[var5] = this.field873[var5 - 1];
            this.field874[var5] = this.field874[var5 - 1];
            this.field831[var5] = this.field831[var5 - 1];
        }
        this.field873[0] = var3;
        this.field874[0] = var4;
        this.field831[0] = arg1;
    }

    @ObfuscatedName("au.r(IIZS)V")
    public final void method704(int arg0, int arg1, boolean arg2) {
        if (this.field850 != -1 && class45.method2337(this.field850).field1010 == 1) {
            this.field850 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field873[0];
            int var5 = arg1 - this.field874[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field872 < 9) {
                    this.field872++;
                }
                for (int var6 = this.field872; var6 > 0; var6--) {
                    this.field873[var6] = this.field873[var6 - 1];
                    this.field874[var6] = this.field874[var6 - 1];
                    this.field831[var6] = this.field831[var6 - 1];
                }
                this.field873[0] = arg0;
                this.field874[0] = arg1;
                this.field831[0] = 1;
                return;
            }
        }
        this.field872 = 0;
        this.field823 = 0;
        this.field876 = 0;
        this.field873[0] = arg0;
        this.field874[0] = arg1;
        this.field852 = this.field873[0] * 128 + this.field822 * 64;
        this.field869 = this.field874[0] * 128 + this.field822 * 64;
    }

    @ObfuscatedName("au.j(I)Ldj;")
    public final class109 method17() {
        if (this.field793 == null) {
            return null;
        }
        class45 var1 = this.field850 != -1 && this.field832 == 0 ? class45.method2337(this.field850) : null;
        class45 var2 = this.field847 == -1 || this.field847 == this.field818 && var1 != null ? null : class45.method2337(this.field847);
        class109 var3 = this.field793.method746(var1, this.field851, var2, this.field848);
        if (var3 == null) {
            return null;
        }
        var3.method2250();
        this.field868 = var3.field1504;
        if (this.field855 != -1 && this.field856 != -1) {
            class109 var4 = class46.method1823(this.field855).method875(this.field856);
            if (var4 != null) {
                var4.method2287(0, -this.field859, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (this.field793.field903 == 1) {
            var3.field1867 = true;
        }
        return var3;
    }

    @ObfuscatedName("au.l(I)Z")
    public final boolean method23() {
        return this.field793 != null;
    }
}
