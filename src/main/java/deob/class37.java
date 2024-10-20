package deob;

@ObfuscatedName("ar")
public final class class37 extends class40 {

    @ObfuscatedName("ar.i")
    public class42 field803;

    @ObfuscatedName("ar.i(IBI)V")
    public final void method727(int arg0, byte arg1) {
        int var3 = this.field857[0];
        int var4 = this.field858[0];
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
        if (this.field868 != -1 && class45.method3523(this.field868).field1024 == 1) {
            this.field868 = -1;
        }
        if (this.field890 < 9) {
            this.field890++;
        }
        for (int var5 = this.field890; var5 > 0; var5--) {
            this.field857[var5] = this.field857[var5 - 1];
            this.field858[var5] = this.field858[var5 - 1];
            this.field851[var5] = this.field851[var5 - 1];
        }
        this.field857[0] = var3;
        this.field858[0] = var4;
        this.field851[0] = arg1;
    }

    @ObfuscatedName("ar.h(IIZB)V")
    public final void method722(int arg0, int arg1, boolean arg2) {
        if (this.field868 != -1 && class45.method3523(this.field868).field1024 == 1) {
            this.field868 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field857[0];
            int var5 = arg1 - this.field858[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field890 < 9) {
                    this.field890++;
                }
                for (int var6 = this.field890; var6 > 0; var6--) {
                    this.field857[var6] = this.field857[var6 - 1];
                    this.field858[var6] = this.field858[var6 - 1];
                    this.field851[var6] = this.field851[var6 - 1];
                }
                this.field857[0] = arg0;
                this.field858[0] = arg1;
                this.field851[0] = 1;
                return;
            }
        }
        this.field890 = 0;
        this.field895 = 0;
        this.field894 = 0;
        this.field857[0] = arg0;
        this.field858[0] = arg1;
        this.field879 = this.field857[0] * 128 + this.field840 * 64;
        this.field837 = this.field858[0] * 128 + this.field840 * 64;
    }

    @ObfuscatedName("ar.e(I)Ldo;")
    public final class109 method47() {
        if (this.field803 == null) {
            return null;
        }
        class45 var1 = this.field868 != -1 && this.field852 == 0 ? class45.method3523(this.field868) : null;
        class45 var2 = this.field865 == -1 || this.field886 == this.field865 && var1 != null ? null : class45.method3523(this.field865);
        class109 var3 = this.field803.method780(var1, this.field854, var2, this.field866);
        if (var3 == null) {
            return null;
        }
        var3.method2204();
        this.field871 = var3.field1511;
        if (this.field873 != -1 && this.field874 != -1) {
            class109 var4 = class46.method895(this.field873).method901(this.field874);
            if (var4 != null) {
                var4.method2214(0, -this.field877, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (this.field803.field911 == 1) {
            var3.field1882 = true;
        }
        return var3;
    }

    @ObfuscatedName("ar.d(I)Z")
    public final boolean method22() {
        return this.field803 != null;
    }
}
