package deob;

@ObfuscatedName("aw")
public final class class36 extends class28 {

    @ObfuscatedName("aw.s")
    public class200 field760;

    @ObfuscatedName("aw.s(IBI)V")
    public final void method691(int arg0, byte arg1) {
        int var3 = this.field663[0];
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
        if (this.field631 != -1 && class202.method1914(this.field631).field3069 == 1) {
            this.field631 = -1;
        }
        if (this.field659 < 9) {
            this.field659++;
        }
        for (int var5 = this.field659; var5 > 0; var5--) {
            this.field663[var5] = this.field663[var5 - 1];
            this.field661[var5] = this.field661[var5 - 1];
            this.field625[var5] = this.field625[var5 - 1];
        }
        this.field663[0] = var3;
        this.field661[0] = var4;
        this.field625[0] = arg1;
    }

    @ObfuscatedName("aw.c(IIZB)V")
    public final void method694(int arg0, int arg1, boolean arg2) {
        if (this.field631 != -1 && class202.method1914(this.field631).field3069 == 1) {
            this.field631 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field663[0];
            int var5 = arg1 - this.field661[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field659 < 9) {
                    this.field659++;
                }
                for (int var6 = this.field659; var6 > 0; var6--) {
                    this.field663[var6] = this.field663[var6 - 1];
                    this.field661[var6] = this.field661[var6 - 1];
                    this.field625[var6] = this.field625[var6 - 1];
                }
                this.field663[0] = arg0;
                this.field661[0] = arg1;
                this.field625[0] = 1;
                return;
            }
        }
        this.field659 = 0;
        this.field664 = 0;
        this.field648 = 0;
        this.field663[0] = arg0;
        this.field661[0] = arg1;
        this.field609 = this.field663[0] * 128 + this.field646 * 64;
        this.field606 = this.field661[0] * 128 + this.field646 * 64;
    }

    @ObfuscatedName("aw.f(I)Lcz;")
    public final class83 method195() {
        if (this.field760 == null) {
            return null;
        }
        class202 var1 = this.field631 != -1 && this.field617 == 0 ? class202.method1914(this.field631) : null;
        class202 var2 = this.field634 == -1 || this.field634 == this.field610 && var1 != null ? null : class202.method1914(this.field634);
        class83 var3 = this.field760.method3388(var1, this.field638, var2, this.field635);
        if (var3 == null) {
            return null;
        }
        var3.method1443();
        this.field655 = var3.field1546;
        if (this.field613 != -1 && this.field643 != -1) {
            class83 var4 = class191.method827(this.field613).method3150(this.field643);
            if (var4 != null) {
                var4.method1442(0, -this.field632, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (this.field760.field3011 == 1) {
            var3.field1383 = true;
        }
        return var3;
    }

    @ObfuscatedName("aw.b(I)Z")
    public final boolean method201() {
        return this.field760 != null;
    }
}
