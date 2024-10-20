package deob;

@ObfuscatedName("bf")
public final class class74 extends class65 {

    @ObfuscatedName("bf.f")
    public class274 field1071;

    @ObfuscatedName("bf.f(IBB)V")
    public final void method1708(int arg0, byte arg1) {
        int var3 = this.field958[0];
        int var4 = this.field944[0];
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
        if (this.field935 != -1 && class276.method2865(this.field935).field3598 == 1) {
            this.field935 = -1;
        }
        if (this.field957 < 9) {
            this.field957++;
        }
        for (int var5 = this.field957; var5 > 0; var5--) {
            this.field958[var5] = this.field958[var5 - 1];
            this.field944[var5] = this.field944[var5 - 1];
            this.field960[var5] = this.field960[var5 - 1];
        }
        this.field958[0] = var3;
        this.field944[0] = var4;
        this.field960[0] = arg1;
    }

    @ObfuscatedName("bf.h(IIZI)V")
    public final void method1709(int arg0, int arg1, boolean arg2) {
        if (this.field935 != -1 && class276.method2865(this.field935).field3598 == 1) {
            this.field935 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field958[0];
            int var5 = arg1 - this.field944[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field957 < 9) {
                    this.field957++;
                }
                for (int var6 = this.field957; var6 > 0; var6--) {
                    this.field958[var6] = this.field958[var6 - 1];
                    this.field944[var6] = this.field944[var6 - 1];
                    this.field960[var6] = this.field960[var6 - 1];
                }
                this.field958[0] = arg0;
                this.field944[0] = arg1;
                this.field960[0] = 1;
                return;
            }
        }
        this.field957 = 0;
        this.field962 = 0;
        this.field961 = 0;
        this.field958[0] = arg0;
        this.field944[0] = arg1;
        this.field953 = this.field958[0] * 128 + this.field964 * 64;
        this.field919 = this.field944[0] * 128 + this.field964 * 64;
    }

    @ObfuscatedName("bf.s(B)Lds;")
    public final class122 method1038() {
        if (this.field1071 == null) {
            return null;
        }
        class276 var1 = this.field935 != -1 && this.field938 == 0 ? class276.method2865(this.field935) : null;
        class276 var2 = this.field906 == -1 || this.field908 == this.field906 && var1 != null ? null : class276.method2865(this.field906);
        class122 var3 = this.field1071.method4819(var1, this.field936, var2, this.field951);
        if (var3 == null) {
            return null;
        }
        var3.method2534();
        this.field902 = var3.field1829;
        if (this.field940 != -1 && this.field946 != -1) {
            class122 var4 = class261.method2874(this.field940).method4493(this.field946);
            if (var4 != null) {
                var4.method2501(0, -this.field941, 0);
                class122[] var5 = new class122[] { var3, var4 };
                var3 = new class122(var5, 2);
            }
        }
        if (this.field1071.field3548 == 1) {
            var3.field1642 = true;
        }
        return var3;
    }

    @ObfuscatedName("bf.q(I)Z")
    public final boolean method1030() {
        return this.field1071 != null;
    }
}
