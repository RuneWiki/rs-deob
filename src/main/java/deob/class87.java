package deob;

@ObfuscatedName("cj")
public final class class87 extends class79 {

    @ObfuscatedName("cj.c")
    public class259 field1359;

    @ObfuscatedName("cj.c(IBI)V")
    public final void method1513(int arg0, byte arg1) {
        int var3 = this.field1210[0];
        int var4 = this.field1264[0];
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
        if (this.field1242 != -1 && Statics.method240(this.field1242).field3596 == 1) {
            this.field1242 = -1;
        }
        if (this.field1252 < 9) {
            this.field1252++;
        }
        for (int var5 = this.field1252; var5 > 0; var5--) {
            this.field1210[var5] = this.field1210[var5 - 1];
            this.field1264[var5] = this.field1264[var5 - 1];
            this.field1267[var5] = this.field1267[var5 - 1];
        }
        this.field1210[0] = var3;
        this.field1264[0] = var4;
        this.field1267[0] = arg1;
    }

    @ObfuscatedName("cj.o(IIZI)V")
    public final void method1514(int arg0, int arg1, boolean arg2) {
        if (this.field1242 != -1 && Statics.method240(this.field1242).field3596 == 1) {
            this.field1242 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1210[0];
            int var5 = arg1 - this.field1264[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1252 < 9) {
                    this.field1252++;
                }
                for (int var6 = this.field1252; var6 > 0; var6--) {
                    this.field1210[var6] = this.field1210[var6 - 1];
                    this.field1264[var6] = this.field1264[var6 - 1];
                    this.field1267[var6] = this.field1267[var6 - 1];
                }
                this.field1210[0] = arg0;
                this.field1264[0] = arg1;
                this.field1267[0] = 1;
                return;
            }
        }
        this.field1252 = 0;
        this.field1220 = 0;
        this.field1268 = 0;
        this.field1210[0] = arg0;
        this.field1264[0] = arg1;
        this.field1211 = this.field1210[0] * 128 + this.field1214 * 64;
        this.field1219 = this.field1264[0] * 128 + this.field1214 * 64;
    }

    @ObfuscatedName("cj.i(B)Leo;")
    public final class134 method983() {
        if (this.field1359 == null) {
            return null;
        }
        class261 var1 = this.field1242 != -1 && this.field1232 == 0 ? Statics.method240(this.field1242) : null;
        class261 var2 = this.field1239 == -1 || this.field1253 == this.field1239 && var1 != null ? null : Statics.method240(this.field1239);
        class134 var3 = this.field1359.method4205(var1, this.field1243, var2, this.field1215);
        if (var3 == null) {
            return null;
        }
        var3.method2240();
        this.field1260 = var3.field2085;
        if (this.field1247 != -1 && this.field1248 != -1) {
            class134 var4 = class246.method3494(this.field1247).method3925(this.field1248);
            if (var4 != null) {
                var4.method2286(0, -this.field1251, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (this.field1359.field3533 == 1) {
            var3.field1880 = true;
        }
        return var3;
    }

    @ObfuscatedName("cj.s(I)Z")
    public final boolean method980() {
        return this.field1359 != null;
    }
}
