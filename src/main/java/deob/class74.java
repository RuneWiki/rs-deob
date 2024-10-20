package deob;

@ObfuscatedName("ba")
public final class class74 extends class65 {

    @ObfuscatedName("ba.y")
    public class274 field1088;

    @ObfuscatedName("ba.y(IBI)V")
    public final void method1675(int arg0, byte arg1) {
        int var3 = this.field933[0];
        int var4 = this.field974[0];
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
        if (this.field950 != -1 && class276.method3241(this.field950).field3600 == 1) {
            this.field950 = -1;
        }
        if (this.field972 < 9) {
            this.field972++;
        }
        for (int var5 = this.field972; var5 > 0; var5--) {
            this.field933[var5] = this.field933[var5 - 1];
            this.field974[var5] = this.field974[var5 - 1];
            this.field918[var5] = this.field918[var5 - 1];
        }
        this.field933[0] = var3;
        this.field974[0] = var4;
        this.field918[0] = arg1;
    }

    @ObfuscatedName("ba.c(IIZI)V")
    public final void method1677(int arg0, int arg1, boolean arg2) {
        if (this.field950 != -1 && class276.method3241(this.field950).field3600 == 1) {
            this.field950 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field933[0];
            int var5 = arg1 - this.field974[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field972 < 9) {
                    this.field972++;
                }
                for (int var6 = this.field972; var6 > 0; var6--) {
                    this.field933[var6] = this.field933[var6 - 1];
                    this.field974[var6] = this.field974[var6 - 1];
                    this.field918[var6] = this.field918[var6 - 1];
                }
                this.field933[0] = arg0;
                this.field974[0] = arg1;
                this.field918[0] = 1;
                return;
            }
        }
        this.field972 = 0;
        this.field977 = 0;
        this.field976 = 0;
        this.field933[0] = arg0;
        this.field974[0] = arg1;
        this.field951 = this.field933[0] * 128 + this.field921 * 64;
        this.field956 = this.field974[0] * 128 + this.field921 * 64;
    }

    @ObfuscatedName("ba.v(I)Lde;")
    public final class122 method1059() {
        if (this.field1088 == null) {
            return null;
        }
        class276 var1 = this.field950 != -1 && this.field953 == 0 ? class276.method3241(this.field950) : null;
        class276 var2 = this.field947 == -1 || this.field947 == this.field923 && var1 != null ? null : class276.method3241(this.field947);
        class122 var3 = this.field1088.method4803(var1, this.field955, var2, this.field922);
        if (var3 == null) {
            return null;
        }
        var3.method2473();
        this.field964 = var3.field1828;
        if (this.field975 != -1 && this.field934 != -1) {
            class122 var4 = class261.method1754(this.field975).method4499(this.field934);
            if (var4 != null) {
                var4.method2484(0, -this.field959, 0);
                class122[] var5 = new class122[] { var3, var4 };
                var3 = new class122(var5, 2);
            }
        }
        if (this.field1088.field3553 == 1) {
            var3.field1632 = true;
        }
        return var3;
    }

    @ObfuscatedName("ba.l(I)Z")
    public final boolean method1083() {
        return this.field1088 != null;
    }
}
