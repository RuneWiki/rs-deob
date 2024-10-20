package deob;

@ObfuscatedName("ar")
public final class class35 extends class38 {

    @ObfuscatedName("ar.h")
    public class40 field786;

    @ObfuscatedName("ar.h(IBB)V")
    public final void method696(int arg0, byte arg1) {
        int var3 = this.field870[0];
        int var4 = this.field817[0];
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
        if (this.field834 != -1 && class43.method733(this.field834).field1006 == 1) {
            this.field834 = -1;
        }
        if (this.field869 < 9) {
            this.field869++;
        }
        for (int var5 = this.field869; var5 > 0; var5--) {
            this.field870[var5] = this.field870[var5 - 1];
            this.field817[var5] = this.field817[var5 - 1];
            this.field872[var5] = this.field872[var5 - 1];
        }
        this.field870[0] = var3;
        this.field817[0] = var4;
        this.field872[0] = arg1;
    }

    @ObfuscatedName("ar.q(IIZI)V")
    public final void method699(int arg0, int arg1, boolean arg2) {
        if (this.field834 != -1 && class43.method733(this.field834).field1006 == 1) {
            this.field834 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field870[0];
            int var5 = arg1 - this.field817[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field869 < 9) {
                    this.field869++;
                }
                for (int var6 = this.field869; var6 > 0; var6--) {
                    this.field870[var6] = this.field870[var6 - 1];
                    this.field817[var6] = this.field817[var6 - 1];
                    this.field872[var6] = this.field872[var6 - 1];
                }
                this.field870[0] = arg0;
                this.field817[0] = arg1;
                this.field872[0] = 1;
                return;
            }
        }
        this.field869 = 0;
        this.field874 = 0;
        this.field873 = 0;
        this.field870[0] = arg0;
        this.field817[0] = arg1;
        this.field853 = this.field870[0] * 128 + this.field821 * 64;
        this.field843 = this.field817[0] * 128 + this.field821 * 64;
    }

    @ObfuscatedName("ar.v(B)Ldg;")
    public final class105 method32() {
        if (this.field786 == null) {
            return null;
        }
        class43 var1 = this.field834 != -1 && this.field819 == 0 ? class43.method733(this.field834) : null;
        class43 var2 = this.field844 == -1 || this.field844 == this.field820 && var1 != null ? null : class43.method733(this.field844);
        class105 var3 = this.field786.method740(var1, this.field848, var2, this.field845);
        if (var3 == null) {
            return null;
        }
        var3.method2220();
        this.field865 = var3.field1450;
        if (this.field826 != -1 && this.field847 != -1) {
            class105 var4 = class44.method2821(this.field826).method886(this.field847);
            if (var4 != null) {
                var4.method2172(0, -this.field827, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field786.field907 == 1) {
            var3.field1853 = true;
        }
        return var3;
    }

    @ObfuscatedName("ar.o(I)Z")
    public final boolean method18() {
        return this.field786 != null;
    }
}
