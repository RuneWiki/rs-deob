package deob;

@ObfuscatedName("ch")
public final class class87 extends class79 {

    @ObfuscatedName("ch.a")
    public class259 field1368;

    @ObfuscatedName("ch.a(IBI)V")
    public final void method1517(int arg0, byte arg1) {
        int var3 = this.field1270[0];
        int var4 = this.field1255[0];
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
        if (this.field1247 != -1 && class261.method1884(this.field1247).field3621 == 1) {
            this.field1247 = -1;
        }
        if (this.field1269 < 9) {
            this.field1269++;
        }
        for (int var5 = this.field1269; var5 > 0; var5--) {
            this.field1270[var5] = this.field1270[var5 - 1];
            this.field1255[var5] = this.field1255[var5 - 1];
            this.field1240[var5] = this.field1240[var5 - 1];
        }
        this.field1270[0] = var3;
        this.field1255[0] = var4;
        this.field1240[0] = arg1;
    }

    @ObfuscatedName("ch.j(IIZI)V")
    public final void method1520(int arg0, int arg1, boolean arg2) {
        if (this.field1247 != -1 && class261.method1884(this.field1247).field3621 == 1) {
            this.field1247 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1270[0];
            int var5 = arg1 - this.field1255[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1269 < 9) {
                    this.field1269++;
                }
                for (int var6 = this.field1269; var6 > 0; var6--) {
                    this.field1270[var6] = this.field1270[var6 - 1];
                    this.field1255[var6] = this.field1255[var6 - 1];
                    this.field1240[var6] = this.field1240[var6 - 1];
                }
                this.field1270[0] = arg0;
                this.field1255[0] = arg1;
                this.field1240[0] = 1;
                return;
            }
        }
        this.field1269 = 0;
        this.field1274 = 0;
        this.field1273 = 0;
        this.field1270[0] = arg0;
        this.field1255[0] = arg1;
        this.field1233 = this.field1270[0] * 128 + this.field1219 * 64;
        this.field1265 = this.field1255[0] * 128 + this.field1219 * 64;
    }

    @ObfuscatedName("ch.n(B)Lej;")
    public final class134 method1018() {
        if (this.field1368 == null) {
            return null;
        }
        class261 var1 = this.field1247 != -1 && this.field1227 == 0 ? class261.method1884(this.field1247) : null;
        class261 var2 = this.field1244 == -1 || this.field1271 == this.field1244 && var1 != null ? null : class261.method1884(this.field1244);
        class134 var3 = this.field1368.method4239(var1, this.field1248, var2, this.field1253);
        if (var3 == null) {
            return null;
        }
        var3.method2319();
        this.field1236 = var3.field2119;
        if (this.field1215 != -1 && this.field1251 != -1) {
            class134 var4 = class246.method3901(this.field1215).method3954(this.field1251);
            if (var4 != null) {
                var4.method2352(0, -this.field1256, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (this.field1368.field3558 == 1) {
            var3.field1976 = true;
        }
        return var3;
    }

    @ObfuscatedName("ch.l(B)Z")
    public final boolean method1001() {
        return this.field1368 != null;
    }
}
