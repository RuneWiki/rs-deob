package deob;

@ObfuscatedName("ay")
public final class class36 extends class28 {

    @ObfuscatedName("ay.p")
    public class200 field763;

    @ObfuscatedName("ay.p(IBI)V")
    public final void method698(int arg0, byte arg1) {
        int var3 = this.field636[0];
        int var4 = this.field630[0];
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
        if (this.field625 != -1 && class202.method2533(this.field625).field3062 == 1) {
            this.field625 = -1;
        }
        if (this.field647 < 9) {
            this.field647++;
        }
        for (int var5 = this.field647; var5 > 0; var5--) {
            this.field636[var5] = this.field636[var5 - 1];
            this.field630[var5] = this.field630[var5 - 1];
            this.field650[var5] = this.field650[var5 - 1];
        }
        this.field636[0] = var3;
        this.field630[0] = var4;
        this.field650[0] = arg1;
    }

    @ObfuscatedName("ay.g(IIZI)V")
    public final void method693(int arg0, int arg1, boolean arg2) {
        if (this.field625 != -1 && class202.method2533(this.field625).field3062 == 1) {
            this.field625 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field636[0];
            int var5 = arg1 - this.field630[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field647 < 9) {
                    this.field647++;
                }
                for (int var6 = this.field647; var6 > 0; var6--) {
                    this.field636[var6] = this.field636[var6 - 1];
                    this.field630[var6] = this.field630[var6 - 1];
                    this.field650[var6] = this.field650[var6 - 1];
                }
                this.field636[0] = arg0;
                this.field630[0] = arg1;
                this.field650[0] = 1;
                return;
            }
        }
        this.field647 = 0;
        this.field652 = 0;
        this.field628 = 0;
        this.field636[0] = arg0;
        this.field630[0] = arg1;
        this.field622 = this.field636[0] * 128 + this.field597 * 64;
        this.field639 = this.field630[0] * 128 + this.field597 * 64;
    }

    @ObfuscatedName("ay.x(I)Lcw;")
    public final class83 method223() {
        if (this.field763 == null) {
            return null;
        }
        class202 var1 = this.field625 != -1 && this.field633 == 0 ? class202.method2533(this.field625) : null;
        class202 var2 = this.field618 == -1 || this.field618 == this.field598 && var1 != null ? null : class202.method2533(this.field618);
        class83 var3 = this.field763.method3460(var1, this.field615, var2, this.field623);
        if (var3 == null) {
            return null;
        }
        var3.method1504();
        this.field643 = var3.field1544;
        if (this.field629 != -1 && this.field631 != -1) {
            class83 var4 = class191.method1354(this.field629).method3209(this.field631);
            if (var4 != null) {
                var4.method1492(0, -this.field634, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (this.field763.field3000 == 1) {
            var3.field1381 = true;
        }
        return var3;
    }

    @ObfuscatedName("ay.j(B)Z")
    public final boolean method227() {
        return this.field763 != null;
    }
}
