package deob;

@ObfuscatedName("bd")
public final class class74 extends class65 {

    @ObfuscatedName("bd.f")
    public class274 field1091;

    @ObfuscatedName("bd.f(IBI)V")
    public final void method1758(int arg0, byte arg1) {
        int var3 = this.field954[0];
        int var4 = this.field981[0];
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
        if (this.field939 != -1 && class276.method3224(this.field939).field3610 == 1) {
            this.field939 = -1;
        }
        if (this.field945 < 9) {
            this.field945++;
        }
        for (int var5 = this.field945; var5 > 0; var5--) {
            this.field954[var5] = this.field954[var5 - 1];
            this.field981[var5] = this.field981[var5 - 1];
            this.field982[var5] = this.field982[var5 - 1];
        }
        this.field954[0] = var3;
        this.field981[0] = var4;
        this.field982[0] = arg1;
    }

    @ObfuscatedName("bd.l(IIZI)V")
    public final void method1759(int arg0, int arg1, boolean arg2) {
        if (this.field939 != -1 && class276.method3224(this.field939).field3610 == 1) {
            this.field939 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field954[0];
            int var5 = arg1 - this.field981[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field945 < 9) {
                    this.field945++;
                }
                for (int var6 = this.field945; var6 > 0; var6--) {
                    this.field954[var6] = this.field954[var6 - 1];
                    this.field981[var6] = this.field981[var6 - 1];
                    this.field982[var6] = this.field982[var6 - 1];
                }
                this.field954[0] = arg0;
                this.field981[0] = arg1;
                this.field982[0] = 1;
                return;
            }
        }
        this.field945 = 0;
        this.field984 = 0;
        this.field973 = 0;
        this.field954[0] = arg0;
        this.field981[0] = arg1;
        this.field943 = this.field954[0] * 128 + this.field928 * 64;
        this.field925 = this.field981[0] * 128 + this.field928 * 64;
    }

    @ObfuscatedName("bd.m(S)Lds;")
    public final class122 method1042() {
        if (this.field1091 == null) {
            return null;
        }
        class276 var1 = this.field939 != -1 && this.field960 == 0 ? class276.method3224(this.field939) : null;
        class276 var2 = this.field931 == -1 || this.field942 == this.field931 && var1 != null ? null : class276.method3224(this.field931);
        class122 var3 = this.field1091.method4849(var1, this.field958, var2, this.field955);
        if (var3 == null) {
            return null;
        }
        var3.method2535();
        this.field924 = var3.field1841;
        if (this.field962 != -1 && this.field963 != -1) {
            class122 var4 = class261.method2403(this.field962).method4533(this.field963);
            if (var4 != null) {
                var4.method2566(0, -this.field952, 0);
                class122[] var5 = new class122[] { var3, var4 };
                var3 = new class122(var5, 2);
            }
        }
        if (this.field1091.field3565 == 1) {
            var3.field1663 = true;
        }
        return var3;
    }

    @ObfuscatedName("bd.v(B)Z")
    public final boolean method1043() {
        return this.field1091 != null;
    }
}
