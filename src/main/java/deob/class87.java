package deob;

@ObfuscatedName("cb")
public final class class87 extends class79 {

    @ObfuscatedName("cb.e")
    public class259 field1380;

    @ObfuscatedName("cb.e(IBI)V")
    public final void method1541(int arg0, byte arg1) {
        int var3 = this.field1283[0];
        int var4 = this.field1284[0];
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
        if (this.field1260 != -1 && class261.method2746(this.field1260).field3599 == 1) {
            this.field1260 = -1;
        }
        if (this.field1245 < 9) {
            this.field1245++;
        }
        for (int var5 = this.field1245; var5 > 0; var5--) {
            this.field1283[var5] = this.field1283[var5 - 1];
            this.field1284[var5] = this.field1284[var5 - 1];
            this.field1285[var5] = this.field1285[var5 - 1];
        }
        this.field1283[0] = var3;
        this.field1284[0] = var4;
        this.field1285[0] = arg1;
    }

    @ObfuscatedName("cb.o(IIZI)V")
    public final void method1538(int arg0, int arg1, boolean arg2) {
        if (this.field1260 != -1 && class261.method2746(this.field1260).field3599 == 1) {
            this.field1260 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1283[0];
            int var5 = arg1 - this.field1284[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1245 < 9) {
                    this.field1245++;
                }
                for (int var6 = this.field1245; var6 > 0; var6--) {
                    this.field1283[var6] = this.field1283[var6 - 1];
                    this.field1284[var6] = this.field1284[var6 - 1];
                    this.field1285[var6] = this.field1285[var6 - 1];
                }
                this.field1283[0] = arg0;
                this.field1284[0] = arg1;
                this.field1285[0] = 1;
                return;
            }
        }
        this.field1245 = 0;
        this.field1287 = 0;
        this.field1286 = 0;
        this.field1283[0] = arg0;
        this.field1284[0] = arg1;
        this.field1243 = this.field1283[0] * 128 + this.field1232 * 64;
        this.field1229 = this.field1284[0] * 128 + this.field1232 * 64;
    }

    @ObfuscatedName("cb.m(B)Leo;")
    public final class134 method1018() {
        if (this.field1380 == null) {
            return null;
        }
        class261 var1 = this.field1260 != -1 && this.field1263 == 0 ? class261.method2746(this.field1260) : null;
        class261 var2 = this.field1237 == -1 || this.field1276 == this.field1237 && var1 != null ? null : class261.method2746(this.field1237);
        class134 var3 = this.field1380.method4301(var1, this.field1261, var2, this.field1269);
        if (var3 == null) {
            return null;
        }
        var3.method2281();
        this.field1282 = var3.field2121;
        if (this.field1265 != -1 && this.field1273 != -1) {
            class134 var4 = class246.method707(this.field1265).method3957(this.field1273);
            if (var4 != null) {
                var4.method2291(0, -this.field1275, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (this.field1380.field3544 == 1) {
            var3.field1945 = true;
        }
        return var3;
    }

    @ObfuscatedName("cb.k(B)Z")
    public final boolean method1031() {
        return this.field1380 != null;
    }
}
