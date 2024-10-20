package deob;

@ObfuscatedName("cd")
public final class class92 extends class87 {

    @ObfuscatedName("cd.o")
    public class179 field1261;

    @ObfuscatedName("cd.q")
    public String field1259 = "";

    @ObfuscatedName("cd.o(Ljava/lang/String;B)V")
    public void method2218(String arg0) {
        this.field1259 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("cd.l(I)Ljava/lang/String;")
    public final String method2221() {
        if (!this.field1259.isEmpty()) {
            return this.field1259;
        }
        class179 var1 = this.field1261;
        if (var1.field1982 != null) {
            var1 = var1.method3119();
            if (var1 == null) {
                var1 = this.field1261;
            }
        }
        return var1.field1966;
    }

    @ObfuscatedName("cd.k(ILgd;B)V")
    public final void method2219(int arg0, class194 arg1) {
        int var3 = this.field1194[0];
        int var4 = this.field1208[0];
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
        if (this.field1212 != -1 && class191.method2497(this.field1212).field2207 == 1) {
            this.field1212 = -1;
        }
        if (this.field1206 < 9) {
            this.field1206++;
        }
        for (int var5 = this.field1206; var5 > 0; var5--) {
            this.field1194[var5] = this.field1194[var5 - 1];
            this.field1208[var5] = this.field1208[var5 - 1];
            this.field1164[var5] = this.field1164[var5 - 1];
        }
        this.field1194[0] = var3;
        this.field1208[0] = var4;
        this.field1164[0] = arg1;
    }

    @ObfuscatedName("cd.r(IIZI)V")
    public final void method2220(int arg0, int arg1, boolean arg2) {
        if (this.field1212 != -1 && class191.method2497(this.field1212).field2207 == 1) {
            this.field1212 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1194[0];
            int var5 = arg1 - this.field1208[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1206 < 9) {
                    this.field1206++;
                }
                for (int var6 = this.field1206; var6 > 0; var6--) {
                    this.field1194[var6] = this.field1194[var6 - 1];
                    this.field1208[var6] = this.field1208[var6 - 1];
                    this.field1164[var6] = this.field1164[var6 - 1];
                }
                this.field1194[0] = arg0;
                this.field1208[0] = arg1;
                this.field1164[0] = class194.field2252;
                return;
            }
        }
        this.field1206 = 0;
        this.field1201 = 0;
        this.field1195 = 0;
        this.field1194[0] = arg0;
        this.field1208[0] = arg1;
        this.field1182 = this.field1194[0] * 128 + this.field1168 * 64;
        this.field1138 = this.field1208[0] * 128 + this.field1168 * 64;
    }

    @ObfuscatedName("cd.q(I)Lhv;")
    public final class212 method1774() {
        if (this.field1261 == null) {
            return null;
        }
        class191 var1 = this.field1212 != -1 && this.field1181 == 0 ? class191.method2497(this.field1212) : null;
        class191 var2 = this.field1175 == -1 || this.field1175 == this.field1145 && var1 != null ? null : class191.method2497(this.field1175);
        class212 var3 = this.field1261.method3117(var1, this.field1179, var2, this.field1176);
        if (var3 == null) {
            return null;
        }
        var3.method3946();
        this.field1196 = var3.field2487;
        if (this.field1207 != -1 && this.field1210 != -1) {
            class212 var4 = class181.method2676(this.field1207).method3155(this.field1210);
            if (var4 != null) {
                var4.method3970(0, -this.field1152, 0);
                class212[] var5 = new class212[] { var3, var4 };
                var3 = new class212(var5, 2);
            }
        }
        if (this.field1261.field1950 == 1) {
            var3.field2624 = true;
        }
        if (this.field1141 == 0 || client.field631 < this.field1197 || client.field631 >= this.field1198) {
            var3.field2625 = 0;
        } else {
            var3.field2622 = this.field1144;
            var3.field2623 = this.field1200;
            var3.field2619 = this.field1154;
            var3.field2625 = this.field1141;
        }
        return var3;
    }

    @ObfuscatedName("cd.h(B)Z")
    public final boolean method2009() {
        return this.field1261 != null;
    }
}
