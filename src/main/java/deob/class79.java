package deob;

@ObfuscatedName("ch")
public final class class79 extends class70 {

    @ObfuscatedName("ch.n")
    public class277 field1086;

    @ObfuscatedName("ch.n(IBB)V")
    public final void method1845(int arg0, byte arg1) {
        int var3 = this.field977[0];
        int var4 = this.field982[0];
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
        if (this.field954 != -1 && class279.method2783(this.field954).field3606 == 1) {
            this.field954 = -1;
        }
        if (this.field957 < 9) {
            this.field957++;
        }
        for (int var5 = this.field957; var5 > 0; var5--) {
            this.field977[var5] = this.field977[var5 - 1];
            this.field982[var5] = this.field982[var5 - 1];
            this.field979[var5] = this.field979[var5 - 1];
        }
        this.field977[0] = var3;
        this.field982[0] = var4;
        this.field979[0] = arg1;
    }

    @ObfuscatedName("ch.h(IIZB)V")
    public final void method1850(int arg0, int arg1, boolean arg2) {
        if (this.field954 != -1 && class279.method2783(this.field954).field3606 == 1) {
            this.field954 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field977[0];
            int var5 = arg1 - this.field982[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field957 < 9) {
                    this.field957++;
                }
                for (int var6 = this.field957; var6 > 0; var6--) {
                    this.field977[var6] = this.field977[var6 - 1];
                    this.field982[var6] = this.field982[var6 - 1];
                    this.field979[var6] = this.field979[var6 - 1];
                }
                this.field977[0] = arg0;
                this.field982[0] = arg1;
                this.field979[0] = 1;
                return;
            }
        }
        this.field957 = 0;
        this.field921 = 0;
        this.field925 = 0;
        this.field977[0] = arg0;
        this.field982[0] = arg1;
        this.field949 = this.field977[0] * 128 + this.field950 * 64;
        this.field922 = this.field982[0] * 128 + this.field950 * 64;
    }

    @ObfuscatedName("ch.j(I)Ldq;")
    public final class127 method1101() {
        if (this.field1086 == null) {
            return null;
        }
        class279 var1 = this.field954 != -1 && this.field969 == 0 ? class279.method2783(this.field954) : null;
        class279 var2 = this.field951 == -1 || this.field951 == this.field927 && var1 != null ? null : class279.method2783(this.field951);
        class127 var3 = this.field1086.method4974(var1, this.field955, var2, this.field952);
        if (var3 == null) {
            return null;
        }
        var3.method2676();
        this.field972 = var3.field1860;
        if (this.field959 != -1 && this.field960 != -1) {
            class127 var4 = class264.method2268(this.field959).method4686(this.field960);
            if (var4 != null) {
                var4.method2701(0, -this.field966, 0);
                class127[] var5 = new class127[] { var3, var4 };
                var3 = new class127(var5, 2);
            }
        }
        if (this.field1086.field3549 == 1) {
            var3.field1673 = true;
        }
        return var3;
    }

    @ObfuscatedName("ch.v(B)Z")
    public final boolean method1105() {
        return this.field1086 != null;
    }
}
