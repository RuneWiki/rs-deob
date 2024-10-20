package deob;

@ObfuscatedName("aa")
public final class class35 extends class38 {

    @ObfuscatedName("aa.o")
    public class40 field779;

    @ObfuscatedName("aa.o(IBI)V")
    public final void method703(int arg0, byte arg1) {
        int var3 = this.field853[0];
        int var4 = this.field862[0];
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
        if (this.field847 != -1 && class43.method3081(this.field847).field990 == 1) {
            this.field847 = -1;
        }
        if (this.field865 < 9) {
            this.field865++;
        }
        for (int var5 = this.field865; var5 > 0; var5--) {
            this.field853[var5] = this.field853[var5 - 1];
            this.field862[var5] = this.field862[var5 - 1];
            this.field863[var5] = this.field863[var5 - 1];
        }
        this.field853[0] = var3;
        this.field862[0] = var4;
        this.field863[0] = arg1;
    }

    @ObfuscatedName("aa.f(IIZI)V")
    public final void method702(int arg0, int arg1, boolean arg2) {
        if (this.field847 != -1 && class43.method3081(this.field847).field990 == 1) {
            this.field847 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field853[0];
            int var5 = arg1 - this.field862[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field865 < 9) {
                    this.field865++;
                }
                for (int var6 = this.field865; var6 > 0; var6--) {
                    this.field853[var6] = this.field853[var6 - 1];
                    this.field862[var6] = this.field862[var6 - 1];
                    this.field863[var6] = this.field863[var6 - 1];
                }
                this.field853[0] = arg0;
                this.field862[0] = arg1;
                this.field863[0] = 1;
                return;
            }
        }
        this.field865 = 0;
        this.field832 = 0;
        this.field864 = 0;
        this.field853[0] = arg0;
        this.field862[0] = arg1;
        this.field854 = this.field853[0] * 128 + this.field811 * 64;
        this.field808 = this.field862[0] * 128 + this.field811 * 64;
    }

    @ObfuscatedName("aa.i(B)Ldm;")
    public final class105 method21() {
        if (this.field779 == null) {
            return null;
        }
        class43 var1 = this.field847 != -1 && this.field841 == 0 ? class43.method3081(this.field847) : null;
        class43 var2 = this.field848 == -1 || this.field848 == this.field812 && var1 != null ? null : class43.method3081(this.field848);
        class105 var3 = this.field779.method738(var1, this.field860, var2, this.field836);
        if (var3 == null) {
            return null;
        }
        var3.method2093();
        this.field856 = var3.field1441;
        if (this.field843 != -1 && this.field835 != -1) {
            class105 var4 = class44.method1455(this.field843).method847(this.field835);
            if (var4 != null) {
                var4.method2102(0, -this.field813, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field779.field881 == 1) {
            var3.field1815 = true;
        }
        return var3;
    }

    @ObfuscatedName("aa.m(B)Z")
    public final boolean method22() {
        return this.field779 != null;
    }
}
