package deob;

@ObfuscatedName("ci")
public final class class80 extends class70 {

    @ObfuscatedName("ci.s")
    public class257 field1104;

    @ObfuscatedName("ci.s(IBB)V")
    public final void method1852(int arg0, byte arg1) {
        int var3 = this.field975[0];
        int var4 = this.field945[0];
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
        if (this.field924 != -1 && Statics.method3725(this.field924).field3506 == 1) {
            this.field924 = -1;
        }
        if (this.field973 < 9) {
            this.field973++;
        }
        for (int var5 = this.field973; var5 > 0; var5--) {
            this.field975[var5] = this.field975[var5 - 1];
            this.field945[var5] = this.field945[var5 - 1];
            this.field976[var5] = this.field976[var5 - 1];
        }
        this.field975[0] = var3;
        this.field945[0] = var4;
        this.field976[0] = arg1;
    }

    @ObfuscatedName("ci.j(IIZI)V")
    public final void method1858(int arg0, int arg1, boolean arg2) {
        if (this.field924 != -1 && Statics.method3725(this.field924).field3506 == 1) {
            this.field924 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field975[0];
            int var5 = arg1 - this.field945[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field973 < 9) {
                    this.field973++;
                }
                for (int var6 = this.field973; var6 > 0; var6--) {
                    this.field975[var6] = this.field975[var6 - 1];
                    this.field945[var6] = this.field945[var6 - 1];
                    this.field976[var6] = this.field976[var6 - 1];
                }
                this.field975[0] = arg0;
                this.field945[0] = arg1;
                this.field976[0] = 1;
                return;
            }
        }
        this.field973 = 0;
        this.field948 = 0;
        this.field977 = 0;
        this.field975[0] = arg0;
        this.field945[0] = arg1;
        this.field957 = this.field975[0] * 128 + this.field921 * 64;
        this.field918 = this.field945[0] * 128 + this.field921 * 64;
    }

    @ObfuscatedName("ci.x(I)Ldo;")
    public final class128 method1064() {
        if (this.field1104 == null) {
            return null;
        }
        class259 var1 = this.field924 != -1 && this.field954 == 0 ? Statics.method3725(this.field924) : null;
        class259 var2 = this.field980 == -1 || this.field980 == this.field917 && var1 != null ? null : Statics.method3725(this.field980);
        class128 var3 = this.field1104.method4321(var1, this.field952, var2, this.field949);
        if (var3 == null) {
            return null;
        }
        var3.method2627();
        this.field969 = var3.field1851;
        if (this.field956 != -1 && this.field923 != -1) {
            class128 var4 = class244.method1579(this.field956).method4011(this.field923);
            if (var4 != null) {
                var4.method2638(0, -this.field960, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (this.field1104.field3451 == 1) {
            var3.field1676 = true;
        }
        return var3;
    }

    @ObfuscatedName("ci.r(B)Z")
    public final boolean method1073() {
        return this.field1104 != null;
    }
}
