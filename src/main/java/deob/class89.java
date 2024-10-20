package deob;

@ObfuscatedName("ca")
public final class class89 extends class79 {

    @ObfuscatedName("ca.n")
    public class268 field1150;

    @ObfuscatedName("ca.n(IBB)V")
    public final void method2009(int arg0, byte arg1) {
        int var3 = this.field1009[0];
        int var4 = this.field986[0];
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
        if (this.field998 != -1 && Statics.method1124(this.field998).field3566 == 1) {
            this.field998 = -1;
        }
        if (this.field964 < 9) {
            this.field964++;
        }
        for (int var5 = this.field964; var5 > 0; var5--) {
            this.field1009[var5] = this.field1009[var5 - 1];
            this.field986[var5] = this.field986[var5 - 1];
            this.field1011[var5] = this.field1011[var5 - 1];
        }
        this.field1009[0] = var3;
        this.field986[0] = var4;
        this.field1011[0] = arg1;
    }

    @ObfuscatedName("ca.v(IIZI)V")
    public final void method2012(int arg0, int arg1, boolean arg2) {
        if (this.field998 != -1 && Statics.method1124(this.field998).field3566 == 1) {
            this.field998 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1009[0];
            int var5 = arg1 - this.field986[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field964 < 9) {
                    this.field964++;
                }
                for (int var6 = this.field964; var6 > 0; var6--) {
                    this.field1009[var6] = this.field1009[var6 - 1];
                    this.field986[var6] = this.field986[var6 - 1];
                    this.field1011[var6] = this.field1011[var6 - 1];
                }
                this.field1009[0] = arg0;
                this.field986[0] = arg1;
                this.field1011[0] = 1;
                return;
            }
        }
        this.field964 = 0;
        this.field1013 = 0;
        this.field990 = 0;
        this.field1009[0] = arg0;
        this.field986[0] = arg1;
        this.field957 = this.field1009[0] * 128 + this.field1008 * 64;
        this.field954 = this.field986[0] * 128 + this.field1008 * 64;
    }

    @ObfuscatedName("ca.q(B)Lef;")
    public final class137 method1214() {
        if (this.field1150 == null) {
            return null;
        }
        class270 var1 = this.field998 != -1 && this.field989 == 0 ? Statics.method1124(this.field998) : null;
        class270 var2 = this.field983 == -1 || this.field983 == this.field973 && var1 != null ? null : Statics.method1124(this.field983);
        class137 var3 = this.field1150.method4549(var1, this.field996, var2, this.field984);
        if (var3 == null) {
            return null;
        }
        var3.method2793();
        this.field1004 = var3.field1885;
        if (this.field988 != -1 && this.field992 != -1) {
            class137 var4 = class255.method4871(this.field988).method4216(this.field992);
            if (var4 != null) {
                var4.method2810(0, -this.field995, 0);
                class137[] var5 = new class137[] { var3, var4 };
                var3 = new class137(var5, 2);
            }
        }
        if (this.field1150.field3504 == 1) {
            var3.field1697 = true;
        }
        return var3;
    }

    @ObfuscatedName("ca.a(I)Z")
    public final boolean method1192() {
        return this.field1150 != null;
    }
}
