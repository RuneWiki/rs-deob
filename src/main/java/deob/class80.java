package deob;

@ObfuscatedName("cd")
public final class class80 extends class70 {

    @ObfuscatedName("cd.u")
    public class257 field1126;

    @ObfuscatedName("cd.u(IBI)V")
    public final void method1873(int arg0, byte arg1) {
        int var3 = this.field991[0];
        int var4 = this.field956[0];
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
        if (this.field990 != -1 && class259.method154(this.field990).field3516 == 1) {
            this.field990 = -1;
        }
        if (this.field967 < 9) {
            this.field967++;
        }
        for (int var5 = this.field967; var5 > 0; var5--) {
            this.field991[var5] = this.field991[var5 - 1];
            this.field956[var5] = this.field956[var5 - 1];
            this.field993[var5] = this.field993[var5 - 1];
        }
        this.field991[0] = var3;
        this.field956[0] = var4;
        this.field993[0] = arg1;
    }

    @ObfuscatedName("cd.f(IIZB)V")
    public final void method1874(int arg0, int arg1, boolean arg2) {
        if (this.field990 != -1 && class259.method154(this.field990).field3516 == 1) {
            this.field990 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field991[0];
            int var5 = arg1 - this.field956[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field967 < 9) {
                    this.field967++;
                }
                for (int var6 = this.field967; var6 > 0; var6--) {
                    this.field991[var6] = this.field991[var6 - 1];
                    this.field956[var6] = this.field956[var6 - 1];
                    this.field993[var6] = this.field993[var6 - 1];
                }
                this.field991[0] = arg0;
                this.field956[0] = arg1;
                this.field993[0] = 1;
                return;
            }
        }
        this.field967 = 0;
        this.field995 = 0;
        this.field977 = 0;
        this.field991[0] = arg0;
        this.field956[0] = arg1;
        this.field992 = this.field991[0] * 128 + this.field939 * 64;
        this.field936 = this.field956[0] * 128 + this.field939 * 64;
    }

    @ObfuscatedName("cd.w(I)Ldf;")
    public final class128 method1103() {
        if (this.field1126 == null) {
            return null;
        }
        class259 var1 = this.field990 != -1 && this.field971 == 0 ? class259.method154(this.field990) : null;
        class259 var2 = this.field985 == -1 || this.field986 == this.field985 && var1 != null ? null : class259.method154(this.field985);
        class128 var3 = this.field1126.method4398(var1, this.field969, var2, this.field996);
        if (var3 == null) {
            return null;
        }
        var3.method2640();
        this.field950 = var3.field1863;
        if (this.field973 != -1 && this.field974 != -1) {
            class128 var4 = class244.method420(this.field973).method4091(this.field974);
            if (var4 != null) {
                var4.method2651(0, -this.field997, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (this.field1126.field3490 == 1) {
            var3.field1686 = true;
        }
        return var3;
    }

    @ObfuscatedName("cd.o(I)Z")
    public final boolean method1096() {
        return this.field1126 != null;
    }
}
