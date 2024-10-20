package deob;

@ObfuscatedName("as")
public final class class35 extends class38 {

    @ObfuscatedName("as.o")
    public class40 field778;

    @ObfuscatedName("as.o(IBI)V")
    public final void method718(int arg0, byte arg1) {
        int var3 = this.field865[0];
        int var4 = this.field827[0];
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
        if (this.field842 != -1 && class43.method774(this.field842).field996 == 1) {
            this.field842 = -1;
        }
        if (this.field864 < 9) {
            this.field864++;
        }
        for (int var5 = this.field864; var5 > 0; var5--) {
            this.field865[var5] = this.field865[var5 - 1];
            this.field827[var5] = this.field827[var5 - 1];
            this.field848[var5] = this.field848[var5 - 1];
        }
        this.field865[0] = var3;
        this.field827[0] = var4;
        this.field848[0] = arg1;
    }

    @ObfuscatedName("as.e(IIZI)V")
    public final void method719(int arg0, int arg1, boolean arg2) {
        if (this.field842 != -1 && class43.method774(this.field842).field996 == 1) {
            this.field842 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field865[0];
            int var5 = arg1 - this.field827[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field864 < 9) {
                    this.field864++;
                }
                for (int var6 = this.field864; var6 > 0; var6--) {
                    this.field865[var6] = this.field865[var6 - 1];
                    this.field827[var6] = this.field827[var6 - 1];
                    this.field848[var6] = this.field848[var6 - 1];
                }
                this.field865[0] = arg0;
                this.field827[0] = arg1;
                this.field848[0] = 1;
                return;
            }
        }
        this.field864 = 0;
        this.field869 = 0;
        this.field832 = 0;
        this.field865[0] = arg0;
        this.field827[0] = arg1;
        this.field845 = this.field865[0] * 128 + this.field850 * 64;
        this.field812 = this.field827[0] * 128 + this.field850 * 64;
    }

    @ObfuscatedName("as.u(I)Ldk;")
    public final class105 method14() {
        if (this.field778 == null) {
            return null;
        }
        class43 var1 = this.field842 != -1 && this.field853 == 0 ? class43.method774(this.field842) : null;
        class43 var2 = this.field816 == -1 || this.field826 == this.field816 && var1 != null ? null : class43.method774(this.field816);
        class105 var3 = this.field778.method770(var1, this.field843, var2, this.field840);
        if (var3 == null) {
            return null;
        }
        var3.method2125();
        this.field811 = var3.field1441;
        if (this.field847 != -1 && this.field867 != -1) {
            class105 var4 = class44.method3260(this.field847).method883(this.field867);
            if (var4 != null) {
                var4.method2169(0, -this.field851, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field778.field895 == 1) {
            var3.field1805 = true;
        }
        return var3;
    }

    @ObfuscatedName("as.y(B)Z")
    public final boolean method18() {
        return this.field778 != null;
    }
}
