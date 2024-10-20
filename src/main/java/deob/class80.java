package deob;

@ObfuscatedName("ct")
public final class class80 extends class70 {

    @ObfuscatedName("ct.c")
    public class257 field1098;

    @ObfuscatedName("ct.c(IBI)V")
    public final void method1877(int arg0, byte arg1) {
        int var3 = this.field940[0];
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
        if (this.field950 != -1 && class259.method1897(this.field950).field3502 == 1) {
            this.field950 = -1;
        }
        if (this.field972 < 9) {
            this.field972++;
        }
        for (int var5 = this.field972; var5 > 0; var5--) {
            this.field940[var5] = this.field940[var5 - 1];
            this.field974[var5] = this.field974[var5 - 1];
            this.field975[var5] = this.field975[var5 - 1];
        }
        this.field940[0] = var3;
        this.field974[0] = var4;
        this.field975[0] = arg1;
    }

    @ObfuscatedName("ct.x(IIZB)V")
    public final void method1878(int arg0, int arg1, boolean arg2) {
        if (this.field950 != -1 && class259.method1897(this.field950).field3502 == 1) {
            this.field950 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field940[0];
            int var5 = arg1 - this.field974[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field972 < 9) {
                    this.field972++;
                }
                for (int var6 = this.field972; var6 > 0; var6--) {
                    this.field940[var6] = this.field940[var6 - 1];
                    this.field974[var6] = this.field974[var6 - 1];
                    this.field975[var6] = this.field975[var6 - 1];
                }
                this.field940[0] = arg0;
                this.field974[0] = arg1;
                this.field975[0] = 1;
                return;
            }
        }
        this.field972 = 0;
        this.field970 = 0;
        this.field976 = 0;
        this.field940[0] = arg0;
        this.field974[0] = arg1;
        this.field971 = this.field940[0] * 128 + this.field939 * 64;
        this.field918 = this.field974[0] * 128 + this.field939 * 64;
    }

    @ObfuscatedName("ct.d(B)Ldr;")
    public final class128 method1062() {
        if (this.field1098 == null) {
            return null;
        }
        class259 var1 = this.field950 != -1 && this.field953 == 0 ? class259.method1897(this.field950) : null;
        class259 var2 = this.field973 == -1 || this.field973 == this.field923 && var1 != null ? null : class259.method1897(this.field973);
        class128 var3 = this.field1098.method4408(var1, this.field951, var2, this.field948);
        if (var3 == null) {
            return null;
        }
        var3.method2635();
        this.field968 = var3.field1837;
        if (this.field955 != -1 && this.field919 != -1) {
            class128 var4 = class244.method3966(this.field955).method4082(this.field919);
            if (var4 != null) {
                var4.method2664(0, -this.field959, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (this.field1098.field3441 == 1) {
            var3.field1664 = true;
        }
        return var3;
    }

    @ObfuscatedName("ct.e(B)Z")
    public final boolean method1066() {
        return this.field1098 != null;
    }
}
