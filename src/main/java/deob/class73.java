package deob;

@ObfuscatedName("ba")
public final class class73 extends class64 {

    @ObfuscatedName("ba.w")
    public class272 field1059;

    @ObfuscatedName("ba.w(IBB)V")
    public final void method1703(int arg0, byte arg1) {
        int var3 = this.field929[0];
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
        if (this.field916 != -1 && class274.method2918(this.field916).field3564 == 1) {
            this.field916 = -1;
        }
        if (this.field938 < 9) {
            this.field938++;
        }
        for (int var5 = this.field938; var5 > 0; var5--) {
            this.field929[var5] = this.field929[var5 - 1];
            this.field940[var5] = this.field940[var5 - 1];
            this.field941[var5] = this.field941[var5 - 1];
        }
        this.field929[0] = var3;
        this.field940[0] = var4;
        this.field941[0] = arg1;
    }

    @ObfuscatedName("ba.m(IIZS)V")
    public final void method1702(int arg0, int arg1, boolean arg2) {
        if (this.field916 != -1 && class274.method2918(this.field916).field3564 == 1) {
            this.field916 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field929[0];
            int var5 = arg1 - this.field940[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field938 < 9) {
                    this.field938++;
                }
                for (int var6 = this.field938; var6 > 0; var6--) {
                    this.field929[var6] = this.field929[var6 - 1];
                    this.field940[var6] = this.field940[var6 - 1];
                    this.field941[var6] = this.field941[var6 - 1];
                }
                this.field929[0] = arg0;
                this.field940[0] = arg1;
                this.field941[0] = 1;
                return;
            }
        }
        this.field938 = 0;
        this.field943 = 0;
        this.field937 = 0;
        this.field929[0] = arg0;
        this.field940[0] = arg1;
        this.field901 = this.field929[0] * 128 + this.field886 * 64;
        this.field919 = this.field940[0] * 128 + this.field886 * 64;
    }

    @ObfuscatedName("ba.s(B)Ldk;")
    public final class120 method1048() {
        if (this.field1059 == null) {
            return null;
        }
        class274 var1 = this.field916 != -1 && this.field914 == 0 ? class274.method2918(this.field916) : null;
        class274 var2 = this.field913 == -1 || this.field913 == this.field910 && var1 != null ? null : class274.method2918(this.field913);
        class120 var3 = this.field1059.method4782(var1, this.field917, var2, this.field912);
        if (var3 == null) {
            return null;
        }
        var3.method2512();
        this.field923 = var3.field1806;
        if (this.field921 != -1 && this.field922 != -1) {
            class120 var4 = class259.method973(this.field921).method4477(this.field922);
            if (var4 != null) {
                var4.method2523(0, -this.field925, 0);
                class120[] var5 = new class120[] { var3, var4 };
                var3 = new class120(var5, 2);
            }
        }
        if (this.field1059.field3520 == 1) {
            var3.field1637 = true;
        }
        return var3;
    }

    @ObfuscatedName("ba.c(B)Z")
    public final boolean method1052() {
        return this.field1059 != null;
    }
}
