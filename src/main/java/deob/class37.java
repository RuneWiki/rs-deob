package deob;

@ObfuscatedName("ao")
public final class class37 extends class40 {

    @ObfuscatedName("ao.s")
    public class42 field770;

    @ObfuscatedName("ao.s(IBB)V")
    public final void method727(int arg0, byte arg1) {
        int var3 = this.field857[0];
        int var4 = this.field831[0];
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
        if (this.field858 != -1 && class45.method44(this.field858).field981 == 1) {
            this.field858 = -1;
        }
        if (this.field856 < 9) {
            this.field856++;
        }
        for (int var5 = this.field856; var5 > 0; var5--) {
            this.field857[var5] = this.field857[var5 - 1];
            this.field831[var5] = this.field831[var5 - 1];
            this.field859[var5] = this.field859[var5 - 1];
        }
        this.field857[0] = var3;
        this.field831[0] = var4;
        this.field859[0] = arg1;
    }

    @ObfuscatedName("ao.z(IIZB)V")
    public final void method732(int arg0, int arg1, boolean arg2) {
        if (this.field858 != -1 && class45.method44(this.field858).field981 == 1) {
            this.field858 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field857[0];
            int var5 = arg1 - this.field831[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field856 < 9) {
                    this.field856++;
                }
                for (int var6 = this.field856; var6 > 0; var6--) {
                    this.field857[var6] = this.field857[var6 - 1];
                    this.field831[var6] = this.field831[var6 - 1];
                    this.field859[var6] = this.field859[var6 - 1];
                }
                this.field857[0] = arg0;
                this.field831[0] = arg1;
                this.field859[0] = 1;
                return;
            }
        }
        this.field856 = 0;
        this.field822 = 0;
        this.field860 = 0;
        this.field857[0] = arg0;
        this.field831[0] = arg1;
        this.field810 = this.field857[0] * 128 + this.field806 * 64;
        this.field843 = this.field831[0] * 128 + this.field806 * 64;
    }

    @ObfuscatedName("ao.t(B)Lde;")
    public final class109 method27() {
        if (this.field770 == null) {
            return null;
        }
        class45 var1 = this.field858 != -1 && this.field837 == 0 ? class45.method44(this.field858) : null;
        class45 var2 = this.field827 == -1 || this.field830 == this.field827 && var1 != null ? null : class45.method44(this.field827);
        class109 var3 = this.field770.method773(var1, this.field835, var2, this.field842);
        if (var3 == null) {
            return null;
        }
        var3.method2169();
        this.field852 = var3.field1503;
        if (this.field805 != -1 && this.field812 != -1) {
            class109 var4 = class46.method2163(this.field805).method900(this.field812);
            if (var4 != null) {
                var4.method2174(0, -this.field840, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (this.field770.field903 == 1) {
            var3.field1865 = true;
        }
        return var3;
    }

    @ObfuscatedName("ao.m(I)Z")
    public final boolean method35() {
        return this.field770 != null;
    }
}
