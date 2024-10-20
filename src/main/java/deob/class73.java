package deob;

@ObfuscatedName("br")
public final class class73 extends class64 {

    @ObfuscatedName("br.z")
    public class272 field1038;

    @ObfuscatedName("br.z(IBB)V")
    public final void method1677(int arg0, byte arg1) {
        int var3 = this.field923[0];
        int var4 = this.field873[0];
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
        if (this.field904 != -1 && class274.method26(this.field904).field3536 == 1) {
            this.field904 = -1;
        }
        if (this.field910 < 9) {
            this.field910++;
        }
        for (int var5 = this.field910; var5 > 0; var5--) {
            this.field923[var5] = this.field923[var5 - 1];
            this.field873[var5] = this.field873[var5 - 1];
            this.field929[var5] = this.field929[var5 - 1];
        }
        this.field923[0] = var3;
        this.field873[0] = var4;
        this.field929[0] = arg1;
    }

    @ObfuscatedName("br.w(IIZI)V")
    public final void method1673(int arg0, int arg1, boolean arg2) {
        if (this.field904 != -1 && class274.method26(this.field904).field3536 == 1) {
            this.field904 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field923[0];
            int var5 = arg1 - this.field873[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field910 < 9) {
                    this.field910++;
                }
                for (int var6 = this.field910; var6 > 0; var6--) {
                    this.field923[var6] = this.field923[var6 - 1];
                    this.field873[var6] = this.field873[var6 - 1];
                    this.field929[var6] = this.field929[var6 - 1];
                }
                this.field923[0] = arg0;
                this.field873[0] = arg1;
                this.field929[0] = 1;
                return;
            }
        }
        this.field910 = 0;
        this.field931 = 0;
        this.field924 = 0;
        this.field923[0] = arg0;
        this.field873[0] = arg1;
        this.field932 = this.field923[0] * 128 + this.field875 * 64;
        this.field882 = this.field873[0] * 128 + this.field875 * 64;
    }

    @ObfuscatedName("br.e(I)Ldc;")
    public final class120 method1010() {
        if (this.field1038 == null) {
            return null;
        }
        class274 var1 = this.field904 != -1 && this.field907 == 0 ? class274.method26(this.field904) : null;
        class274 var2 = this.field901 == -1 || this.field901 == this.field894 && var1 != null ? null : class274.method26(this.field901);
        class120 var3 = this.field1038.method4768(var1, this.field905, var2, this.field909);
        if (var3 == null) {
            return null;
        }
        var3.method2466();
        this.field926 = var3.field1782;
        if (this.field892 != -1 && this.field877 != -1) {
            class120 var4 = class259.method956(this.field892).method4475(this.field877);
            if (var4 != null) {
                var4.method2514(0, -this.field872, 0);
                class120[] var5 = new class120[] { var3, var4 };
                var3 = new class120(var5, 2);
            }
        }
        if (this.field1038.field3498 == 1) {
            var3.field1604 = true;
        }
        return var3;
    }

    @ObfuscatedName("br.f(B)Z")
    public final boolean method1042() {
        return this.field1038 != null;
    }
}
