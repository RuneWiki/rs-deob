package deob;

@ObfuscatedName("at")
public final class class37 extends class40 {

    @ObfuscatedName("at.f")
    public class42 field787;

    @ObfuscatedName("at.f(IBI)V")
    public final void method728(int arg0, byte arg1) {
        int var3 = this.field872[0];
        int var4 = this.field837[0];
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
        if (this.field849 != -1 && class45.method1289(this.field849).field998 == 1) {
            this.field849 = -1;
        }
        if (this.field868 < 9) {
            this.field868++;
        }
        for (int var5 = this.field868; var5 > 0; var5--) {
            this.field872[var5] = this.field872[var5 - 1];
            this.field837[var5] = this.field837[var5 - 1];
            this.field858[var5] = this.field858[var5 - 1];
        }
        this.field872[0] = var3;
        this.field837[0] = var4;
        this.field858[0] = arg1;
    }

    @ObfuscatedName("at.e(IIZI)V")
    public final void method729(int arg0, int arg1, boolean arg2) {
        if (this.field849 != -1 && class45.method1289(this.field849).field998 == 1) {
            this.field849 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field872[0];
            int var5 = arg1 - this.field837[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field868 < 9) {
                    this.field868++;
                }
                for (int var6 = this.field868; var6 > 0; var6--) {
                    this.field872[var6] = this.field872[var6 - 1];
                    this.field837[var6] = this.field837[var6 - 1];
                    this.field858[var6] = this.field858[var6 - 1];
                }
                this.field872[0] = arg0;
                this.field837[0] = arg1;
                this.field858[0] = 1;
                return;
            }
        }
        this.field868 = 0;
        this.field876 = 0;
        this.field873 = 0;
        this.field872[0] = arg0;
        this.field837[0] = arg1;
        this.field864 = this.field872[0] * 128 + this.field843 * 64;
        this.field818 = this.field837[0] * 128 + this.field843 * 64;
    }

    @ObfuscatedName("at.n(B)Ldg;")
    public final class109 method36() {
        if (this.field787 == null) {
            return null;
        }
        class45 var1 = this.field849 != -1 && this.field852 == 0 ? class45.method1289(this.field849) : null;
        class45 var2 = this.field857 == -1 || this.field857 == this.field822 && var1 != null ? null : class45.method1289(this.field857);
        class109 var3 = this.field787.method776(var1, this.field850, var2, this.field855);
        if (var3 == null) {
            return null;
        }
        var3.method2251();
        this.field840 = var3.field1518;
        if (this.field854 != -1 && this.field836 != -1) {
            class109 var4 = class46.method2917(this.field854).method901(this.field836);
            if (var4 != null) {
                var4.method2215(0, -this.field861, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (this.field787.field895 == 1) {
            var3.field1916 = true;
        }
        return var3;
    }

    @ObfuscatedName("at.m(I)Z")
    public final boolean method25() {
        return this.field787 != null;
    }
}
