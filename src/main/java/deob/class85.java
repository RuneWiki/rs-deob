package deob;

@ObfuscatedName("cs")
public final class class85 extends class77 {

    @ObfuscatedName("cs.d")
    public class259 field1370;

    @ObfuscatedName("cs.d(IBB)V")
    public final void method1615(int arg0, byte arg1) {
        int var3 = this.field1263[0];
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
        if (this.field1240 != -1 && class261.method3613(this.field1240).field3621 == 1) {
            this.field1240 = -1;
        }
        if (this.field1213 < 9) {
            this.field1213++;
        }
        for (int var5 = this.field1213; var5 > 0; var5--) {
            this.field1263[var5] = this.field1263[var5 - 1];
            this.field1264[var5] = this.field1264[var5 - 1];
            this.field1265[var5] = this.field1265[var5 - 1];
        }
        this.field1263[0] = var3;
        this.field1264[0] = var4;
        this.field1265[0] = arg1;
    }

    @ObfuscatedName("cs.k(IIZB)V")
    public final void method1616(int arg0, int arg1, boolean arg2) {
        if (this.field1240 != -1 && class261.method3613(this.field1240).field3621 == 1) {
            this.field1240 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1263[0];
            int var5 = arg1 - this.field1264[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1213 < 9) {
                    this.field1213++;
                }
                for (int var6 = this.field1213; var6 > 0; var6--) {
                    this.field1263[var6] = this.field1263[var6 - 1];
                    this.field1264[var6] = this.field1264[var6 - 1];
                    this.field1265[var6] = this.field1265[var6 - 1];
                }
                this.field1263[0] = arg0;
                this.field1264[0] = arg1;
                this.field1265[0] = 1;
                return;
            }
        }
        this.field1213 = 0;
        this.field1242 = 0;
        this.field1252 = 0;
        this.field1263[0] = arg0;
        this.field1264[0] = arg1;
        this.field1243 = this.field1263[0] * 128 + this.field1212 * 64;
        this.field1209 = this.field1264[0] * 128 + this.field1212 * 64;
    }

    @ObfuscatedName("cs.e(I)Leb;")
    public final class132 method1070() {
        if (this.field1370 == null) {
            return null;
        }
        class261 var1 = this.field1240 != -1 && this.field1245 == 0 ? class261.method3613(this.field1240) : null;
        class261 var2 = this.field1254 == -1 || this.field1254 == this.field1249 && var1 != null ? null : class261.method3613(this.field1254);
        class132 var3 = this.field1370.method4367(var1, this.field1241, var2, this.field1228);
        if (var3 == null) {
            return null;
        }
        var3.method2364();
        this.field1258 = var3.field2115;
        if (this.field1260 != -1 && this.field1250 != -1) {
            class132 var4 = class246.method2787(this.field1260).method4078(this.field1250);
            if (var4 != null) {
                var4.method2435(0, -this.field1215, 0);
                class132[] var5 = new class132[] { var3, var4 };
                var3 = new class132(var5, 2);
            }
        }
        if (this.field1370.field3560 == 1) {
            var3.field1939 = true;
        }
        return var3;
    }

    @ObfuscatedName("cs.r(I)Z")
    public final boolean method1074() {
        return this.field1370 != null;
    }
}
