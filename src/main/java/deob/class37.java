package deob;

@ObfuscatedName("aq")
public final class class37 extends class40 {

    @ObfuscatedName("aq.m")
    public class42 field803;

    @ObfuscatedName("aq.m(IBI)V")
    public final void method715(int arg0, byte arg1) {
        int var3 = this.field886[0];
        int var4 = this.field887[0];
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
        if (this.field885 != -1 && class45.method637(this.field885).field1021 == 1) {
            this.field885 = -1;
        }
        if (this.field876 < 9) {
            this.field876++;
        }
        for (int var5 = this.field876; var5 > 0; var5--) {
            this.field886[var5] = this.field886[var5 - 1];
            this.field887[var5] = this.field887[var5 - 1];
            this.field888[var5] = this.field888[var5 - 1];
        }
        this.field886[0] = var3;
        this.field887[0] = var4;
        this.field888[0] = arg1;
    }

    @ObfuscatedName("aq.w(IIZI)V")
    public final void method714(int arg0, int arg1, boolean arg2) {
        if (this.field885 != -1 && class45.method637(this.field885).field1021 == 1) {
            this.field885 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field886[0];
            int var5 = arg1 - this.field887[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field876 < 9) {
                    this.field876++;
                }
                for (int var6 = this.field876; var6 > 0; var6--) {
                    this.field886[var6] = this.field886[var6 - 1];
                    this.field887[var6] = this.field887[var6 - 1];
                    this.field888[var6] = this.field888[var6 - 1];
                }
                this.field886[0] = arg0;
                this.field887[0] = arg1;
                this.field888[0] = 1;
                return;
            }
        }
        this.field876 = 0;
        this.field852 = 0;
        this.field889 = 0;
        this.field886[0] = arg0;
        this.field887[0] = arg1;
        this.field865 = this.field886[0] * 128 + this.field859 * 64;
        this.field832 = this.field887[0] * 128 + this.field859 * 64;
    }

    @ObfuscatedName("aq.e(I)Ldg;")
    public final class109 method22() {
        if (this.field803 == null) {
            return null;
        }
        class45 var1 = this.field885 != -1 && this.field866 == 0 ? class45.method637(this.field885) : null;
        class45 var2 = this.field860 == -1 || this.field860 == this.field848 && var1 != null ? null : class45.method637(this.field860);
        class109 var3 = this.field803.method761(var1, this.field864, var2, this.field861);
        if (var3 == null) {
            return null;
        }
        var3.method2237();
        this.field881 = var3.field1537;
        if (this.field835 != -1 && this.field869 != -1) {
            class109 var4 = class46.method3219(this.field835).method908(this.field869);
            if (var4 != null) {
                var4.method2226(0, -this.field872, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (this.field803.field907 == 1) {
            var3.field1925 = true;
        }
        return var3;
    }

    @ObfuscatedName("aq.j(B)Z")
    public final boolean method20() {
        return this.field803 != null;
    }
}
