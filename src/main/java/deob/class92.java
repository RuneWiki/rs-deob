package deob;

@ObfuscatedName("co")
public final class class92 extends class87 {

    @ObfuscatedName("co.c")
    public class178 field1263;

    @ObfuscatedName("co.v")
    public String field1262 = "";

    @ObfuscatedName("co.c(Ljava/lang/String;I)V")
    public void method2259(String arg0) {
        this.field1262 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("co.q(B)Ljava/lang/String;")
    public final String method2251() {
        if (!this.field1262.isEmpty()) {
            return this.field1262;
        }
        class178 var1 = this.field1263;
        if (var1.field1953 != null) {
            var1 = var1.method3173();
            if (var1 == null) {
                var1 = this.field1263;
            }
        }
        return var1.field1915;
    }

    @ObfuscatedName("co.f(ILgn;I)V")
    public final void method2252(int arg0, class193 arg1) {
        int var3 = this.field1200[0];
        int var4 = this.field1201[0];
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
        if (this.field1171 != -1 && class190.method983(this.field1171).field2189 == 1) {
            this.field1171 = -1;
        }
        if (this.field1199 < 9) {
            this.field1199++;
        }
        for (int var5 = this.field1199; var5 > 0; var5--) {
            this.field1200[var5] = this.field1200[var5 - 1];
            this.field1201[var5] = this.field1201[var5 - 1];
            this.field1202[var5] = this.field1202[var5 - 1];
        }
        this.field1200[0] = var3;
        this.field1201[0] = var4;
        this.field1202[0] = arg1;
    }

    @ObfuscatedName("co.j(IIZI)V")
    public final void method2253(int arg0, int arg1, boolean arg2) {
        if (this.field1171 != -1 && class190.method983(this.field1171).field2189 == 1) {
            this.field1171 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1200[0];
            int var5 = arg1 - this.field1201[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1199 < 9) {
                    this.field1199++;
                }
                for (int var6 = this.field1199; var6 > 0; var6--) {
                    this.field1200[var6] = this.field1200[var6 - 1];
                    this.field1201[var6] = this.field1201[var6 - 1];
                    this.field1202[var6] = this.field1202[var6 - 1];
                }
                this.field1200[0] = arg0;
                this.field1201[0] = arg1;
                this.field1202[0] = class193.field2213;
                return;
            }
        }
        this.field1199 = 0;
        this.field1204 = 0;
        this.field1203 = 0;
        this.field1200[0] = arg0;
        this.field1201[0] = arg1;
        this.field1137 = this.field1200[0] * 128 + this.field1206 * 64;
        this.field1131 = this.field1201[0] * 128 + this.field1206 * 64;
    }

    @ObfuscatedName("co.v(I)Lhy;")
    public final class211 method1782() {
        if (this.field1263 == null) {
            return null;
        }
        class190 var1 = this.field1171 != -1 && this.field1174 == 0 ? class190.method983(this.field1171) : null;
        class190 var2 = this.field1147 == -1 || this.field1168 == this.field1147 && var1 != null ? null : class190.method983(this.field1147);
        class211 var3 = this.field1263.method3176(var1, this.field1176, var2, this.field1169);
        if (var3 == null) {
            return null;
        }
        var3.method4080();
        this.field1189 = var3.field2447;
        if (this.field1175 != -1 && this.field1177 != -1) {
            class211 var4 = class180.method1612(this.field1175).method3213(this.field1177);
            if (var4 != null) {
                var4.method4072(0, -this.field1144, 0);
                class211[] var5 = new class211[] { var3, var4 };
                var3 = new class211(var5, 2);
            }
        }
        if (this.field1263.field1919 == 1) {
            var3.field2537 = true;
        }
        if (this.field1134 == 0 || client.field552 < this.field1190 || client.field552 >= this.field1136) {
            var3.field2584 = 0;
        } else {
            var3.field2575 = this.field1192;
            var3.field2582 = this.field1193;
            var3.field2583 = this.field1194;
            var3.field2584 = this.field1134;
        }
        return var3;
    }

    @ObfuscatedName("co.x(I)Z")
    public final boolean method2059() {
        return this.field1263 != null;
    }
}
