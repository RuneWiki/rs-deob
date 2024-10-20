package deob;

@ObfuscatedName("cj")
public final class class86 extends class78 {

    @ObfuscatedName("cj.d")
    public class266 field1296;

    @ObfuscatedName("cj.d(IBI)V")
    public final void method1610(int arg0, byte arg1) {
        int var3 = this.field1187[0];
        int var4 = this.field1203[0];
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
        if (this.field1192 != -1 && class268.method76(this.field1192).field3681 == 1) {
            this.field1192 = -1;
        }
        if (this.field1184 < 9) {
            this.field1184++;
        }
        for (int var5 = this.field1184; var5 > 0; var5--) {
            this.field1187[var5] = this.field1187[var5 - 1];
            this.field1203[var5] = this.field1203[var5 - 1];
            this.field1204[var5] = this.field1204[var5 - 1];
        }
        this.field1187[0] = var3;
        this.field1203[0] = var4;
        this.field1204[0] = arg1;
    }

    @ObfuscatedName("cj.x(IIZI)V")
    public final void method1608(int arg0, int arg1, boolean arg2) {
        if (this.field1192 != -1 && class268.method76(this.field1192).field3681 == 1) {
            this.field1192 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1187[0];
            int var5 = arg1 - this.field1203[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1184 < 9) {
                    this.field1184++;
                }
                for (int var6 = this.field1184; var6 > 0; var6--) {
                    this.field1187[var6] = this.field1187[var6 - 1];
                    this.field1203[var6] = this.field1203[var6 - 1];
                    this.field1204[var6] = this.field1204[var6 - 1];
                }
                this.field1187[0] = arg0;
                this.field1203[0] = arg1;
                this.field1204[0] = 1;
                return;
            }
        }
        this.field1184 = 0;
        this.field1160 = 0;
        this.field1205 = 0;
        this.field1187[0] = arg0;
        this.field1203[0] = arg1;
        this.field1149 = this.field1187[0] * 128 + this.field1148 * 64;
        this.field1198 = this.field1203[0] * 128 + this.field1148 * 64;
    }

    @ObfuscatedName("cj.k(I)Leh;")
    public final class133 method1060() {
        if (this.field1296 == null) {
            return null;
        }
        class268 var1 = this.field1192 != -1 && this.field1150 == 0 ? class268.method76(this.field1192) : null;
        class268 var2 = this.field1176 == -1 || this.field1176 == this.field1152 && var1 != null ? null : class268.method76(this.field1176);
        class133 var3 = this.field1296.method4480(var1, this.field1206, var2, this.field1190);
        if (var3 == null) {
            return null;
        }
        var3.method2407();
        this.field1180 = var3.field2024;
        if (this.field1201 != -1 && this.field1185 != -1) {
            class133 var4 = class253.method3903(this.field1201).method4151(this.field1185);
            if (var4 != null) {
                var4.method2419(0, -this.field1188, 0);
                class133[] var5 = new class133[] { var3, var4 };
                var3 = new class133(var5, 2);
            }
        }
        if (this.field1296.field3620 == 1) {
            var3.field1856 = true;
        }
        return var3;
    }

    @ObfuscatedName("cj.b(B)Z")
    public final boolean method1065() {
        return this.field1296 != null;
    }
}
