package deob;

@ObfuscatedName("ak")
public final class class35 extends class38 {

    @ObfuscatedName("ak.n")
    public class40 field773;

    @ObfuscatedName("ak.n(IBB)V")
    public final void method725(int arg0, byte arg1) {
        int var3 = this.field861[0];
        int var4 = this.field862[0];
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
        if (this.field811 != -1 && class43.method788(this.field811).field987 == 1) {
            this.field811 = -1;
        }
        if (this.field836 < 9) {
            this.field836++;
        }
        for (int var5 = this.field836; var5 > 0; var5--) {
            this.field861[var5] = this.field861[var5 - 1];
            this.field862[var5] = this.field862[var5 - 1];
            this.field863[var5] = this.field863[var5 - 1];
        }
        this.field861[0] = var3;
        this.field862[0] = var4;
        this.field863[0] = arg1;
    }

    @ObfuscatedName("ak.q(IIZB)V")
    public final void method726(int arg0, int arg1, boolean arg2) {
        if (this.field811 != -1 && class43.method788(this.field811).field987 == 1) {
            this.field811 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field861[0];
            int var5 = arg1 - this.field862[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field836 < 9) {
                    this.field836++;
                }
                for (int var6 = this.field836; var6 > 0; var6--) {
                    this.field861[var6] = this.field861[var6 - 1];
                    this.field862[var6] = this.field862[var6 - 1];
                    this.field863[var6] = this.field863[var6 - 1];
                }
                this.field861[0] = arg0;
                this.field862[0] = arg1;
                this.field863[0] = 1;
                return;
            }
        }
        this.field836 = 0;
        this.field865 = 0;
        this.field808 = 0;
        this.field861[0] = arg0;
        this.field862[0] = arg1;
        this.field867 = this.field861[0] * 128 + this.field810 * 64;
        this.field807 = this.field862[0] * 128 + this.field810 * 64;
    }

    @ObfuscatedName("ak.c(I)Ldt;")
    public final class105 method14() {
        if (this.field773 == null) {
            return null;
        }
        class43 var1 = this.field811 != -1 && this.field841 == 0 ? class43.method788(this.field811) : null;
        class43 var2 = this.field838 == -1 || this.field838 == this.field834 && var1 != null ? null : class43.method788(this.field838);
        class105 var3 = this.field773.method770(var1, this.field851, var2, this.field820);
        if (var3 == null) {
            return null;
        }
        var3.method2164();
        this.field856 = var3.field1437;
        if (this.field843 != -1 && this.field844 != -1) {
            class105 var4 = class44.method601(this.field843).method895(this.field844);
            if (var4 != null) {
                var4.method2191(0, -this.field847, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field773.field882 == 1) {
            var3.field1815 = true;
        }
        return var3;
    }

    @ObfuscatedName("ak.j(B)Z")
    public final boolean method32() {
        return this.field773 != null;
    }
}
