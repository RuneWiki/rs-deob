package deob;

@ObfuscatedName("cz")
public final class class87 extends class79 {

    @ObfuscatedName("cz.s")
    public class262 field1374;

    @ObfuscatedName("cz.s(IBB)V")
    public final void method1572(int arg0, byte arg1) {
        int var3 = this.field1279[0];
        int var4 = this.field1280[0];
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
        if (this.field1256 != -1 && class264.method341(this.field1256).field3629 == 1) {
            this.field1256 = -1;
        }
        if (this.field1278 < 9) {
            this.field1278++;
        }
        for (int var5 = this.field1278; var5 > 0; var5--) {
            this.field1279[var5] = this.field1279[var5 - 1];
            this.field1280[var5] = this.field1280[var5 - 1];
            this.field1235[var5] = this.field1235[var5 - 1];
        }
        this.field1279[0] = var3;
        this.field1280[0] = var4;
        this.field1235[0] = arg1;
    }

    @ObfuscatedName("cz.c(IIZI)V")
    public final void method1574(int arg0, int arg1, boolean arg2) {
        if (this.field1256 != -1 && class264.method341(this.field1256).field3629 == 1) {
            this.field1256 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1279[0];
            int var5 = arg1 - this.field1280[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1278 < 9) {
                    this.field1278++;
                }
                for (int var6 = this.field1278; var6 > 0; var6--) {
                    this.field1279[var6] = this.field1279[var6 - 1];
                    this.field1280[var6] = this.field1280[var6 - 1];
                    this.field1235[var6] = this.field1235[var6 - 1];
                }
                this.field1279[0] = arg0;
                this.field1280[0] = arg1;
                this.field1235[0] = 1;
                return;
            }
        }
        this.field1278 = 0;
        this.field1283 = 0;
        this.field1228 = 0;
        this.field1279[0] = arg0;
        this.field1280[0] = arg1;
        this.field1282 = this.field1279[0] * 128 + this.field1271 * 64;
        this.field1225 = this.field1280[0] * 128 + this.field1271 * 64;
    }

    @ObfuscatedName("cz.f(B)Leb;")
    public final class134 method1016() {
        if (this.field1374 == null) {
            return null;
        }
        class264 var1 = this.field1256 != -1 && this.field1266 == 0 ? class264.method341(this.field1256) : null;
        class264 var2 = this.field1253 == -1 || this.field1253 == this.field1229 && var1 != null ? null : class264.method341(this.field1253);
        class134 var3 = this.field1374.method4373(var1, this.field1241, var2, this.field1252);
        if (var3 == null) {
            return null;
        }
        var3.method2346();
        this.field1274 = var3.field2117;
        if (this.field1254 != -1 && this.field1262 != -1) {
            class134 var4 = class249.method3835(this.field1254).method4051(this.field1262);
            if (var4 != null) {
                var4.method2357(0, -this.field1265, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (this.field1374.field3581 == 1) {
            var3.field1950 = true;
        }
        return var3;
    }

    @ObfuscatedName("cz.p(B)Z")
    public final boolean method1014() {
        return this.field1374 != null;
    }
}
