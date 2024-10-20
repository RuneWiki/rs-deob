package deob;

@ObfuscatedName("as")
public final class class36 extends class28 {

    @ObfuscatedName("as.q")
    public class200 field789;

    @ObfuscatedName("as.q(IBI)V")
    public final void method798(int arg0, byte arg1) {
        int var3 = this.field679[0];
        int var4 = this.field629[0];
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
        if (this.field656 != -1 && class202.method3379(this.field656).field3069 == 1) {
            this.field656 = -1;
        }
        if (this.field674 < 9) {
            this.field674++;
        }
        for (int var5 = this.field674; var5 > 0; var5--) {
            this.field679[var5] = this.field679[var5 - 1];
            this.field629[var5] = this.field629[var5 - 1];
            this.field681[var5] = this.field681[var5 - 1];
        }
        this.field679[0] = var3;
        this.field629[0] = var4;
        this.field681[0] = arg1;
    }

    @ObfuscatedName("as.d(IIZS)V")
    public final void method795(int arg0, int arg1, boolean arg2) {
        if (this.field656 != -1 && class202.method3379(this.field656).field3069 == 1) {
            this.field656 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field679[0];
            int var5 = arg1 - this.field629[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field674 < 9) {
                    this.field674++;
                }
                for (int var6 = this.field674; var6 > 0; var6--) {
                    this.field679[var6] = this.field679[var6 - 1];
                    this.field629[var6] = this.field629[var6 - 1];
                    this.field681[var6] = this.field681[var6 - 1];
                }
                this.field679[0] = arg0;
                this.field629[0] = arg1;
                this.field681[0] = 1;
                return;
            }
        }
        this.field674 = 0;
        this.field683 = 0;
        this.field682 = 0;
        this.field679[0] = arg0;
        this.field629[0] = arg1;
        this.field638 = this.field679[0] * 128 + this.field658 * 64;
        this.field625 = this.field629[0] * 128 + this.field658 * 64;
    }

    @ObfuscatedName("as.h(I)Lcf;")
    public final class83 method229() {
        if (this.field789 == null) {
            return null;
        }
        class202 var1 = this.field656 != -1 && this.field637 == 0 ? class202.method3379(this.field656) : null;
        class202 var2 = this.field633 == -1 || this.field660 == this.field633 && var1 != null ? null : class202.method3379(this.field633);
        class83 var3 = this.field789.method3548(var1, this.field657, var2, this.field654);
        if (var3 == null) {
            return null;
        }
        var3.method1582();
        this.field630 = var3.field1558;
        if (this.field659 != -1 && this.field662 != -1) {
            class83 var4 = class191.method1883(this.field659).method3279(this.field662);
            if (var4 != null) {
                var4.method1562(0, -this.field665, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (this.field789.field3011 == 1) {
            var3.field1403 = true;
        }
        return var3;
    }

    @ObfuscatedName("as.c(I)Z")
    public final boolean method233() {
        return this.field789 != null;
    }
}
