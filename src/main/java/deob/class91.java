package deob;

@ObfuscatedName("cr")
public final class class91 extends class85 {

    @ObfuscatedName("cr.n")
    public class161 field1214;

    @ObfuscatedName("cr.n(IBI)V")
    public final void method2101(int arg0, byte arg1) {
        int var3 = this.field1126[0];
        int var4 = this.field1150[0];
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
        if (this.field1130 != -1 && class172.method269(this.field1130).field1961 == 1) {
            this.field1130 = -1;
        }
        if (this.field1148 < 9) {
            this.field1148++;
        }
        for (int var5 = this.field1148; var5 > 0; var5--) {
            this.field1126[var5] = this.field1126[var5 - 1];
            this.field1150[var5] = this.field1150[var5 - 1];
            this.field1151[var5] = this.field1151[var5 - 1];
        }
        this.field1126[0] = var3;
        this.field1150[0] = var4;
        this.field1151[0] = arg1;
    }

    @ObfuscatedName("cr.m(IIZI)V")
    public final void method2106(int arg0, int arg1, boolean arg2) {
        if (this.field1130 != -1 && class172.method269(this.field1130).field1961 == 1) {
            this.field1130 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1126[0];
            int var5 = arg1 - this.field1150[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1148 < 9) {
                    this.field1148++;
                }
                for (int var6 = this.field1148; var6 > 0; var6--) {
                    this.field1126[var6] = this.field1126[var6 - 1];
                    this.field1150[var6] = this.field1150[var6 - 1];
                    this.field1151[var6] = this.field1151[var6 - 1];
                }
                this.field1126[0] = arg0;
                this.field1150[0] = arg1;
                this.field1151[0] = 1;
                return;
            }
        }
        this.field1148 = 0;
        this.field1153 = 0;
        this.field1152 = 0;
        this.field1126[0] = arg0;
        this.field1150[0] = arg1;
        this.field1119 = this.field1126[0] * 128 + this.field1138 * 64;
        this.field1096 = this.field1150[0] * 128 + this.field1138 * 64;
    }

    @ObfuscatedName("cr.c(B)Lhg;")
    public final class220 method1766() {
        if (this.field1214 == null) {
            return null;
        }
        class172 var1 = this.field1130 != -1 && this.field1129 == 0 ? class172.method269(this.field1130) : null;
        class172 var2 = this.field1143 == -1 || this.field1143 == this.field1099 && var1 != null ? null : class172.method269(this.field1143);
        class220 var3 = this.field1214.method2717(var1, this.field1127, var2, this.field1124);
        if (var3 == null) {
            return null;
        }
        var3.method4018();
        this.field1113 = var3.field2429;
        if (this.field1131 != -1 && this.field1132 != -1) {
            class220 var4 = class163.method2520(this.field1131).method2749(this.field1132);
            if (var4 != null) {
                var4.method4029(0, -this.field1135, 0);
                class220[] var5 = new class220[] { var3, var4 };
                var3 = new class220(var5, 2);
            }
        }
        if (this.field1214.field1711 == 1) {
            var3.field2520 = true;
        }
        return var3;
    }

    @ObfuscatedName("cr.q(I)Z")
    public final boolean method1993() {
        return this.field1214 != null;
    }
}
