package deob;

@ObfuscatedName("ce")
public final class class87 extends class79 {

    @ObfuscatedName("ce.w")
    public class262 field1387;

    @ObfuscatedName("ce.w(IBI)V")
    public final void method1533(int arg0, byte arg1) {
        int var3 = this.field1255[0];
        int var4 = this.field1291[0];
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
        if (this.field1267 != -1 && class264.method3098(this.field1267).field3632 == 1) {
            this.field1267 = -1;
        }
        if (this.field1289 < 9) {
            this.field1289++;
        }
        for (int var5 = this.field1289; var5 > 0; var5--) {
            this.field1255[var5] = this.field1255[var5 - 1];
            this.field1291[var5] = this.field1291[var5 - 1];
            this.field1259[var5] = this.field1259[var5 - 1];
        }
        this.field1255[0] = var3;
        this.field1291[0] = var4;
        this.field1259[0] = arg1;
    }

    @ObfuscatedName("ce.o(IIZB)V")
    public final void method1541(int arg0, int arg1, boolean arg2) {
        if (this.field1267 != -1 && class264.method3098(this.field1267).field3632 == 1) {
            this.field1267 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1255[0];
            int var5 = arg1 - this.field1291[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1289 < 9) {
                    this.field1289++;
                }
                for (int var6 = this.field1289; var6 > 0; var6--) {
                    this.field1255[var6] = this.field1255[var6 - 1];
                    this.field1291[var6] = this.field1291[var6 - 1];
                    this.field1259[var6] = this.field1259[var6 - 1];
                }
                this.field1255[0] = arg0;
                this.field1291[0] = arg1;
                this.field1259[0] = 1;
                return;
            }
        }
        this.field1289 = 0;
        this.field1294 = 0;
        this.field1293 = 0;
        this.field1255[0] = arg0;
        this.field1291[0] = arg1;
        this.field1264 = this.field1255[0] * 128 + this.field1243 * 64;
        this.field1236 = this.field1291[0] * 128 + this.field1243 * 64;
    }

    @ObfuscatedName("ce.x(I)Lev;")
    public final class134 method1017() {
        if (this.field1387 == null) {
            return null;
        }
        class264 var1 = this.field1267 != -1 && this.field1270 == 0 ? class264.method3098(this.field1267) : null;
        class264 var2 = this.field1242 == -1 || this.field1246 == this.field1242 && var1 != null ? null : class264.method3098(this.field1242);
        class134 var3 = this.field1387.method4275(var1, this.field1279, var2, this.field1265);
        if (var3 == null) {
            return null;
        }
        var3.method2303();
        this.field1285 = var3.field2130;
        if (this.field1292 != -1 && this.field1273 != -1) {
            class134 var4 = Statics.method3709(this.field1292).method3940(this.field1273);
            if (var4 != null) {
                var4.method2285(0, -this.field1276, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (this.field1387.field3570 == 1) {
            var3.field1975 = true;
        }
        return var3;
    }

    @ObfuscatedName("ce.j(I)Z")
    public final boolean method1020() {
        return this.field1387 != null;
    }
}
