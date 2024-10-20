package deob;

@ObfuscatedName("bo")
public final class class74 extends class65 {

    @ObfuscatedName("bo.g")
    public class274 field1103;

    @ObfuscatedName("bo.g(IBI)V")
    public final void method1860(int arg0, byte arg1) {
        int var3 = this.field995[0];
        int var4 = this.field953[0];
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
        if (this.field972 != -1 && class276.method493(this.field972).field3633 == 1) {
            this.field972 = -1;
        }
        if (this.field940 < 9) {
            this.field940++;
        }
        for (int var5 = this.field940; var5 > 0; var5--) {
            this.field995[var5] = this.field995[var5 - 1];
            this.field953[var5] = this.field953[var5 - 1];
            this.field997[var5] = this.field997[var5 - 1];
        }
        this.field995[0] = var3;
        this.field953[0] = var4;
        this.field997[0] = arg1;
    }

    @ObfuscatedName("bo.r(IIZI)V")
    public final void method1864(int arg0, int arg1, boolean arg2) {
        if (this.field972 != -1 && class276.method493(this.field972).field3633 == 1) {
            this.field972 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field995[0];
            int var5 = arg1 - this.field953[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field940 < 9) {
                    this.field940++;
                }
                for (int var6 = this.field940; var6 > 0; var6--) {
                    this.field995[var6] = this.field995[var6 - 1];
                    this.field953[var6] = this.field953[var6 - 1];
                    this.field997[var6] = this.field997[var6 - 1];
                }
                this.field995[0] = arg0;
                this.field953[0] = arg1;
                this.field997[0] = 1;
                return;
            }
        }
        this.field940 = 0;
        this.field960 = 0;
        this.field956 = 0;
        this.field995[0] = arg0;
        this.field953[0] = arg1;
        this.field954 = this.field995[0] * 128 + this.field965 * 64;
        this.field1000 = this.field953[0] * 128 + this.field965 * 64;
    }

    @ObfuscatedName("bo.d(I)Ldl;")
    public final class122 method1130() {
        if (this.field1103 == null) {
            return null;
        }
        class276 var1 = this.field972 != -1 && this.field999 == 0 ? class276.method493(this.field972) : null;
        class276 var2 = this.field973 == -1 || this.field973 == this.field945 && var1 != null ? null : class276.method493(this.field973);
        class122 var3 = this.field1103.method5000(var1, this.field987, var2, this.field970);
        if (var3 == null) {
            return null;
        }
        var3.method2671();
        this.field947 = var3.field1841;
        if (this.field977 != -1 && this.field994 != -1) {
            class122 var4 = class261.method4525(this.field977).method4680(this.field994);
            if (var4 != null) {
                var4.method2683(0, -this.field981, 0);
                class122[] var5 = new class122[] { var3, var4 };
                var3 = new class122(var5, 2);
            }
        }
        if (this.field1103.field3601 == 1) {
            var3.field1665 = true;
        }
        return var3;
    }

    @ObfuscatedName("bo.h(I)Z")
    public final boolean method1104() {
        return this.field1103 != null;
    }
}
