package deob;

@ObfuscatedName("cp")
public final class class87 extends class79 {

    @ObfuscatedName("cp.n")
    public class259 field1379;

    @ObfuscatedName("cp.n(IBI)V")
    public final void method1553(int arg0, byte arg1) {
        int var3 = this.field1282[0];
        int var4 = this.field1283[0];
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
        if (this.field1228 != -1 && class261.method2887(this.field1228).field3625 == 1) {
            this.field1228 = -1;
        }
        if (this.field1281 < 9) {
            this.field1281++;
        }
        for (int var5 = this.field1281; var5 > 0; var5--) {
            this.field1282[var5] = this.field1282[var5 - 1];
            this.field1283[var5] = this.field1283[var5 - 1];
            this.field1284[var5] = this.field1284[var5 - 1];
        }
        this.field1282[0] = var3;
        this.field1283[0] = var4;
        this.field1284[0] = arg1;
    }

    @ObfuscatedName("cp.p(IIZI)V")
    public final void method1554(int arg0, int arg1, boolean arg2) {
        if (this.field1228 != -1 && class261.method2887(this.field1228).field3625 == 1) {
            this.field1228 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1282[0];
            int var5 = arg1 - this.field1283[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1281 < 9) {
                    this.field1281++;
                }
                for (int var6 = this.field1281; var6 > 0; var6--) {
                    this.field1282[var6] = this.field1282[var6 - 1];
                    this.field1283[var6] = this.field1283[var6 - 1];
                    this.field1284[var6] = this.field1284[var6 - 1];
                }
                this.field1282[0] = arg0;
                this.field1283[0] = arg1;
                this.field1284[0] = 1;
                return;
            }
        }
        this.field1281 = 0;
        this.field1286 = 0;
        this.field1259 = 0;
        this.field1282[0] = arg0;
        this.field1283[0] = arg1;
        this.field1234 = this.field1282[0] * 128 + this.field1231 * 64;
        this.field1276 = this.field1283[0] * 128 + this.field1231 * 64;
    }

    @ObfuscatedName("cp.i(S)Lek;")
    public final class134 method1012() {
        if (this.field1379 == null) {
            return null;
        }
        class261 var1 = this.field1228 != -1 && this.field1278 == 0 ? class261.method2887(this.field1228) : null;
        class261 var2 = this.field1256 == -1 || this.field1256 == this.field1232 && var1 != null ? null : class261.method2887(this.field1256);
        class134 var3 = this.field1379.method4352(var1, this.field1260, var2, this.field1240);
        if (var3 == null) {
            return null;
        }
        var3.method2324();
        this.field1277 = var3.field2130;
        if (this.field1246 != -1 && this.field1265 != -1) {
            class134 var4 = class246.method1711(this.field1246).method4048(this.field1265);
            if (var4 != null) {
                var4.method2328(0, -this.field1280, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (this.field1379.field3578 == 1) {
            var3.field1958 = true;
        }
        return var3;
    }

    @ObfuscatedName("cp.c(B)Z")
    public final boolean method1015() {
        return this.field1379 != null;
    }
}
