package deob;

@ObfuscatedName("ar")
public final class class35 extends class38 {

    @ObfuscatedName("ar.j")
    public class40 field780;

    @ObfuscatedName("ar.j(IBI)V")
    public final void method718(int arg0, byte arg1) {
        int var3 = this.field865[0];
        int var4 = this.field818[0];
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
        if (this.field821 != -1 && class43.method729(this.field821).field999 == 1) {
            this.field821 = -1;
        }
        if (this.field825 < 9) {
            this.field825++;
        }
        for (int var5 = this.field825; var5 > 0; var5--) {
            this.field865[var5] = this.field865[var5 - 1];
            this.field818[var5] = this.field818[var5 - 1];
            this.field867[var5] = this.field867[var5 - 1];
        }
        this.field865[0] = var3;
        this.field818[0] = var4;
        this.field867[0] = arg1;
    }

    @ObfuscatedName("ar.l(IIZI)V")
    public final void method722(int arg0, int arg1, boolean arg2) {
        if (this.field821 != -1 && class43.method729(this.field821).field999 == 1) {
            this.field821 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field865[0];
            int var5 = arg1 - this.field818[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field825 < 9) {
                    this.field825++;
                }
                for (int var6 = this.field825; var6 > 0; var6--) {
                    this.field865[var6] = this.field865[var6 - 1];
                    this.field818[var6] = this.field818[var6 - 1];
                    this.field867[var6] = this.field867[var6 - 1];
                }
                this.field865[0] = arg0;
                this.field818[0] = arg1;
                this.field867[0] = 1;
                return;
            }
        }
        this.field825 = 0;
        this.field869 = 0;
        this.field868 = 0;
        this.field865[0] = arg0;
        this.field818[0] = arg1;
        this.field840 = this.field865[0] * 128 + this.field815 * 64;
        this.field849 = this.field818[0] * 128 + this.field815 * 64;
    }

    @ObfuscatedName("ar.a(I)Ldd;")
    public final class105 method14() {
        if (this.field780 == null) {
            return null;
        }
        class43 var1 = this.field821 != -1 && this.field845 == 0 ? class43.method729(this.field821) : null;
        class43 var2 = this.field839 == -1 || this.field839 == this.field816 && var1 != null ? null : class43.method729(this.field839);
        class105 var3 = this.field780.method754(var1, this.field828, var2, this.field830);
        if (var3 == null) {
            return null;
        }
        var3.method2133();
        this.field844 = var3.field1462;
        if (this.field847 != -1 && this.field848 != -1) {
            class105 var4 = class44.method632(this.field847).method884(this.field848);
            if (var4 != null) {
                var4.method2142(0, -this.field851, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field780.field886 == 1) {
            var3.field1830 = true;
        }
        return var3;
    }

    @ObfuscatedName("ar.o(I)Z")
    public final boolean method18() {
        return this.field780 != null;
    }
}
