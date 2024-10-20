package deob;

@ObfuscatedName("cu")
public final class class85 extends class76 {

    @ObfuscatedName("cu.d")
    public class286 field1292;

    @ObfuscatedName("cu.d(IBI)V")
    public final void method1732(int arg0, byte arg1) {
        int var3 = this.field1195[0];
        int var4 = this.field1196[0];
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
        if (this.field1172 != -1 && class288.method4510(this.field1172).field3768 == 1) {
            this.field1172 = -1;
        }
        if (this.field1193 < 9) {
            this.field1193++;
        }
        for (int var5 = this.field1193; var5 > 0; var5--) {
            this.field1195[var5] = this.field1195[var5 - 1];
            this.field1196[var5] = this.field1196[var5 - 1];
            this.field1160[var5] = this.field1160[var5 - 1];
        }
        this.field1195[0] = var3;
        this.field1196[0] = var4;
        this.field1160[0] = arg1;
    }

    @ObfuscatedName("cu.z(IIZB)V")
    public final void method1731(int arg0, int arg1, boolean arg2) {
        if (this.field1172 != -1 && class288.method4510(this.field1172).field3768 == 1) {
            this.field1172 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1195[0];
            int var5 = arg1 - this.field1196[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1193 < 9) {
                    this.field1193++;
                }
                for (int var6 = this.field1193; var6 > 0; var6--) {
                    this.field1195[var6] = this.field1195[var6 - 1];
                    this.field1196[var6] = this.field1196[var6 - 1];
                    this.field1160[var6] = this.field1160[var6 - 1];
                }
                this.field1195[0] = arg0;
                this.field1196[0] = arg1;
                this.field1160[0] = 1;
                return;
            }
        }
        this.field1193 = 0;
        this.field1199 = 0;
        this.field1198 = 0;
        this.field1195[0] = arg0;
        this.field1196[0] = arg1;
        this.field1186 = this.field1195[0] * 128 + this.field1194 * 64;
        this.field1151 = this.field1196[0] * 128 + this.field1194 * 64;
    }

    @ObfuscatedName("cu.x(I)Lel;")
    public final class132 method1067() {
        if (this.field1292 == null) {
            return null;
        }
        class288 var1 = this.field1172 != -1 && this.field1175 == 0 ? class288.method4510(this.field1172) : null;
        class288 var2 = this.field1169 == -1 || this.field1181 == this.field1169 && var1 != null ? null : class288.method4510(this.field1169);
        class132 var3 = this.field1292.method4819(var1, this.field1173, var2, this.field1170);
        if (var3 == null) {
            return null;
        }
        var3.method2592();
        this.field1190 = var3.field2027;
        if (this.field1177 != -1 && this.field1178 != -1) {
            class132 var4 = class273.method698(this.field1177).method4528(this.field1178);
            if (var4 != null) {
                var4.method2558(0, -this.field1158, 0);
                class132[] var5 = new class132[] { var3, var4 };
                var3 = new class132(var5, 2);
            }
        }
        if (this.field1292.field3710 == 1) {
            var3.field1860 = true;
        }
        return var3;
    }

    @ObfuscatedName("cu.u(I)Z")
    public final boolean method1048() {
        return this.field1292 != null;
    }
}
