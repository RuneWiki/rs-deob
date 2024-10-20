package deob;

@ObfuscatedName("av")
public final class class36 extends class28 {

    @ObfuscatedName("av.i")
    public class200 field765;

    @ObfuscatedName("av.i(IBI)V")
    public final void method675(int arg0, byte arg1) {
        int var3 = this.field632[0];
        int var4 = this.field655[0];
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
        if (this.field631 != -1 && class202.method2010(this.field631).field3065 == 1) {
            this.field631 = -1;
        }
        if (this.field653 < 9) {
            this.field653++;
        }
        for (int var5 = this.field653; var5 > 0; var5--) {
            this.field632[var5] = this.field632[var5 - 1];
            this.field655[var5] = this.field655[var5 - 1];
            this.field656[var5] = this.field656[var5 - 1];
        }
        this.field632[0] = var3;
        this.field655[0] = var4;
        this.field656[0] = arg1;
    }

    @ObfuscatedName("av.e(IIZI)V")
    public final void method671(int arg0, int arg1, boolean arg2) {
        if (this.field631 != -1 && class202.method2010(this.field631).field3065 == 1) {
            this.field631 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field632[0];
            int var5 = arg1 - this.field655[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field653 < 9) {
                    this.field653++;
                }
                for (int var6 = this.field653; var6 > 0; var6--) {
                    this.field632[var6] = this.field632[var6 - 1];
                    this.field655[var6] = this.field655[var6 - 1];
                    this.field656[var6] = this.field656[var6 - 1];
                }
                this.field632[0] = arg0;
                this.field655[0] = arg1;
                this.field656[0] = 1;
                return;
            }
        }
        this.field653 = 0;
        this.field608 = 0;
        this.field604 = 0;
        this.field632[0] = arg0;
        this.field655[0] = arg1;
        this.field629 = this.field632[0] * 128 + this.field641 * 64;
        this.field600 = this.field655[0] * 128 + this.field641 * 64;
    }

    @ObfuscatedName("av.f(B)Lch;")
    public final class83 method227() {
        if (this.field765 == null) {
            return null;
        }
        class202 var1 = this.field631 != -1 && this.field634 == 0 ? class202.method2010(this.field631) : null;
        class202 var2 = this.field628 == -1 || this.field628 == this.field599 && var1 != null ? null : class202.method2010(this.field628);
        class83 var3 = this.field765.method3428(var1, this.field611, var2, this.field609);
        if (var3 == null) {
            return null;
        }
        var3.method1468();
        this.field602 = var3.field1540;
        if (this.field635 != -1 && this.field637 != -1) {
            class83 var4 = class191.method194(this.field635).method3208(this.field637);
            if (var4 != null) {
                var4.method1476(0, -this.field640, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (this.field765.field3013 == 1) {
            var3.field1382 = true;
        }
        return var3;
    }

    @ObfuscatedName("av.w(I)Z")
    public final boolean method215() {
        return this.field765 != null;
    }
}
