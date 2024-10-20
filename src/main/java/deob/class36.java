package deob;

@ObfuscatedName("ae")
public final class class36 extends class28 {

    @ObfuscatedName("ae.d")
    public class205 field762;

    @ObfuscatedName("ae.d(IBB)V")
    public final void method729(int arg0, byte arg1) {
        int var3 = this.field662[0];
        int var4 = this.field656[0];
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
        if (this.field627 != -1 && class207.method3621(this.field627).field3102 == 1) {
            this.field627 = -1;
        }
        if (this.field654 < 9) {
            this.field654++;
        }
        for (int var5 = this.field654; var5 > 0; var5--) {
            this.field662[var5] = this.field662[var5 - 1];
            this.field656[var5] = this.field656[var5 - 1];
            this.field619[var5] = this.field619[var5 - 1];
        }
        this.field662[0] = var3;
        this.field656[0] = var4;
        this.field619[0] = arg1;
    }

    @ObfuscatedName("ae.c(IIZI)V")
    public final void method728(int arg0, int arg1, boolean arg2) {
        if (this.field627 != -1 && class207.method3621(this.field627).field3102 == 1) {
            this.field627 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field662[0];
            int var5 = arg1 - this.field656[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field654 < 9) {
                    this.field654++;
                }
                for (int var6 = this.field654; var6 > 0; var6--) {
                    this.field662[var6] = this.field662[var6 - 1];
                    this.field656[var6] = this.field656[var6 - 1];
                    this.field619[var6] = this.field619[var6 - 1];
                }
                this.field662[0] = arg0;
                this.field656[0] = arg1;
                this.field619[0] = 1;
                return;
            }
        }
        this.field654 = 0;
        this.field659 = 0;
        this.field658 = 0;
        this.field662[0] = arg0;
        this.field656[0] = arg1;
        this.field629 = this.field662[0] * 128 + this.field604 * 64;
        this.field601 = this.field656[0] * 128 + this.field604 * 64;
    }

    @ObfuscatedName("ae.n(B)Lcf;")
    public final class83 method230() {
        if (this.field762 == null) {
            return null;
        }
        class207 var1 = this.field627 != -1 && this.field635 == 0 ? class207.method3621(this.field627) : null;
        class207 var2 = this.field625 == -1 || this.field625 == this.field605 && var1 != null ? null : class207.method3621(this.field625);
        class83 var3 = this.field762.method3600(var1, this.field633, var2, this.field621);
        if (var3 == null) {
            return null;
        }
        var3.method1489();
        this.field608 = var3.field1532;
        if (this.field637 != -1 && this.field638 != -1) {
            class83 var4 = class193.method3249(this.field637).method3265(this.field638);
            if (var4 != null) {
                var4.method1499(0, -this.field623, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (this.field762.field3043 == 1) {
            var3.field1371 = true;
        }
        return var3;
    }

    @ObfuscatedName("ae.u(I)Z")
    public final boolean method233() {
        return this.field762 != null;
    }
}
