package deob;

@ObfuscatedName("cc")
public final class class96 extends class91 {

    @ObfuscatedName("cc.a")
    public class185 field1267;

    @ObfuscatedName("cc.f")
    public String field1266 = "";

    @ObfuscatedName("cc.x")
    public int field1269 = 31;

    @ObfuscatedName("cc.a(Ljava/lang/String;I)V")
    public void method2389(String arg0) {
        this.field1266 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("cc.c(IB)V")
    public void method2390(int arg0) {
        this.field1269 = arg0;
    }

    @ObfuscatedName("cc.x(IB)Z")
    public boolean method2407(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1269 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("cc.h(I)Ljava/lang/String;")
    public final String method2393() {
        if (!this.field1266.isEmpty()) {
            return this.field1266;
        }
        class185 var1 = this.field1267;
        if (var1.field1977 != null) {
            var1 = var1.method3242();
            if (var1 == null) {
                var1 = this.field1267;
            }
        }
        return var1.field1960;
    }

    @ObfuscatedName("cc.j(ILgo;B)V")
    public final void method2388(int arg0, class203 arg1) {
        int var3 = this.field1197[0];
        int var4 = this.field1209[0];
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
        if (this.field1188 != -1 && class197.method3143(this.field1188).field2212 == 1) {
            this.field1188 = -1;
        }
        if (this.field1207 < 9) {
            this.field1207++;
        }
        for (int var5 = this.field1207; var5 > 0; var5--) {
            this.field1197[var5] = this.field1197[var5 - 1];
            this.field1209[var5] = this.field1209[var5 - 1];
            this.field1139[var5] = this.field1139[var5 - 1];
        }
        this.field1197[0] = var3;
        this.field1209[0] = var4;
        this.field1139[0] = arg1;
    }

    @ObfuscatedName("cc.n(IIZS)V")
    public final void method2396(int arg0, int arg1, boolean arg2) {
        if (this.field1188 != -1 && class197.method3143(this.field1188).field2212 == 1) {
            this.field1188 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1197[0];
            int var5 = arg1 - this.field1209[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1207 < 9) {
                    this.field1207++;
                }
                for (int var6 = this.field1207; var6 > 0; var6--) {
                    this.field1197[var6] = this.field1197[var6 - 1];
                    this.field1209[var6] = this.field1209[var6 - 1];
                    this.field1139[var6] = this.field1139[var6 - 1];
                }
                this.field1197[0] = arg0;
                this.field1209[0] = arg1;
                this.field1139[0] = class203.field2283;
                return;
            }
        }
        this.field1207 = 0;
        this.field1212 = 0;
        this.field1173 = 0;
        this.field1197[0] = arg0;
        this.field1209[0] = arg1;
        this.field1163 = this.field1197[0] * 128 + this.field1202 * 64;
        this.field1138 = this.field1209[0] * 128 + this.field1202 * 64;
    }

    @ObfuscatedName("cc.f(I)Lha;")
    public final class221 method1929() {
        if (this.field1267 == null) {
            return null;
        }
        class197 var1 = this.field1188 != -1 && this.field1140 == 0 ? class197.method3143(this.field1188) : null;
        class197 var2 = this.field1175 == -1 || this.field1175 == this.field1159 && var1 != null ? null : class197.method3143(this.field1175);
        class221 var3 = this.field1267.method3240(var1, this.field1180, var2, this.field1176);
        if (var3 == null) {
            return null;
        }
        var3.method4232();
        this.field1145 = var3.field2521;
        int var4 = var3.field2622;
        if (this.field1184 != -1 && this.field1192 != -1) {
            class221 var5 = class187.method710(this.field1184).method3279(this.field1192);
            if (var5 != null) {
                var5.method4174(0, -this.field1160, 0);
                class221[] var6 = new class221[] { var3, var5 };
                var3 = new class221(var6, 2);
            }
        }
        if (this.field1267.field1961 == 1) {
            var3.field2620 = true;
        }
        if (this.field1203 == 0 || client.field503 < this.field1198 || client.field503 >= this.field1199) {
            var3.field2667 = 0;
        } else {
            var3.field2653 = this.field1200;
            var3.field2630 = this.field1201;
            var3.field2666 = this.field1186;
            var3.field2667 = this.field1203;
            var3.field2668 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("cc.t(I)Z")
    public final boolean method2165() {
        return this.field1267 != null;
    }
}
