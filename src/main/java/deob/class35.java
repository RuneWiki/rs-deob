package deob;

@ObfuscatedName("ai")
public final class class35 extends class38 {

    @ObfuscatedName("ai.t")
    public class40 field773;

    @ObfuscatedName("ai.t(IBB)V")
    public final void method688(int arg0, byte arg1) {
        int var3 = this.field848[0];
        int var4 = this.field840[0];
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
        if (this.field835 != -1 && class43.method168(this.field835).field993 == 1) {
            this.field835 = -1;
        }
        if (this.field857 < 9) {
            this.field857++;
        }
        for (int var5 = this.field857; var5 > 0; var5--) {
            this.field848[var5] = this.field848[var5 - 1];
            this.field840[var5] = this.field840[var5 - 1];
            this.field860[var5] = this.field860[var5 - 1];
        }
        this.field848[0] = var3;
        this.field840[0] = var4;
        this.field860[0] = arg1;
    }

    @ObfuscatedName("ai.i(IIZI)V")
    public final void method685(int arg0, int arg1, boolean arg2) {
        if (this.field835 != -1 && class43.method168(this.field835).field993 == 1) {
            this.field835 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field848[0];
            int var5 = arg1 - this.field840[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field857 < 9) {
                    this.field857++;
                }
                for (int var6 = this.field857; var6 > 0; var6--) {
                    this.field848[var6] = this.field848[var6 - 1];
                    this.field840[var6] = this.field840[var6 - 1];
                    this.field860[var6] = this.field860[var6 - 1];
                }
                this.field848[0] = arg0;
                this.field840[0] = arg1;
                this.field860[0] = 1;
                return;
            }
        }
        this.field857 = 0;
        this.field862 = 0;
        this.field861 = 0;
        this.field848[0] = arg0;
        this.field840[0] = arg1;
        this.field810 = this.field848[0] * 128 + this.field808 * 64;
        this.field805 = this.field840[0] * 128 + this.field808 * 64;
    }

    @ObfuscatedName("ai.g(I)Ldk;")
    public final class106 method11() {
        if (this.field773 == null) {
            return null;
        }
        class43 var1 = this.field835 != -1 && this.field825 == 0 ? class43.method168(this.field835) : null;
        class43 var2 = this.field828 == -1 || this.field828 == this.field809 && var1 != null ? null : class43.method168(this.field828);
        class106 var3 = this.field773.method714(var1, this.field820, var2, this.field833);
        if (var3 == null) {
            return null;
        }
        var3.method2107();
        this.field853 = var3.field1467;
        if (this.field837 != -1 && this.field841 != -1) {
            class106 var4 = class44.method153(this.field837).method851(this.field841);
            if (var4 != null) {
                var4.method2116(0, -this.field804, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (this.field773.field882 == 1) {
            var3.field1807 = true;
        }
        return var3;
    }

    @ObfuscatedName("ai.f(I)Z")
    public final boolean method25() {
        return this.field773 != null;
    }
}
