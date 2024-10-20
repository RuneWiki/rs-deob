package deob;

@ObfuscatedName("av")
public final class class36 extends class28 {

    @ObfuscatedName("av.u")
    public class200 field761;

    @ObfuscatedName("av.u(IBI)V")
    public final void method716(int arg0, byte arg1) {
        int var3 = this.field655[0];
        int var4 = this.field610[0];
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
        if (this.field632 != -1 && class202.method3327(this.field632).field3040 == 1) {
            this.field632 = -1;
        }
        if (this.field654 < 9) {
            this.field654++;
        }
        for (int var5 = this.field654; var5 > 0; var5--) {
            this.field655[var5] = this.field655[var5 - 1];
            this.field610[var5] = this.field610[var5 - 1];
            this.field657[var5] = this.field657[var5 - 1];
        }
        this.field655[0] = var3;
        this.field610[0] = var4;
        this.field657[0] = arg1;
    }

    @ObfuscatedName("av.x(IIZS)V")
    public final void method711(int arg0, int arg1, boolean arg2) {
        if (this.field632 != -1 && class202.method3327(this.field632).field3040 == 1) {
            this.field632 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field655[0];
            int var5 = arg1 - this.field610[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field654 < 9) {
                    this.field654++;
                }
                for (int var6 = this.field654; var6 > 0; var6--) {
                    this.field655[var6] = this.field655[var6 - 1];
                    this.field610[var6] = this.field610[var6 - 1];
                    this.field657[var6] = this.field657[var6 - 1];
                }
                this.field655[0] = arg0;
                this.field610[0] = arg1;
                this.field657[0] = 1;
                return;
            }
        }
        this.field654 = 0;
        this.field659 = 0;
        this.field658 = 0;
        this.field655[0] = arg0;
        this.field610[0] = arg1;
        this.field612 = this.field655[0] * 128 + this.field604 * 64;
        this.field601 = this.field610[0] * 128 + this.field604 * 64;
    }

    @ObfuscatedName("av.i(B)Lcs;")
    public final class83 method217() {
        if (this.field761 == null) {
            return null;
        }
        class202 var1 = this.field632 != -1 && this.field653 == 0 ? class202.method3327(this.field632) : null;
        class202 var2 = this.field629 == -1 || this.field629 == this.field605 && var1 != null ? null : class202.method3327(this.field629);
        class83 var3 = this.field761.method3494(var1, this.field633, var2, this.field630);
        if (var3 == null) {
            return null;
        }
        var3.method1462();
        this.field650 = var3.field1541;
        if (this.field637 != -1 && this.field635 != -1) {
            class83 var4 = class191.method3182(this.field637).method3239(this.field635);
            if (var4 != null) {
                var4.method1480(0, -this.field641, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (this.field761.field3008 == 1) {
            var3.field1382 = true;
        }
        return var3;
    }

    @ObfuscatedName("av.z(I)Z")
    public final boolean method221() {
        return this.field761 != null;
    }
}
