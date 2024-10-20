package deob;

@ObfuscatedName("cm")
public final class class79 extends class70 {

    @ObfuscatedName("cm.a")
    public class278 field1103;

    @ObfuscatedName("cm.a(IBI)V")
    public final void method1899(int arg0, byte arg1) {
        int var3 = this.field999[0];
        int var4 = this.field996[0];
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
        if (this.field939 != -1 && class280.method3173(this.field939).field3625 == 1) {
            this.field939 = -1;
        }
        if (this.field994 < 9) {
            this.field994++;
        }
        for (int var5 = this.field994; var5 > 0; var5--) {
            this.field999[var5] = this.field999[var5 - 1];
            this.field996[var5] = this.field996[var5 - 1];
            this.field956[var5] = this.field956[var5 - 1];
        }
        this.field999[0] = var3;
        this.field996[0] = var4;
        this.field956[0] = arg1;
    }

    @ObfuscatedName("cm.s(IIZI)V")
    public final void method1900(int arg0, int arg1, boolean arg2) {
        if (this.field939 != -1 && class280.method3173(this.field939).field3625 == 1) {
            this.field939 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field999[0];
            int var5 = arg1 - this.field996[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field994 < 9) {
                    this.field994++;
                }
                for (int var6 = this.field994; var6 > 0; var6--) {
                    this.field999[var6] = this.field999[var6 - 1];
                    this.field996[var6] = this.field996[var6 - 1];
                    this.field956[var6] = this.field956[var6 - 1];
                }
                this.field999[0] = arg0;
                this.field996[0] = arg1;
                this.field956[0] = 1;
                return;
            }
        }
        this.field994 = 0;
        this.field951 = 0;
        this.field998 = 0;
        this.field999[0] = arg0;
        this.field996[0] = arg1;
        this.field948 = this.field999[0] * 128 + this.field943 * 64;
        this.field949 = this.field996[0] * 128 + this.field943 * 64;
    }

    @ObfuscatedName("cm.q(I)Ldv;")
    public final class127 method1112() {
        if (this.field1103 == null) {
            return null;
        }
        class280 var1 = this.field939 != -1 && this.field975 == 0 ? class280.method3173(this.field939) : null;
        class280 var2 = this.field970 == -1 || this.field970 == this.field952 && var1 != null ? null : class280.method3173(this.field970);
        class127 var3 = this.field1103.method4988(var1, this.field973, var2, this.field981);
        if (var3 == null) {
            return null;
        }
        var3.method2683();
        this.field978 = var3.field1863;
        if (this.field977 != -1 && this.field965 != -1) {
            class127 var4 = class265.method2303(this.field977).method4644(this.field965);
            if (var4 != null) {
                var4.method2739(0, -this.field993, 0);
                class127[] var5 = new class127[] { var3, var4 };
                var3 = new class127(var5, 2);
            }
        }
        if (this.field1103.field3571 == 1) {
            var3.field1697 = true;
        }
        return var3;
    }

    @ObfuscatedName("cm.r(I)Z")
    public final boolean method1116() {
        return this.field1103 != null;
    }
}
