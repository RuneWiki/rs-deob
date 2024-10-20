package deob;

@ObfuscatedName("cr")
public final class class91 extends class85 {

    @ObfuscatedName("cr.c")
    public class171 field1215;

    @ObfuscatedName("cr.c(ILgj;I)V")
    public final void method2211(int arg0, class186 arg1) {
        int var3 = this.field1152[0];
        int var4 = this.field1153[0];
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
        if (this.field1103 != -1 && class183.method2402(this.field1103).field2098 == 1) {
            this.field1103 = -1;
        }
        if (this.field1151 < 9) {
            this.field1151++;
        }
        for (int var5 = this.field1151; var5 > 0; var5--) {
            this.field1152[var5] = this.field1152[var5 - 1];
            this.field1153[var5] = this.field1153[var5 - 1];
            this.field1154[var5] = this.field1154[var5 - 1];
        }
        this.field1152[0] = var3;
        this.field1153[0] = var4;
        this.field1154[0] = arg1;
    }

    @ObfuscatedName("cr.p(IIZI)V")
    public final void method2210(int arg0, int arg1, boolean arg2) {
        if (this.field1103 != -1 && class183.method2402(this.field1103).field2098 == 1) {
            this.field1103 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1152[0];
            int var5 = arg1 - this.field1153[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1151 < 9) {
                    this.field1151++;
                }
                for (int var6 = this.field1151; var6 > 0; var6--) {
                    this.field1152[var6] = this.field1152[var6 - 1];
                    this.field1153[var6] = this.field1153[var6 - 1];
                    this.field1154[var6] = this.field1154[var6 - 1];
                }
                this.field1152[0] = arg0;
                this.field1153[0] = arg1;
                this.field1154[0] = class186.field2124;
                return;
            }
        }
        this.field1151 = 0;
        this.field1099 = 0;
        this.field1118 = 0;
        this.field1152[0] = arg0;
        this.field1153[0] = arg1;
        this.field1130 = this.field1152[0] * 128 + this.field1121 * 64;
        this.field1090 = this.field1153[0] * 128 + this.field1121 * 64;
    }

    @ObfuscatedName("cr.b(I)Lgo;")
    public final class204 method1860() {
        if (this.field1215 == null) {
            return null;
        }
        class183 var1 = this.field1103 != -1 && this.field1148 == 0 ? class183.method2402(this.field1103) : null;
        class183 var2 = this.field1104 == -1 || this.field1104 == this.field1095 && var1 != null ? null : class183.method2402(this.field1104);
        class204 var3 = this.field1215.method2995(var1, this.field1124, var2, this.field1089);
        if (var3 == null) {
            return null;
        }
        var3.method3872();
        this.field1113 = var3.field2360;
        if (this.field1128 != -1 && this.field1129 != -1) {
            class204 var4 = class173.method6501(this.field1128).method3047(this.field1129);
            if (var4 != null) {
                var4.method3888(0, -this.field1132, 0);
                class204[] var5 = new class204[] { var3, var4 };
                var3 = new class204(var5, 2);
            }
        }
        if (this.field1215.field1839 == 1) {
            var3.field2429 = true;
        }
        if (this.field1147 == 0 || client.field481 < this.field1142 || client.field481 >= this.field1141) {
            var3.field2475 = 0;
        } else {
            var3.field2495 = this.field1144;
            var3.field2496 = this.field1145;
            var3.field2480 = this.field1096;
            var3.field2475 = this.field1147;
        }
        return var3;
    }

    @ObfuscatedName("cr.f(B)Z")
    public final boolean method2080() {
        return this.field1215 != null;
    }
}
