package deob;

@ObfuscatedName("cd")
public final class class89 extends class79 {

    @ObfuscatedName("cd.x")
    public class267 field1149;

    @ObfuscatedName("cd.x(IBI)V")
    public final void method1947(int arg0, byte arg1) {
        int var3 = this.field1029[0];
        int var4 = this.field1030[0];
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
        if (this.field1017 != -1 && class269.method4110(this.field1017).field3525 == 1) {
            this.field1017 = -1;
        }
        if (this.field1028 < 9) {
            this.field1028++;
        }
        for (int var5 = this.field1028; var5 > 0; var5--) {
            this.field1029[var5] = this.field1029[var5 - 1];
            this.field1030[var5] = this.field1030[var5 - 1];
            this.field1023[var5] = this.field1023[var5 - 1];
        }
        this.field1029[0] = var3;
        this.field1030[0] = var4;
        this.field1023[0] = arg1;
    }

    @ObfuscatedName("cd.m(IIZB)V")
    public final void method1949(int arg0, int arg1, boolean arg2) {
        if (this.field1017 != -1 && class269.method4110(this.field1017).field3525 == 1) {
            this.field1017 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1029[0];
            int var5 = arg1 - this.field1030[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1028 < 9) {
                    this.field1028++;
                }
                for (int var6 = this.field1028; var6 > 0; var6--) {
                    this.field1029[var6] = this.field1029[var6 - 1];
                    this.field1030[var6] = this.field1030[var6 - 1];
                    this.field1023[var6] = this.field1023[var6 - 1];
                }
                this.field1029[0] = arg0;
                this.field1030[0] = arg1;
                this.field1023[0] = 1;
                return;
            }
        }
        this.field1028 = 0;
        this.field1033 = 0;
        this.field1032 = 0;
        this.field1029[0] = arg0;
        this.field1030[0] = arg1;
        this.field984 = this.field1029[0] * 128 + this.field977 * 64;
        this.field974 = this.field1030[0] * 128 + this.field977 * 64;
    }

    @ObfuscatedName("cd.t(I)Lel;")
    public final class137 method1182() {
        if (this.field1149 == null) {
            return null;
        }
        class269 var1 = this.field1017 != -1 && this.field1009 == 0 ? class269.method4110(this.field1017) : null;
        class269 var2 = this.field1025 == -1 || this.field979 == this.field1025 && var1 != null ? null : class269.method4110(this.field1025);
        class137 var3 = this.field1149.method4392(var1, this.field1015, var2, this.field975);
        if (var3 == null) {
            return null;
        }
        var3.method2705();
        this.field1024 = var3.field1884;
        if (this.field1010 != -1 && this.field1007 != -1) {
            class137 var4 = class254.method1049(this.field1010).method4099(this.field1007);
            if (var4 != null) {
                var4.method2716(0, -this.field1034, 0);
                class137[] var5 = new class137[] { var3, var4 };
                var3 = new class137(var5, 2);
            }
        }
        if (this.field1149.field3471 == 1) {
            var3.field1717 = true;
        }
        return var3;
    }

    @ObfuscatedName("cd.n(I)Z")
    public final boolean method1179() {
        return this.field1149 != null;
    }
}
