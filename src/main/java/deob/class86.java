package deob;

@ObfuscatedName("cq")
public final class class86 extends class78 {

    @ObfuscatedName("cq.n")
    public class270 field1298;

    @ObfuscatedName("cq.n(IBI)V")
    public final void method1580(int arg0, byte arg1) {
        int var3 = this.field1199[0];
        int var4 = this.field1164[0];
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
        if (this.field1182 != -1 && class272.method579(this.field1182).field3701 == 1) {
            this.field1182 = -1;
        }
        if (this.field1204 < 9) {
            this.field1204++;
        }
        for (int var5 = this.field1204; var5 > 0; var5--) {
            this.field1199[var5] = this.field1199[var5 - 1];
            this.field1164[var5] = this.field1164[var5 - 1];
            this.field1152[var5] = this.field1152[var5 - 1];
        }
        this.field1199[0] = var3;
        this.field1164[0] = var4;
        this.field1152[0] = arg1;
    }

    @ObfuscatedName("cq.v(IIZI)V")
    public final void method1578(int arg0, int arg1, boolean arg2) {
        if (this.field1182 != -1 && class272.method579(this.field1182).field3701 == 1) {
            this.field1182 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1199[0];
            int var5 = arg1 - this.field1164[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1204 < 9) {
                    this.field1204++;
                }
                for (int var6 = this.field1204; var6 > 0; var6--) {
                    this.field1199[var6] = this.field1199[var6 - 1];
                    this.field1164[var6] = this.field1164[var6 - 1];
                    this.field1152[var6] = this.field1152[var6 - 1];
                }
                this.field1199[0] = arg0;
                this.field1164[0] = arg1;
                this.field1152[0] = 1;
                return;
            }
        }
        this.field1204 = 0;
        this.field1209 = 0;
        this.field1208 = 0;
        this.field1199[0] = arg0;
        this.field1164[0] = arg1;
        this.field1155 = this.field1199[0] * 128 + this.field1154 * 64;
        this.field1151 = this.field1164[0] * 128 + this.field1154 * 64;
    }

    @ObfuscatedName("cq.y(B)Les;")
    public final class133 method1047() {
        if (this.field1298 == null) {
            return null;
        }
        class272 var1 = this.field1182 != -1 && this.field1185 == 0 ? class272.method579(this.field1182) : null;
        class272 var2 = this.field1179 == -1 || this.field1179 == this.field1150 && var1 != null ? null : class272.method579(this.field1179);
        class133 var3 = this.field1298.method4453(var1, this.field1206, var2, this.field1180);
        if (var3 == null) {
            return null;
        }
        var3.method2359();
        this.field1200 = var3.field2026;
        if (this.field1187 != -1 && this.field1188 != -1) {
            class133 var4 = Statics.method4461(this.field1187).method4116(this.field1188);
            if (var4 != null) {
                var4.method2362(0, -this.field1191, 0);
                class133[] var5 = new class133[] { var3, var4 };
                var3 = new class133(var5, 2);
            }
        }
        if (this.field1298.field3668 == 1) {
            var3.field1855 = true;
        }
        return var3;
    }

    @ObfuscatedName("cq.s(I)Z")
    public final boolean method1044() {
        return this.field1298 != null;
    }
}
