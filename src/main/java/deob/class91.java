package deob;

@ObfuscatedName("cp")
public final class class91 extends class85 {

    @ObfuscatedName("cp.i")
    public class161 field1210;

    @ObfuscatedName("cp.i(IBI)V")
    public final void method2135(int arg0, byte arg1) {
        int var3 = this.field1091[0];
        int var4 = this.field1144[0];
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
        if (this.field1118 != -1 && class172.method589(this.field1118).field1957 == 1) {
            this.field1118 = -1;
        }
        if (this.field1122 < 9) {
            this.field1122++;
        }
        for (int var5 = this.field1122; var5 > 0; var5--) {
            this.field1091[var5] = this.field1091[var5 - 1];
            this.field1144[var5] = this.field1144[var5 - 1];
            this.field1143[var5] = this.field1143[var5 - 1];
        }
        this.field1091[0] = var3;
        this.field1144[0] = var4;
        this.field1143[0] = arg1;
    }

    @ObfuscatedName("cp.s(IIZB)V")
    public final void method2132(int arg0, int arg1, boolean arg2) {
        if (this.field1118 != -1 && class172.method589(this.field1118).field1957 == 1) {
            this.field1118 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1091[0];
            int var5 = arg1 - this.field1144[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1122 < 9) {
                    this.field1122++;
                }
                for (int var6 = this.field1122; var6 > 0; var6--) {
                    this.field1091[var6] = this.field1091[var6 - 1];
                    this.field1144[var6] = this.field1144[var6 - 1];
                    this.field1143[var6] = this.field1143[var6 - 1];
                }
                this.field1091[0] = arg0;
                this.field1144[0] = arg1;
                this.field1143[0] = 1;
                return;
            }
        }
        this.field1122 = 0;
        this.field1145 = 0;
        this.field1086 = 0;
        this.field1091[0] = arg0;
        this.field1144[0] = arg1;
        this.field1092 = this.field1091[0] * 128 + this.field1088 * 64;
        this.field1085 = this.field1144[0] * 128 + this.field1088 * 64;
    }

    @ObfuscatedName("cp.w(I)Lhl;")
    public final class220 method1799() {
        if (this.field1210 == null) {
            return null;
        }
        class172 var1 = this.field1118 != -1 && this.field1121 == 0 ? class172.method589(this.field1118) : null;
        class172 var2 = this.field1115 == -1 || this.field1115 == this.field1090 && var1 != null ? null : class172.method589(this.field1115);
        class220 var3 = this.field1210.method2806(var1, this.field1119, var2, this.field1116);
        if (var3 == null) {
            return null;
        }
        var3.method4095();
        this.field1136 = var3.field2444;
        if (this.field1123 != -1 && this.field1142 != -1) {
            class220 var4 = class163.method6452(this.field1123).method2844(this.field1142);
            if (var4 != null) {
                var4.method4070(0, -this.field1127, 0);
                class220[] var5 = new class220[] { var3, var4 };
                var3 = new class220(var5, 2);
            }
        }
        if (this.field1210.field1707 == 1) {
            var3.field2570 = true;
        }
        return var3;
    }

    @ObfuscatedName("cp.d(I)Z")
    public final boolean method2005() {
        return this.field1210 != null;
    }
}
