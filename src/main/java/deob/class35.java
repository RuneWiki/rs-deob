package deob;

@ObfuscatedName("av")
public final class class35 extends class38 {

    @ObfuscatedName("av.f")
    public class40 field783;

    @ObfuscatedName("av.f(IBI)V")
    public final void method737(int arg0, byte arg1) {
        int var3 = this.field876[0];
        int var4 = this.field877[0];
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
        if (this.field823 != -1 && class43.method745(this.field823).field998 == 1) {
            this.field823 = -1;
        }
        if (this.field875 < 9) {
            this.field875++;
        }
        for (int var5 = this.field875; var5 > 0; var5--) {
            this.field876[var5] = this.field876[var5 - 1];
            this.field877[var5] = this.field877[var5 - 1];
            this.field829[var5] = this.field829[var5 - 1];
        }
        this.field876[0] = var3;
        this.field877[0] = var4;
        this.field829[0] = arg1;
    }

    @ObfuscatedName("av.u(IIZI)V")
    public final void method736(int arg0, int arg1, boolean arg2) {
        if (this.field823 != -1 && class43.method745(this.field823).field998 == 1) {
            this.field823 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field876[0];
            int var5 = arg1 - this.field877[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field875 < 9) {
                    this.field875++;
                }
                for (int var6 = this.field875; var6 > 0; var6--) {
                    this.field876[var6] = this.field876[var6 - 1];
                    this.field877[var6] = this.field877[var6 - 1];
                    this.field829[var6] = this.field829[var6 - 1];
                }
                this.field876[0] = arg0;
                this.field877[0] = arg1;
                this.field829[0] = 1;
                return;
            }
        }
        this.field875 = 0;
        this.field880 = 0;
        this.field866 = 0;
        this.field876[0] = arg0;
        this.field877[0] = arg1;
        this.field838 = this.field876[0] * 128 + this.field826 * 64;
        this.field881 = this.field877[0] * 128 + this.field826 * 64;
    }

    @ObfuscatedName("av.x(S)Ldr;")
    public final class106 method29() {
        if (this.field783 == null) {
            return null;
        }
        class43 var1 = this.field823 != -1 && this.field856 == 0 ? class43.method745(this.field823) : null;
        class43 var2 = this.field850 == -1 || this.field850 == this.field827 && var1 != null ? null : class43.method745(this.field850);
        class106 var3 = this.field783.method784(var1, this.field854, var2, this.field869);
        if (var3 == null) {
            return null;
        }
        var3.method2195();
        this.field871 = var3.field1469;
        if (this.field858 != -1 && this.field822 != -1) {
            class106 var4 = class44.method13(this.field858).method925(this.field822);
            if (var4 != null) {
                var4.method2203(0, -this.field843, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (this.field783.field908 == 1) {
            var3.field1830 = true;
        }
        return var3;
    }

    @ObfuscatedName("av.n(I)Z")
    public final boolean method22() {
        return this.field783 != null;
    }
}
