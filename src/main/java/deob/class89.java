package deob;

@ObfuscatedName("cw")
public final class class89 extends class79 {

    @ObfuscatedName("cw.z")
    public class267 field1159;

    @ObfuscatedName("cw.z(IBI)V")
    public final void method1943(int arg0, byte arg1) {
        int var3 = this.field1031[0];
        int var4 = this.field1029[0];
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
        if (this.field1005 != -1 && class269.method536(this.field1005).field3542 == 1) {
            this.field1005 = -1;
        }
        if (this.field1006 < 9) {
            this.field1006++;
        }
        for (int var5 = this.field1006; var5 > 0; var5--) {
            this.field1031[var5] = this.field1031[var5 - 1];
            this.field1029[var5] = this.field1029[var5 - 1];
            this.field1013[var5] = this.field1013[var5 - 1];
        }
        this.field1031[0] = var3;
        this.field1029[0] = var4;
        this.field1013[0] = arg1;
    }

    @ObfuscatedName("cw.k(IIZI)V")
    public final void method1945(int arg0, int arg1, boolean arg2) {
        if (this.field1005 != -1 && class269.method536(this.field1005).field3542 == 1) {
            this.field1005 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1031[0];
            int var5 = arg1 - this.field1029[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1006 < 9) {
                    this.field1006++;
                }
                for (int var6 = this.field1006; var6 > 0; var6--) {
                    this.field1031[var6] = this.field1031[var6 - 1];
                    this.field1029[var6] = this.field1029[var6 - 1];
                    this.field1013[var6] = this.field1013[var6 - 1];
                }
                this.field1031[0] = arg0;
                this.field1029[0] = arg1;
                this.field1013[0] = 1;
                return;
            }
        }
        this.field1006 = 0;
        this.field974 = 0;
        this.field1033 = 0;
        this.field1031[0] = arg0;
        this.field1029[0] = arg1;
        this.field995 = this.field1031[0] * 128 + this.field1015 * 64;
        this.field1024 = this.field1029[0] * 128 + this.field1015 * 64;
    }

    @ObfuscatedName("cw.g(I)Ler;")
    public final class137 method1141() {
        if (this.field1159 == null) {
            return null;
        }
        class269 var1 = this.field1005 != -1 && this.field1008 == 0 ? class269.method536(this.field1005) : null;
        class269 var2 = this.field1002 == -1 || this.field978 == this.field1002 && var1 != null ? null : class269.method536(this.field1002);
        class137 var3 = this.field1159.method4449(var1, this.field1009, var2, this.field1003);
        if (var3 == null) {
            return null;
        }
        var3.method2758();
        this.field1023 = var3.field1906;
        if (this.field972 != -1 && this.field1011 != -1) {
            class137 var4 = class254.method1045(this.field972).method4116(this.field1011);
            if (var4 != null) {
                var4.method2760(0, -this.field1004, 0);
                class137[] var5 = new class137[] { var3, var4 };
                var3 = new class137(var5, 2);
            }
        }
        if (this.field1159.field3513 == 1) {
            var3.field1712 = true;
        }
        return var3;
    }

    @ObfuscatedName("cw.h(I)Z")
    public final boolean method1165() {
        return this.field1159 != null;
    }
}
