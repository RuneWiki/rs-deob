package deob;

@ObfuscatedName("aw")
public final class class35 extends class38 {

    @ObfuscatedName("aw.d")
    public class40 field787;

    @ObfuscatedName("aw.d(IBB)V")
    public final void method688(int arg0, byte arg1) {
        int var3 = this.field864[0];
        int var4 = this.field875[0];
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
        if (this.field829 != -1 && class43.method578(this.field829).field991 == 1) {
            this.field829 = -1;
        }
        if (this.field820 < 9) {
            this.field820++;
        }
        for (int var5 = this.field820; var5 > 0; var5--) {
            this.field864[var5] = this.field864[var5 - 1];
            this.field875[var5] = this.field875[var5 - 1];
            this.field870[var5] = this.field870[var5 - 1];
        }
        this.field864[0] = var3;
        this.field875[0] = var4;
        this.field870[0] = arg1;
    }

    @ObfuscatedName("aw.p(IIZB)V")
    public final void method690(int arg0, int arg1, boolean arg2) {
        if (this.field829 != -1 && class43.method578(this.field829).field991 == 1) {
            this.field829 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field864[0];
            int var5 = arg1 - this.field875[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field820 < 9) {
                    this.field820++;
                }
                for (int var6 = this.field820; var6 > 0; var6--) {
                    this.field864[var6] = this.field864[var6 - 1];
                    this.field875[var6] = this.field875[var6 - 1];
                    this.field870[var6] = this.field870[var6 - 1];
                }
                this.field864[0] = arg0;
                this.field875[0] = arg1;
                this.field870[0] = 1;
                return;
            }
        }
        this.field820 = 0;
        this.field878 = 0;
        this.field877 = 0;
        this.field864[0] = arg0;
        this.field875[0] = arg1;
        this.field851 = this.field864[0] * 128 + this.field824 * 64;
        this.field821 = this.field875[0] * 128 + this.field824 * 64;
    }

    @ObfuscatedName("aw.v(B)Ldn;")
    public final class105 method15() {
        if (this.field787 == null) {
            return null;
        }
        class43 var1 = this.field829 != -1 && this.field854 == 0 ? class43.method578(this.field829) : null;
        class43 var2 = this.field848 == -1 || this.field881 == this.field848 && var1 != null ? null : class43.method578(this.field848);
        class105 var3 = this.field787.method734(var1, this.field852, var2, this.field823);
        if (var3 == null) {
            return null;
        }
        var3.method2157();
        this.field869 = var3.field1448;
        if (this.field856 != -1 && this.field837 != -1) {
            class105 var4 = class44.method723(this.field856).method878(this.field837);
            if (var4 != null) {
                var4.method2169(0, -this.field831, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (this.field787.field905 == 1) {
            var3.field1815 = true;
        }
        return var3;
    }

    @ObfuscatedName("aw.u(B)Z")
    public final boolean method19() {
        return this.field787 != null;
    }
}
