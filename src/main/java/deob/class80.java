package deob;

@ObfuscatedName("cp")
public final class class80 extends class70 {

    @ObfuscatedName("cp.f")
    public class257 field1106;

    @ObfuscatedName("cp.f(IBI)V")
    public final void method1873(int arg0, byte arg1) {
        int var3 = this.field978[0];
        int var4 = this.field979[0];
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
        if (this.field955 != -1 && class259.method209(this.field955).field3494 == 1) {
            this.field955 = -1;
        }
        if (this.field977 < 9) {
            this.field977++;
        }
        for (int var5 = this.field977; var5 > 0; var5--) {
            this.field978[var5] = this.field978[var5 - 1];
            this.field979[var5] = this.field979[var5 - 1];
            this.field931[var5] = this.field931[var5 - 1];
        }
        this.field978[0] = var3;
        this.field979[0] = var4;
        this.field931[0] = arg1;
    }

    @ObfuscatedName("cp.i(IIZI)V")
    public final void method1874(int arg0, int arg1, boolean arg2) {
        if (this.field955 != -1 && class259.method209(this.field955).field3494 == 1) {
            this.field955 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field978[0];
            int var5 = arg1 - this.field979[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field977 < 9) {
                    this.field977++;
                }
                for (int var6 = this.field977; var6 > 0; var6--) {
                    this.field978[var6] = this.field978[var6 - 1];
                    this.field979[var6] = this.field979[var6 - 1];
                    this.field931[var6] = this.field931[var6 - 1];
                }
                this.field978[0] = arg0;
                this.field979[0] = arg1;
                this.field931[0] = 1;
                return;
            }
        }
        this.field977 = 0;
        this.field927 = 0;
        this.field981 = 0;
        this.field978[0] = arg0;
        this.field979[0] = arg1;
        this.field937 = this.field978[0] * 128 + this.field926 * 64;
        this.field923 = this.field979[0] * 128 + this.field926 * 64;
    }

    @ObfuscatedName("cp.a(I)Ldw;")
    public final class128 method1101() {
        if (this.field1106 == null) {
            return null;
        }
        class259 var1 = this.field955 != -1 && this.field958 == 0 ? class259.method209(this.field955) : null;
        class259 var2 = this.field952 == -1 || this.field952 == this.field928 && var1 != null ? null : class259.method209(this.field952);
        class128 var3 = this.field1106.method4351(var1, this.field956, var2, this.field953);
        if (var3 == null) {
            return null;
        }
        var3.method2691();
        this.field973 = var3.field1850;
        if (this.field982 != -1 && this.field954 != -1) {
            class128 var4 = class244.method3267(this.field982).method4025(this.field954);
            if (var4 != null) {
                var4.method2646(0, -this.field964, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (this.field1106.field3435 == 1) {
            var3.field1670 = true;
        }
        return var3;
    }

    @ObfuscatedName("cp.l(S)Z")
    public final boolean method1108() {
        return this.field1106 != null;
    }
}
