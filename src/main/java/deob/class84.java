package deob;

@ObfuscatedName("cg")
public final class class84 extends class75 {

    @ObfuscatedName("cg.b")
    public class279 field1253;

    @ObfuscatedName("cg.b(IBI)V")
    public final void method1709(int arg0, byte arg1) {
        int var3 = this.field1150[0];
        int var4 = this.field1151[0];
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
        if (this.field1127 != -1 && class281.method2838(this.field1127).field3696 == 1) {
            this.field1127 = -1;
        }
        if (this.field1149 < 9) {
            this.field1149++;
        }
        for (int var5 = this.field1149; var5 > 0; var5--) {
            this.field1150[var5] = this.field1150[var5 - 1];
            this.field1151[var5] = this.field1151[var5 - 1];
            this.field1153[var5] = this.field1153[var5 - 1];
        }
        this.field1150[0] = var3;
        this.field1151[0] = var4;
        this.field1153[0] = arg1;
    }

    @ObfuscatedName("cg.q(IIZI)V")
    public final void method1710(int arg0, int arg1, boolean arg2) {
        if (this.field1127 != -1 && class281.method2838(this.field1127).field3696 == 1) {
            this.field1127 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1150[0];
            int var5 = arg1 - this.field1151[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1149 < 9) {
                    this.field1149++;
                }
                for (int var6 = this.field1149; var6 > 0; var6--) {
                    this.field1150[var6] = this.field1150[var6 - 1];
                    this.field1151[var6] = this.field1151[var6 - 1];
                    this.field1153[var6] = this.field1153[var6 - 1];
                }
                this.field1150[0] = arg0;
                this.field1151[0] = arg1;
                this.field1153[0] = 1;
                return;
            }
        }
        this.field1149 = 0;
        this.field1154 = 0;
        this.field1129 = 0;
        this.field1150[0] = arg0;
        this.field1151[0] = arg1;
        this.field1133 = this.field1150[0] * 128 + this.field1099 * 64;
        this.field1096 = this.field1151[0] * 128 + this.field1099 * 64;
    }

    @ObfuscatedName("cg.g(I)Lee;")
    public final class131 method1092() {
        if (this.field1253 == null) {
            return null;
        }
        class281 var1 = this.field1127 != -1 && this.field1130 == 0 ? class281.method2838(this.field1127) : null;
        class281 var2 = this.field1124 == -1 || this.field1124 == this.field1097 && var1 != null ? null : class281.method2838(this.field1124);
        class131 var3 = this.field1253.method4689(var1, this.field1128, var2, this.field1125);
        if (var3 == null) {
            return null;
        }
        var3.method2495();
        this.field1132 = var3.field1996;
        if (this.field1108 != -1 && this.field1105 != -1) {
            class131 var4 = class266.method3059(this.field1108).method4392(this.field1105);
            if (var4 != null) {
                var4.method2522(0, -this.field1136, 0);
                class131[] var5 = new class131[] { var3, var4 };
                var3 = new class131(var5, 2);
            }
        }
        if (this.field1253.field3662 == 1) {
            var3.field1828 = true;
        }
        return var3;
    }

    @ObfuscatedName("cg.f(B)Z")
    public final boolean method1096() {
        return this.field1253 != null;
    }
}
