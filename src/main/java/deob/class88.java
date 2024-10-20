package deob;

@ObfuscatedName("cs")
public final class class88 extends class79 {

    @ObfuscatedName("cs.j")
    public class260 field1382;

    @ObfuscatedName("cs.j(IBI)V")
    public final void method1545(int arg0, byte arg1) {
        int var3 = this.field1228[0];
        int var4 = this.field1234[0];
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
        if (this.field1251 != -1 && class262.method1389(this.field1251).field3606 == 1) {
            this.field1251 = -1;
        }
        if (this.field1269 < 9) {
            this.field1269++;
        }
        for (int var5 = this.field1269; var5 > 0; var5--) {
            this.field1228[var5] = this.field1228[var5 - 1];
            this.field1234[var5] = this.field1234[var5 - 1];
            this.field1252[var5] = this.field1252[var5 - 1];
        }
        this.field1228[0] = var3;
        this.field1234[0] = var4;
        this.field1252[0] = arg1;
    }

    @ObfuscatedName("cs.h(IIZI)V")
    public final void method1544(int arg0, int arg1, boolean arg2) {
        if (this.field1251 != -1 && class262.method1389(this.field1251).field3606 == 1) {
            this.field1251 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1228[0];
            int var5 = arg1 - this.field1234[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1269 < 9) {
                    this.field1269++;
                }
                for (int var6 = this.field1269; var6 > 0; var6--) {
                    this.field1228[var6] = this.field1228[var6 - 1];
                    this.field1234[var6] = this.field1234[var6 - 1];
                    this.field1252[var6] = this.field1252[var6 - 1];
                }
                this.field1228[0] = arg0;
                this.field1234[0] = arg1;
                this.field1252[0] = 1;
                return;
            }
        }
        this.field1269 = 0;
        this.field1278 = 0;
        this.field1277 = 0;
        this.field1228[0] = arg0;
        this.field1234[0] = arg1;
        this.field1262 = this.field1228[0] * 128 + this.field1220 * 64;
        this.field1259 = this.field1234[0] * 128 + this.field1220 * 64;
    }

    @ObfuscatedName("cs.f(I)Leo;")
    public final class135 method1077() {
        if (this.field1382 == null) {
            return null;
        }
        class262 var1 = this.field1251 != -1 && this.field1254 == 0 ? class262.method1389(this.field1251) : null;
        class262 var2 = this.field1235 == -1 || this.field1235 == this.field1224 && var1 != null ? null : class262.method1389(this.field1235);
        class135 var3 = this.field1382.method4309(var1, this.field1243, var2, this.field1249);
        if (var3 == null) {
            return null;
        }
        var3.method2305();
        this.field1232 = var3.field2130;
        if (this.field1256 != -1 && this.field1257 != -1) {
            class135 var4 = class247.method473(this.field1256).method4012(this.field1257);
            if (var4 != null) {
                var4.method2315(0, -this.field1260, 0);
                class135[] var5 = new class135[] { var3, var4 };
                var3 = new class135(var5, 2);
            }
        }
        if (this.field1382.field3544 == 1) {
            var3.field1991 = true;
        }
        return var3;
    }

    @ObfuscatedName("cs.c(I)Z")
    public final boolean method1094() {
        return this.field1382 != null;
    }
}
