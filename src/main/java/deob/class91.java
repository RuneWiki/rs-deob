package deob;

@ObfuscatedName("cy")
public final class class91 extends class85 {

    @ObfuscatedName("cy.c")
    public class171 field1247;

    @ObfuscatedName("cy.c(ILgl;I)V")
    public final void method2148(int arg0, class186 arg1) {
        int var3 = this.field1173[0];
        int var4 = this.field1147[0];
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
        if (this.field1144 != -1 && class183.method1980(this.field1144).field2100 == 1) {
            this.field1144 = -1;
        }
        if (this.field1172 < 9) {
            this.field1172++;
        }
        for (int var5 = this.field1172; var5 > 0; var5--) {
            this.field1173[var5] = this.field1173[var5 - 1];
            this.field1147[var5] = this.field1147[var5 - 1];
            this.field1175[var5] = this.field1175[var5 - 1];
        }
        this.field1173[0] = var3;
        this.field1147[0] = var4;
        this.field1175[0] = arg1;
    }

    @ObfuscatedName("cy.s(IIZI)V")
    public final void method2144(int arg0, int arg1, boolean arg2) {
        if (this.field1144 != -1 && class183.method1980(this.field1144).field2100 == 1) {
            this.field1144 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1173[0];
            int var5 = arg1 - this.field1147[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1172 < 9) {
                    this.field1172++;
                }
                for (int var6 = this.field1172; var6 > 0; var6--) {
                    this.field1173[var6] = this.field1173[var6 - 1];
                    this.field1147[var6] = this.field1147[var6 - 1];
                    this.field1175[var6] = this.field1175[var6 - 1];
                }
                this.field1173[0] = arg0;
                this.field1147[0] = arg1;
                this.field1175[0] = class186.field2136;
                return;
            }
        }
        this.field1172 = 0;
        this.field1177 = 0;
        this.field1176 = 0;
        this.field1173[0] = arg0;
        this.field1147[0] = arg1;
        this.field1161 = this.field1173[0] * 128 + this.field1114 * 64;
        this.field1152 = this.field1147[0] * 128 + this.field1114 * 64;
    }

    @ObfuscatedName("cy.l(B)Lgf;")
    public final class204 method1790() {
        if (this.field1247 == null) {
            return null;
        }
        class183 var1 = this.field1144 != -1 && this.field1127 == 0 ? class183.method1980(this.field1144) : null;
        class183 var2 = this.field1141 == -1 || this.field1141 == this.field1116 && var1 != null ? null : class183.method1980(this.field1141);
        class204 var3 = this.field1247.method2971(var1, this.field1162, var2, this.field1142);
        if (var3 == null) {
            return null;
        }
        var3.method3807();
        this.field1123 = var3.field2372;
        if (this.field1155 != -1 && this.field1150 != -1) {
            class204 var4 = class173.method4901(this.field1155).method3009(this.field1150);
            if (var4 != null) {
                var4.method3889(0, -this.field1153, 0);
                class204[] var5 = new class204[] { var3, var4 };
                var3 = new class204(var5, 2);
            }
        }
        if (this.field1247.field1854 == 1) {
            var3.field2498 = true;
        }
        if (this.field1168 == 0 || client.field682 < this.field1163 || client.field682 >= this.field1164) {
            var3.field2491 = 0;
        } else {
            var3.field2509 = this.field1165;
            var3.field2510 = this.field1156;
            var3.field2448 = this.field1167;
            var3.field2491 = this.field1168;
        }
        return var3;
    }

    @ObfuscatedName("cy.d(I)Z")
    public final boolean method2015() {
        return this.field1247 != null;
    }
}
