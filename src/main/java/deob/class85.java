package deob;

@ObfuscatedName("cq")
public final class class85 extends class76 {

    @ObfuscatedName("cq.c")
    public class286 field1301;

    @ObfuscatedName("cq.c(IBI)V")
    public final void method1686(int arg0, byte arg1) {
        int var3 = this.field1189[0];
        int var4 = this.field1207[0];
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
        if (this.field1183 != -1 && class288.method3535(this.field1183).field3763 == 1) {
            this.field1183 = -1;
        }
        if (this.field1205 < 9) {
            this.field1205++;
        }
        for (int var5 = this.field1205; var5 > 0; var5--) {
            this.field1189[var5] = this.field1189[var5 - 1];
            this.field1207[var5] = this.field1207[var5 - 1];
            this.field1177[var5] = this.field1177[var5 - 1];
        }
        this.field1189[0] = var3;
        this.field1207[0] = var4;
        this.field1177[0] = arg1;
    }

    @ObfuscatedName("cq.i(IIZI)V")
    public final void method1687(int arg0, int arg1, boolean arg2) {
        if (this.field1183 != -1 && class288.method3535(this.field1183).field3763 == 1) {
            this.field1183 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1189[0];
            int var5 = arg1 - this.field1207[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1205 < 9) {
                    this.field1205++;
                }
                for (int var6 = this.field1205; var6 > 0; var6--) {
                    this.field1189[var6] = this.field1189[var6 - 1];
                    this.field1207[var6] = this.field1207[var6 - 1];
                    this.field1177[var6] = this.field1177[var6 - 1];
                }
                this.field1189[0] = arg0;
                this.field1207[0] = arg1;
                this.field1177[0] = 1;
                return;
            }
        }
        this.field1205 = 0;
        this.field1195 = 0;
        this.field1209 = 0;
        this.field1189[0] = arg0;
        this.field1207[0] = arg1;
        this.field1186 = this.field1189[0] * 128 + this.field1154 * 64;
        this.field1210 = this.field1207[0] * 128 + this.field1154 * 64;
    }

    @ObfuscatedName("cq.w(B)Led;")
    public final class132 method1043() {
        if (this.field1301 == null) {
            return null;
        }
        class288 var1 = this.field1183 != -1 && this.field1165 == 0 ? class288.method3535(this.field1183) : null;
        class288 var2 = this.field1174 == -1 || this.field1174 == this.field1156 && var1 != null ? null : class288.method3535(this.field1174);
        class132 var3 = this.field1301.method4749(var1, this.field1184, var2, this.field1181);
        if (var3 == null) {
            return null;
        }
        var3.method2475();
        this.field1201 = var3.field2043;
        if (this.field1188 != -1 && this.field1160 != -1) {
            class132 var4 = class273.method4166(this.field1188).method4422(this.field1160);
            if (var4 != null) {
                var4.method2486(0, -this.field1192, 0);
                class132[] var5 = new class132[] { var3, var4 };
                var3 = new class132(var5, 2);
            }
        }
        if (this.field1301.field3703 == 1) {
            var3.field1851 = true;
        }
        return var3;
    }

    @ObfuscatedName("cq.b(I)Z")
    public final boolean method1052() {
        return this.field1301 != null;
    }
}
