package deob;

@ObfuscatedName("cj")
public final class class86 extends class78 {

    @ObfuscatedName("cj.b")
    public class266 field1289;

    @ObfuscatedName("cj.b(IBI)V")
    public final void method1538(int arg0, byte arg1) {
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
        if (this.field1158 != -1 && class268.method1560(this.field1158).field3666 == 1) {
            this.field1158 = -1;
        }
        if (this.field1199 < 9) {
            this.field1199++;
        }
        for (int var5 = this.field1199; var5 > 0; var5--) {
            this.field1200[var5] = this.field1200[var5 - 1];
            this.field1201[var5] = this.field1201[var5 - 1];
            this.field1190[var5] = this.field1190[var5 - 1];
        }
        this.field1200[0] = var3;
        this.field1201[0] = var4;
        this.field1190[0] = arg1;
    }

    @ObfuscatedName("cj.s(IIZI)V")
    public final void method1539(int arg0, int arg1, boolean arg2) {
        if (this.field1158 != -1 && class268.method1560(this.field1158).field3666 == 1) {
            this.field1158 = -1;
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
                    this.field1190[var6] = this.field1190[var6 - 1];
                }
                this.field1200[0] = arg0;
                this.field1201[0] = arg1;
                this.field1190[0] = 1;
                return;
            }
        }
        this.field1199 = 0;
        this.field1204 = 0;
        this.field1203 = 0;
        this.field1200[0] = arg0;
        this.field1201[0] = arg1;
        this.field1195 = this.field1200[0] * 128 + this.field1149 * 64;
        this.field1157 = this.field1201[0] * 128 + this.field1149 * 64;
    }

    @ObfuscatedName("cj.r(I)Lev;")
    public final class133 method983() {
        if (this.field1289 == null) {
            return null;
        }
        class268 var1 = this.field1158 != -1 && this.field1180 == 0 ? class268.method1560(this.field1158) : null;
        class268 var2 = this.field1174 == -1 || this.field1174 == this.field1150 && var1 != null ? null : class268.method1560(this.field1174);
        class133 var3 = this.field1289.method4331(var1, this.field1178, var2, this.field1181);
        if (var3 == null) {
            return null;
        }
        var3.method2312();
        this.field1152 = var3.field2023;
        if (this.field1182 != -1 && this.field1191 != -1) {
            class133 var4 = class253.method3933(this.field1182).method4018(this.field1191);
            if (var4 != null) {
                var4.method2324(0, -this.field1186, 0);
                class133[] var5 = new class133[] { var3, var4 };
                var3 = new class133(var5, 2);
            }
        }
        if (this.field1289.field3607 == 1) {
            var3.field1832 = true;
        }
        return var3;
    }

    @ObfuscatedName("cj.u(B)Z")
    public final boolean method987() {
        return this.field1289 != null;
    }
}
