package deob;

@ObfuscatedName("am")
public final class class36 extends class28 {

    @ObfuscatedName("am.k")
    public class200 field764;

    @ObfuscatedName("am.k(IBI)V")
    public final void method727(int arg0, byte arg1) {
        int var3 = this.field629[0];
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
        if (this.field623 != -1 && class202.method1368(this.field623).field3033 == 1) {
            this.field623 = -1;
        }
        if (this.field645 < 9) {
            this.field645++;
        }
        for (int var5 = this.field645; var5 > 0; var5--) {
            this.field629[var5] = this.field629[var5 - 1];
            this.field641[var5] = this.field641[var5 - 1];
            this.field595[var5] = this.field595[var5 - 1];
        }
        this.field629[0] = var3;
        this.field641[0] = var4;
        this.field595[0] = arg1;
    }

    @ObfuscatedName("am.y(IIZB)V")
    public final void method726(int arg0, int arg1, boolean arg2) {
        if (this.field623 != -1 && class202.method1368(this.field623).field3033 == 1) {
            this.field623 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field629[0];
            int var5 = arg1 - this.field641[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field645 < 9) {
                    this.field645++;
                }
                for (int var6 = this.field645; var6 > 0; var6--) {
                    this.field629[var6] = this.field629[var6 - 1];
                    this.field641[var6] = this.field641[var6 - 1];
                    this.field595[var6] = this.field595[var6 - 1];
                }
                this.field629[0] = arg0;
                this.field641[0] = arg1;
                this.field595[0] = 1;
                return;
            }
        }
        this.field645 = 0;
        this.field646 = 0;
        this.field639 = 0;
        this.field629[0] = arg0;
        this.field641[0] = arg1;
        this.field619 = this.field629[0] * 128 + this.field598 * 64;
        this.field609 = this.field641[0] * 128 + this.field598 * 64;
    }

    @ObfuscatedName("am.o(I)Lcu;")
    public final class83 method258() {
        if (this.field764 == null) {
            return null;
        }
        class202 var1 = this.field623 != -1 && this.field626 == 0 ? class202.method1368(this.field623) : null;
        class202 var2 = this.field620 == -1 || this.field652 == this.field620 && var1 != null ? null : class202.method1368(this.field620);
        class83 var3 = this.field764.method3487(var1, this.field624, var2, this.field621);
        if (var3 == null) {
            return null;
        }
        var3.method1482();
        this.field593 = var3.field1544;
        if (this.field628 != -1 && this.field648 != -1) {
            class83 var4 = class191.method188(this.field628).method3242(this.field648);
            if (var4 != null) {
                var4.method1492(0, -this.field632, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (this.field764.field2988 == 1) {
            var3.field1379 = true;
        }
        return var3;
    }

    @ObfuscatedName("am.c(I)Z")
    public final boolean method242() {
        return this.field764 != null;
    }
}
