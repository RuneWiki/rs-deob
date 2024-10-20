package deob;

@ObfuscatedName("cf")
public final class class87 extends class79 {

    @ObfuscatedName("cf.d")
    public class259 field1343;

    @ObfuscatedName("cf.d(IBB)V")
    public final void method1549(int arg0, byte arg1) {
        int var3 = this.field1245[0];
        int var4 = this.field1246[0];
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
        if (this.field1222 != -1 && class261.method494(this.field1222).field3598 == 1) {
            this.field1222 = -1;
        }
        if (this.field1235 < 9) {
            this.field1235++;
        }
        for (int var5 = this.field1235; var5 > 0; var5--) {
            this.field1245[var5] = this.field1245[var5 - 1];
            this.field1246[var5] = this.field1246[var5 - 1];
            this.field1247[var5] = this.field1247[var5 - 1];
        }
        this.field1245[0] = var3;
        this.field1246[0] = var4;
        this.field1247[0] = arg1;
    }

    @ObfuscatedName("cf.q(IIZB)V")
    public final void method1550(int arg0, int arg1, boolean arg2) {
        if (this.field1222 != -1 && class261.method494(this.field1222).field3598 == 1) {
            this.field1222 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1245[0];
            int var5 = arg1 - this.field1246[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1235 < 9) {
                    this.field1235++;
                }
                for (int var6 = this.field1235; var6 > 0; var6--) {
                    this.field1245[var6] = this.field1245[var6 - 1];
                    this.field1246[var6] = this.field1246[var6 - 1];
                    this.field1247[var6] = this.field1247[var6 - 1];
                }
                this.field1245[0] = arg0;
                this.field1246[0] = arg1;
                this.field1247[0] = 1;
                return;
            }
        }
        this.field1235 = 0;
        this.field1249 = 0;
        this.field1248 = 0;
        this.field1245[0] = arg0;
        this.field1246[0] = arg1;
        this.field1232 = this.field1245[0] * 128 + this.field1217 * 64;
        this.field1191 = this.field1246[0] * 128 + this.field1217 * 64;
    }

    @ObfuscatedName("cf.x(I)Lev;")
    public final class134 method1046() {
        if (this.field1343 == null) {
            return null;
        }
        class261 var1 = this.field1222 != -1 && this.field1225 == 0 ? class261.method494(this.field1222) : null;
        class261 var2 = this.field1211 == -1 || this.field1211 == this.field1195 && var1 != null ? null : class261.method494(this.field1211);
        class134 var3 = this.field1343.method4248(var1, this.field1237, var2, this.field1223);
        if (var3 == null) {
            return null;
        }
        var3.method2270();
        this.field1240 = var3.field2088;
        if (this.field1227 != -1 && this.field1228 != -1) {
            class134 var4 = class246.method465(this.field1227).method3935(this.field1228);
            if (var4 != null) {
                var4.method2281(0, -this.field1231, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (this.field1343.field3536 == 1) {
            var3.field1903 = true;
        }
        return var3;
    }

    @ObfuscatedName("cf.v(B)Z")
    public final boolean method1037() {
        return this.field1343 != null;
    }
}
