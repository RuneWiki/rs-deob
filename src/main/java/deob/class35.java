package deob;

@ObfuscatedName("ac")
public final class class35 extends class38 {

    @ObfuscatedName("ac.f")
    public class40 field789;

    @ObfuscatedName("ac.f(IBB)V")
    public final void method710(int arg0, byte arg1) {
        int var3 = this.field827[0];
        int var4 = this.field872[0];
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
        if (this.field848 != -1 && Statics.method653(this.field848).field1004 == 1) {
            this.field848 = -1;
        }
        if (this.field857 < 9) {
            this.field857++;
        }
        for (int var5 = this.field857; var5 > 0; var5--) {
            this.field827[var5] = this.field827[var5 - 1];
            this.field872[var5] = this.field872[var5 - 1];
            this.field873[var5] = this.field873[var5 - 1];
        }
        this.field827[0] = var3;
        this.field872[0] = var4;
        this.field873[0] = arg1;
    }

    @ObfuscatedName("ac.s(IIZI)V")
    public final void method713(int arg0, int arg1, boolean arg2) {
        if (this.field848 != -1 && Statics.method653(this.field848).field1004 == 1) {
            this.field848 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field827[0];
            int var5 = arg1 - this.field872[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field857 < 9) {
                    this.field857++;
                }
                for (int var6 = this.field857; var6 > 0; var6--) {
                    this.field827[var6] = this.field827[var6 - 1];
                    this.field872[var6] = this.field872[var6 - 1];
                    this.field873[var6] = this.field873[var6 - 1];
                }
                this.field827[0] = arg0;
                this.field872[0] = arg1;
                this.field873[0] = 1;
                return;
            }
        }
        this.field857 = 0;
        this.field877 = 0;
        this.field875 = 0;
        this.field827[0] = arg0;
        this.field872[0] = arg1;
        this.field828 = this.field827[0] * 128 + this.field821 * 64;
        this.field818 = this.field872[0] * 128 + this.field821 * 64;
    }

    @ObfuscatedName("ac.q(I)Ldu;")
    public final class105 method16() {
        if (this.field789 == null) {
            return null;
        }
        class43 var1 = this.field848 != -1 && this.field851 == 0 ? Statics.method653(this.field848) : null;
        class43 var2 = this.field874 == -1 || this.field874 == this.field852 && var1 != null ? null : Statics.method653(this.field874);
        class105 var3 = this.field789.method753(var1, this.field849, var2, this.field846);
        if (var3 == null) {
            return null;
        }
        var3.method2161();
        this.field866 = var3.field1462;
        if (this.field853 != -1 && this.field854 != -1) {
            class105 var4 = class44.method732(this.field853).method886(this.field854);
            if (var4 != null) {
                var4.method2178(0, -this.field843, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field789.field917 == 1) {
            var3.field1821 = true;
        }
        return var3;
    }

    @ObfuscatedName("ac.j(S)Z")
    public final boolean method28() {
        return this.field789 != null;
    }
}
