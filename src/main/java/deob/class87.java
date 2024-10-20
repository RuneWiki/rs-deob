package deob;

@ObfuscatedName("ca")
public final class class87 extends class79 {

    @ObfuscatedName("ca.i")
    public class259 field1400;

    @ObfuscatedName("ca.i(IBI)V")
    public final void method1558(int arg0, byte arg1) {
        int var3 = this.field1294[0];
        int var4 = this.field1296[0];
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
        if (this.field1259 != -1 && class261.method3746(this.field1259).field3624 == 1) {
            this.field1259 = -1;
        }
        if (this.field1293 < 9) {
            this.field1293++;
        }
        for (int var5 = this.field1293; var5 > 0; var5--) {
            this.field1294[var5] = this.field1294[var5 - 1];
            this.field1296[var5] = this.field1296[var5 - 1];
            this.field1298[var5] = this.field1298[var5 - 1];
        }
        this.field1294[0] = var3;
        this.field1296[0] = var4;
        this.field1298[0] = arg1;
    }

    @ObfuscatedName("ca.w(IIZI)V")
    public final void method1556(int arg0, int arg1, boolean arg2) {
        if (this.field1259 != -1 && class261.method3746(this.field1259).field3624 == 1) {
            this.field1259 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1294[0];
            int var5 = arg1 - this.field1296[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1293 < 9) {
                    this.field1293++;
                }
                for (int var6 = this.field1293; var6 > 0; var6--) {
                    this.field1294[var6] = this.field1294[var6 - 1];
                    this.field1296[var6] = this.field1296[var6 - 1];
                    this.field1298[var6] = this.field1298[var6 - 1];
                }
                this.field1294[0] = arg0;
                this.field1296[0] = arg1;
                this.field1298[0] = 1;
                return;
            }
        }
        this.field1293 = 0;
        this.field1270 = 0;
        this.field1276 = 0;
        this.field1294[0] = arg0;
        this.field1296[0] = arg1;
        this.field1273 = this.field1294[0] * 128 + this.field1243 * 64;
        this.field1240 = this.field1296[0] * 128 + this.field1243 * 64;
    }

    @ObfuscatedName("ca.a(I)Let;")
    public final class134 method1044() {
        if (this.field1400 == null) {
            return null;
        }
        class261 var1 = this.field1259 != -1 && this.field1282 == 0 ? class261.method3746(this.field1259) : null;
        class261 var2 = this.field1269 == -1 || this.field1269 == this.field1244 && var1 != null ? null : class261.method3746(this.field1269);
        class134 var3 = this.field1400.method4287(var1, this.field1272, var2, this.field1280);
        if (var3 == null) {
            return null;
        }
        var3.method2269();
        this.field1289 = var3.field2136;
        if (this.field1249 != -1 && this.field1245 != -1) {
            class134 var4 = class246.method2634(this.field1249).method3979(this.field1245);
            if (var4 != null) {
                var4.method2280(0, -this.field1239, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (this.field1400.field3562 == 1) {
            var3.field1951 = true;
        }
        return var3;
    }

    @ObfuscatedName("ca.v(I)Z")
    public final boolean method1046() {
        return this.field1400 != null;
    }
}
