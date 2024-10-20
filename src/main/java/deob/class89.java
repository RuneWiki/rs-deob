package deob;

@ObfuscatedName("cv")
public final class class89 extends class79 {

    @ObfuscatedName("cv.m")
    public class267 field1158;

    @ObfuscatedName("cv.m(IBI)V")
    public final void method1944(int arg0, byte arg1) {
        int var3 = this.field1020[0];
        int var4 = this.field1021[0];
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
        if (this.field992 != -1 && class269.method3330(this.field992).field3561 == 1) {
            this.field992 = -1;
        }
        if (this.field976 < 9) {
            this.field976++;
        }
        for (int var5 = this.field976; var5 > 0; var5--) {
            this.field1020[var5] = this.field1020[var5 - 1];
            this.field1021[var5] = this.field1021[var5 - 1];
            this.field1022[var5] = this.field1022[var5 - 1];
        }
        this.field1020[0] = var3;
        this.field1021[0] = var4;
        this.field1022[0] = arg1;
    }

    @ObfuscatedName("cv.o(IIZI)V")
    public final void method1942(int arg0, int arg1, boolean arg2) {
        if (this.field992 != -1 && class269.method3330(this.field992).field3561 == 1) {
            this.field992 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1020[0];
            int var5 = arg1 - this.field1021[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field976 < 9) {
                    this.field976++;
                }
                for (int var6 = this.field976; var6 > 0; var6--) {
                    this.field1020[var6] = this.field1020[var6 - 1];
                    this.field1021[var6] = this.field1021[var6 - 1];
                    this.field1022[var6] = this.field1022[var6 - 1];
                }
                this.field1020[0] = arg0;
                this.field1021[0] = arg1;
                this.field1022[0] = 1;
                return;
            }
        }
        this.field976 = 0;
        this.field1024 = 0;
        this.field1023 = 0;
        this.field1020[0] = arg0;
        this.field1021[0] = arg1;
        this.field983 = this.field1020[0] * 128 + this.field968 * 64;
        this.field965 = this.field1021[0] * 128 + this.field968 * 64;
    }

    @ObfuscatedName("cv.a(I)Lef;")
    public final class137 method1131() {
        if (this.field1158 == null) {
            return null;
        }
        class269 var1 = this.field992 != -1 && this.field1000 == 0 ? class269.method3330(this.field992) : null;
        class269 var2 = this.field1019 == -1 || this.field970 == this.field1019 && var1 != null ? null : class269.method3330(this.field1019);
        class137 var3 = this.field1158.method4470(var1, this.field998, var2, this.field995);
        if (var3 == null) {
            return null;
        }
        var3.method2711();
        this.field1015 = var3.field1898;
        if (this.field1002 != -1 && this.field974 != -1) {
            class137 var4 = class254.method41(this.field1002).method4145(this.field974);
            if (var4 != null) {
                var4.method2779(0, -this.field1006, 0);
                class137[] var5 = new class137[] { var3, var4 };
                var3 = new class137(var5, 2);
            }
        }
        if (this.field1158.field3500 == 1) {
            var3.field1755 = true;
        }
        return var3;
    }

    @ObfuscatedName("cv.c(B)Z")
    public final boolean method1124() {
        return this.field1158 != null;
    }
}
