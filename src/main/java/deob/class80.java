package deob;

@ObfuscatedName("cv")
public final class class80 extends class70 {

    @ObfuscatedName("cv.m")
    public class268 field1097;

    @ObfuscatedName("cv.m(IBI)V")
    public final void method1828(int arg0, byte arg1) {
        int var3 = this.field953[0];
        int var4 = this.field935[0];
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
        if (this.field948 != -1 && class270.method596(this.field948).field3593 == 1) {
            this.field948 = -1;
        }
        if (this.field970 < 9) {
            this.field970++;
        }
        for (int var5 = this.field970; var5 > 0; var5--) {
            this.field953[var5] = this.field953[var5 - 1];
            this.field935[var5] = this.field935[var5 - 1];
            this.field973[var5] = this.field973[var5 - 1];
        }
        this.field953[0] = var3;
        this.field935[0] = var4;
        this.field973[0] = arg1;
    }

    @ObfuscatedName("cv.f(IIZI)V")
    public final void method1829(int arg0, int arg1, boolean arg2) {
        if (this.field948 != -1 && class270.method596(this.field948).field3593 == 1) {
            this.field948 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field953[0];
            int var5 = arg1 - this.field935[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field970 < 9) {
                    this.field970++;
                }
                for (int var6 = this.field970; var6 > 0; var6--) {
                    this.field953[var6] = this.field953[var6 - 1];
                    this.field935[var6] = this.field935[var6 - 1];
                    this.field973[var6] = this.field973[var6 - 1];
                }
                this.field953[0] = arg0;
                this.field935[0] = arg1;
                this.field973[0] = 1;
                return;
            }
        }
        this.field970 = 0;
        this.field975 = 0;
        this.field951 = 0;
        this.field953[0] = arg0;
        this.field935[0] = arg1;
        this.field957 = this.field953[0] * 128 + this.field919 * 64;
        this.field916 = this.field935[0] * 128 + this.field919 * 64;
    }

    @ObfuscatedName("cv.e(I)Ldu;")
    public final class128 method1105() {
        if (this.field1097 == null) {
            return null;
        }
        class270 var1 = this.field948 != -1 && this.field947 == 0 ? class270.method596(this.field948) : null;
        class270 var2 = this.field945 == -1 || this.field962 == this.field945 && var1 != null ? null : class270.method596(this.field945);
        class128 var3 = this.field1097.method4705(var1, this.field926, var2, this.field946);
        if (var3 == null) {
            return null;
        }
        var3.method2659();
        this.field966 = var3.field1851;
        if (this.field934 != -1 && this.field921 != -1) {
            class128 var4 = class255.method756(this.field934).method4396(this.field921);
            if (var4 != null) {
                var4.method2634(0, -this.field949, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (this.field1097.field3539 == 1) {
            var3.field1644 = true;
        }
        return var3;
    }

    @ObfuscatedName("cv.z(B)Z")
    public final boolean method1109() {
        return this.field1097 != null;
    }
}
