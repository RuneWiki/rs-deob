package deob;

@ObfuscatedName("ab")
public final class class37 extends class40 {

    @ObfuscatedName("ab.l")
    public class42 field804;

    @ObfuscatedName("ab.l(IBI)V")
    public final void method744(int arg0, byte arg1) {
        int var3 = this.field887[0];
        int var4 = this.field888[0];
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
        if (this.field864 != -1 && class45.method578(this.field864).field1029 == 1) {
            this.field864 = -1;
        }
        if (this.field850 < 9) {
            this.field850++;
        }
        for (int var5 = this.field850; var5 > 0; var5--) {
            this.field887[var5] = this.field887[var5 - 1];
            this.field888[var5] = this.field888[var5 - 1];
            this.field889[var5] = this.field889[var5 - 1];
        }
        this.field887[0] = var3;
        this.field888[0] = var4;
        this.field889[0] = arg1;
    }

    @ObfuscatedName("ab.g(IIZB)V")
    public final void method749(int arg0, int arg1, boolean arg2) {
        if (this.field864 != -1 && class45.method578(this.field864).field1029 == 1) {
            this.field864 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field887[0];
            int var5 = arg1 - this.field888[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field850 < 9) {
                    this.field850++;
                }
                for (int var6 = this.field850; var6 > 0; var6--) {
                    this.field887[var6] = this.field887[var6 - 1];
                    this.field888[var6] = this.field888[var6 - 1];
                    this.field889[var6] = this.field889[var6 - 1];
                }
                this.field887[0] = arg0;
                this.field888[0] = arg1;
                this.field889[0] = 1;
                return;
            }
        }
        this.field850 = 0;
        this.field840 = 0;
        this.field890 = 0;
        this.field887[0] = arg0;
        this.field888[0] = arg1;
        this.field876 = this.field887[0] * 128 + this.field878 * 64;
        this.field833 = this.field888[0] * 128 + this.field878 * 64;
    }

    @ObfuscatedName("ab.r(I)Ldv;")
    public final class109 method18() {
        if (this.field804 == null) {
            return null;
        }
        class45 var1 = this.field864 != -1 && this.field865 == 0 ? class45.method578(this.field864) : null;
        class45 var2 = this.field861 == -1 || this.field861 == this.field839 && var1 != null ? null : class45.method578(this.field861);
        class109 var3 = this.field804.method793(var1, this.field837, var2, this.field862);
        if (var3 == null) {
            return null;
        }
        var3.method2270();
        this.field838 = var3.field1539;
        if (this.field869 != -1 && this.field891 != -1) {
            class109 var4 = class46.method2351(this.field869).method927(this.field891);
            if (var4 != null) {
                var4.method2280(0, -this.field873, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (this.field804.field914 == 1) {
            var3.field1893 = true;
        }
        return var3;
    }

    @ObfuscatedName("ab.k(B)Z")
    public final boolean method38() {
        return this.field804 != null;
    }
}
