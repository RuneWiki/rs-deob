package deob;

@ObfuscatedName("ae")
public final class class36 extends class28 {

    @ObfuscatedName("ae.x")
    public class200 field795;

    @ObfuscatedName("ae.x(IBI)V")
    public final void method772(int arg0, byte arg1) {
        int var3 = this.field681[0];
        int var4 = this.field632[0];
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
        if (this.field658 != -1 && class202.method2997(this.field658).field3071 == 1) {
            this.field658 = -1;
        }
        if (this.field680 < 9) {
            this.field680++;
        }
        for (int var5 = this.field680; var5 > 0; var5--) {
            this.field681[var5] = this.field681[var5 - 1];
            this.field632[var5] = this.field632[var5 - 1];
            this.field683[var5] = this.field683[var5 - 1];
        }
        this.field681[0] = var3;
        this.field632[0] = var4;
        this.field683[0] = arg1;
    }

    @ObfuscatedName("ae.j(IIZI)V")
    public final void method774(int arg0, int arg1, boolean arg2) {
        if (this.field658 != -1 && class202.method2997(this.field658).field3071 == 1) {
            this.field658 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field681[0];
            int var5 = arg1 - this.field632[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field680 < 9) {
                    this.field680++;
                }
                for (int var6 = this.field680; var6 > 0; var6--) {
                    this.field681[var6] = this.field681[var6 - 1];
                    this.field632[var6] = this.field632[var6 - 1];
                    this.field683[var6] = this.field683[var6 - 1];
                }
                this.field681[0] = arg0;
                this.field632[0] = arg1;
                this.field683[0] = 1;
                return;
            }
        }
        this.field680 = 0;
        this.field637 = 0;
        this.field684 = 0;
        this.field681[0] = arg0;
        this.field632[0] = arg1;
        this.field675 = this.field681[0] * 128 + this.field673 * 64;
        this.field627 = this.field632[0] * 128 + this.field673 * 64;
    }

    @ObfuscatedName("ae.c(S)Lcj;")
    public final class83 method247() {
        if (this.field795 == null) {
            return null;
        }
        class202 var1 = this.field658 != -1 && this.field661 == 0 ? class202.method2997(this.field658) : null;
        class202 var2 = this.field626 == -1 || this.field631 == this.field626 && var1 != null ? null : class202.method2997(this.field626);
        class83 var3 = this.field795.method3495(var1, this.field659, var2, this.field656);
        if (var3 == null) {
            return null;
        }
        var3.method1532();
        this.field655 = var3.field1556;
        if (this.field634 != -1 && this.field663 != -1) {
            class83 var4 = class191.method3043(this.field634).method3261(this.field663);
            if (var4 != null) {
                var4.method1545(0, -this.field667, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (this.field795.field3009 == 1) {
            var3.field1391 = true;
        }
        return var3;
    }

    @ObfuscatedName("ae.y(B)Z")
    public final boolean method251() {
        return this.field795 != null;
    }
}
