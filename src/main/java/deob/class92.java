package deob;

@ObfuscatedName("ct")
public final class class92 extends class87 {

    @ObfuscatedName("ct.s")
    public class178 field1261;

    @ObfuscatedName("ct.h")
    public String field1259 = "";

    @ObfuscatedName("ct.s(Ljava/lang/String;I)V")
    public void method2209(String arg0) {
        this.field1259 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("ct.w(B)Ljava/lang/String;")
    public final String method2195() {
        if (!this.field1259.isEmpty()) {
            return this.field1259;
        }
        class178 var1 = this.field1261;
        if (var1.field1943 != null) {
            var1 = var1.method3101();
            if (var1 == null) {
                var1 = this.field1261;
            }
        }
        return var1.field1936;
    }

    @ObfuscatedName("ct.v(ILgi;B)V")
    public final void method2196(int arg0, class193 arg1) {
        int var3 = this.field1198[0];
        int var4 = this.field1199[0];
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
        if (this.field1169 != -1 && class190.method5853(this.field1169).field2181 == 1) {
            this.field1169 = -1;
        }
        if (this.field1197 < 9) {
            this.field1197++;
        }
        for (int var5 = this.field1197; var5 > 0; var5--) {
            this.field1198[var5] = this.field1198[var5 - 1];
            this.field1199[var5] = this.field1199[var5 - 1];
            this.field1145[var5] = this.field1145[var5 - 1];
        }
        this.field1198[0] = var3;
        this.field1199[0] = var4;
        this.field1145[0] = arg1;
    }

    @ObfuscatedName("ct.k(IIZI)V")
    public final void method2197(int arg0, int arg1, boolean arg2) {
        if (this.field1169 != -1 && class190.method5853(this.field1169).field2181 == 1) {
            this.field1169 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1198[0];
            int var5 = arg1 - this.field1199[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1197 < 9) {
                    this.field1197++;
                }
                for (int var6 = this.field1197; var6 > 0; var6--) {
                    this.field1198[var6] = this.field1198[var6 - 1];
                    this.field1199[var6] = this.field1199[var6 - 1];
                    this.field1145[var6] = this.field1145[var6 - 1];
                }
                this.field1198[0] = arg0;
                this.field1199[0] = arg1;
                this.field1145[0] = class193.field2207;
                return;
            }
        }
        this.field1197 = 0;
        this.field1202 = 0;
        this.field1201 = 0;
        this.field1198[0] = arg0;
        this.field1199[0] = arg1;
        this.field1172 = this.field1198[0] * 128 + this.field1191 * 64;
        this.field1155 = this.field1199[0] * 128 + this.field1191 * 64;
    }

    @ObfuscatedName("ct.h(B)Lhp;")
    public final class211 method1748() {
        if (this.field1261 == null) {
            return null;
        }
        class190 var1 = this.field1169 != -1 && this.field1127 == 0 ? class190.method5853(this.field1169) : null;
        class190 var2 = this.field1156 == -1 || this.field1156 == this.field1133 && var1 != null ? null : class190.method5853(this.field1156);
        class211 var3 = this.field1261.method3070(var1, this.field1170, var2, this.field1166);
        if (var3 == null) {
            return null;
        }
        var3.method3930();
        this.field1187 = var3.field2449;
        int var4 = var3.field2521;
        if (this.field1174 != -1 && this.field1175 != -1) {
            class211 var5 = class180.method6177(this.field1174).method3109(this.field1175);
            if (var5 != null) {
                var5.method4031(0, -this.field1196, 0);
                class211[] var6 = new class211[] { var3, var5 };
                var3 = new class211(var6, 2);
            }
        }
        if (this.field1261.field1907 == 1) {
            var3.field2541 = true;
        }
        if (this.field1193 == 0 || client.field487 < this.field1188 || client.field487 >= this.field1189) {
            var3.field2588 = 0;
        } else {
            var3.field2550 = this.field1190;
            var3.field2525 = this.field1132;
            var3.field2589 = this.field1192;
            var3.field2588 = this.field1193;
            var3.field2528 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("ct.p(B)Z")
    public final boolean method1993() {
        return this.field1261 != null;
    }
}
