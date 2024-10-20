package deob;

@ObfuscatedName("cv")
public final class class80 extends class70 {

    @ObfuscatedName("cv.a")
    public class257 field1114;

    @ObfuscatedName("cv.a(IBI)V")
    public final void method1962(int arg0, byte arg1) {
        int var3 = this.field924[0];
        int var4 = this.field931[0];
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
        if (this.field957 != -1 && class259.method3856(this.field957).field3514 == 1) {
            this.field957 = -1;
        }
        if (this.field979 < 9) {
            this.field979++;
        }
        for (int var5 = this.field979; var5 > 0; var5--) {
            this.field924[var5] = this.field924[var5 - 1];
            this.field931[var5] = this.field931[var5 - 1];
            this.field982[var5] = this.field982[var5 - 1];
        }
        this.field924[0] = var3;
        this.field931[0] = var4;
        this.field982[0] = arg1;
    }

    @ObfuscatedName("cv.t(IIZB)V")
    public final void method1964(int arg0, int arg1, boolean arg2) {
        if (this.field957 != -1 && class259.method3856(this.field957).field3514 == 1) {
            this.field957 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field924[0];
            int var5 = arg1 - this.field931[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field979 < 9) {
                    this.field979++;
                }
                for (int var6 = this.field979; var6 > 0; var6--) {
                    this.field924[var6] = this.field924[var6 - 1];
                    this.field931[var6] = this.field931[var6 - 1];
                    this.field982[var6] = this.field982[var6 - 1];
                }
                this.field924[0] = arg0;
                this.field931[0] = arg1;
                this.field982[0] = 1;
                return;
            }
        }
        this.field979 = 0;
        this.field984 = 0;
        this.field983 = 0;
        this.field924[0] = arg0;
        this.field931[0] = arg1;
        this.field930 = this.field924[0] * 128 + this.field928 * 64;
        this.field933 = this.field931[0] * 128 + this.field928 * 64;
    }

    @ObfuscatedName("cv.i(B)Ldv;")
    public final class128 method1159() {
        if (this.field1114 == null) {
            return null;
        }
        class259 var1 = this.field957 != -1 && this.field960 == 0 ? class259.method3856(this.field957) : null;
        class259 var2 = this.field954 == -1 || this.field965 == this.field954 && var1 != null ? null : class259.method3856(this.field954);
        class128 var3 = this.field1114.method4406(var1, this.field958, var2, this.field977);
        if (var3 == null) {
            return null;
        }
        var3.method2734();
        this.field975 = var3.field1849;
        if (this.field962 != -1 && this.field963 != -1) {
            class128 var4 = class244.method1992(this.field962).method4119(this.field963);
            if (var4 != null) {
                var4.method2740(0, -this.field966, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (this.field1114.field3460 == 1) {
            var3.field1670 = true;
        }
        return var3;
    }

    @ObfuscatedName("cv.h(B)Z")
    public final boolean method1163() {
        return this.field1114 != null;
    }
}
