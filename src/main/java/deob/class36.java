package deob;

@ObfuscatedName("ah")
public final class class36 extends class28 {

    @ObfuscatedName("ah.b")
    public class200 field756;

    @ObfuscatedName("ah.b(IBI)V")
    public final void method740(int arg0, byte arg1) {
        int var3 = this.field656[0];
        int var4 = this.field657[0];
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
        if (this.field633 != -1 && class202.method17(this.field633).field3075 == 1) {
            this.field633 = -1;
        }
        if (this.field655 < 9) {
            this.field655++;
        }
        for (int var5 = this.field655; var5 > 0; var5--) {
            this.field656[var5] = this.field656[var5 - 1];
            this.field657[var5] = this.field657[var5 - 1];
            this.field658[var5] = this.field658[var5 - 1];
        }
        this.field656[0] = var3;
        this.field657[0] = var4;
        this.field658[0] = arg1;
    }

    @ObfuscatedName("ah.e(IIZI)V")
    public final void method744(int arg0, int arg1, boolean arg2) {
        if (this.field633 != -1 && class202.method17(this.field633).field3075 == 1) {
            this.field633 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field656[0];
            int var5 = arg1 - this.field657[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field655 < 9) {
                    this.field655++;
                }
                for (int var6 = this.field655; var6 > 0; var6--) {
                    this.field656[var6] = this.field656[var6 - 1];
                    this.field657[var6] = this.field657[var6 - 1];
                    this.field658[var6] = this.field658[var6 - 1];
                }
                this.field656[0] = arg0;
                this.field657[0] = arg1;
                this.field658[0] = 1;
                return;
            }
        }
        this.field655 = 0;
        this.field660 = 0;
        this.field659 = 0;
        this.field656[0] = arg0;
        this.field657[0] = arg1;
        this.field610 = this.field656[0] * 128 + this.field605 * 64;
        this.field609 = this.field657[0] * 128 + this.field605 * 64;
    }

    @ObfuscatedName("ah.c(B)Lco;")
    public final class83 method241() {
        if (this.field756 == null) {
            return null;
        }
        class202 var1 = this.field633 != -1 && this.field636 == 0 ? class202.method17(this.field633) : null;
        class202 var2 = this.field630 == -1 || this.field630 == this.field604 && var1 != null ? null : class202.method17(this.field630);
        class83 var3 = this.field756.method3541(var1, this.field650, var2, this.field615);
        if (var3 == null) {
            return null;
        }
        var3.method1505();
        this.field651 = var3.field1548;
        if (this.field638 != -1 && this.field639 != -1) {
            class83 var4 = class191.method3117(this.field638).method3304(this.field639);
            if (var4 != null) {
                var4.method1513(0, -this.field642, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (this.field756.field3042 == 1) {
            var3.field1397 = true;
        }
        return var3;
    }

    @ObfuscatedName("ah.t(I)Z")
    public final boolean method245() {
        return this.field756 != null;
    }
}
