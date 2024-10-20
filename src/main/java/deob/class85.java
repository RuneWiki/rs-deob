package deob;

@ObfuscatedName("ch")
public final class class85 extends class76 {

    @ObfuscatedName("ch.t")
    public class286 field1284;

    @ObfuscatedName("ch.t(IBI)V")
    public final void method1746(int arg0, byte arg1) {
        int var3 = this.field1193[0];
        int var4 = this.field1194[0];
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
        if (this.field1170 != -1 && class288.method2932(this.field1170).field3772 == 1) {
            this.field1170 = -1;
        }
        if (this.field1192 < 9) {
            this.field1192++;
        }
        for (int var5 = this.field1192; var5 > 0; var5--) {
            this.field1193[var5] = this.field1193[var5 - 1];
            this.field1194[var5] = this.field1194[var5 - 1];
            this.field1180[var5] = this.field1180[var5 - 1];
        }
        this.field1193[0] = var3;
        this.field1194[0] = var4;
        this.field1180[0] = arg1;
    }

    @ObfuscatedName("ch.q(IIZI)V")
    public final void method1747(int arg0, int arg1, boolean arg2) {
        if (this.field1170 != -1 && class288.method2932(this.field1170).field3772 == 1) {
            this.field1170 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1193[0];
            int var5 = arg1 - this.field1194[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1192 < 9) {
                    this.field1192++;
                }
                for (int var6 = this.field1192; var6 > 0; var6--) {
                    this.field1193[var6] = this.field1193[var6 - 1];
                    this.field1194[var6] = this.field1194[var6 - 1];
                    this.field1180[var6] = this.field1180[var6 - 1];
                }
                this.field1193[0] = arg0;
                this.field1194[0] = arg1;
                this.field1180[0] = 1;
                return;
            }
        }
        this.field1192 = 0;
        this.field1197 = 0;
        this.field1196 = 0;
        this.field1193[0] = arg0;
        this.field1194[0] = arg1;
        this.field1175 = this.field1193[0] * 128 + this.field1140 * 64;
        this.field1138 = this.field1194[0] * 128 + this.field1140 * 64;
    }

    @ObfuscatedName("ch.p(B)Lek;")
    public final class132 method1098() {
        if (this.field1284 == null) {
            return null;
        }
        class288 var1 = this.field1170 != -1 && this.field1173 == 0 ? class288.method2932(this.field1170) : null;
        class288 var2 = this.field1172 == -1 || this.field1181 == this.field1172 && var1 != null ? null : class288.method2932(this.field1172);
        class132 var3 = this.field1284.method4749(var1, this.field1171, var2, this.field1168);
        if (var3 == null) {
            return null;
        }
        var3.method2485();
        this.field1174 = var3.field2020;
        if (this.field1190 != -1 && this.field1176 != -1) {
            class132 var4 = class273.method346(this.field1190).method4420(this.field1176);
            if (var4 != null) {
                var4.method2469(0, -this.field1179, 0);
                class132[] var5 = new class132[] { var3, var4 };
                var3 = new class132(var5, 2);
            }
        }
        if (this.field1284.field3711 == 1) {
            var3.field1850 = true;
        }
        return var3;
    }

    @ObfuscatedName("ch.k(I)Z")
    public final boolean method1102() {
        return this.field1284 != null;
    }
}
