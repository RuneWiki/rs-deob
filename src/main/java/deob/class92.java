package deob;

@ObfuscatedName("cy")
public final class class92 extends class87 {

    @ObfuscatedName("cy.v")
    public class179 field1235;

    @ObfuscatedName("cy.v(ILgm;I)V")
    public final void method2243(int arg0, class194 arg1) {
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
        if (this.field1149 != -1 && class191.method3011(this.field1149).field2159 == 1) {
            this.field1149 = -1;
        }
        if (this.field1177 < 9) {
            this.field1177++;
        }
        for (int var5 = this.field1177; var5 > 0; var5--) {
            this.field1178[var5] = this.field1178[var5 - 1];
            this.field1179[var5] = this.field1179[var5 - 1];
            this.field1124[var5] = this.field1124[var5 - 1];
        }
        this.field1178[0] = var3;
        this.field1179[0] = var4;
        this.field1124[0] = arg1;
    }

    @ObfuscatedName("cy.i(IIZI)V")
    public final void method2244(int arg0, int arg1, boolean arg2) {
        if (this.field1149 != -1 && class191.method3011(this.field1149).field2159 == 1) {
            this.field1149 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1178[0];
            int var5 = arg1 - this.field1179[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1177 < 9) {
                    this.field1177++;
                }
                for (int var6 = this.field1177; var6 > 0; var6--) {
                    this.field1178[var6] = this.field1178[var6 - 1];
                    this.field1179[var6] = this.field1179[var6 - 1];
                    this.field1124[var6] = this.field1124[var6 - 1];
                }
                this.field1178[0] = arg0;
                this.field1179[0] = arg1;
                this.field1124[0] = class194.field2186;
                return;
            }
        }
        this.field1177 = 0;
        this.field1171 = 0;
        this.field1180 = 0;
        this.field1178[0] = arg0;
        this.field1179[0] = arg1;
        this.field1132 = this.field1178[0] * 128 + this.field1151 * 64;
        this.field1116 = this.field1179[0] * 128 + this.field1151 * 64;
    }

    @ObfuscatedName("cy.c(B)Liq;")
    public final class241 method1809() {
        if (this.field1235 == null) {
            return null;
        }
        class191 var1 = this.field1149 != -1 && this.field1152 == 0 ? class191.method3011(this.field1149) : null;
        class191 var2 = this.field1146 == -1 || this.field1146 == this.field1121 && var1 != null ? null : class191.method3011(this.field1146);
        class241 var3 = this.field1235.method3175(var1, this.field1150, var2, this.field1173);
        if (var3 == null) {
            return null;
        }
        var3.method4539();
        this.field1167 = var3.field2659;
        if (this.field1165 != -1 && this.field1157 != -1) {
            class241 var4 = class181.method2196(this.field1165).method3206(this.field1157);
            if (var4 != null) {
                var4.method4505(0, -this.field1158, 0);
                class241[] var5 = new class241[] { var3, var4 };
                var3 = new class241(var5, 2);
            }
        }
        if (this.field1235.field1905 == 1) {
            var3.field2751 = true;
        }
        if (this.field1123 == 0 || client.field507 < this.field1168 || client.field507 >= this.field1169) {
            var3.field2798 = 0;
        } else {
            var3.field2760 = this.field1170;
            var3.field2796 = this.field1115;
            var3.field2735 = this.field1172;
            var3.field2798 = this.field1123;
        }
        return var3;
    }

    @ObfuscatedName("cy.g(I)Z")
    public final boolean method2022() {
        return this.field1235 != null;
    }
}
