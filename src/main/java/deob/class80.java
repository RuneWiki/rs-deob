package deob;

@ObfuscatedName("cg")
public final class class80 extends class70 {

    @ObfuscatedName("cg.c")
    public class258 field1120;

    @ObfuscatedName("cg.c(IBI)V")
    public final void method1904(int arg0, byte arg1) {
        int var3 = this.field978[0];
        int var4 = this.field996[0];
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
        if (this.field995 != -1 && class260.method5476(this.field995).field3525 == 1) {
            this.field995 = -1;
        }
        if (this.field974 < 9) {
            this.field974++;
        }
        for (int var5 = this.field974; var5 > 0; var5--) {
            this.field978[var5] = this.field978[var5 - 1];
            this.field996[var5] = this.field996[var5 - 1];
            this.field997[var5] = this.field997[var5 - 1];
        }
        this.field978[0] = var3;
        this.field996[0] = var4;
        this.field997[0] = arg1;
    }

    @ObfuscatedName("cg.t(IIZB)V")
    public final void method1902(int arg0, int arg1, boolean arg2) {
        if (this.field995 != -1 && class260.method5476(this.field995).field3525 == 1) {
            this.field995 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field978[0];
            int var5 = arg1 - this.field996[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field974 < 9) {
                    this.field974++;
                }
                for (int var6 = this.field974; var6 > 0; var6--) {
                    this.field978[var6] = this.field978[var6 - 1];
                    this.field996[var6] = this.field996[var6 - 1];
                    this.field997[var6] = this.field997[var6 - 1];
                }
                this.field978[0] = arg0;
                this.field996[0] = arg1;
                this.field997[0] = 1;
                return;
            }
        }
        this.field974 = 0;
        this.field999 = 0;
        this.field998 = 0;
        this.field978[0] = arg0;
        this.field996[0] = arg1;
        this.field983 = this.field978[0] * 128 + this.field943 * 64;
        this.field940 = this.field996[0] * 128 + this.field943 * 64;
    }

    @ObfuscatedName("cg.j(I)Ldx;")
    public final class128 method1118() {
        if (this.field1120 == null) {
            return null;
        }
        class260 var1 = this.field995 != -1 && this.field975 == 0 ? class260.method5476(this.field995) : null;
        class260 var2 = this.field969 == -1 || this.field969 == this.field945 && var1 != null ? null : class260.method5476(this.field969);
        class128 var3 = this.field1120.method4386(var1, this.field973, var2, this.field970);
        if (var3 == null) {
            return null;
        }
        var3.method2722();
        this.field954 = var3.field1869;
        if (this.field985 != -1 && this.field979 != -1) {
            class128 var4 = class245.method1108(this.field985).method4090(this.field979);
            if (var4 != null) {
                var4.method2680(0, -this.field981, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (this.field1120.field3484 == 1) {
            var3.field1683 = true;
        }
        return var3;
    }

    @ObfuscatedName("cg.v(I)Z")
    public final boolean method1141() {
        return this.field1120 != null;
    }
}
