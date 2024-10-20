package deob;

@ObfuscatedName("cl")
public final class class87 extends class79 {

    @ObfuscatedName("cl.i")
    public class259 field1354;

    @ObfuscatedName("cl.i(IBI)V")
    public final void method1584(int arg0, byte arg1) {
        int var3 = this.field1254[0];
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
        if (this.field1241 != -1 && class261.method2856(this.field1241).field3611 == 1) {
            this.field1241 = -1;
        }
        if (this.field1253 < 9) {
            this.field1253++;
        }
        for (int var5 = this.field1253; var5 > 0; var5--) {
            this.field1254[var5] = this.field1254[var5 - 1];
            this.field1255[var5] = this.field1255[var5 - 1];
            this.field1256[var5] = this.field1256[var5 - 1];
        }
        this.field1254[0] = var3;
        this.field1255[0] = var4;
        this.field1256[0] = arg1;
    }

    @ObfuscatedName("cl.h(IIZI)V")
    public final void method1585(int arg0, int arg1, boolean arg2) {
        if (this.field1241 != -1 && class261.method2856(this.field1241).field3611 == 1) {
            this.field1241 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1254[0];
            int var5 = arg1 - this.field1255[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1253 < 9) {
                    this.field1253++;
                }
                for (int var6 = this.field1253; var6 > 0; var6--) {
                    this.field1254[var6] = this.field1254[var6 - 1];
                    this.field1255[var6] = this.field1255[var6 - 1];
                    this.field1256[var6] = this.field1256[var6 - 1];
                }
                this.field1254[0] = arg0;
                this.field1255[0] = arg1;
                this.field1256[0] = 1;
                return;
            }
        }
        this.field1253 = 0;
        this.field1237 = 0;
        this.field1258 = 0;
        this.field1254[0] = arg0;
        this.field1255[0] = arg1;
        this.field1247 = this.field1254[0] * 128 + this.field1203 * 64;
        this.field1200 = this.field1255[0] * 128 + this.field1203 * 64;
    }

    @ObfuscatedName("cl.u(I)Lew;")
    public final class134 method1053() {
        if (this.field1354 == null) {
            return null;
        }
        class261 var1 = this.field1241 != -1 && this.field1233 == 0 ? class261.method2856(this.field1241) : null;
        class261 var2 = this.field1222 == -1 || this.field1222 == this.field1204 && var1 != null ? null : class261.method2856(this.field1222);
        class134 var3 = this.field1354.method4343(var1, this.field1232, var2, this.field1242);
        if (var3 == null) {
            return null;
        }
        var3.method2359();
        this.field1249 = var3.field2104;
        if (this.field1236 != -1 && this.field1229 != -1) {
            class134 var4 = class246.method3468(this.field1236).method4051(this.field1229);
            if (var4 != null) {
                var4.method2349(0, -this.field1240, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (this.field1354.field3549 == 1) {
            var3.field1909 = true;
        }
        return var3;
    }

    @ObfuscatedName("cl.t(I)Z")
    public final boolean method1057() {
        return this.field1354 != null;
    }
}
