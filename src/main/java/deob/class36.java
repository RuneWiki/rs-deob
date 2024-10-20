package deob;

@ObfuscatedName("ak")
public final class class36 extends class28 {

    @ObfuscatedName("ak.f")
    public class200 field783;

    @ObfuscatedName("ak.f(IBB)V")
    public final void method729(int arg0, byte arg1) {
        int var3 = this.field674[0];
        int var4 = this.field675[0];
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
        if (this.field651 != -1 && class202.method164(this.field651).field3073 == 1) {
            this.field651 = -1;
        }
        if (this.field673 < 9) {
            this.field673++;
        }
        for (int var5 = this.field673; var5 > 0; var5--) {
            this.field674[var5] = this.field674[var5 - 1];
            this.field675[var5] = this.field675[var5 - 1];
            this.field676[var5] = this.field676[var5 - 1];
        }
        this.field674[0] = var3;
        this.field675[0] = var4;
        this.field676[0] = arg1;
    }

    @ObfuscatedName("ak.i(IIZI)V")
    public final void method730(int arg0, int arg1, boolean arg2) {
        if (this.field651 != -1 && class202.method164(this.field651).field3073 == 1) {
            this.field651 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field674[0];
            int var5 = arg1 - this.field675[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field673 < 9) {
                    this.field673++;
                }
                for (int var6 = this.field673; var6 > 0; var6--) {
                    this.field674[var6] = this.field674[var6 - 1];
                    this.field675[var6] = this.field675[var6 - 1];
                    this.field676[var6] = this.field676[var6 - 1];
                }
                this.field674[0] = arg0;
                this.field675[0] = arg1;
                this.field676[0] = 1;
                return;
            }
        }
        this.field673 = 0;
        this.field656 = 0;
        this.field652 = 0;
        this.field674[0] = arg0;
        this.field675[0] = arg1;
        this.field625 = this.field674[0] * 128 + this.field623 * 64;
        this.field620 = this.field675[0] * 128 + this.field623 * 64;
    }

    @ObfuscatedName("ak.u(B)Lce;")
    public final class83 method209() {
        if (this.field783 == null) {
            return null;
        }
        class202 var1 = this.field651 != -1 && this.field621 == 0 ? class202.method164(this.field651) : null;
        class202 var2 = this.field648 == -1 || this.field648 == this.field624 && var1 != null ? null : class202.method164(this.field648);
        class83 var3 = this.field783.method3515(var1, this.field654, var2, this.field655);
        if (var3 == null) {
            return null;
        }
        var3.method1556();
        this.field677 = var3.field1564;
        if (this.field669 != -1 && this.field679 != -1) {
            class83 var4 = class191.method2599(this.field669).method3293(this.field679);
            if (var4 != null) {
                var4.method1510(0, -this.field660, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (this.field783.field3012 == 1) {
            var3.field1410 = true;
        }
        return var3;
    }

    @ObfuscatedName("ak.n(I)Z")
    public final boolean method213() {
        return this.field783 != null;
    }
}
