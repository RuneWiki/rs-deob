package deob;

@ObfuscatedName("am")
public final class class36 extends class28 {

    @ObfuscatedName("am.n")
    public class200 field757;

    @ObfuscatedName("am.n(IBS)V")
    public final void method725(int arg0, byte arg1) {
        int var3 = this.field629[0];
        int var4 = this.field652[0];
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
        if (this.field628 != -1 && class202.method119(this.field628).field3063 == 1) {
            this.field628 = -1;
        }
        if (this.field650 < 9) {
            this.field650++;
        }
        for (int var5 = this.field650; var5 > 0; var5--) {
            this.field629[var5] = this.field629[var5 - 1];
            this.field652[var5] = this.field652[var5 - 1];
            this.field626[var5] = this.field626[var5 - 1];
        }
        this.field629[0] = var3;
        this.field652[0] = var4;
        this.field626[0] = arg1;
    }

    @ObfuscatedName("am.d(IIZB)V")
    public final void method727(int arg0, int arg1, boolean arg2) {
        if (this.field628 != -1 && class202.method119(this.field628).field3063 == 1) {
            this.field628 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field629[0];
            int var5 = arg1 - this.field652[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field650 < 9) {
                    this.field650++;
                }
                for (int var6 = this.field650; var6 > 0; var6--) {
                    this.field629[var6] = this.field629[var6 - 1];
                    this.field652[var6] = this.field652[var6 - 1];
                    this.field626[var6] = this.field626[var6 - 1];
                }
                this.field629[0] = arg0;
                this.field652[0] = arg1;
                this.field626[0] = 1;
                return;
            }
        }
        this.field650 = 0;
        this.field655 = 0;
        this.field635 = 0;
        this.field629[0] = arg0;
        this.field652[0] = arg1;
        this.field648 = this.field629[0] * 128 + this.field600 * 64;
        this.field597 = this.field652[0] * 128 + this.field600 * 64;
    }

    @ObfuscatedName("am.m(I)Lca;")
    public final class83 method233() {
        if (this.field757 == null) {
            return null;
        }
        class202 var1 = this.field628 != -1 && this.field646 == 0 ? class202.method119(this.field628) : null;
        class202 var2 = this.field625 == -1 || this.field625 == this.field601 && var1 != null ? null : class202.method119(this.field625);
        class83 var3 = this.field757.method3512(var1, this.field621, var2, this.field654);
        if (var3 == null) {
            return null;
        }
        var3.method1494();
        this.field622 = var3.field1535;
        if (this.field633 != -1 && this.field634 != -1) {
            class83 var4 = class191.method3085(this.field633).method3266(this.field634);
            if (var4 != null) {
                var4.method1498(0, -this.field637, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (this.field757.field3010 == 1) {
            var3.field1400 = true;
        }
        return var3;
    }

    @ObfuscatedName("am.c(I)Z")
    public final boolean method237() {
        return this.field757 != null;
    }
}
