package deob;

@ObfuscatedName("co")
public final class class88 extends class79 {

    @ObfuscatedName("co.e")
    public class260 field1364;

    @ObfuscatedName("co.e(IBI)V")
    public final void method1584(int arg0, byte arg1) {
        int var3 = this.field1261[0];
        int var4 = this.field1262[0];
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
        if (this.field1238 != -1 && class262.method1025(this.field1238).field3609 == 1) {
            this.field1238 = -1;
        }
        if (this.field1260 < 9) {
            this.field1260++;
        }
        for (int var5 = this.field1260; var5 > 0; var5--) {
            this.field1261[var5] = this.field1261[var5 - 1];
            this.field1262[var5] = this.field1262[var5 - 1];
            this.field1263[var5] = this.field1263[var5 - 1];
        }
        this.field1261[0] = var3;
        this.field1262[0] = var4;
        this.field1263[0] = arg1;
    }

    @ObfuscatedName("co.n(IIZI)V")
    public final void method1585(int arg0, int arg1, boolean arg2) {
        if (this.field1238 != -1 && class262.method1025(this.field1238).field3609 == 1) {
            this.field1238 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1261[0];
            int var5 = arg1 - this.field1262[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1260 < 9) {
                    this.field1260++;
                }
                for (int var6 = this.field1260; var6 > 0; var6--) {
                    this.field1261[var6] = this.field1261[var6 - 1];
                    this.field1262[var6] = this.field1262[var6 - 1];
                    this.field1263[var6] = this.field1263[var6 - 1];
                }
                this.field1261[0] = arg0;
                this.field1262[0] = arg1;
                this.field1263[0] = 1;
                return;
            }
        }
        this.field1260 = 0;
        this.field1265 = 0;
        this.field1264 = 0;
        this.field1261[0] = arg0;
        this.field1262[0] = arg1;
        this.field1221 = this.field1261[0] * 128 + this.field1255 * 64;
        this.field1207 = this.field1262[0] * 128 + this.field1255 * 64;
    }

    @ObfuscatedName("co.g(I)Lew;")
    public final class135 method1081() {
        if (this.field1364 == null) {
            return null;
        }
        class262 var1 = this.field1238 != -1 && this.field1241 == 0 ? class262.method1025(this.field1238) : null;
        class262 var2 = this.field1235 == -1 || this.field1235 == this.field1211 && var1 != null ? null : class262.method1025(this.field1235);
        class135 var3 = this.field1364.method4344(var1, this.field1218, var2, this.field1236);
        if (var3 == null) {
            return null;
        }
        var3.method2320();
        this.field1256 = var3.field2113;
        if (this.field1234 != -1 && this.field1210 != -1) {
            class135 var4 = class247.method891(this.field1234).method4024(this.field1210);
            if (var4 != null) {
                var4.method2327(0, -this.field1266, 0);
                class135[] var5 = new class135[] { var3, var4 };
                var3 = new class135(var5, 2);
            }
        }
        if (this.field1364.field3548 == 1) {
            var3.field1939 = true;
        }
        return var3;
    }

    @ObfuscatedName("co.v(I)Z")
    public final boolean method1057() {
        return this.field1364 != null;
    }
}
