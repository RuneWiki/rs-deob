package deob;

@ObfuscatedName("ax")
public final class class37 extends class40 {

    @ObfuscatedName("ax.a")
    public class42 field810;

    @ObfuscatedName("ax.a(IBI)V")
    public final void method739(int arg0, byte arg1) {
        int var3 = this.field895[0];
        int var4 = this.field896[0];
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
        if (this.field872 != -1 && class45.method185(this.field872).field1018 == 1) {
            this.field872 = -1;
        }
        if (this.field894 < 9) {
            this.field894++;
        }
        for (int var5 = this.field894; var5 > 0; var5--) {
            this.field895[var5] = this.field895[var5 - 1];
            this.field896[var5] = this.field896[var5 - 1];
            this.field897[var5] = this.field897[var5 - 1];
        }
        this.field895[0] = var3;
        this.field896[0] = var4;
        this.field897[0] = arg1;
    }

    @ObfuscatedName("ax.d(IIZI)V")
    public final void method744(int arg0, int arg1, boolean arg2) {
        if (this.field872 != -1 && class45.method185(this.field872).field1018 == 1) {
            this.field872 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field895[0];
            int var5 = arg1 - this.field896[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field894 < 9) {
                    this.field894++;
                }
                for (int var6 = this.field894; var6 > 0; var6--) {
                    this.field895[var6] = this.field895[var6 - 1];
                    this.field896[var6] = this.field896[var6 - 1];
                    this.field897[var6] = this.field897[var6 - 1];
                }
                this.field895[0] = arg0;
                this.field896[0] = arg1;
                this.field897[0] = 1;
                return;
            }
        }
        this.field894 = 0;
        this.field899 = 0;
        this.field898 = 0;
        this.field895[0] = arg0;
        this.field896[0] = arg1;
        this.field847 = this.field895[0] * 128 + this.field844 * 64;
        this.field849 = this.field896[0] * 128 + this.field844 * 64;
    }

    @ObfuscatedName("ax.v(I)Ldp;")
    public final class109 method40() {
        if (this.field810 == null) {
            return null;
        }
        class45 var1 = this.field872 != -1 && this.field875 == 0 ? class45.method185(this.field872) : null;
        class45 var2 = this.field869 == -1 || this.field869 == this.field859 && var1 != null ? null : class45.method185(this.field869);
        class109 var3 = this.field810.method800(var1, this.field890, var2, this.field870);
        if (var3 == null) {
            return null;
        }
        var3.method2220();
        this.field841 = var3.field1549;
        if (this.field874 != -1 && this.field878 != -1) {
            class109 var4 = class46.method1007(this.field874).method918(this.field878);
            if (var4 != null) {
                var4.method2209(0, -this.field881, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (this.field810.field916 == 1) {
            var3.field1909 = true;
        }
        return var3;
    }

    @ObfuscatedName("ax.n(I)Z")
    public final boolean method17() {
        return this.field810 != null;
    }
}
