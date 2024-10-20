package deob;

@ObfuscatedName("al")
public final class class35 extends class38 {

    @ObfuscatedName("al.v")
    public class40 field782;

    @ObfuscatedName("al.v(IBI)V")
    public final void method714(int arg0, byte arg1) {
        int var3 = this.field862[0];
        int var4 = this.field856[0];
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
        if (this.field839 != -1 && class43.method616(this.field839).field983 == 1) {
            this.field839 = -1;
        }
        if (this.field842 < 9) {
            this.field842++;
        }
        for (int var5 = this.field842; var5 > 0; var5--) {
            this.field862[var5] = this.field862[var5 - 1];
            this.field856[var5] = this.field856[var5 - 1];
            this.field864[var5] = this.field864[var5 - 1];
        }
        this.field862[0] = var3;
        this.field856[0] = var4;
        this.field864[0] = arg1;
    }

    @ObfuscatedName("al.f(IIZI)V")
    public final void method715(int arg0, int arg1, boolean arg2) {
        if (this.field839 != -1 && class43.method616(this.field839).field983 == 1) {
            this.field839 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field862[0];
            int var5 = arg1 - this.field856[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field842 < 9) {
                    this.field842++;
                }
                for (int var6 = this.field842; var6 > 0; var6--) {
                    this.field862[var6] = this.field862[var6 - 1];
                    this.field856[var6] = this.field856[var6 - 1];
                    this.field864[var6] = this.field864[var6 - 1];
                }
                this.field862[0] = arg0;
                this.field856[0] = arg1;
                this.field864[0] = 1;
                return;
            }
        }
        this.field842 = 0;
        this.field853 = 0;
        this.field837 = 0;
        this.field862[0] = arg0;
        this.field856[0] = arg1;
        this.field863 = this.field862[0] * 128 + this.field812 * 64;
        this.field819 = this.field856[0] * 128 + this.field812 * 64;
    }

    @ObfuscatedName("al.i(I)Ldq;")
    public final class105 method9() {
        if (this.field782 == null) {
            return null;
        }
        class43 var1 = this.field839 != -1 && this.field809 == 0 ? class43.method616(this.field839) : null;
        class43 var2 = this.field836 == -1 || this.field836 == this.field813 && var1 != null ? null : class43.method616(this.field836);
        class105 var3 = this.field782.method749(var1, this.field840, var2, this.field816);
        if (var3 == null) {
            return null;
        }
        var3.method2159();
        this.field857 = var3.field1443;
        if (this.field844 != -1 && this.field845 != -1) {
            class105 var4 = class44.method1502(this.field844).method874(this.field845);
            if (var4 != null) {
                var4.method2169(0, -this.field848, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field782.field883 == 1) {
            var3.field1796 = true;
        }
        return var3;
    }

    @ObfuscatedName("al.p(I)Z")
    public final boolean method13() {
        return this.field782 != null;
    }
}
