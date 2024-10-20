package deob;

@ObfuscatedName("bo")
public final class class74 extends class65 {

    @ObfuscatedName("bo.v")
    public class274 field1077;

    @ObfuscatedName("bo.v(IBI)V")
    public final void method1700(int arg0, byte arg1) {
        int var3 = this.field927[0];
        int var4 = this.field940[0];
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
        if (this.field944 != -1 && class276.method115(this.field944).field3579 == 1) {
            this.field944 = -1;
        }
        if (this.field962 < 9) {
            this.field962++;
        }
        for (int var5 = this.field962; var5 > 0; var5--) {
            this.field927[var5] = this.field927[var5 - 1];
            this.field940[var5] = this.field940[var5 - 1];
            this.field965[var5] = this.field965[var5 - 1];
        }
        this.field927[0] = var3;
        this.field940[0] = var4;
        this.field965[0] = arg1;
    }

    @ObfuscatedName("bo.s(IIZB)V")
    public final void method1697(int arg0, int arg1, boolean arg2) {
        if (this.field944 != -1 && class276.method115(this.field944).field3579 == 1) {
            this.field944 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field927[0];
            int var5 = arg1 - this.field940[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field962 < 9) {
                    this.field962++;
                }
                for (int var6 = this.field962; var6 > 0; var6--) {
                    this.field927[var6] = this.field927[var6 - 1];
                    this.field940[var6] = this.field940[var6 - 1];
                    this.field965[var6] = this.field965[var6 - 1];
                }
                this.field927[0] = arg0;
                this.field940[0] = arg1;
                this.field965[0] = 1;
                return;
            }
        }
        this.field962 = 0;
        this.field967 = 0;
        this.field966 = 0;
        this.field927[0] = arg0;
        this.field940[0] = arg1;
        this.field933 = this.field927[0] * 128 + this.field911 * 64;
        this.field964 = this.field940[0] * 128 + this.field911 * 64;
    }

    @ObfuscatedName("bo.w(I)Lda;")
    public final class122 method1056() {
        if (this.field1077 == null) {
            return null;
        }
        class276 var1 = this.field944 != -1 && this.field943 == 0 ? class276.method115(this.field944) : null;
        class276 var2 = this.field937 == -1 || this.field937 == this.field913 && var1 != null ? null : class276.method115(this.field937);
        class122 var3 = this.field1077.method4812(var1, this.field932, var2, this.field938);
        if (var3 == null) {
            return null;
        }
        var3.method2532();
        this.field958 = var3.field1833;
        if (this.field941 != -1 && this.field931 != -1) {
            class122 var4 = class261.method2850(this.field941).method4519(this.field931);
            if (var4 != null) {
                var4.method2516(0, -this.field949, 0);
                class122[] var5 = new class122[] { var3, var4 };
                var3 = new class122(var5, 2);
            }
        }
        if (this.field1077.field3518 == 1) {
            var3.field1701 = true;
        }
        return var3;
    }

    @ObfuscatedName("bo.q(B)Z")
    public final boolean method1040() {
        return this.field1077 != null;
    }
}
