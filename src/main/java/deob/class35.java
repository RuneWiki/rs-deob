package deob;

@ObfuscatedName("as")
public final class class35 extends class38 {

    @ObfuscatedName("as.s")
    public class40 field783;

    @ObfuscatedName("as.s(IBB)V")
    public final void method685(int arg0, byte arg1) {
        int var3 = this.field867[0];
        int var4 = this.field864[0];
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
        if (this.field844 != -1 && class43.method43(this.field844).field1002 == 1) {
            this.field844 = -1;
        }
        if (this.field842 < 9) {
            this.field842++;
        }
        for (int var5 = this.field842; var5 > 0; var5--) {
            this.field867[var5] = this.field867[var5 - 1];
            this.field864[var5] = this.field864[var5 - 1];
            this.field869[var5] = this.field869[var5 - 1];
        }
        this.field867[0] = var3;
        this.field864[0] = var4;
        this.field869[0] = arg1;
    }

    @ObfuscatedName("as.j(IIZB)V")
    public final void method686(int arg0, int arg1, boolean arg2) {
        if (this.field844 != -1 && class43.method43(this.field844).field1002 == 1) {
            this.field844 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field867[0];
            int var5 = arg1 - this.field864[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field842 < 9) {
                    this.field842++;
                }
                for (int var6 = this.field842; var6 > 0; var6--) {
                    this.field867[var6] = this.field867[var6 - 1];
                    this.field864[var6] = this.field864[var6 - 1];
                    this.field869[var6] = this.field869[var6 - 1];
                }
                this.field867[0] = arg0;
                this.field864[0] = arg1;
                this.field869[0] = 1;
                return;
            }
        }
        this.field842 = 0;
        this.field871 = 0;
        this.field870 = 0;
        this.field867[0] = arg0;
        this.field864[0] = arg1;
        this.field824 = this.field867[0] * 128 + this.field873 * 64;
        this.field814 = this.field864[0] * 128 + this.field873 * 64;
    }

    @ObfuscatedName("as.p(B)Ldh;")
    public final class106 method14() {
        if (this.field783 == null) {
            return null;
        }
        class43 var1 = this.field844 != -1 && this.field852 == 0 ? class43.method43(this.field844) : null;
        class43 var2 = this.field841 == -1 || this.field841 == this.field818 && var1 != null ? null : class43.method43(this.field841);
        class106 var3 = this.field783.method722(var1, this.field845, var2, this.field862);
        if (var3 == null) {
            return null;
        }
        var3.method2145();
        this.field817 = var3.field1466;
        if (this.field849 != -1 && this.field850 != -1) {
            class106 var4 = class44.method3263(this.field849).method859(this.field850);
            if (var4 != null) {
                var4.method2155(0, -this.field860, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (this.field783.field888 == 1) {
            var3.field1835 = true;
        }
        return var3;
    }

    @ObfuscatedName("as.o(I)Z")
    public final boolean method18() {
        return this.field783 != null;
    }
}
