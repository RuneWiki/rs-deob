package deob;

@ObfuscatedName("ad")
public final class class37 extends class40 {

    @ObfuscatedName("ad.e")
    public class42 field826;

    @ObfuscatedName("ad.e(IBB)V")
    public final void method732(int arg0, byte arg1) {
        int var3 = this.field886[0];
        int var4 = this.field907[0];
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
        if (this.field891 != -1 && Statics.method144(this.field891).field1036 == 1) {
            this.field891 = -1;
        }
        if (this.field853 < 9) {
            this.field853++;
        }
        for (int var5 = this.field853; var5 > 0; var5--) {
            this.field886[var5] = this.field886[var5 - 1];
            this.field907[var5] = this.field907[var5 - 1];
            this.field908[var5] = this.field908[var5 - 1];
        }
        this.field886[0] = var3;
        this.field907[0] = var4;
        this.field908[0] = arg1;
    }

    @ObfuscatedName("ad.l(IIZI)V")
    public final void method733(int arg0, int arg1, boolean arg2) {
        if (this.field891 != -1 && Statics.method144(this.field891).field1036 == 1) {
            this.field891 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field886[0];
            int var5 = arg1 - this.field907[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field853 < 9) {
                    this.field853++;
                }
                for (int var6 = this.field853; var6 > 0; var6--) {
                    this.field886[var6] = this.field886[var6 - 1];
                    this.field907[var6] = this.field907[var6 - 1];
                    this.field908[var6] = this.field908[var6 - 1];
                }
                this.field886[0] = arg0;
                this.field907[0] = arg1;
                this.field908[0] = 1;
                return;
            }
        }
        this.field853 = 0;
        this.field910 = 0;
        this.field909 = 0;
        this.field886[0] = arg0;
        this.field907[0] = arg1;
        this.field897 = this.field886[0] * 128 + this.field852 * 64;
        this.field880 = this.field907[0] * 128 + this.field852 * 64;
    }

    @ObfuscatedName("ad.c(I)Lds;")
    public final class109 method9() {
        if (this.field826 == null) {
            return null;
        }
        class45 var1 = this.field891 != -1 && this.field905 == 0 ? Statics.method144(this.field891) : null;
        class45 var2 = this.field901 == -1 || this.field901 == this.field855 && var1 != null ? null : Statics.method144(this.field901);
        class109 var3 = this.field826.method796(var1, this.field866, var2, this.field881);
        if (var3 == null) {
            return null;
        }
        var3.method2248();
        this.field856 = var3.field1530;
        if (this.field888 != -1 && this.field889 != -1) {
            class109 var4 = class46.method3025(this.field888).method932(this.field889);
            if (var4 != null) {
                var4.method2257(0, -this.field892, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (this.field826.field925 == 1) {
            var3.field1930 = true;
        }
        return var3;
    }

    @ObfuscatedName("ad.b(I)Z")
    public final boolean method16() {
        return this.field826 != null;
    }
}
