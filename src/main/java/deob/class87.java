package deob;

@ObfuscatedName("cp")
public final class class87 extends class79 {

    @ObfuscatedName("cp.p")
    public class259 field1363;

    @ObfuscatedName("cp.p(IBB)V")
    public final void method1488(int arg0, byte arg1) {
        int var3 = this.field1264[0];
        int var4 = this.field1265[0];
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
        if (this.field1261 != -1 && class261.method790(this.field1261).field3620 == 1) {
            this.field1261 = -1;
        }
        if (this.field1211 < 9) {
            this.field1211++;
        }
        for (int var5 = this.field1211; var5 > 0; var5--) {
            this.field1264[var5] = this.field1264[var5 - 1];
            this.field1265[var5] = this.field1265[var5 - 1];
            this.field1266[var5] = this.field1266[var5 - 1];
        }
        this.field1264[0] = var3;
        this.field1265[0] = var4;
        this.field1266[0] = arg1;
    }

    @ObfuscatedName("cp.m(IIZI)V")
    public final void method1491(int arg0, int arg1, boolean arg2) {
        if (this.field1261 != -1 && class261.method790(this.field1261).field3620 == 1) {
            this.field1261 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1264[0];
            int var5 = arg1 - this.field1265[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1211 < 9) {
                    this.field1211++;
                }
                for (int var6 = this.field1211; var6 > 0; var6--) {
                    this.field1264[var6] = this.field1264[var6 - 1];
                    this.field1265[var6] = this.field1265[var6 - 1];
                    this.field1266[var6] = this.field1266[var6 - 1];
                }
                this.field1264[0] = arg0;
                this.field1265[0] = arg1;
                this.field1266[0] = 1;
                return;
            }
        }
        this.field1211 = 0;
        this.field1268 = 0;
        this.field1267 = 0;
        this.field1264[0] = arg0;
        this.field1265[0] = arg1;
        this.field1234 = this.field1264[0] * 128 + this.field1213 * 64;
        this.field1210 = this.field1265[0] * 128 + this.field1213 * 64;
    }

    @ObfuscatedName("cp.e(I)Les;")
    public final class134 method1001() {
        if (this.field1363 == null) {
            return null;
        }
        class261 var1 = this.field1261 != -1 && this.field1256 == 0 ? class261.method790(this.field1261) : null;
        class261 var2 = this.field1238 == -1 || this.field1244 == this.field1238 && var1 != null ? null : class261.method790(this.field1238);
        class134 var3 = this.field1363.method4207(var1, this.field1253, var2, this.field1239);
        if (var3 == null) {
            return null;
        }
        var3.method2224();
        this.field1259 = var3.field2129;
        if (this.field1246 != -1 && this.field1222 != -1) {
            class134 var4 = class246.method3873(this.field1246).method3910(this.field1222);
            if (var4 != null) {
                var4.method2235(0, -this.field1240, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (this.field1363.field3560 == 1) {
            var3.field1950 = true;
        }
        return var3;
    }

    @ObfuscatedName("cp.j(S)Z")
    public final boolean method1011() {
        return this.field1363 != null;
    }
}
