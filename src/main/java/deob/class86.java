package deob;

@ObfuscatedName("cw")
public final class class86 extends class78 {

    @ObfuscatedName("cw.i")
    public class260 field1382;

    @ObfuscatedName("cw.i(IBI)V")
    public final void method1555(int arg0, byte arg1) {
        int var3 = this.field1248[0];
        int var4 = this.field1242[0];
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
        if (this.field1257 != -1 && class262.method3737(this.field1257).field3609 == 1) {
            this.field1257 = -1;
        }
        if (this.field1284 < 9) {
            this.field1284++;
        }
        for (int var5 = this.field1284; var5 > 0; var5--) {
            this.field1248[var5] = this.field1248[var5 - 1];
            this.field1242[var5] = this.field1242[var5 - 1];
            this.field1287[var5] = this.field1287[var5 - 1];
        }
        this.field1248[0] = var3;
        this.field1242[0] = var4;
        this.field1287[0] = arg1;
    }

    @ObfuscatedName("cw.j(IIZB)V")
    public final void method1560(int arg0, int arg1, boolean arg2) {
        if (this.field1257 != -1 && class262.method3737(this.field1257).field3609 == 1) {
            this.field1257 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1248[0];
            int var5 = arg1 - this.field1242[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1284 < 9) {
                    this.field1284++;
                }
                for (int var6 = this.field1284; var6 > 0; var6--) {
                    this.field1248[var6] = this.field1248[var6 - 1];
                    this.field1242[var6] = this.field1242[var6 - 1];
                    this.field1287[var6] = this.field1287[var6 - 1];
                }
                this.field1248[0] = arg0;
                this.field1242[0] = arg1;
                this.field1287[0] = 1;
                return;
            }
        }
        this.field1284 = 0;
        this.field1250 = 0;
        this.field1288 = 0;
        this.field1248[0] = arg0;
        this.field1242[0] = arg1;
        this.field1233 = this.field1248[0] * 128 + this.field1234 * 64;
        this.field1232 = this.field1242[0] * 128 + this.field1234 * 64;
    }

    @ObfuscatedName("cw.a(I)Lem;")
    public final class133 method1038() {
        if (this.field1382 == null) {
            return null;
        }
        class262 var1 = this.field1257 != -1 && this.field1262 == 0 ? class262.method3737(this.field1257) : null;
        class262 var2 = this.field1259 == -1 || this.field1259 == this.field1235 && var1 != null ? null : class262.method3737(this.field1259);
        class133 var3 = this.field1382.method4293(var1, this.field1263, var2, this.field1260);
        if (var3 == null) {
            return null;
        }
        var3.method2310();
        this.field1280 = var3.field2129;
        if (this.field1267 != -1 && this.field1268 != -1) {
            class133 var4 = class247.method80(this.field1267).method4017(this.field1268);
            if (var4 != null) {
                var4.method2321(0, -this.field1271, 0);
                class133[] var5 = new class133[] { var3, var4 };
                var3 = new class133(var5, 2);
            }
        }
        if (this.field1382.field3575 == 1) {
            var3.field1958 = true;
        }
        return var3;
    }

    @ObfuscatedName("cw.q(I)Z")
    public final boolean method1050() {
        return this.field1382 != null;
    }
}
