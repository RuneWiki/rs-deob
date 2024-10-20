package deob;

@ObfuscatedName("as")
public final class class36 extends class28 {

    @ObfuscatedName("as.x")
    public class200 field765;

    @ObfuscatedName("as.x(IBI)V")
    public final void method786(int arg0, byte arg1) {
        int var3 = this.field659[0];
        int var4 = this.field660[0];
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
        if (this.field641 != -1 && Statics.method1464(this.field641).field3075 == 1) {
            this.field641 = -1;
        }
        if (this.field658 < 9) {
            this.field658++;
        }
        for (int var5 = this.field658; var5 > 0; var5--) {
            this.field659[var5] = this.field659[var5 - 1];
            this.field660[var5] = this.field660[var5 - 1];
            this.field610[var5] = this.field610[var5 - 1];
        }
        this.field659[0] = var3;
        this.field660[0] = var4;
        this.field610[0] = arg1;
    }

    @ObfuscatedName("as.n(IIZB)V")
    public final void method787(int arg0, int arg1, boolean arg2) {
        if (this.field641 != -1 && Statics.method1464(this.field641).field3075 == 1) {
            this.field641 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field659[0];
            int var5 = arg1 - this.field660[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field658 < 9) {
                    this.field658++;
                }
                for (int var6 = this.field658; var6 > 0; var6--) {
                    this.field659[var6] = this.field659[var6 - 1];
                    this.field660[var6] = this.field660[var6 - 1];
                    this.field610[var6] = this.field610[var6 - 1];
                }
                this.field659[0] = arg0;
                this.field660[0] = arg1;
                this.field610[0] = 1;
                return;
            }
        }
        this.field658 = 0;
        this.field663 = 0;
        this.field662 = 0;
        this.field659[0] = arg0;
        this.field660[0] = arg1;
        this.field636 = this.field659[0] * 128 + this.field608 * 64;
        this.field605 = this.field660[0] * 128 + this.field608 * 64;
    }

    @ObfuscatedName("as.g(B)Lcj;")
    public final class83 method240() {
        if (this.field765 == null) {
            return null;
        }
        class202 var1 = this.field641 != -1 && this.field639 == 0 ? Statics.method1464(this.field641) : null;
        class202 var2 = this.field650 == -1 || this.field650 == this.field609 && var1 != null ? null : Statics.method1464(this.field650);
        class83 var3 = this.field765.method3568(var1, this.field637, var2, this.field634);
        if (var3 == null) {
            return null;
        }
        var3.method1571();
        this.field654 = var3.field1551;
        if (this.field653 != -1 && this.field649 != -1) {
            class83 var4 = class191.method2936(this.field653).method3326(this.field649);
            if (var4 != null) {
                var4.method1616(0, -this.field617, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (this.field765.field3041 == 1) {
            var3.field1389 = true;
        }
        return var3;
    }

    @ObfuscatedName("as.j(I)Z")
    public final boolean method250() {
        return this.field765 != null;
    }
}
