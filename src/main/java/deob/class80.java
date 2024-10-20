package deob;

@ObfuscatedName("cf")
public final class class80 extends class70 {

    @ObfuscatedName("cf.q")
    public class257 field1135;

    @ObfuscatedName("cf.q(IBI)V")
    public final void method1795(int arg0, byte arg1) {
        int var3 = this.field995[0];
        int var4 = this.field963[0];
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
        if (this.field982 != -1 && class259.method67(this.field982).field3533 == 1) {
            this.field982 = -1;
        }
        if (this.field1004 < 9) {
            this.field1004++;
        }
        for (int var5 = this.field1004; var5 > 0; var5--) {
            this.field995[var5] = this.field995[var5 - 1];
            this.field963[var5] = this.field963[var5 - 1];
            this.field1007[var5] = this.field1007[var5 - 1];
        }
        this.field995[0] = var3;
        this.field963[0] = var4;
        this.field1007[0] = arg1;
    }

    @ObfuscatedName("cf.w(IIZS)V")
    public final void method1792(int arg0, int arg1, boolean arg2) {
        if (this.field982 != -1 && class259.method67(this.field982).field3533 == 1) {
            this.field982 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field995[0];
            int var5 = arg1 - this.field963[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1004 < 9) {
                    this.field1004++;
                }
                for (int var6 = this.field1004; var6 > 0; var6--) {
                    this.field995[var6] = this.field995[var6 - 1];
                    this.field963[var6] = this.field963[var6 - 1];
                    this.field1007[var6] = this.field1007[var6 - 1];
                }
                this.field995[0] = arg0;
                this.field963[0] = arg1;
                this.field1007[0] = 1;
                return;
            }
        }
        this.field1004 = 0;
        this.field1009 = 0;
        this.field1008 = 0;
        this.field995[0] = arg0;
        this.field963[0] = arg1;
        this.field1006 = this.field995[0] * 128 + this.field953 * 64;
        this.field950 = this.field963[0] * 128 + this.field953 * 64;
    }

    @ObfuscatedName("cf.c(I)Ldm;")
    public final class128 method1087() {
        if (this.field1135 == null) {
            return null;
        }
        class259 var1 = this.field982 != -1 && this.field985 == 0 ? class259.method67(this.field982) : null;
        class259 var2 = this.field979 == -1 || this.field979 == this.field1005 && var1 != null ? null : class259.method67(this.field979);
        class128 var3 = this.field1135.method4322(var1, this.field952, var2, this.field980);
        if (var3 == null) {
            return null;
        }
        var3.method2642();
        this.field1000 = var3.field1874;
        if (this.field987 != -1 && this.field988 != -1) {
            class128 var4 = class244.method3544(this.field987).method4023(this.field988);
            if (var4 != null) {
                var4.method2644(0, -this.field991, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (this.field1135.field3470 == 1) {
            var3.field1731 = true;
        }
        return var3;
    }

    @ObfuscatedName("cf.v(I)Z")
    public final boolean method1045() {
        return this.field1135 != null;
    }
}
