package deob;

@ObfuscatedName("co")
public final class class87 extends class79 {

    @ObfuscatedName("co.i")
    public class259 field1396;

    @ObfuscatedName("co.i(IBI)V")
    public final void method1550(int arg0, byte arg1) {
        int var3 = this.field1298[0];
        int var4 = this.field1299[0];
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
        if (this.field1247 != -1 && class261.method3748(this.field1247).field3599 == 1) {
            this.field1247 = -1;
        }
        if (this.field1264 < 9) {
            this.field1264++;
        }
        for (int var5 = this.field1264; var5 > 0; var5--) {
            this.field1298[var5] = this.field1298[var5 - 1];
            this.field1299[var5] = this.field1299[var5 - 1];
            this.field1258[var5] = this.field1258[var5 - 1];
        }
        this.field1298[0] = var3;
        this.field1299[0] = var4;
        this.field1258[0] = arg1;
    }

    @ObfuscatedName("co.c(IIZB)V")
    public final void method1551(int arg0, int arg1, boolean arg2) {
        if (this.field1247 != -1 && class261.method3748(this.field1247).field3599 == 1) {
            this.field1247 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1298[0];
            int var5 = arg1 - this.field1299[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1264 < 9) {
                    this.field1264++;
                }
                for (int var6 = this.field1264; var6 > 0; var6--) {
                    this.field1298[var6] = this.field1298[var6 - 1];
                    this.field1299[var6] = this.field1299[var6 - 1];
                    this.field1258[var6] = this.field1258[var6 - 1];
                }
                this.field1298[0] = arg0;
                this.field1299[0] = arg1;
                this.field1258[0] = 1;
                return;
            }
        }
        this.field1264 = 0;
        this.field1302 = 0;
        this.field1301 = 0;
        this.field1298[0] = arg0;
        this.field1299[0] = arg1;
        this.field1275 = this.field1298[0] * 128 + this.field1269 * 64;
        this.field1244 = this.field1299[0] * 128 + this.field1269 * 64;
    }

    @ObfuscatedName("co.e(I)Led;")
    public final class134 method1026() {
        if (this.field1396 == null) {
            return null;
        }
        class261 var1 = this.field1247 != -1 && this.field1278 == 0 ? class261.method3748(this.field1247) : null;
        class261 var2 = this.field1272 == -1 || this.field1284 == this.field1272 && var1 != null ? null : class261.method3748(this.field1272);
        class134 var3 = this.field1396.method4293(var1, this.field1276, var2, this.field1273);
        if (var3 == null) {
            return null;
        }
        var3.method2277();
        this.field1293 = var3.field2141;
        if (this.field1280 != -1 && this.field1281 != -1) {
            class134 var4 = class246.method1412(this.field1280).method3990(this.field1281);
            if (var4 != null) {
                var4.method2294(0, -this.field1303, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (this.field1396.field3578 == 1) {
            var3.field1988 = true;
        }
        return var3;
    }

    @ObfuscatedName("co.h(I)Z")
    public final boolean method1006() {
        return this.field1396 != null;
    }
}
