package deob;

@ObfuscatedName("ci")
public final class class86 extends class78 {

    @ObfuscatedName("ci.a")
    public class270 field1273;

    @ObfuscatedName("ci.a(IBB)V")
    public final void method1505(int arg0, byte arg1) {
        int var3 = this.field1178[0];
        int var4 = this.field1179[0];
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
        if (this.field1155 != -1 && class272.method3881(this.field1155).field3686 == 1) {
            this.field1155 = -1;
        }
        if (this.field1136 < 9) {
            this.field1136++;
        }
        for (int var5 = this.field1136; var5 > 0; var5--) {
            this.field1178[var5] = this.field1178[var5 - 1];
            this.field1179[var5] = this.field1179[var5 - 1];
            this.field1168[var5] = this.field1168[var5 - 1];
        }
        this.field1178[0] = var3;
        this.field1179[0] = var4;
        this.field1168[0] = arg1;
    }

    @ObfuscatedName("ci.w(IIZI)V")
    public final void method1506(int arg0, int arg1, boolean arg2) {
        if (this.field1155 != -1 && class272.method3881(this.field1155).field3686 == 1) {
            this.field1155 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1178[0];
            int var5 = arg1 - this.field1179[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1136 < 9) {
                    this.field1136++;
                }
                for (int var6 = this.field1136; var6 > 0; var6--) {
                    this.field1178[var6] = this.field1178[var6 - 1];
                    this.field1179[var6] = this.field1179[var6 - 1];
                    this.field1168[var6] = this.field1168[var6 - 1];
                }
                this.field1178[0] = arg0;
                this.field1179[0] = arg1;
                this.field1168[0] = 1;
                return;
            }
        }
        this.field1136 = 0;
        this.field1156 = 0;
        this.field1181 = 0;
        this.field1178[0] = arg0;
        this.field1179[0] = arg1;
        this.field1182 = this.field1178[0] * 128 + this.field1127 * 64;
        this.field1143 = this.field1179[0] * 128 + this.field1127 * 64;
    }

    @ObfuscatedName("ci.e(I)Lef;")
    public final class133 method981() {
        if (this.field1273 == null) {
            return null;
        }
        class272 var1 = this.field1155 != -1 && this.field1146 == 0 ? class272.method3881(this.field1155) : null;
        class272 var2 = this.field1152 == -1 || this.field1152 == this.field1128 && var1 != null ? null : class272.method3881(this.field1152);
        class133 var3 = this.field1273.method4397(var1, this.field1169, var2, this.field1153);
        if (var3 == null) {
            return null;
        }
        var3.method2302();
        this.field1137 = var3.field2010;
        if (this.field1160 != -1 && this.field1161 != -1) {
            class133 var4 = class257.method4035(this.field1160).method4109(this.field1161);
            if (var4 != null) {
                var4.method2321(0, -this.field1164, 0);
                class133[] var5 = new class133[] { var3, var4 };
                var3 = new class133(var5, 2);
            }
        }
        if (this.field1273.field3621 == 1) {
            var3.field1852 = true;
        }
        return var3;
    }

    @ObfuscatedName("ci.t(I)Z")
    public final boolean method985() {
        return this.field1273 != null;
    }
}
