package deob;

@ObfuscatedName("bx")
public final class class74 extends class65 {

    @ObfuscatedName("bx.c")
    public class274 field1089;

    @ObfuscatedName("bx.c(IBI)V")
    public final void method1660(int arg0, byte arg1) {
        int var3 = this.field977[0];
        int var4 = this.field975[0];
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
        if (this.field963 != -1 && class276.method2826(this.field963).field3597 == 1) {
            this.field963 = -1;
        }
        if (this.field985 < 9) {
            this.field985++;
        }
        for (int var5 = this.field985; var5 > 0; var5--) {
            this.field977[var5] = this.field977[var5 - 1];
            this.field975[var5] = this.field975[var5 - 1];
            this.field988[var5] = this.field988[var5 - 1];
        }
        this.field977[0] = var3;
        this.field975[0] = var4;
        this.field988[0] = arg1;
    }

    @ObfuscatedName("bx.q(IIZI)V")
    public final void method1659(int arg0, int arg1, boolean arg2) {
        if (this.field963 != -1 && class276.method2826(this.field963).field3597 == 1) {
            this.field963 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field977[0];
            int var5 = arg1 - this.field975[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field985 < 9) {
                    this.field985++;
                }
                for (int var6 = this.field985; var6 > 0; var6--) {
                    this.field977[var6] = this.field977[var6 - 1];
                    this.field975[var6] = this.field975[var6 - 1];
                    this.field988[var6] = this.field988[var6 - 1];
                }
                this.field977[0] = arg0;
                this.field975[0] = arg1;
                this.field988[0] = 1;
                return;
            }
        }
        this.field985 = 0;
        this.field990 = 0;
        this.field976 = 0;
        this.field977[0] = arg0;
        this.field975[0] = arg1;
        this.field947 = this.field977[0] * 128 + this.field934 * 64;
        this.field960 = this.field975[0] * 128 + this.field934 * 64;
    }

    @ObfuscatedName("bx.o(B)Ldx;")
    public final class122 method1063() {
        if (this.field1089 == null) {
            return null;
        }
        class276 var1 = this.field963 != -1 && this.field987 == 0 ? class276.method2826(this.field963) : null;
        class276 var2 = this.field970 == -1 || this.field970 == this.field930 && var1 != null ? null : class276.method2826(this.field970);
        class122 var3 = this.field1089.method4801(var1, this.field964, var2, this.field979);
        if (var3 == null) {
            return null;
        }
        var3.method2496();
        this.field981 = var3.field1849;
        if (this.field971 != -1 && this.field969 != -1) {
            class122 var4 = class261.method34(this.field971).method4477(this.field969);
            if (var4 != null) {
                var4.method2431(0, -this.field972, 0);
                class122[] var5 = new class122[] { var3, var4 };
                var3 = new class122(var5, 2);
            }
        }
        if (this.field1089.field3539 == 1) {
            var3.field1673 = true;
        }
        return var3;
    }

    @ObfuscatedName("bx.n(I)Z")
    public final boolean method1040() {
        return this.field1089 != null;
    }
}
