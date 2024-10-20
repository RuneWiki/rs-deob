package deob;

@ObfuscatedName("cp")
public final class class86 extends class78 {

    @ObfuscatedName("cp.m")
    public class266 field1293;

    @ObfuscatedName("cp.m(IBB)V")
    public final void method1628(int arg0, byte arg1) {
        int var3 = this.field1199[0];
        int var4 = this.field1172[0];
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
        if (this.field1176 != -1 && class268.method2289(this.field1176).field3672 == 1) {
            this.field1176 = -1;
        }
        if (this.field1198 < 9) {
            this.field1198++;
        }
        for (int var5 = this.field1198; var5 > 0; var5--) {
            this.field1199[var5] = this.field1199[var5 - 1];
            this.field1172[var5] = this.field1172[var5 - 1];
            this.field1190[var5] = this.field1190[var5 - 1];
        }
        this.field1199[0] = var3;
        this.field1172[0] = var4;
        this.field1190[0] = arg1;
    }

    @ObfuscatedName("cp.p(IIZB)V")
    public final void method1624(int arg0, int arg1, boolean arg2) {
        if (this.field1176 != -1 && class268.method2289(this.field1176).field3672 == 1) {
            this.field1176 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1199[0];
            int var5 = arg1 - this.field1172[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1198 < 9) {
                    this.field1198++;
                }
                for (int var6 = this.field1198; var6 > 0; var6--) {
                    this.field1199[var6] = this.field1199[var6 - 1];
                    this.field1172[var6] = this.field1172[var6 - 1];
                    this.field1190[var6] = this.field1190[var6 - 1];
                }
                this.field1199[0] = arg0;
                this.field1172[0] = arg1;
                this.field1190[0] = 1;
                return;
            }
        }
        this.field1198 = 0;
        this.field1187 = 0;
        this.field1158 = 0;
        this.field1199[0] = arg0;
        this.field1172[0] = arg1;
        this.field1188 = this.field1199[0] * 128 + this.field1202 * 64;
        this.field1145 = this.field1172[0] * 128 + this.field1202 * 64;
    }

    @ObfuscatedName("cp.i(I)Len;")
    public final class133 method1070() {
        if (this.field1293 == null) {
            return null;
        }
        class268 var1 = this.field1176 != -1 && this.field1179 == 0 ? class268.method2289(this.field1176) : null;
        class268 var2 = this.field1173 == -1 || this.field1175 == this.field1173 && var1 != null ? null : class268.method2289(this.field1173);
        class133 var3 = this.field1293.method4455(var1, this.field1177, var2, this.field1174);
        if (var3 == null) {
            return null;
        }
        var3.method2385();
        this.field1162 = var3.field2037;
        if (this.field1181 != -1 && this.field1182 != -1) {
            class133 var4 = class253.method4750(this.field1181).method4154(this.field1182);
            if (var4 != null) {
                var4.method2412(0, -this.field1185, 0);
                class133[] var5 = new class133[] { var3, var4 };
                var3 = new class133(var5, 2);
            }
        }
        if (this.field1293.field3626 == 1) {
            var3.field1861 = true;
        }
        return var3;
    }

    @ObfuscatedName("cp.e(I)Z")
    public final boolean method1073() {
        return this.field1293 != null;
    }
}
