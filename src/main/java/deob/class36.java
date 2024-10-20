package deob;

@ObfuscatedName("am")
public final class class36 extends class28 {

    @ObfuscatedName("am.b")
    public class200 field759;

    @ObfuscatedName("am.b(IBS)V")
    public final void method773(int arg0, byte arg1) {
        int var3 = this.field657[0];
        int var4 = this.field641[0];
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
        if (this.field605 != -1 && class202.method262(this.field605).field3075 == 1) {
            this.field605 = -1;
        }
        if (this.field656 < 9) {
            this.field656++;
        }
        for (int var5 = this.field656; var5 > 0; var5--) {
            this.field657[var5] = this.field657[var5 - 1];
            this.field641[var5] = this.field641[var5 - 1];
            this.field659[var5] = this.field659[var5 - 1];
        }
        this.field657[0] = var3;
        this.field641[0] = var4;
        this.field659[0] = arg1;
    }

    @ObfuscatedName("am.l(IIZI)V")
    public final void method771(int arg0, int arg1, boolean arg2) {
        if (this.field605 != -1 && class202.method262(this.field605).field3075 == 1) {
            this.field605 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field657[0];
            int var5 = arg1 - this.field641[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field656 < 9) {
                    this.field656++;
                }
                for (int var6 = this.field656; var6 > 0; var6--) {
                    this.field657[var6] = this.field657[var6 - 1];
                    this.field641[var6] = this.field641[var6 - 1];
                    this.field659[var6] = this.field659[var6 - 1];
                }
                this.field657[0] = arg0;
                this.field641[0] = arg1;
                this.field659[0] = 1;
                return;
            }
        }
        this.field656 = 0;
        this.field661 = 0;
        this.field602 = 0;
        this.field657[0] = arg0;
        this.field641[0] = arg1;
        this.field658 = this.field657[0] * 128 + this.field635 * 64;
        this.field632 = this.field641[0] * 128 + this.field635 * 64;
    }

    @ObfuscatedName("am.i(B)Lcs;")
    public final class83 method226() {
        if (this.field759 == null) {
            return null;
        }
        class202 var1 = this.field605 != -1 && this.field637 == 0 ? class202.method262(this.field605) : null;
        class202 var2 = this.field631 == -1 || this.field631 == this.field606 && var1 != null ? null : class202.method262(this.field631);
        class83 var3 = this.field759.method3600(var1, this.field619, var2, this.field654);
        if (var3 == null) {
            return null;
        }
        var3.method1607();
        this.field610 = var3.field1530;
        if (this.field639 != -1 && this.field640 != -1) {
            class83 var4 = class191.method2966(this.field639).method3334(this.field640);
            if (var4 != null) {
                var4.method1547(0, -this.field643, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (this.field759.field3013 == 1) {
            var3.field1361 = true;
        }
        return var3;
    }

    @ObfuscatedName("am.z(I)Z")
    public final boolean method230() {
        return this.field759 != null;
    }
}
