package deob;

@ObfuscatedName("co")
public final class class92 extends class87 {

    @ObfuscatedName("co.c")
    public class179 field1254;

    @ObfuscatedName("co.p")
    public String field1255 = "";

    @ObfuscatedName("co.c(Ljava/lang/String;I)V")
    public void method2403(String arg0) {
        this.field1255 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("co.f(I)Ljava/lang/String;")
    public final String method2397() {
        if (!this.field1255.isEmpty()) {
            return this.field1255;
        }
        class179 var1 = this.field1254;
        if (var1.field1967 != null) {
            var1 = var1.method3298();
            if (var1 == null) {
                var1 = this.field1254;
            }
        }
        return var1.field1934;
    }

    @ObfuscatedName("co.w(ILga;I)V")
    public final void method2401(int arg0, class194 arg1) {
        int var3 = this.field1199[0];
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
        if (this.field1147 != -1 && class191.method22(this.field1147).field2219 == 1) {
            this.field1147 = -1;
        }
        if (this.field1198 < 9) {
            this.field1198++;
        }
        for (int var5 = this.field1198; var5 > 0; var5--) {
            this.field1199[var5] = this.field1199[var5 - 1];
            this.field1201[var5] = this.field1201[var5 - 1];
            this.field1143[var5] = this.field1143[var5 - 1];
        }
        this.field1199[0] = var3;
        this.field1201[0] = var4;
        this.field1143[0] = arg1;
    }

    @ObfuscatedName("co.s(IIZB)V")
    public final void method2399(int arg0, int arg1, boolean arg2) {
        if (this.field1147 != -1 && class191.method22(this.field1147).field2219 == 1) {
            this.field1147 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1199[0];
            int var5 = arg1 - this.field1201[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1198 < 9) {
                    this.field1198++;
                }
                for (int var6 = this.field1198; var6 > 0; var6--) {
                    this.field1199[var6] = this.field1199[var6 - 1];
                    this.field1201[var6] = this.field1201[var6 - 1];
                    this.field1143[var6] = this.field1143[var6 - 1];
                }
                this.field1199[0] = arg0;
                this.field1201[0] = arg1;
                this.field1143[0] = class194.field2247;
                return;
            }
        }
        this.field1198 = 0;
        this.field1203 = 0;
        this.field1202 = 0;
        this.field1199[0] = arg0;
        this.field1201[0] = arg1;
        this.field1185 = this.field1199[0] * 128 + this.field1132 * 64;
        this.field1129 = this.field1201[0] * 128 + this.field1132 * 64;
    }

    @ObfuscatedName("co.p(B)Lha;")
    public final class212 method1926() {
        if (this.field1254 == null) {
            return null;
        }
        class191 var1 = this.field1147 != -1 && this.field1173 == 0 ? class191.method22(this.field1147) : null;
        class191 var2 = this.field1166 == -1 || this.field1166 == this.field1134 && var1 != null ? null : class191.method22(this.field1166);
        class212 var3 = this.field1254.method3274(var1, this.field1171, var2, this.field1167);
        if (var3 == null) {
            return null;
        }
        var3.method4136();
        this.field1188 = var3.field2479;
        int var4 = var3.field2551;
        if (this.field1175 != -1 && this.field1139 != -1) {
            class212 var5 = class181.method5344(this.field1175).method3307(this.field1139);
            if (var5 != null) {
                var5.method4152(0, -this.field1146, 0);
                class212[] var6 = new class212[] { var3, var5 };
                var3 = new class212(var6, 2);
            }
        }
        if (this.field1254.field1973 == 1) {
            var3.field2567 = true;
        }
        if (this.field1195 == 0 || client.field504 < this.field1189 || client.field504 >= this.field1159) {
            var3.field2598 = 0;
        } else {
            var3.field2555 = this.field1191;
            var3.field2616 = this.field1192;
            var3.field2615 = this.field1170;
            var3.field2598 = this.field1195;
            var3.field2619 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("co.a(B)Z")
    public final boolean method2182() {
        return this.field1254 != null;
    }
}
