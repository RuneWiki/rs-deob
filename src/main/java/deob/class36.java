package deob;

@ObfuscatedName("ab")
public final class class36 extends class28 {

    @ObfuscatedName("ab.o")
    public class200 field772;

    @ObfuscatedName("ab.o(IBB)V")
    public final void method687(int arg0, byte arg1) {
        int var3 = this.field660[0];
        int var4 = this.field661[0];
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
        if (this.field637 != -1 && class202.method658(this.field637).field3063 == 1) {
            this.field637 = -1;
        }
        if (this.field657 < 9) {
            this.field657++;
        }
        for (int var5 = this.field657; var5 > 0; var5--) {
            this.field660[var5] = this.field660[var5 - 1];
            this.field661[var5] = this.field661[var5 - 1];
            this.field662[var5] = this.field662[var5 - 1];
        }
        this.field660[0] = var3;
        this.field661[0] = var4;
        this.field662[0] = arg1;
    }

    @ObfuscatedName("ab.m(IIZB)V")
    public final void method689(int arg0, int arg1, boolean arg2) {
        if (this.field637 != -1 && class202.method658(this.field637).field3063 == 1) {
            this.field637 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field660[0];
            int var5 = arg1 - this.field661[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field657 < 9) {
                    this.field657++;
                }
                for (int var6 = this.field657; var6 > 0; var6--) {
                    this.field660[var6] = this.field660[var6 - 1];
                    this.field661[var6] = this.field661[var6 - 1];
                    this.field662[var6] = this.field662[var6 - 1];
                }
                this.field660[0] = arg0;
                this.field661[0] = arg1;
                this.field662[0] = 1;
                return;
            }
        }
        this.field657 = 0;
        this.field664 = 0;
        this.field663 = 0;
        this.field660[0] = arg0;
        this.field661[0] = arg1;
        this.field608 = this.field660[0] * 128 + this.field613 * 64;
        this.field605 = this.field661[0] * 128 + this.field613 * 64;
    }

    @ObfuscatedName("ab.b(B)Lcy;")
    public final class83 method212() {
        if (this.field772 == null) {
            return null;
        }
        class202 var1 = this.field637 != -1 && this.field646 == 0 ? class202.method658(this.field637) : null;
        class202 var2 = this.field634 == -1 || this.field644 == this.field634 && var1 != null ? null : class202.method658(this.field634);
        class83 var3 = this.field772.method3420(var1, this.field638, var2, this.field631);
        if (var3 == null) {
            return null;
        }
        var3.method1445();
        this.field635 = var3.field1534;
        if (this.field642 != -1 && this.field643 != -1) {
            class83 var4 = class191.method3446(this.field642).method3188(this.field643);
            if (var4 != null) {
                var4.method1460(0, -this.field655, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (this.field772.field3000 == 1) {
            var3.field1358 = true;
        }
        return var3;
    }

    @ObfuscatedName("ab.u(I)Z")
    public final boolean method216() {
        return this.field772 != null;
    }
}
