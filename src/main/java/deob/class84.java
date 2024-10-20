package deob;

@ObfuscatedName("cd")
public final class class84 extends class75 {

    @ObfuscatedName("cd.s")
    public class270 field1271;

    @ObfuscatedName("cd.s(IBB)V")
    public final void method1732(int arg0, byte arg1) {
        int var3 = this.field1170[0];
        int var4 = this.field1174[0];
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
        if (this.field1147 != -1 && class272.method4180(this.field1147).field3694 == 1) {
            this.field1147 = -1;
        }
        if (this.field1123 < 9) {
            this.field1123++;
        }
        for (int var5 = this.field1123; var5 > 0; var5--) {
            this.field1170[var5] = this.field1170[var5 - 1];
            this.field1174[var5] = this.field1174[var5 - 1];
            this.field1166[var5] = this.field1166[var5 - 1];
        }
        this.field1170[0] = var3;
        this.field1174[0] = var4;
        this.field1166[0] = arg1;
    }

    @ObfuscatedName("cd.g(IIZI)V")
    public final void method1733(int arg0, int arg1, boolean arg2) {
        if (this.field1147 != -1 && class272.method4180(this.field1147).field3694 == 1) {
            this.field1147 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1170[0];
            int var5 = arg1 - this.field1174[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1123 < 9) {
                    this.field1123++;
                }
                for (int var6 = this.field1123; var6 > 0; var6--) {
                    this.field1170[var6] = this.field1170[var6 - 1];
                    this.field1174[var6] = this.field1174[var6 - 1];
                    this.field1166[var6] = this.field1166[var6 - 1];
                }
                this.field1170[0] = arg0;
                this.field1174[0] = arg1;
                this.field1166[0] = 1;
                return;
            }
        }
        this.field1123 = 0;
        this.field1162 = 0;
        this.field1173 = 0;
        this.field1170[0] = arg0;
        this.field1174[0] = arg1;
        this.field1129 = this.field1170[0] * 128 + this.field1128 * 64;
        this.field1116 = this.field1174[0] * 128 + this.field1128 * 64;
    }

    @ObfuscatedName("cd.z(I)Les;")
    public final class131 method1039() {
        if (this.field1271 == null) {
            return null;
        }
        class272 var1 = this.field1147 != -1 && this.field1115 == 0 ? class272.method4180(this.field1147) : null;
        class272 var2 = this.field1144 == -1 || this.field1144 == this.field1138 && var1 != null ? null : class272.method4180(this.field1144);
        class131 var3 = this.field1271.method4693(var1, this.field1171, var2, this.field1145);
        if (var3 == null) {
            return null;
        }
        var3.method2578();
        this.field1165 = var3.field2001;
        if (this.field1152 != -1 && this.field1153 != -1) {
            class131 var4 = class257.method3116(this.field1152).method4406(this.field1153);
            if (var4 != null) {
                var4.method2586(0, -this.field1169, 0);
                class131[] var5 = new class131[] { var3, var4 };
                var3 = new class131(var5, 2);
            }
        }
        if (this.field1271.field3634 == 1) {
            var3.field1870 = true;
        }
        return var3;
    }

    @ObfuscatedName("cd.l(B)Z")
    public final boolean method1046() {
        return this.field1271 != null;
    }
}
